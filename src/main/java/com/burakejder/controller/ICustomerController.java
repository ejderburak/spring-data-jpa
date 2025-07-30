package com.burakejder.controller;

import com.burakejder.DTO.DtoCustomer;

public interface ICustomerController {

    public DtoCustomer findCustomerById(Long id);

}
