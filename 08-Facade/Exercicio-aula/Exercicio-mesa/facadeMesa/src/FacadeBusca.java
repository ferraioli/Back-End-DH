public class FacadeBusca {
    private ApiVoos apiVoos;
    private ApiHotel apiHotel;

    public FacadeBusca() {
         apiVoos = new ApiVoos();
         apiHotel = new ApiHotel();
    }

    public String buscarHotelEVoo(Voos voos, Hotel hotel){
        String booking = " ";
        if (voos.getDestino().contains(hotel.getCidade())){
            if (hotel.getDataDeEntrada().equals(voos.getDataPartida())){

                return booking = apiVoos.buscarVoos(voos) + "\n" + apiHotel.buscarHotel(hotel);

            }
            else {
                return booking = "Datas não compativeis";
            }
        }
        else {
            return booking = "Destinos não compativeis";
        }
    }
}
