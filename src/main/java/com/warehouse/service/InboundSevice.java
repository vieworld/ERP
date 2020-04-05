package com.warehouse.service;

import com.github.pagehelper.PageInfo;
import com.warehouse.DTO.PurchaseInboundDTO;
import com.warehouse.pojo.Inbound;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface InboundSevice {

    String addInbound(Inbound inbound, MultipartFile[] fileName) throws IOException;

    //查询采购订单的入库记录
    PageInfo<PurchaseInboundDTO> getPurchaseInboundInfo(String id, int pageSize, int page);
}
