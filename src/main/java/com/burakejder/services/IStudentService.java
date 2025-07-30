package com.burakejder.services;

import com.burakejder.DTO.DtoStudent;
import com.burakejder.DTO.DtoStudentIU;
import com.burakejder.entites.Student;

import java.util.List;

public interface IStudentService {

    public DtoStudent saveStudent(DtoStudentIU student);

    public List<DtoStudent> getAllStudents();

    public DtoStudent getStudentById(Integer id);

    public void deleteStudentById(Integer id);

    public DtoStudent updateStudent(Integer id, DtoStudentIU dtoStudentIU);

}
