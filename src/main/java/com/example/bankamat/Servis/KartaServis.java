package com.example.bankamat.Servis;

import com.example.bankamat.DTO.ApiRespos;
import com.example.bankamat.DTO.KartaDTO;
import com.example.bankamat.Model.Karta;
import com.example.bankamat.Repazitori.KartaRepazitori;
import com.example.bankamat.Repazitori.TurlarRepazitori;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KartaServis {
    @Autowired
    KartaRepazitori kartaRepazitori;
    @Autowired
    TurlarRepazitori turlarRepazitori;
    public ApiRespos addkarta(KartaDTO kartaDTO) {
        if (kartaRepazitori.existsByRaqam(kartaDTO.getRaqam())) return new ApiRespos("bunday karta mavjud",false);
     kartaRepazitori.save(new Karta(
             kartaDTO.getRaqam(),kartaDTO.getKod(),kartaDTO.getFish(),kartaDTO.getBanknomi(),kartaDTO.getMuddat(),kartaDTO.getSum(),turlarRepazitori.findById(kartaDTO.getTurlarid()).get()
     ));
        return new ApiRespos("successfuly",true);
    }
}
