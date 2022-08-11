public class SerieProxy implements Iserie {
    Integer qtdViews = 0;
    private Serie serie;

    public Integer getQtdViews() {
        return qtdViews;
    }

    public void setQtdViews(Integer qtdViews) {
        this.qtdViews = qtdViews;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public Serie SerieProxy(Serie serie){
        this.serie = serie;
        serie.getSerie(serie.getNome());
        if(qtdViews < 3){
            qtdViews ++;
        }
        return serie;
    }
    @Override
    public Serie getSerie(String nomeSerie) {
        return null;
    }
}
