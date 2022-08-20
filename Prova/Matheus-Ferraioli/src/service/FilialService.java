package service;

import dao.IDao;
import model.Filial;

public class FilialService {

    private IDao<Filial> filialDao;


    public FilialService(IDao<Filial> filialIDao) {
        this.filialDao = filialIDao;
    }


    public Filial salvarFilial(Filial filial){
        filialDao.salvar(filial);
        return filial;
    }

}
