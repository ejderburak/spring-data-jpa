package com.burakejder.services.impl;

import com.burakejder.DTO.DtoCourse;
import com.burakejder.DTO.DtoStudent;
import com.burakejder.DTO.DtoStudentIU;
import com.burakejder.entites.Course;
import com.burakejder.entites.Student;
import com.burakejder.repository.StudentRepository;
import com.burakejder.services.IStudentService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Setter
@Getter
@AllArgsConstructor
@Service
public class StudentServiceImpl implements IStudentService {

    private final StudentRepository studentRepository; // my injection


    public StudentRepository getStudentRepository() {
        return studentRepository;
    }

    @Override
    public DtoStudent saveStudent(DtoStudentIU dtoStudentIU){
        Student student = new Student();
        DtoStudent response = new DtoStudent();
        BeanUtils.copyProperties(dtoStudentIU, student);

        Student dbStudent = studentRepository.save(student);
        BeanUtils.copyProperties(dbStudent, response);
        return response;
    }

    @Override
    public List<DtoStudent> getAllStudents(){
        List<DtoStudent> dtoList = new ArrayList<>();

        List<Student> students = studentRepository.findAllStudents();
        for(Student student : students){
            DtoStudent dto = new DtoStudent();
            BeanUtils.copyProperties(student, dto);
            dtoList.add(dto);
        }
        return dtoList;
    }

    @Override
    public DtoStudent getStudentById(Integer id) {

        DtoStudent dtoStudent = new DtoStudent();
        Optional<Student> optional =  studentRepository.findById(id);

        if(optional.isEmpty()){
            return null;
        }

        Student dbStudent = optional.get();
        BeanUtils.copyProperties(dbStudent, dtoStudent);

        if(dbStudent.getCourses() != null && !dbStudent.getCourses().isEmpty()){
            for(Course course : dbStudent.getCourses()){
                DtoCourse dtoCourse = new DtoCourse();
                BeanUtils.copyProperties(course, dtoCourse);

                dtoStudent.getCourses().add(dtoCourse);
            }
        }
        return dtoStudent;
    }

    @Override
    public void deleteStudentById(Integer id) {
        Optional<Student> optioanal =  studentRepository.findById(id);
        if (optioanal.isPresent()) {
            studentRepository.delete(optioanal.get());
        }
    }

    @Override
    public DtoStudent updateStudent(Integer id, DtoStudentIU dtoStudentIU){
        DtoStudent dto = new DtoStudent();
        Optional<Student> optional = studentRepository.findById(id);
        if(optional.isPresent()){
            Student dbStudent = optional.get();

            dbStudent.setFirstName(dtoStudentIU.getFirstName());
            dbStudent.setLastName(dtoStudentIU.getLastName());
            dbStudent.setDateOfBirth(dtoStudentIU.getDateOfBirth());

            Student updatedStudent = studentRepository.save(dbStudent);
            BeanUtils.copyProperties(updatedStudent, dto);
            return dto;
        }
        return null;
    }

}
