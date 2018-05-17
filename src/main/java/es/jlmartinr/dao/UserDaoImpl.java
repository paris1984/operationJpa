package es.jlmartinr.dao;

import es.jlmartinr.entity.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Boolean save(User user) {
        Boolean success = true;
        try {
            sessionFactory.getCurrentSession().save(user);
        }catch (Exception e){
            success = false;
        }
        return success;
    }

    @Override
    public List<User> list() {
        TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery("from User");
        return query.getResultList();
    }
}
