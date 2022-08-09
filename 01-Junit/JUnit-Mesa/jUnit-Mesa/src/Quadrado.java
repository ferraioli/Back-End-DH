public class Quadrado extends Figura{
    public Quadrado(int medida) {
        super(medida);
    }

    @Override
    public int calcPerimetro() {
       int area = this.getMedida() * 4;
        return area;
    }
}
