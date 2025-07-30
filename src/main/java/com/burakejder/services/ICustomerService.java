package com.burakejder.services;

import com.burakejder.DTO.DtoCustomer;

public interface ICustomerService {

    public DtoCustomer findCustomerById(Long id);
}
