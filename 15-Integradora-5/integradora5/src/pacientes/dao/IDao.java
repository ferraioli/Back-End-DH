package pacientes.dao;

public interface IDao <T> {

    public T salvar(T t);
    public T buscar(Integer id);
    public T excluir(T t);
    public T excluir(Integer id);
    public T atualizar(T t);
}
