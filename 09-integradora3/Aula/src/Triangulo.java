public class Triangulo {
    private String cor;
    private int tamanho;

    public Triangulo(String cor) {
        this.cor = cor;

    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "cor='" + cor + '\'' +
                ", tamanho=" + tamanho +
                '}';
    }
}
