package com.warehouse.mapper;

import com.warehouse.pojo.Address;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AddressMapper {

    List<Address> getAllAddress(@Param(value = "username") String username);

    void addAddressInfo(Address address);

    void updateAddressInfo(Address address);

    void deleteAddressInfo(@Param(value = "id") String id);
}
