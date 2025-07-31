package com.burakejder.controller;

import com.burakejder.DTO.DtoEmployee;

import java.util.List;

public interface IEmployeeController {

    public List<DtoEmployee> findAllEmployees();
}
