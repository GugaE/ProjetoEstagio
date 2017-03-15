/**
 * 
 */
package com.saruman.negocios;

import java.util.List;

import com.saruman.dao.UsuarioInter;
import com.saruman.dao.imp.UsuarioDaoImp;
import com.saruman.modelo.Usuario;

/**
 * @author gustavo.marins
 *
 */
public class UsuarioNeg implements UsuarioInter {

	private UsuarioDaoImp usuarioDao;

	public void adicionar(Usuario usuario) {
		usuarioDao.adicionar(usuario);

	}

	public void remover(Usuario usuario) {
		usuarioDao.remover(usuario);

	}

	public Usuario buscarUsuario(int idUsuario) {

		return usuarioDao.buscarUsuario(idUsuario);
	}

	public List<Usuario> listarUsuarios() {
		// TODO Auto-generated method stub
		return usuarioDao.listarUsuarios();
	}

	@Override
	public void alterar(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

}
