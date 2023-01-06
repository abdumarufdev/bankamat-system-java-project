package com.example.bankamat.Servis;

import com.example.bankamat.DTO.ApiRespos;
import com.example.bankamat.DTO.TransferDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

@Service
public class TransferServis {
    @Autowired
    BankamatServis bankamatServis
    public ApiRespos bankamatdanYechishServisFunction(@Valid TransferDTO transferDTO) {
        return null;
    }
}
