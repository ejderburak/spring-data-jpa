package com.burakejder.controller.impl;

import com.burakejder.DTO.DtoAddress;
import com.burakejder.controller.IAddressController;
import com.burakejder.services.IAddressService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

@Data
@AllArgsConstructor
@RestController
@RequestMapping("/rest/api/address")
public class AddressControllerImpl implements IAddressController {

    private final IAddressService addressService;


    @GetMapping(path = "/list/{id}")
    @Override
    public DtoAddress findAddressById(@PathVariable(name = "id") Long id) {
        return addressService.findAddressById(id);
    }
}
