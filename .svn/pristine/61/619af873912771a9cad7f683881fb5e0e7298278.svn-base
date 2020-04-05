package com.warehouse.service.impl;

import com.warehouse.Vo.DocumentVo;
import com.warehouse.common.UUIDUtils;
import com.warehouse.mapper.DocumentNumberMapper;
import com.warehouse.pojo.DocumentNumber;
import com.warehouse.pojo.DocumentPrefix;
import com.warehouse.service.DocumentNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class DocumentNumberServiceImpl implements DocumentNumberService {

    HashMap<String, Object> map = new HashMap<>();

    {
        map.put("CK", "CK");
        map.put("RK", "RK");
        map.put("CG", "CG");
        map.put("XS", "xS");
    }

    @Autowired
    private DocumentNumberMapper documentNumberMapper;

    @Override
    public List<DocumentVo> getAllDocumentInfo(String username) {
        map.put("username", username);
//        map.put("type", 0);
//        List<String> type = new ArrayList<>();
        List<DocumentVo> list = new ArrayList<>();

        List<DocumentNumber> document = documentNumberMapper.getAllUserDocument(map);

        for (DocumentNumber number : document) {
            DocumentVo documentVo = new DocumentVo();

            documentVo.setDocnId(number.getDocnId());
            documentVo.setDocnDateType(number.getDocnDateType());
            documentVo.setDocnType(number.getDocnType());
            List<DocumentPrefix> prefix = number.getDocumentPrefixList();
//            System.out.println(prefix.size());
            if (prefix.size() > 0) {
                for (DocumentPrefix documentPrefix : prefix) {
                    if (documentPrefix.getDpType() == 1) {
                        documentVo.setDpId(documentPrefix.getDpId());
                        documentVo.setDpName(documentPrefix.getDpName());
                    } else {
                        documentVo.setDpId(documentPrefix.getDpId());
                        documentVo.setDpName(documentPrefix.getDpName());
                    }
                }
            } else {
                for (DocumentPrefix documentPrefix : prefix) {
                    documentVo.setDpId(documentPrefix.getDpId());
                    documentVo.setDpName(documentPrefix.getDpName());
                }
            }
            list.add(documentVo);
        }


        return list;
    }

    @Override
    public void updateDocumentInfo(List<DocumentNumber> documentNumberList, String username) {
        for (DocumentNumber number : documentNumberList) {
            number.getDocumentPrefix().setUsername(username);
            DocumentNumber documentNumber = documentNumberMapper.getDocumentInfo(number);
            if (documentNumber == null) {
                String str = documentNumberMapper.getDocumentName(number);
                System.out.println("================>" + str);
                if (!str.equals(number.getDocumentPrefix().getDpName())) {
                    documentNumberMapper.updateDocumentDate(number);
                } else {
                    documentNumberMapper.updateDocumentDate(number);
                    number.getDocumentPrefix().setDpId(UUIDUtils.getUUID());
                    number.getDocumentPrefix().setDocnId(number.getDocnId());
                    number.getDocumentPrefix().setDpType(1);
                    documentNumberMapper.addDocumentPrefix(number);
                }
            } else {
                documentNumberMapper.updateDocumentDate(number);
                number.getDocumentPrefix().setUsername(username);
                documentNumberMapper.updateDocumentPrefix(number.getDocumentPrefix());
            }
        }

    }

}
