package pacientes.service;

import pacientes.dao.IDao;
import pacientes.dao.impl.PacienteDaoImpl;
import pacientes.model.Endereco;
import pacientes.model.Pacientes;

public class ClinicaService {


    private IDao<Endereco> enderecoIDao;
    private IDao<Pacientes> pacienteIDao;

    public ClinicaService(IDao<Endereco> enderecoIDao, PacienteDaoImpl pacienteIDao) {
        this.enderecoIDao = enderecoIDao;
        this.pacienteIDao = pacienteIDao;
    }

    public Endereco salvar (Endereco endereco){
        return enderecoIDao.salvar(endereco);
    }

    public Pacientes salvar (Pacientes paciente){
        return pacienteIDao.salvar(paciente);
    }
}
