package com.example.bankamat.DTO;

import com.example.bankamat.Enum.Turi;
import com.example.bankamat.Model.Turlar;
import lombok.Data;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;

@Data
public class KartaDTO {
    @NotNull(message = "karta raqami kiritilmadi!")
    private String raqam;
    @NotNull(message = "karta kod kiritilmadi!")
    private String kod;
    @NotNull(message = "karta fish kiritilmadi!")
    private String fish;
    @NotNull(message = "karta bank nomi kiritilmadi!")
    private String banknomi;
    @NotNull(message = "karta muddati kiritilmadi!")
    private String muddat;
    @NotNull(message = "karta sumi kiritilmadi!")
    private String sum;
    private Integer turlarid;
}
