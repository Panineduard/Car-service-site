package ua.kh.multiservice.service;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ua.kh.multiservice.dao.models.Login;
import ua.kh.multiservice.dao.service.HibernateUtil;


/**
 * Created by paninEd on 28.01.2017.
 */

    @Service
    public class UserDetailsServiceImpl implements UserDetailsService {

        public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {

            Login login;
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            Query query= session.createQuery("from Login l where l.id=:id");
            query.setParameter("id",id);
            login=(Login)query.uniqueResult();
            session.beginTransaction().commit();
            return login;
        }

    }

