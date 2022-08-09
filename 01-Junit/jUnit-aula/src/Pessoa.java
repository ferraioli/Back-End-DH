import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;

    public Pessoa(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                '}';
    }

    public int validarIdade(){
        int idade = Period.between(this.dataNascimento, LocalDate.now()).getYears();
        return idade;
    }

    public List<String> adicionarNomes(List<Pessoa> pessoas) {
        List<String> colecao = new ArrayList<>();

        for (int i = 0; i< pessoas.size(); i++) {
            int tamanhoNome = pessoas.get(i).getNome().length();
            int idade = pessoas.get(i).validarIdade();

            if(tamanhoNome > 4 && idade > 17) {
                colecao.add(pessoas.get(i).getNome());
            }
        }

        return colecao;
    }
}
