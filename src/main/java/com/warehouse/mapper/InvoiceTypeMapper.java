package com.warehouse.mapper;

import com.warehouse.pojo.InvoiceType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InvoiceTypeMapper {

    List<InvoiceType> getAllInvoiceTypeInfo(@Param(value = "username") String username);

    void addInvoiceTypeInfo(InvoiceType invoiceType);

    void updateInvoiceTypeInfo(InvoiceType invoiceType);

    void deleteInvoiceTypeInfo(@Param(value = "id") String id);
}
