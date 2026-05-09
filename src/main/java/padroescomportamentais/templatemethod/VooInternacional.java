package padroescomportamentais.templatemethod;

public class VooInternacional extends Voo {

    public String verificarAutorizacao() {
        if (this.calcularPesoTotal() <= 20000.0f) {
            return "Autorizado";
        }
        else {
            return "Nao Autorizado - Excesso de Peso";
        }
    }

    @Override
    public String getTipo() {
        return "VooInternacional";
    }
}
