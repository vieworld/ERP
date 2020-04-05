package com.warehouse.mapper;

import com.warehouse.Vo.CustomVo;
import com.warehouse.pojo.Custom;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomMapper {

    /**
     * 添加备注信息
     *
     * @param list
     */
    void addCustomList(@Param(value = "list") List<Custom> list);

    /**
     * 查询用户采购备注信息
     *
     * @param username
     * @return
     */
    List<String> getAllPurchaseCustomInfo(@Param(value = "username") String username);

    List<CustomVo> getAllCustomInfo(@Param(value = "username") String username, @Param(value = "id") int id);

    void addCustomInfo(Custom custom);

    void updateCustomInfo(Custom custom);

    void deleteCustomInfo(String id);

    //更新自定义信息
    void updateCustomList(List<Custom> customList);
}
