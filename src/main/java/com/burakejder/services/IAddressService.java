package com.burakejder.services;

import com.burakejder.DTO.DtoAddress;

public interface IAddressService {

    public DtoAddress findAddressById(Long id);
}
