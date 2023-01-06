package com.example.bankamat.Controller;


import com.example.bankamat.DTO.ApiRespos;
import com.example.bankamat.DTO.KartaDTO;
import com.example.bankamat.Model.Bankamat;
import com.example.bankamat.Servis.BankamatServis;
import com.example.bankamat.Servis.KartaServis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/bankamatregister")
public class BankamatController {
    @Autowired
    BankamatServis bankamatServis;
    @PostMapping()
    public HttpEntity<?> insertbankamat(@Valid @RequestBody Bankamat bankamat){
        ApiRespos apiRespos=bankamatServis.addbanakamat(bankamat);
        return ResponseEntity.status(apiRespos.isHolat()?200:409).body(apiRespos.getMessege());
    }
}
