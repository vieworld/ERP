package com.warehouse.mapper;

import com.warehouse.DTO.PurchaseInboundDTO;
import com.warehouse.pojo.Inbound;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface InboundMapper {

    int getInboundCount(@Param(value = "inbDate") Date inbDate, @Param(value = "username") String username);

    Integer addInboundInfo(Inbound inbound);

    List<PurchaseInboundDTO> getPurchaseInboundInfo(String id);
}
