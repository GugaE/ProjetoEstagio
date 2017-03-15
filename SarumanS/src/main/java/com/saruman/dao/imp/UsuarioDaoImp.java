package com.saruman.dao.imp;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.hibernate.*;
import com.saruman.dao.UsuarioInter;

import com.saruman.modelo.Usuario;
import com.saruman.util.HibernateUtil;
import java.util.ArrayList;

@Repository
@Transactional
public class UsuarioDaoImp implements UsuarioInter {

    public void adicionar(Usuario usuario) {
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            session.save(usuario);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
        } finally {
            session.flush();
            session.close();
        }
    }

    @Override
    public void alterar(Usuario usuario) {
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            session.update(usuario);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }

        } finally {
            session.flush();
            session.close();
        }

    }

    public void remover(Usuario usuario) {
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            Usuario usuario1;
            usuario1 = (Usuario) session.load(Usuario.class, usuario.getIdUsuario());
            session.delete(usuario1);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
        } finally {
            session.flush();
            session.close();
        }

    }

    public Usuario buscarUsuario(int idUsuario) {
        Usuario usuario = null;
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            String queryString = "from Usuario where idUsuario = :id";
            Query query = session.createQuery(queryString);
            query.setInteger("id", idUsuario);
            usuario = (Usuario) query.uniqueResult();
        } catch (RuntimeException e) {
        } finally {
            session.flush();
            session.close();
        }
        return usuario;
    }

    public List<Usuario> listarUsuarios() {
        List<Usuario> usuario = new ArrayList<Usuario>();
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            usuario = session.createQuery("from Usuario").list();
        } catch (RuntimeException e) {
        } finally {
            session.flush();
            session.close();
        }
        return usuario;
    }
}
