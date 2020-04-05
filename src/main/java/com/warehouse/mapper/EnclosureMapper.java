package com.warehouse.mapper;

import com.warehouse.pojo.Enclosure;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EnclosureMapper {

    void addEnclosureList(@Param(value = "list") List<Enclosure> list);

    void updateEnclosureList(List<Enclosure> enclosures);

    void deleEnclosureList(@Param(value = "purId") String purId);
}
