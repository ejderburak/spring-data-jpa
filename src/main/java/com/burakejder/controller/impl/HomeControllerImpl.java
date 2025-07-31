package com.burakejder.controller.impl;

import com.burakejder.DTO.DtoHome;
import com.burakejder.controller.IHomeController;
import com.burakejder.services.IHomeService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Data
@AllArgsConstructor
@RestController
@RequestMapping("/rest/api/home")
public class HomeControllerImpl implements IHomeController {


    private final IHomeService homeService;

    @Override
    @GetMapping(path = "/{id}")
    public DtoHome findHomeById(@PathVariable(name = "id") Long id) {
        return homeService.findHomeById(id);
    }
}
