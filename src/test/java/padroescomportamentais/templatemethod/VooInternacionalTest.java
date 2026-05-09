package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VooInternacionalTest {

    @Test
    void deveRetornarAutorizadoVooInternacional() {
        VooInternacional voo = new VooInternacional();
        voo.setPesoCarga(10000.0f);
        voo.setPesoBagagens(9000.0f);
        assertEquals("Autorizado", voo.verificarAutorizacao());
    }

    @Test
    void deveRetornarNaoAutorizadoVooInternacional() {
        VooInternacional voo = new VooInternacional();
        voo.setPesoCarga(12000.0f);
        voo.setPesoBagagens(9000.0f);
        assertEquals("Nao Autorizado - Excesso de Peso", voo.verificarAutorizacao());
    }

    @Test
    void deveRetornarInformacoesVooInternacional() {
        VooInternacional voo = new VooInternacional();
        voo.setNumeroVoo(456);
        voo.setDestino("Nova York");
        voo.setPesoCarga(10000.0f);
        voo.setPesoBagagens(9000.0f);
        assertEquals("VooInternacional{numeroVoo=456, destino='Nova York', resultado=Autorizado}", voo.getInfo());
    }

}
