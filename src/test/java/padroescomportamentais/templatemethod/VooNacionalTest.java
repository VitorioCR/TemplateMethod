package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VooNacionalTest {

    @Test
    void deveRetornarAutorizadoVooNacional() {
        VooNacional voo = new VooNacional();
        voo.setPesoCarga(5000.0f);
        voo.setPesoBagagens(4000.0f);
        assertEquals("Autorizado", voo.verificarAutorizacao());
    }

    @Test
    void deveRetornarNaoAutorizadoVooNacional() {
        VooNacional voo = new VooNacional();
        voo.setPesoCarga(6000.0f);
        voo.setPesoBagagens(5000.0f);
        assertEquals("Nao Autorizado - Excesso de Peso", voo.verificarAutorizacao());
    }

    @Test
    void deveRetornarInformacoesVooNacional() {
        VooNacional voo = new VooNacional();
        voo.setNumeroVoo(123);
        voo.setDestino("Sao Paulo");
        voo.setPesoCarga(5000.0f);
        voo.setPesoBagagens(4000.0f);
        assertEquals("Voo{numeroVoo=123, destino='Sao Paulo', resultado=Autorizado}", voo.getInfo());
    }

}
