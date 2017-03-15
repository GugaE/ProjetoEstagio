package com.saruman.dao;

import java.util.List;

import com.saruman.modelo.Usuario;

public interface UsuarioInter {
	
	public void adicionar(Usuario usuario);
	public void alterar(Usuario usuario);
	public void remover(Usuario usuario);
	public Usuario buscarUsuario(int idUsuario);
	public List<Usuario> listarUsuarios();

}
