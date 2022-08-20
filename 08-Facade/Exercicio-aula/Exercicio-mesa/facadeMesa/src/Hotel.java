import java.time.LocalDate;

public class Hotel {
    private LocalDate dataDeEntrada;
    private LocalDate dataDeSaida;
    private String cidade;

    public Hotel(LocalDate dataDeEntrada, LocalDate dataDeSaida, String cidade) {
        this.dataDeEntrada = dataDeEntrada;
        this.dataDeSaida = dataDeSaida;
        this.cidade = cidade;
    }

    public Hotel() {
    }

    public LocalDate getDataDeEntrada() {
        return dataDeEntrada;
    }

    public void setDataDeEntrada(LocalDate dataDeEntrada) {
        this.dataDeEntrada = dataDeEntrada;
    }

    public LocalDate getDataDeSaida() {
        return dataDeSaida;
    }

    public void setDataDeSaida(LocalDate dataDeSaida) {
        this.dataDeSaida = dataDeSaida;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
