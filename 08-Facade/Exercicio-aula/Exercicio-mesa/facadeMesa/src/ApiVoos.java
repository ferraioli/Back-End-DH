public class ApiVoos {

    public String buscarVoos(Voos voos){
        String dataPartida ="Data de partida: " + voos.getDataPartida();
        String dataChegada ="Data de retorno: " + voos.getDataRetorno();
        String origem ="Cidade de embarque: " + voos.getOrigem();
        String destino ="Cidade de destino: " + voos.getDestino();


        return " ----------------------- Voos: ------------------------"
                + "\n" + dataPartida + "; " + dataChegada + "; " + origem + "; " +destino;
    }
}
