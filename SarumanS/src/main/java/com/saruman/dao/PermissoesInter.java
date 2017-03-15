package com.saruman.dao;

import java.util.List;
import com.saruman.modelo.Permissoes;
import com.saruman.modelo.Reino;

public interface PermissoesInter {

    public void adicionar(Permissoes permissoes);

    public void alterar(Permissoes permissoes);

    public void remover(Permissoes permissoes);

    public Permissoes buscarPermissoes(int idPermissoes);

    public List<Permissoes> listarPermissoes();

}
