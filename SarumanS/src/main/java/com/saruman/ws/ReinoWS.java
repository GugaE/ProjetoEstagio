/**
 *
 */
package com.saruman.ws;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.saruman.dao.ReinoInter;
import com.saruman.modelo.Reino;
import com.saruman.negocios.ReinoNeg;

/**
 * @author gustavo.marins
 *
 */
@Path("/reinows")
public class ReinoWS implements ReinoInter {

    private ReinoNeg reinoNeg;

    @GET
    @Path("/adicionar")
    @Produces(MediaType.APPLICATION_JSON)
    public void adicionar(Reino reino) {
        // TODO Auto-generated method stub
        reinoNeg.adicionar(reino);
    }

    @GET
    @Path("/remover")
    @Produces(MediaType.APPLICATION_JSON)
    public void remover(Reino reino) {
        reinoNeg.remover(reino);
    }

    @GET
    @Path("/buscar")
    @Produces(MediaType.APPLICATION_JSON)
    public Reino buscarReino(int idReino) {
        // TODO Auto-generated method stub
        return reinoNeg.buscarReino(idReino);
    }

    @GET
    @Path("/relatorio")
    @Produces(MediaType.APPLICATION_JSON)
    public String relatorio(int id) {
        return reinoNeg.relatorio(id);
    }

    @GET
    @Path("/listarreinos")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Reino> listarReinos() {
        // TODO Auto-generated method stub
        return reinoNeg.listarReinos();
    }

    @GET
    @Path("/alterar")
    @Produces(MediaType.APPLICATION_JSON)
    public void alterar(Reino reino) {
        reinoNeg.alterar(reino);
    }

}
