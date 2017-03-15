/**
 *
 */
package com.saruman.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author gustavo.marins
 *
 */
@Entity
@Table(name = "reino")
@XmlRootElement
public class Reino implements Serializable {

    @Id
    @Column(name = "idReino")
    private int idReino;
    @Column(name = "nome")
    private String nome;
    @Column(name = "administrador")
    @OneToOne
    private Usuario administrador;
    @Column(name = "qntOrcs")
    private int qntOrcs;
    @Column(name = "qntLobos")
    private int qntLobos;
    @Column(name = "usuarios")
    @OneToMany
    private List<Usuario> usuarios;
    private int lotacaoMax;

    public String relatorioGeral() {
        return "Reino{" + "id=" + idReino + ", nome="
                + nome + ", administrador=" + administrador.getNome() + ", qntOrcs="
                + qntOrcs + ", qntLobos=" + qntLobos + "Total de unidades=" + (qntLobos + qntOrcs)
                + "Maximo de unidade" + lotacaoMax + '}';
    }

    public Reino(int idReino, String nome, Usuario administrador, int qntOrcs, int qntLobos, List<Usuario> usuarios, int lotacaoMax) {
        this.idReino = idReino;
        this.nome = nome;
        this.administrador = administrador;
        this.qntOrcs = qntOrcs;
        this.qntLobos = qntLobos;
        this.usuarios = usuarios;
        this.lotacaoMax = lotacaoMax;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + this.idReino;
        hash = 11 * hash + (this.nome != null ? this.nome.hashCode() : 0);
        hash = 11 * hash + (this.administrador != null ? this.administrador.hashCode() : 0);
        hash = 11 * hash + this.qntOrcs;
        hash = 11 * hash + this.qntLobos;
        hash = 11 * hash + (this.usuarios != null ? this.usuarios.hashCode() : 0);
        hash = 11 * hash + this.lotacaoMax;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Reino other = (Reino) obj;
        if (this.idReino != other.idReino) {
            return false;
        }
        if (this.qntOrcs != other.qntOrcs) {
            return false;
        }
        if (this.qntLobos != other.qntLobos) {
            return false;
        }
        if (this.lotacaoMax != other.lotacaoMax) {
            return false;
        }
        if ((this.nome == null) ? (other.nome != null) : !this.nome.equals(other.nome)) {
            return false;
        }
        if (this.administrador != other.administrador && (this.administrador == null || !this.administrador.equals(other.administrador))) {
            return false;
        }
        return !(this.usuarios != other.usuarios && (this.usuarios == null || !this.usuarios.equals(other.usuarios)));
    }

    public int getIdReino() {
        return idReino;
    }

    public void setIdReino(int idReino) {
        this.idReino = idReino;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Usuario getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Usuario administrador) {
        this.administrador = administrador;
    }

    public int getQntOrcs() {
        return qntOrcs;
    }

    public void setQntOrcs(int qntOrcs) {
        this.qntOrcs = qntOrcs;
    }

    public int getQntLobos() {
        return qntLobos;
    }

    public void setQntLobos(int qntLobos) {
        this.qntLobos = qntLobos;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public int getLotacaoMax() {
        return lotacaoMax;
    }

    public void setLotacaoMax(int lotacaoMax) {
        this.lotacaoMax = lotacaoMax;
    }

}
