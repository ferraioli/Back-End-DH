import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Contato> contatos = new ArrayList<>();

        Contato contato1 = new Contato("Walter White",
                "breakingbad@gmail.com", "123456789");
        Contato contato2 = new Contato("Gustavo Fring",
                "elPolloLoco@gmail.com", "1234546589");
        Contato contato3 = new Contato("Saul Goodman",
                "jimmyMcGill@gmail.com", "1237644789");

        contatos.add(contato1);
        contatos.add(contato2);
        contatos.add(contato3);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("Contatos.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(contatos);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        List<Contato> contatos1 = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("Contatos.txt");
            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);

            contatos1 = (List<Contato>) inputStream.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        for (Contato contato: contatos1) {
            System.out.println(contato.getNome() +"|"+ contato.getEmail()
                    + "|" + contato.getTelefone());
        }
    }
}
