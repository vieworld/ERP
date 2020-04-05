package com.warehouse.mapper;

import com.warehouse.Vo.DocumentVo;
import com.warehouse.pojo.DocumentNumber;
import com.warehouse.pojo.DocumentPrefix;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

public interface DocumentNumberMapper {

    DocumentNumber getDocumentNumber(@Param("id") String id);

    //查询
    List<DocumentNumber> getAllUserDocument(@Param(value = "map") HashMap<String, Object> map);


    DocumentNumber getDocumentInfo(DocumentNumber number);

    String getDocumentName(DocumentNumber documentNumber);

    void updateDocumentDate(DocumentNumber number);

    void addDocumentPrefix(DocumentNumber number);

    void updateDocumentPrefix(DocumentPrefix documentPrefix);

    //查询用户是否有自定义编号前缀
    DocumentPrefix getDocumentPrefix(@Param(value = "username") String username, @Param(value = "type") String type);

    //查询用户自定义的前缀信息
    DocumentNumber getDocumentNumberUser(@Param("id") String id, @Param("username") String username);
}
