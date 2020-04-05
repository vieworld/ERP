package com.warehouse.service.impl;

import com.github.pagehelper.PageInfo;
import com.warehouse.Vo.ProductVo;
import com.warehouse.mapper.ProductMapper;
import com.warehouse.pojo.Product;
import com.warehouse.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;


    @Override
    public PageInfo getPartProduct(ProductVo productVo) {

        //数据结果集
        List<Product> list = null;

        PageInfo pageInfo = new PageInfo();
        pageInfo.setPageNum(productVo.getPage());
        pageInfo.setPageSize(productVo.getTotalItem());

        if (productVo.getStockState() != null) {

            switch (productVo.getStockState()) {
                case 0:
                    list = productMapper.getPartProduct(productVo);
                    break;
                case 1:
                    list = productMapper.getNormalProduct(productVo);
                    break;
                case 2:
                    list = productMapper.getNegativeProduct(productVo);
                    break;
                case 3:
                    list = productMapper.getUpperProduct(productVo);
                    break;
                case 4:
                    list = productMapper.getLowerProduct(productVo);
                    break;

            }
        } else {
            //获取结果集
            list = productMapper.getPartProduct(productVo);
        }
        pageInfo.setList(list);

        return pageInfo;
    }
}
