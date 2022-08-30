package model.repository;

import connection.SessionFactorySingleton;
import model.entity.PersonSponsoredStatus;
import org.hibernate.SessionFactory;

import java.util.List;

public class PersonSponsoredStatusRepository {
    private final SessionFactory sessionFactory = SessionFactorySingleton.getInstance();

    public PersonSponsoredStatus findById(Integer id) {
        var session = sessionFactory.getCurrentSession();
        return session
                .createQuery("from PersonSponsoredStatus as p where p.id = :id", PersonSponsoredStatus.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    public List<PersonSponsoredStatus> findAll() {
        var session = sessionFactory.getCurrentSession();
        return session
                .createQuery("from PersonSponsoredStatus as p", PersonSponsoredStatus.class)
                .list();
    }
}
