package com.warehouse.mapper;

import com.warehouse.Vo.ChartVo;
import com.warehouse.Vo.DayVo;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface IndexMapper {
    /**
     * 销售图表
     *
     * @param map
     * @return
     */

    Integer getCountAmount(@Param(value = "map") Map<String, String> map);

    Float getTotalAmount(@Param(value = "map") Map<String, String> map);

    Float getAmount(DayVo dayVo);

    Integer getCount(DayVo dayVo);

    Float getMonthAmount(@Param(value = "map") Map<String, String> map);

    Integer getMonthCount(@Param(value = "map") Map<String, String> map);


    /**
     * 采购图表
     *
     * @param map
     * @return
     */
    int getPurCountAmount(@Param(value = "map") Map<String, String> map);

    Float getPurTotalAmount(@Param(value = "map") Map<String, String> map);

    Float getPurAmount(DayVo dayVo);

    Integer getPurCount(DayVo dayVo);

    Float getPurMonthAmount(@Param(value = "map") Map<String, String> map);

    Integer getPurMonthCount(@Param(value = "map") Map<String, String> map);
}
