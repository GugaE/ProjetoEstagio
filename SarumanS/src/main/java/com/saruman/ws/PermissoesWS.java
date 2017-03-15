/**
 *
 */
package com.saruman.ws;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.saruman.dao.PermissoesInter;
import com.saruman.modelo.Permissoes;

import com.saruman.negocios.PermissoesNeg;

/**
 * @author gustavo.marins
 *
 */
@Path("/permissoesws")
public class PermissoesWS implements PermissoesInter {

    private PermissoesNeg permissoesNeg;

    @GET
    @Path("/adicionar")
    @Produces(MediaType.APPLICATION_JSON)
    public void adicionar(Permissoes permissoes) {
        permissoesNeg.adicionar(permissoes);
    }

    @GET
    @Path("/remover")
    @Produces(MediaType.APPLICATION_JSON)
    public void remover(Permissoes permissoes) {
        permissoesNeg.remover(permissoes);
    }

    @GET
    @Path("/buscarpermissoes")
    @Produces(MediaType.APPLICATION_JSON)
    public Permissoes buscarPermissoes(int idPermissoes) {
        // TODO Auto-generated method stub
        return permissoesNeg.buscarPermissoes(idPermissoes);
    }

    @GET
    @Path("/listarpermissoes")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Permissoes> listarPermissoes() {
        // TODO Auto-generated method stub
        return permissoesNeg.listarPermissoes();
    }

    @GET
    @Path("/listarpermissoes")
    @Produces(MediaType.APPLICATION_JSON)
    public void alterar(Permissoes permissoes) {
        permissoesNeg.alterar(permissoes);
    }

}
