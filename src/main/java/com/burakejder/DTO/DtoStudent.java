package com.burakejder.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DtoStudent { // get işlemlerinde kullanıcaz

    private Integer id;
    private String firstName;
    private String lastName;

    private List<DtoCourse> courses = new ArrayList<>();

}
