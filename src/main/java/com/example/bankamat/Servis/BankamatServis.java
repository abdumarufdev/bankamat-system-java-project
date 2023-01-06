package com.example.bankamat.Servis;

import com.example.bankamat.DTO.ApiRespos;
import com.example.bankamat.Model.Bankamat;
import com.example.bankamat.Repazitori.BankamatRepazitori;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankamatServis {
    @Autowired
    BankamatRepazitori bankamatRepazitori;
    public ApiRespos addbanakamat(Bankamat bankamat) {
       try {
           bankamatRepazitori.save(new Bankamat(
                   bankamat.getNomi(),bankamat.getBanknomi(), bankamat.getMaxpul(),bankamat.getPulmiqdori(),bankamat.getKommissiya(),bankamat.getBankamatturi()
           ));
           return new ApiRespos("successfuly",true);
       }
       catch (Exception e){
           e.getStackTrace();
           return new ApiRespos("joylanmadi!",false);
       }

    }
}
