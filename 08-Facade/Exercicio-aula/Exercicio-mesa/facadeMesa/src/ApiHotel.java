public class ApiHotel {

    public String buscarHotel(Hotel hotel){
       String dataEntrada = "Data de entrada: " + hotel.getDataDeEntrada();
       String dataSaida = "Data de saída: " + hotel.getDataDeSaida();
       String cidade = "Cidade: " + hotel.getCidade();


        return " ----------------------- Hotel: ------------------------"
                + "\n" + dataEntrada + "; " + dataSaida + "; " + cidade ;
    }
}
