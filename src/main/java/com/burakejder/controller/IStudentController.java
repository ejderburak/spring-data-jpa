package com.burakejder.controller;


import com.burakejder.DTO.DtoStudent;
import com.burakejder.DTO.DtoStudentIU;
import com.burakejder.entites.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface IStudentController {

    // dto ayrı bir sınıf, içeri ve dışarı çıkıp girerken istediğim fieldler geliyor
    public DtoStudent saveStudent(DtoStudentIU dtoStudentIU);
    public List<DtoStudent> getAllStudents();
    public DtoStudent getStudentById(Integer id);
    public void deleteStudentById(Integer id);
    public DtoStudent updateStudent(Integer id, DtoStudentIU student);
}
