/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.foto.daos;

import br.com.foto.entity.usuarios;
import br.com.foto.util.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ACOSTA
 */
public class usuariosDaos {

    private Session session;
    private Transaction trans;
    private List<usuarios> list;

    public List<usuarios> getList() {
        session = HibernateUtil.getSessionFactory().openSession();
        trans = session.beginTransaction();
        
        Criteria cri= session.createCriteria(usuarios.class);
        this.list= cri.list(); 
        
        return list;
    }
    

    public void addusuarios(usuarios u) {
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            trans = session.beginTransaction();

            usuarios usuarios = new usuarios();
            usuarios.setName(u.getName());
             usuarios.setUser(u.getUser());
            usuarios.setPassword(u.getPassword());

            session.save(usuarios);
            trans.commit();

        } catch (Exception e) {
               e.printStackTrace();
               
        }finally{
            
            session.close();
        }

    }
    
    public void cancelarusuario(usuarios u){
        
         try {
            session = HibernateUtil.getSessionFactory().openSession();
            trans = session.beginTransaction();


            session.delete(u);
            trans.commit();

        } catch (Exception e) {
               e.printStackTrace();
               
        }finally{
            
            session.close();
        }
    }
}
