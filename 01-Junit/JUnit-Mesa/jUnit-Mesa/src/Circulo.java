public class Circulo extends Figura{
    public Circulo(int medida) {
        super(medida);
    }

    @Override
    public int calcPerimetro() {
       int perimetro = (int) ((2* Math.PI) * this.getMedida());
        return perimetro;
    }


}
