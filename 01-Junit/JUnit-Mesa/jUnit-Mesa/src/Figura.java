public abstract class Figura {
    private int medida;

    public Figura(int medida) {
        this.medida = medida;
    }

    public int getMedida() {
        return medida;
    }

    public void setMedida(int medida) {
        this.medida = medida;
    }

    public abstract int calcPerimetro();
}
