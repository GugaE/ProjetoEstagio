/**
 * 
 */
package com.saruman.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author gustavo.marins
 *
 */
@Entity
@Table(name = "permissoes")
@XmlRootElement
public class Permissoes {

	@Id
	@Column(name = "idPermissoes")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idPermissoes;
	@Column(name = "upLoadFiles")
	private boolean upLoadFiles;
	@Column(name = "administrador")
	private boolean administrador;
	@Column(name = "adicionarReino")
	private boolean adicionarReino;
	@Column(name = "deletarUsuario")
	private boolean deletarUsuario;
	@Column(name = "grupo")
	private Grupos grupo;

	public Permissoes(int grupo) {

		switch (grupo) {
		case 1:
			this.grupo = Grupos.SARUMAN;
			this.administrador = true;
			this.upLoadFiles = true;
			this.adicionarReino = true;
			this.deletarUsuario = true;
			break;
		case 2:
			this.grupo = Grupos.ADMINISTRADOR;
			this.administrador = true;
			this.upLoadFiles = true;
			this.deletarUsuario = true;
			break;
		case 3:
			this.grupo = Grupos.GOBLINS;
			this.administrador = false;
			this.upLoadFiles = true;
			this.deletarUsuario = false;
			break;
		case 4:
			this.grupo = Grupos.SNAGAS;
			this.administrador = false;
			this.upLoadFiles = true;
			this.deletarUsuario = false;
			break;
		case 5:
			this.grupo = Grupos.URUKHAIS;
			this.administrador = false;
			this.upLoadFiles = true;
			this.deletarUsuario = false;
			break;
		}

	}
}
