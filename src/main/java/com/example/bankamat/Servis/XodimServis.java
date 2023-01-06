package com.example.bankamat.Servis;

import com.example.bankamat.DTO.ApiRespos;
import com.example.bankamat.DTO.XodimDTO;
import com.example.bankamat.Model.Bankamat;
import com.example.bankamat.Model.Xodim;
import com.example.bankamat.Repazitori.BankamatRepazitori;
import com.example.bankamat.Repazitori.LavozimRepazitori;
import com.example.bankamat.Repazitori.XodimRepazitori;
import com.example.bankamat.Util.ConstXodim;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class XodimServis {
    @Autowired
    XodimRepazitori xodimRepazitori;
    @Autowired
    LavozimRepazitori lavozimRepazitori;
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    BankamatRepazitori bankamatRepazitori;
    public ApiRespos addxodim(XodimDTO xodimDTO) {
        if (xodimRepazitori.existsByUsername(xodimDTO.getUsername())) return new ApiRespos("Bunday xodim mavjud",false);
        if (!xodimRepazitori.findById(xodimDTO.getXodimid()).get().getLavozim().getNomi().equals(lavozimRepazitori.findById(1).get().getNomi())) return new ApiRespos("Bunday hodimdagi lavozim hodim qosha olmaydi!",false);
    xodimRepazitori.save(new Xodim(
            xodimDTO.getFish(),xodimDTO.getUsername(),passwordEncoder.encode(xodimDTO.getPassword()),bankamatRepazitori.findById(xodimDTO.getBankamatid()).get(),lavozimRepazitori.findByNomi(ConstXodim.Xodim).get(),true
    ));
        return new ApiRespos("successfuly",true);
    }
}
