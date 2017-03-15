package com.saruman.dao.imp;

import java.util.List;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.saruman.dao.PermissoesInter;
import com.saruman.modelo.Permissoes;
import com.saruman.modelo.Reino;
import com.saruman.util.HibernateUtil;
import java.util.ArrayList;
import javax.persistence.Query;
import org.hibernate.Transaction;

@Repository
@Transactional
public class PermissoesDaoImp implements PermissoesInter {

    public void adicionar(Permissoes permissoes) {
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            session.save(permissoes);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
                throw new RuntimeException(e);
            }
        } finally {
            session.flush();
            session.close();
        }
    }

    public void remover(Permissoes permissoes) {
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            Permissoes permissoes1 = (Permissoes) session.load(Permissoes.class, new Integer(permisssoes.getIdPermissoes()));
            session.delete(permissoes1);
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

    public Permissoes buscarPermissoes(int idPermissoes) {
        Permissoes permissoes = null;
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            String queryString = "from Reino where idReino = :id";
            Query query = session.createQuery(queryString);
            query.setInteger("id", idPermissoes);
            permissoes = (Permissoes) query.uniqueResult();
        } catch (RuntimeException e) {
        } finally {
            session.flush();
            session.close();
        }
        return permissoes;
    }

    public List<Permissoes> listarPermissoes() {
        List<Permissoes> permissoes = new ArrayList<Permissoes>();
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            permissoes = session.createQuery("from Permissoes").list();
        } catch (RuntimeException e) {
        } finally {
            session.flush();
            session.close();
        }
        return permissoes;
    }

    public void alterar(Permissoes permissoes) {
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            session.update(permissoes);
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

}
