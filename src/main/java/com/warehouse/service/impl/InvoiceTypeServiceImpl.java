package com.warehouse.service.impl;

import com.warehouse.common.UUIDUtils;
import com.warehouse.mapper.InvoiceTypeMapper;
import com.warehouse.pojo.InvoiceType;
import com.warehouse.service.InvoiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceTypeServiceImpl implements InvoiceTypeService {

    @Autowired
    private InvoiceTypeMapper invoiceTypeMapper;


    @Override
    public List<InvoiceType> getAllInvoiceTypeInfo(String username) {
        return invoiceTypeMapper.getAllInvoiceTypeInfo(username);
    }

    @Override
    public void addInvoiceTypeInfo(InvoiceType invoiceType) {
        invoiceType.setInvtId(UUIDUtils.getUUID());
        invoiceTypeMapper.addInvoiceTypeInfo(invoiceType);
    }

    @Override
    public void updateInvoiceTypeInfo(InvoiceType invoiceType) {
        invoiceTypeMapper.updateInvoiceTypeInfo(invoiceType);
    }

    @Override
    public void deleteInvoiceTypeInfo(String id) {
        invoiceTypeMapper.deleteInvoiceTypeInfo(id);
    }
}
