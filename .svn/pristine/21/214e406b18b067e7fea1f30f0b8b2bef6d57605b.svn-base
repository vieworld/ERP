package com.warehouse.service.impl;

import com.warehouse.common.UUIDUtils;
import com.warehouse.mapper.AddressMapper;
import com.warehouse.pojo.Address;
import com.warehouse.pojo.Users;
import com.warehouse.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressMapper addressMapper;


    @Override
    public List<Address> getAllAddress(String username) {
        return addressMapper.getAllAddress(username);
    }

    @Override
    public void addAddressInfo(Address address) {
        address.setAdId(UUIDUtils.getUUID());

        addressMapper.addAddressInfo(address);
    }

    @Override
    public void updateAddressInfo(Address address) {
        addressMapper.updateAddressInfo(address);
    }

    @Override
    public void deleteAddressInfo(String id) {
        addressMapper.deleteAddressInfo(id);
    }
}
