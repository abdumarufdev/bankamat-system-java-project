package com.example.bankamat.Comanent;

import com.example.bankamat.Enum.Huquqlar;
import com.example.bankamat.Enum.Turi;
import com.example.bankamat.Model.Bankamat;
import com.example.bankamat.Model.Lavozim;
import com.example.bankamat.Model.Turlar;
import com.example.bankamat.Model.Xodim;
import com.example.bankamat.Repazitori.BankamatRepazitori;
import com.example.bankamat.Repazitori.LavozimRepazitori;
import com.example.bankamat.Repazitori.XodimRepazitori;
import com.example.bankamat.Util.ConstXodim;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Arrays;

import static com.example.bankamat.Enum.Huquqlar.*;

@Component
public class DataLodaer implements ApplicationRunner {
    @Autowired
    XodimRepazitori xodimRepazitori;
    @Autowired
    LavozimRepazitori lavozimRepazitori;
    @Autowired
    BankamatRepazitori bankamatRepazitori;
    @Autowired
    PasswordEncoder passwordEncoder;
    @Value("${spring.sql.init.mode}")
    String initmode;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        if(initmode.equals("always")) {
            Huquqlar[] huquqlars=Huquqlar.values();
            Lavozim lavozim = lavozimRepazitori.save(new Lavozim(
                    ConstXodim.DIREKTOR, Arrays.asList(huquqlars)
            ));

            Lavozim lavozim1 = lavozimRepazitori.save(new Lavozim(
                    ConstXodim.Xodim, Arrays.asList(EDITXODIM, READMYXODIM, MYKIRIMCHIQIMROYHATI, MYPULMIQDORI)
            ));
            Bankamat bankamat = bankamatRepazitori.save(new Bankamat("Nomi", "Asaka", "50000000","30000000", "0", Turi.UZCARD));
            xodimRepazitori.save(new Xodim(
                    "Direktor","faxriddin011",passwordEncoder.encode("12345"),bankamat,lavozim,true
            ));
            xodimRepazitori.save(new Xodim(
                    "Jamshid","jamshid",passwordEncoder.encode("123"),bankamat,lavozim1,true
            ));
        }
    }
}
