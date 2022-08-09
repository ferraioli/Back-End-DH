import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Marc", LocalDate.of(2000,12,12));

        System.out.println(pessoa.validarIdade());


    }
}
