package com.burakejder.repository;

import com.burakejder.entites.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    // buraya kendi özel kodlarınızı yazabilirsiniz, spesifik kodlar, query anatosyonu
    // farz et ki JpaRepository içinde bu yok

    // hql (hibernate query language) -> class isimleri ve değişken(fields) üzerinden  yazılır
    // SQL için -> tablo ismi ve column isimleri ile çağrılır, nativeQury true yapılır
    @Query(value = "from Student", nativeQuery = false) // false -> hql demek
    List<Student> findAllStudents();

    @Query(value = "from Student s WHERE s.id=:studentId")
    Optional<Student> findStudentById(Integer studentId);


}