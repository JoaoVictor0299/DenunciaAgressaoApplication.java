package br.com.LadyPower.services;

import br.com.LadyPower.Entities.Testimony;
import org.springframework.stereotype.Service;

@Service
public class TestimonyService {

    public Testimony getTestimony(){
        return generateTestimonyTest();
    }

    private Testimony generateTestimonyTest() {

        return new Testimony(1,"Graças a plataforma, pude fazer uma denuncia de um abusador");
    }

    public Testimony createTestimony (Testimony testimony) {
        return testimony;
    }
}

