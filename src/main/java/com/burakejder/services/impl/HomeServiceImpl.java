package com.burakejder.services.impl;

import com.burakejder.DTO.DtoHome;
import com.burakejder.DTO.DtoRoom;
import com.burakejder.entites.Home;
import com.burakejder.entites.Room;
import com.burakejder.repository.HomeRepository;
import com.burakejder.services.IHomeService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Data
@AllArgsConstructor
public class HomeServiceImpl implements IHomeService {

    private final HomeRepository homeRepository;


    @Override
    public DtoHome findHomeById(Long id) {
        DtoHome dtoHome = new DtoHome();

        Optional<Home> optional = homeRepository.findById(id);
        if (optional.isEmpty()) {
            // home bulamazsa nolcak???? throw exception olması lazım burada yoksa patlarsın
            return null;
        }

        Home dbHome = optional.get();
        BeanUtils.copyProperties(dbHome, dtoHome); // burada List<Room> copy olmadı elinle yapmalısın

        List<Room> dbRooms = optional.get().getRoom();

        if(dbRooms != null){
            for(Room room : dbRooms){
                DtoRoom dtoRoom = new DtoRoom();
                BeanUtils.copyProperties(room, dtoRoom);
                dtoHome.getRooms().add(dtoRoom);
            }
        }
        return dtoHome;
    }
}

