package com.warehouse.mapper;

import com.warehouse.pojo.TaxRate;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TaxRateMapper {

    List<TaxRate> getAllTaxRateInfo(@Param(value = "username") String username);

    void addTaxTateInfo(TaxRate taxRate);

    void updateTaxRateInfo(TaxRate taxRate);

    void deleteTaxRateInfo(@Param(value = "id") String id);
}
