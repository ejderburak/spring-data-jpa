package com.burakejder.controller;


import com.burakejder.DTO.DtoStudent;
import com.burakejder.DTO.DtoStudentIU;

import java.util.List;

public interface IStudentController {

    // dto ayrı bir sınıf, içeri ve dışarı çıkıp girerken istediğim fieldler geliyor

    public DtoStudent saveStudent(DtoStudentIU dtoStudentIU);
    public List<DtoStudent> getAllStudents();
    public DtoStudent getStudentById(Integer id);
    public void deleteStudentById(Integer id);
    public DtoStudent updateStudent(Integer id, DtoStudentIU student);
}
