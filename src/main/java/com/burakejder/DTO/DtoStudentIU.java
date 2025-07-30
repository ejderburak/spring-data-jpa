package com.burakejder.DTO;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DtoStudentIU { // insert ve update işlemleri yaparkne sadece bu kullanılır

    @NotEmpty(message = "First name alanı boş geçilemez")
    @Size(min = 3, max = 10)
    private String firstName;

    @Size(min = 3, max = 10)
    private String lastName;

    private Date dateOfBirth;

    @Email(message = "please enter an email format")
    private String email;

    @Size(min = 11 , max = 11, message = "tckn alanı 11 karakter olmalıdır")
    @NotEmpty(message = "TCKN alanı boş geçilemez")
    private String tckn;



}
