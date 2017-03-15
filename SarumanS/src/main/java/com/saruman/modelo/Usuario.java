/**
 *
 */
package com.saruman.modelo;

import java.util.Calendar;

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
@Table(name = "usuario")
@XmlRootElement
public class Usuario {

    @Id
    @Column(name = "idUsuario")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idUsuario;
    @Column(name = "nome")
    private String nome;
    @Column(name = "sobrenome")
    private String sobreNome;
    @Column(name = "email")
    private String email;
    @Column(name = "dataNascimento")
    private Calendar dataNascimento;
    @Column(name = "idFace")
    private String idFace;
    @Column(name = "linkFace")
    private String linkFace;
    @Column(name = "verified")
    private String verified;
    @Column(name = "senha")
    private String senha;
    @Column(name = "grupo")
    private Grupos grupo;

    public void logarFace(Usuario usuario) {

    }
    // contrutores

    public Usuario() {
    }

    public Usuario(int idUsuario, String nome, String sobreNome, String email, Calendar dataNascimento, String idFace,
            String linkFace, String verified, String senha, Grupos grupo) {
        super();
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.idFace = idFace;
        this.linkFace = linkFace;
        this.verified = verified;
        this.senha = senha;
        this.grupo = grupo;
    }

    // hashCode e equals
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((grupo == null) ? 0 : grupo.hashCode());
        result = prime * result + ((idFace == null) ? 0 : idFace.hashCode());
        result = prime * result + idUsuario;
        result = prime * result + ((linkFace == null) ? 0 : linkFace.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((senha == null) ? 0 : senha.hashCode());
        result = prime * result + ((sobreNome == null) ? 0 : sobreNome.hashCode());
        result = prime * result + ((verified == null) ? 0 : verified.hashCode());
        return result;
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
        Usuario other = (Usuario) obj;
        if (dataNascimento == null) {
            if (other.dataNascimento != null) {
                return false;
            }
        } else if (!dataNascimento.equals(other.dataNascimento)) {
            return false;
        }
        if (email == null) {
            if (other.email != null) {
                return false;
            }
        } else if (!email.equals(other.email)) {
            return false;
        }
        if (grupo != other.grupo) {
            return false;
        }
        if (idFace == null) {
            if (other.idFace != null) {
                return false;
            }
        } else if (!idFace.equals(other.idFace)) {
            return false;
        }
        if (idUsuario != other.idUsuario) {
            return false;
        }
        if (linkFace == null) {
            if (other.linkFace != null) {
                return false;
            }
        } else if (!linkFace.equals(other.linkFace)) {
            return false;
        }
        if (nome == null) {
            if (other.nome != null) {
                return false;
            }
        } else if (!nome.equals(other.nome)) {
            return false;
        }
        if (senha == null) {
            if (other.senha != null) {
                return false;
            }
        } else if (!senha.equals(other.senha)) {
            return false;
        }
        if (sobreNome == null) {
            if (other.sobreNome != null) {
                return false;
            }
        } else if (!sobreNome.equals(other.sobreNome)) {
            return false;
        }
        if (verified == null) {
            if (other.verified != null) {
                return false;
            }
        } else if (!verified.equals(other.verified)) {
            return false;
        }
        return true;
    }

    // Gets e Sets
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getIdFace() {
        return idFace;
    }

    public void setIdFace(String idFace) {
        this.idFace = idFace;
    }

    public String getLinkFace() {
        return linkFace;
    }

    public void setLinkFace(String linkFace) {
        this.linkFace = linkFace;
    }

    public String getVerified() {
        return verified;
    }

    public void setVerified(String verified) {
        this.verified = verified;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Grupos getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupos grupo) {
        this.grupo = grupo;
    }

}
