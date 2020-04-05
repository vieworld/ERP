package com.warehouse.service.impl;

import com.warehouse.common.UUIDUtils;
import com.warehouse.mapper.TaxRateMapper;
import com.warehouse.pojo.TaxRate;
import com.warehouse.pojo.Users;
import com.warehouse.service.TaxRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaxRateServiceImpl implements TaxRateService {

    @Autowired
    private TaxRateMapper taxRateMapper;


    @Override
    public List<TaxRate> getAllTaxRateInfo(String username) {
        return taxRateMapper.getAllTaxRateInfo(username);
    }

    @Override
    public void addTaxRateInfo(TaxRate taxRate) {
        taxRate.setTrId(UUIDUtils.getUUID());
        taxRateMapper.addTaxTateInfo(taxRate);
    }

    @Override
    public void updateTaxRateInfo(TaxRate taxRate) {
        taxRateMapper.updateTaxRateInfo(taxRate);
    }

    @Override
    public void deleteTaxRateInfo(String id) {
        taxRateMapper.deleteTaxRateInfo(id);
    }


}
