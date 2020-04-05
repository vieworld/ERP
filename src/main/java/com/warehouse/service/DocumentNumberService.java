package com.warehouse.service;

import com.warehouse.Vo.DocumentVo;
import com.warehouse.pojo.DocumentNumber;

import java.util.List;

public interface DocumentNumberService {

    //获取用户的单据编号
    List<DocumentVo> getAllDocumentInfo(String username);

    //修改用户单据信息
    void updateDocumentInfo(List<DocumentNumber> documentNumberList, String username);


}
