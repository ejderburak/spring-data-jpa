package com.burakejder.services.impl;

import com.burakejder.DTO.DtoAddress;
import com.burakejder.DTO.DtoCustomer;
import com.burakejder.entites.Address;
import com.burakejder.repository.AddressRepository;
import com.burakejder.services.IAddressService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@AllArgsConstructor
@Service
public class AddressServiceImpl implements IAddressService {

    private final AddressRepository addressRepository;

    @Override
    public DtoAddress findAddressById(Long id) {

        DtoAddress dtoAddress = new DtoAddress();
        Optional<Address> optional = addressRepository.findById(id);
        if (optional.isEmpty()) {
            return null;
        }

        Address address = optional.get();
        BeanUtils.copyProperties(address, dtoAddress); // burada customer class oldupu için setlemez sen yap

        DtoCustomer dtoCustomer = new DtoCustomer(); // dtoAddress içindeki customer class oldupu için copy properties ile yapamazsın elle yaptık
        dtoCustomer.setId(address.getCustomer().getId());
        dtoCustomer.setName(address.getCustomer().getName());

        // customer içindeki addressi tekrardan setlersek sonsuz döngü olur, yapma!! zaten address elimide var
        dtoAddress.setCustomer(dtoCustomer);

        return dtoAddress;


    }
}
