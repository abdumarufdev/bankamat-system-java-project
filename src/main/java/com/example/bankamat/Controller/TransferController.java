package com.example.bankamat.Controller;


import com.example.bankamat.DTO.ApiRespos;
import com.example.bankamat.DTO.TransferDTO;
import com.example.bankamat.Model.Bankamat;
import com.example.bankamat.Servis.BankamatServis;
import com.example.bankamat.Servis.TransferServis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/transfer")
public class TransferController {
    @Autowired
    TransferServis transferServis;
    @PostMapping("/yechish")
    public HttpEntity<?> bankamatdanyechish(@Valid @RequestBody TransferDTO transferDTO){
        ApiRespos apiRespos=transferServis.bankamatdanYechishServisFunction(transferDTO);
        return ResponseEntity.status(apiRespos.isHolat()?200:409).body(apiRespos.getMessege());
    }
}
