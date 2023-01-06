package com.example.bankamat.Controller;


import com.example.bankamat.DTO.ApiRespos;
import com.example.bankamat.DTO.KartaDTO;
import com.example.bankamat.Servis.KartaServis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/kartaregister")
public class KartaController {
    @Autowired
    KartaServis kartaServis;
    @PostMapping()
    public HttpEntity<?> addkard(@Valid @RequestBody KartaDTO kartaDTO){
        ApiRespos apiRespos=kartaServis.addkarta(kartaDTO);
        return ResponseEntity.status(apiRespos.isHolat()?200:409).body(apiRespos.getMessege());
    }
}
