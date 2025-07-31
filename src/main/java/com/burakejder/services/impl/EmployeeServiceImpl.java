package com.burakejder.services.impl;

import com.burakejder.DTO.DtoDepartment;
import com.burakejder.DTO.DtoEmployee;
import com.burakejder.entites.Employee;
import com.burakejder.repository.EmployeeRepository;
import com.burakejder.services.IEmployeeService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@Service
public class EmployeeServiceImpl implements IEmployeeService {

    private final EmployeeRepository employeeRepository;

    @Override
    public List<DtoEmployee> findAllEmployees() {
        List<DtoEmployee> dtoEmployeeList = new ArrayList<>();
        List<Employee> employeeList = employeeRepository.findAll();
        if (employeeList != null && !employeeList.isEmpty()) {
            for (Employee employee : employeeList) {
                DtoEmployee dtoEmployee = new DtoEmployee();
                BeanUtils.copyProperties(employee, dtoEmployee); // kopyalar ama içindeki dtoDeparment kopyalamadı

                dtoEmployee.setDepartment(new DtoDepartment(employee.getDepartment().getId(),
                                                            employee.getDepartment().getDepartmentName()));

                dtoEmployeeList.add(dtoEmployee);
            }
        }
        return dtoEmployeeList;
    }
}
