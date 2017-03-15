package com.saruman.dao.imp;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.saruman.dao.ReinoInter;
import com.saruman.modelo.Reino;
import com.saruman.util.HibernateUtil;
import org.hibernate.Transaction;
import org.hibernate.Session;

/**
 * @author gustavo.marins
 *
 */
@Repository
@Transactional
public class ReinoDaoImp implements ReinoInter {

    public void adicionar(Reino reino) {
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            session.save(reino);
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

    public void alterar(Reino reino) {
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            session.update(reino);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
    }

    public void remover(Reino reino) {
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            Reino reino1 = (Reino) session.load(Reino.class, new Integer(reino.getIdReino()));
            session.delete(reino1);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
    }

    public Reino buscarReino(int idReino) {
        Reino reino = null;
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            String queryString = "from Reino where idReino = :id";
            Query query = session.createQuery(queryString);
            query.setInteger("id", idReino);
            user = (Reino) query.uniqueResult();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return reino;
    }

    public List<Reino> listarReinos() {
        List<Reino> reinos = new ArrayList<Reino>();
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            reinos = session.createQuery("from reino").list();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return reinos;
    }

    public String relatorio(int id) {
        String relatorio = buscarReino(id).relatorio();
        return relatorio;
    }

}
