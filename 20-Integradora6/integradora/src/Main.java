import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Empresa> contatos = new ArrayList<>();
        List<Funcionarios> funcionarios = new ArrayList<>();

        Funcionarios funcionario1 = new Funcionarios("Saul", "Goodman"
                , "154894846-459", 12500.00);
        Funcionarios funcionario2 = new Funcionarios("Jessie", "Jackson"
                , "546484684-658", 1500.00);
        Funcionarios funcionario3 = new Funcionarios("Walter", "White"
                , "5464155684-783", 1500.00);
        Funcionarios funcionario4 = new Funcionarios("Gustavo", "Fring"
                , "7899413554-666", 155500.00);
        funcionarios.add(funcionario1);
        funcionarios.add(funcionario2);
        funcionarios.add(funcionario3);
        funcionarios.add(funcionario4);

        Empresa empresa1 = new Empresa("515617-8546841",
                "Saul Goodman attorney's .INC", funcionarios);

        contatos.add(empresa1);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("Empresa.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            FileOutputStream fileOutputStream1 = new FileOutputStream("Funcionarios.txt");
            ObjectOutputStream objectOutputStream1 = new ObjectOutputStream(fileOutputStream1);

            objectOutputStream.writeObject(contatos);
            objectOutputStream1.writeObject(funcionarios);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        List<Empresa> empresas1 = null;
        List<Funcionarios> funcionarios1 = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("Empresa.txt");
            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);


            empresas1 = (List<Empresa>) inputStream.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        for (Empresa contato : empresas1) {
            System.out.println(contato.getCNPJ() + ";" + contato.getRazaoSocial() +
                    ";" + funcionarios);
        }
        FileWriter fileWriter = new FileWriter("empregados.txt");
        PrintWriter escreverArquivo = new PrintWriter(fileWriter);


        for (Funcionarios funcionario : funcionarios) {
            escreverArquivo.printf("%s;%s;%s;%s%n", funcionario.getNome(), funcionario.getSobrenome(),
                    funcionario.getDocumentoDeIdentificacao(), funcionario.getSalario());
        }
        fileWriter.close();
    }
}
