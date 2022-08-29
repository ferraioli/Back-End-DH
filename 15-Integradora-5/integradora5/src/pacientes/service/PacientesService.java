package pacientes.service;

import pacientes.dao.IDao;
import pacientes.model.Pacientes;

public class PacientesService {

    private IDao<Pacientes> pacientesIDao;

    public PacientesService(IDao<Pacientes> pacientesIDao) {
        this.pacientesIDao = pacientesIDao;
    }

    public Pacientes salvar(Pacientes pacientes){
        return pacientesIDao.salvar(pacientes);
    }

    public Pacientes buscar(Integer id){
        return pacientesIDao.buscar(id);
    }
}
