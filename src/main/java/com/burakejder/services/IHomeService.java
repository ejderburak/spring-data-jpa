package com.burakejder.services;

import com.burakejder.DTO.DtoHome;

public interface IHomeService {

    public DtoHome findHomeById(Long id);
}
