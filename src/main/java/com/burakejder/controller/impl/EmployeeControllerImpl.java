package com.burakejder.controller.impl;

import com.burakejder.DTO.DtoEmployee;
import com.burakejder.controller.IEmployeeController;
import com.burakejder.repository.EmployeeRepository;
import com.burakejder.services.IEmployeeService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Data
@AllArgsConstructor
@RestController
@RequestMapping("rest/api/employee")
public class EmployeeControllerImpl implements IEmployeeController {

    private final IEmployeeService employeeService; // injection


    @Override
    @GetMapping(path = "/list")
    public List<DtoEmployee> findAllEmployees() {
        return employeeService.findAllEmployees();
    }
}
