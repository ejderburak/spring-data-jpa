package com.burakejder.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoEmployee {

    private Long id;
    private String firstName;
    private DtoDepartment department;
}
