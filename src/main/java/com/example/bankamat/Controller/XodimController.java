package com.example.bankamat.Controller;


import com.example.bankamat.DTO.ApiRespos;
import com.example.bankamat.DTO.KartaDTO;
import com.example.bankamat.DTO.XodimDTO;
import com.example.bankamat.Model.Xodim;
import com.example.bankamat.Repazitori.XodimRepazitori;
import com.example.bankamat.Servis.KartaServis;
import com.example.bankamat.Servis.XodimServis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/xodimregister")
public class XodimController {
    @Autowired
    XodimServis xodimServis;
    @PostMapping()
    public HttpEntity<?> insertxodim(@Valid @RequestBody XodimDTO xodimDTO){
        ApiRespos apiRespos=xodimServis.addxodim(xodimDTO);
        return ResponseEntity.status(apiRespos.isHolat()?200:409).body(apiRespos.getMessege());
    }
}
