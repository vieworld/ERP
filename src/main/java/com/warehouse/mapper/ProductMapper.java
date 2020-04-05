package com.warehouse.mapper;

import com.warehouse.Vo.ProductVo;
import com.warehouse.pojo.Product;
import com.warehouse.pojo.Purdetails;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

public interface ProductMapper {

    //获取物品数量
    int getProductCount(@Param(value = "id") String id, @Param(value = "username") String username);

    //查询所有物品信息
    List<Product> getPartProduct(ProductVo productVo);


    //查询正常库存物品
    List<Product> getNormalProduct(ProductVo productVo);

    //查询负库存物品
    List<Product> getNegativeProduct(ProductVo productVo);

    //查询高于库存上线物品
    List<Product> getUpperProduct(ProductVo productVo);

    //查询低于库存下限物品
    List<Product> getLowerProduct(ProductVo productVo);

    int getCountProduct(@Param(value = "id") String pudGoodsId);

    void updateProductInfo(Purdetails purdetails);

    void addProductInfo(@Param(value = "purdetails") Purdetails purdetails, @Param(value = "wareId") String wareId);

    //查询当天入库物品条数
    int getCount(@Param(value = "username") String username);

//    //添加商品
//    void addProductList(@Param(value = "purdetailsList") List<Purdetails> purdetailsList);
}
