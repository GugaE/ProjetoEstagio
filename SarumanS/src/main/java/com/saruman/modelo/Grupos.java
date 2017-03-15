package com.saruman.modelo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public enum Grupos {
	
SARUMAN(1),ADMINISTRADOR(2),GOBLINS(3),URUKHAIS(4),SNAGAS(5);
	
	private int valor;
	
	private Grupos(int valor) {
		this.valor = valor;
	}
	public int getValor() {
		return valor;
	}
	
}
