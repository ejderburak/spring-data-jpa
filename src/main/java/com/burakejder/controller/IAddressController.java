package com.burakejder.controller;

import com.burakejder.DTO.DtoAddress;

public interface IAddressController {

    public DtoAddress findAddressById(Long id);

}
