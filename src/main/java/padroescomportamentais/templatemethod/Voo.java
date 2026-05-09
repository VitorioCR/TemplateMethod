package padroescomportamentais.templatemethod;

public abstract class Voo {

    private int numeroVoo;
    protected String destino;
    private float pesoCarga;
    private float pesoBagagens;

    public int getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(int numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public float getPesoCarga() {
        return pesoCarga;
    }

    public void setPesoCarga(float pesoCarga) {
        this.pesoCarga = pesoCarga;
    }

    public float getPesoBagagens() {
        return pesoBagagens;
    }

    public void setPesoBagagens(float pesoBagagens) {
        this.pesoBagagens = pesoBagagens;
    }

    public float calcularPesoTotal() {
        return this.pesoCarga + this.pesoBagagens;
    }

    public abstract String verificarAutorizacao();

    public String getTipo() {
        return "Voo";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "numeroVoo=" + this.numeroVoo +
                ", destino='" + this.destino + '\'' +
                ", resultado=" + this.verificarAutorizacao() +
                '}';
    }
}
