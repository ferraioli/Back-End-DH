import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel(LocalDate.of(2019,12,12),
                LocalDate.now(), "Cabo Frio");
        Voos voos = new Voos(LocalDate.of(2019,12,12),
                LocalDate.now(), "São Gonçalo", "Cabo Frio");

        FacadeBusca facadeBusca = new FacadeBusca();

        System.out.println(facadeBusca.buscarHotelEVoo(voos, hotel));
    }
}
