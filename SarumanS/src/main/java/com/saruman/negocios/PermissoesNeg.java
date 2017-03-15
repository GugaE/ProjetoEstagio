package com.saruman.negocios;

import java.util.List;

import com.saruman.dao.PermissoesInter;
import com.saruman.dao.imp.PermissoesDaoImp;
import com.saruman.modelo.Permissoes;

public class PermissoesNeg implements PermissoesInter {

    private PermissoesDaoImp permissoesDao;

    public void adicionar(Permissoes permissoes) {
        // TODO Auto-generated method stub
        permissoesDao.adicionar(permissoes);
    }

    public void remover(Permissoes permissoes) {
        permissoesDao.remover(permissoes);

    }

    public Permissoes buscarPermissoes(int idPermissoes) {
        // TODO Auto-generated method stub
        return permissoesDao.buscarPermissoes(idPermissoes);
    }

    public List<Permissoes> listarPermissoes() {
        // TODO Auto-generated method stub
        return permissoesDao.listarPermissoes();
    }

    @Override
    public void alterar(Permissoes permissoes) {
        // TODO Auto-generated method stub

    }

}
