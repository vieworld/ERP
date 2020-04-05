package com.warehouse.service.impl;

import com.github.pagehelper.PageInfo;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.warehouse.DTO.PurchaseInboundDTO;
import com.warehouse.common.DayUtils;
import com.warehouse.common.FileUploadUtils;
import com.warehouse.common.UUIDUtils;
import com.warehouse.mapper.*;
import com.warehouse.pojo.*;
import com.warehouse.service.InboundSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.UUID;

@Service
public class InboundServiceImpl implements InboundSevice {

    private static final String INBOUNDID = "RK";

    @Autowired
    private InboundMapper inboundMapper;

    @Autowired
    private DocumentNumberMapper documentNumberMapper;

    @Autowired
    private PurdetailsMapper purdetailsMapper;
    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private PurInboundMapper purInboundMapper;

    @Autowired
    private CustomMapper customMapper;

    @Autowired
    private EnclosureMapper enclosureMapper;

    @Autowired
    private ProduceMapper produceMapper;

    @Autowired
    private OtherInboundMapper otherInboundMapper;

    @Autowired
    private SaleInboundMapper saleInboundMapper;


    @Override
    public String addInbound(Inbound inbound, MultipartFile[] fileName) throws IOException {

        String count = String.valueOf(inboundMapper.getInboundCount(inbound.getInbDate(), inbound.getUsername()) + 1);

        DocumentNumber number = null;
        if (documentNumberMapper.getDocumentPrefix(inbound.getUsername(), INBOUNDID) != null) {
            number = documentNumberMapper.getDocumentNumberUser(INBOUNDID, inbound.getUsername());//查询单据编号规则
        } else {
            number = documentNumberMapper.getDocumentNumber(INBOUNDID);
        }

        for (int i = 0; i < count.length(); i++) {
            if (count.length() == 4) {
                break;
            }
            count = "0" + count;
        }

        String date = null;
        if (number.getDocnDateType() == 0) {
            //时间转换
            date = DayUtils.DateTransfrom(inbound.getInbDate()).replace("-", "");//20200202
//           date = DayUtils.getDate().replace("-",""); //20200202

        } else {
            date = DayUtils.DateTransfrom(inbound.getInbDate()).replace("-", "").substring(2);//200202
//            date = DayUtils.getDate().replace("-","").substring(2);
        }

        String id = number.getDocumentPrefix().getDpName() + "-" + date + "-" + count;//入库编号

        inbound.setInbId(id);
        System.out.println("========================>id" + id);
        //修改物品详情的出库数量以及未出库数量
        if (inbound.getInbType() == 1) {
            List<Purdetails> list = inbound.getPurdetailsList();
            if (list != null) {
                for (Purdetails purdetails : list) {
                    if (purdetails.getPudId() != null) {
                        purdetailsMapper.updatePurchaseInbound(inbound.getPurdetailsList());
                    }
                }
            }
        }
        //添加物品关联信息
        List<Purdetails> list = inbound.getPurdetailsList();
        System.out.println("======================>1");
        for (Purdetails purdetails : list) {
            purdetails.setInbId(id);
            purdetails.setPudId(UUIDUtils.getUUID());
            if (purdetails.getPudGoodsId() == null) {
                String productCount = String.valueOf((productMapper.getCount(inbound.getUsername()) + 1));

//                System.out.println("=++++++++++++++++++++"+(productMapper.getCount(inbound.getUsername())+1);
                for (int i = 0; i < 5; i++) {
                    if (productCount.length() == 5) {
                        break;
                    }
                    productCount = "0" + productCount;
                }
                purdetails.setPudGoodsId("WP" + productCount);
            }
        }
        System.out.println("======================>2");
        purdetailsMapper.addPurdetailsList(list);

        System.out.println("=====================>2.5");
        //添加物品信息,先查询物品是否存在,不存在即新增,存在即更新
        for (Purdetails purdetails : list) {
            if (productMapper.getCountProduct(purdetails.getPudGoodsId()) > 0) {
                productMapper.updateProductInfo(purdetails);
            } else {
                productMapper.addProductInfo(purdetails, inbound.getInbWare());
            }
        }
        System.out.println("======================>hhh" + inbound.getInbType());
        System.out.println("======================>3");
        //添加采购入库表信息
        if (inbound.getInbType() == 0) {
            inbound.getProduce().setInbId(id);
            produceMapper.addProduceInfo(inbound.getProduce());
        } else if (inbound.getInbType() == 1) {
//            PurInbound purInbound = new PurInbound();
//            purInbound.setInbId(id);
//            purInbound.setPuiId(UUIDUtils.getUUID());
//            purInbound.setPuiSupid(inbound.getPurInbound().getPuiSupid());
//            purInbound.setPuiContacts(inbound.getPurInbound().getPuiContacts());
//            purInbound.setPuiPhone(inbound.getPurInbound().getPuiPhone());

            PurInbound purInbound = inbound.getPurInbound();
            purInbound.setPuiId(UUIDUtils.getUUID());
            purInbound.setInbId(id);
            purInbound.setPurId(inbound.getPurdetailsList().get(0).getPurId());

            purInboundMapper.addPurInboundInfo(purInbound);


        } else if (inbound.getInbType() == 2) {
            inbound.getSaleInbound().setInbId(id);
            inbound.getSaleInbound().setSaiId(UUIDUtils.getUUID());
            saleInboundMapper.addSaleInboundInfo(inbound.getSaleInbound());
        } else if (inbound.getInbType() == 3) {
            inbound.getOtherInbound().setInbId(id);
            inbound.getOtherInbound().setOiId(UUIDUtils.getUUID());
            otherInboundMapper.addOtherInboundInfo(inbound.getOtherInbound());
        }
        System.out.println("======================>4");
        //自定义,附件上传
        List<Custom> customList = inbound.getCustomList();
        if (customList.size() > 0) {
            for (Custom custom : customList) {
                custom.setCusType(5);
                custom.setInbId(id);
            }

            customMapper.addCustomList(customList);

        }
        System.out.println("======================>5");
        List<Enclosure> enclosures = new ArrayList<>();
        //添加附件信息
        if (fileName != null) {//判断是否上传有附件
            List<String> path = FileUploadUtils.fileUpload(fileName);
            for (String s : path) {
                Enclosure enclosure = new Enclosure();
                enclosure.setEnName(s);
                enclosure.setEnId(UUIDUtils.getUUID());
                enclosure.setInbId(id);

                enclosures.add(enclosure);
            }

            enclosureMapper.addEnclosureList(enclosures);
        }
        inbound.setInbModifier(inbound.getUsername());
        inbound.setInbModifierdate(new Date());
        System.out.println("======================>6");
        //添加入库单
        inboundMapper.addInboundInfo(inbound);
        return inbound.getInbId();
    }

    @Override
    public PageInfo<PurchaseInboundDTO> getPurchaseInboundInfo(String id, int pageSize, int page) {
        PageInfo pageInfo = new PageInfo();
        pageInfo.setPageSize(pageSize);
        pageInfo.setPageNum(page);

        List<PurchaseInboundDTO> list = inboundMapper.getPurchaseInboundInfo(id);

        pageInfo.setList(list);


        return pageInfo;
    }

}
