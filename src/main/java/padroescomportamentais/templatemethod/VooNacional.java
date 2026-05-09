package padroescomportamentais.templatemethod;

public class VooNacional extends Voo {

    public String verificarAutorizacao() {
        if (this.calcularPesoTotal() <= 10000.0f) {
            return "Autorizado";
        }
        else {
            return "Nao Autorizado - Excesso de Peso";
        }
    }

}
