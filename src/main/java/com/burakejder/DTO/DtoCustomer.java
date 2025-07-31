package com.burakejder.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL) // bu classta bir şey nullsa o nulları dönme demek bu
public class DtoCustomer {

    private Long id;
    private String name;

    private DtoAddress address; // one-to-one

}
