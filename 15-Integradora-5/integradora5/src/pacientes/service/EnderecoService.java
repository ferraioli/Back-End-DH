package pacientes.service;

import pacientes.dao.IDao;
import pacientes.model.Endereco;
import pacientes.model.Pacientes;

public class EnderecoService {

    private IDao<Endereco> enderecoIDao;

    public EnderecoService(IDao<Endereco> enderecoIDao) {
        this.enderecoIDao = enderecoIDao;
    }

    public Endereco salvar(Endereco endereco){
        return enderecoIDao.salvar(endereco);
    }

    public Endereco buscar(Integer id){
        return enderecoIDao.buscar(id);
    }
}
