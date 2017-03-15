/**
 *
 */
package com.saruman.ws;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.saruman.dao.UsuarioInter;
import com.saruman.modelo.Usuario;
import com.saruman.negocios.UsuarioNeg;

/**
 * @author gustavo.marins
 *
 */
@Path("/usuariows")
public class UsuarioWS implements UsuarioInter {

    private UsuarioNeg usuarioNeg;

    @GET
    @Path("/adicionar")
    @Produces(MediaType.APPLICATION_JSON)
    public void adicionar(Usuario usuario) {
        usuarioNeg.adicionar(usuario);

    }

    @GET
    @Path("/logarface")
    @Produces(MediaType.APPLICATION_JSON)
    public void logarFace(Usuario usuario) {
        usuario.logarFace(usuario);
    }

    @GET
    @Path("/remover")
    @Produces(MediaType.APPLICATION_JSON)
    public void remover(Usuario usuario) {
        usuarioNeg.remover(usuario);

    }

    @GET
    @Path("/buscar")
    @Produces(MediaType.APPLICATION_JSON)
    public Usuario buscarUsuario(int idUsuario) {
        // TODO Auto-generated method stub
        return usuarioNeg.buscarUsuario(idUsuario);
    }

    @GET
    @Path("/listartodos")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Usuario> listarUsuarios() {
        // TODO Auto-generated method stub
        return usuarioNeg.listarUsuarios();
    }

    @Override
    public void alterar(Usuario usuario) {
        // TODO Auto-generated method stub

    }
}
