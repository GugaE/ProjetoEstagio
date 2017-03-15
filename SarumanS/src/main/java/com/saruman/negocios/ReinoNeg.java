package com.saruman.negocios;

import java.util.List;

import com.saruman.dao.ReinoInter;
import com.saruman.dao.imp.ReinoDaoImp;
import com.saruman.modelo.Reino;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReinoNeg implements ReinoInter {

    private ReinoDaoImp reinoDao;

    public void adicionar(Reino reino) {
        try {
            reinoDao.adicionar(reino);
        } catch (Exception ex) {
            Logger.getLogger(ReinoNeg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void remover(Reino reino) {
        try {
            reinoDao.adicionar(reino);
        } catch (Exception ex) {
            Logger.getLogger(ReinoNeg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Reino buscarReino(int idReino) {
        try {
            // TODO Auto-generated method stub
            return reinoDao.buscarReino(idReino);
        } catch (Exception ex) {
            Logger.getLogger(ReinoNeg.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Reino> listarReinos() {
        try {
            // TODO Auto-generated method stub
            return reinoDao.listarReinos();
        } catch (Exception ex) {
            Logger.getLogger(ReinoNeg.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public void alterar(Reino reino) {
        try {
            reinoDao.alterar(reino);
        } catch (Exception ex) {
            Logger.getLogger(ReinoNeg.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public String relatorio(int id) {
        return reinoDao.relatorio(id);
    }
}
