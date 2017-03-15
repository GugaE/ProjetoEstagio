package com.saruman.dao;

import java.util.List;
import com.saruman.modelo.Reino;

public interface ReinoInter {

    public void adicionar(Reino reino);

    public void alterar(Reino reino);

    public void remover(Reino reino);

    public Reino buscarReino(int idReino);

    public List<Reino> listarReinos();

    public String relatorio(int id);
}
