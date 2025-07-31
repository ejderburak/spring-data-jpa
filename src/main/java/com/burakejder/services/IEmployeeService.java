package com.burakejder.services;

import com.burakejder.DTO.DtoEmployee;

import java.util.List;

public interface IEmployeeService {

    public List<DtoEmployee> findAllEmployees();

}
