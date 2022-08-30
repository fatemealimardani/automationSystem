package model.repository;

import connection.SessionFactorySingleton;
import model.entity.PersonBirthIdentity;
import model.repository.genericCRUD.CRUDRepository;
import org.hibernate.SessionFactory;

import java.util.List;

public class PersonBirthIdentityRepository extends CRUDRepository<PersonBirthIdentity, Integer> {
    private final SessionFactory sessionFactory = SessionFactorySingleton.getInstance();

    public PersonBirthIdentity findById(Integer id) {
        var session = sessionFactory.getCurrentSession();
        return session
                .createQuery("from PersonBirthIdentity as p where p.id = :id", PersonBirthIdentity.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    public List<PersonBirthIdentity> findAll() {
        var session = sessionFactory.getCurrentSession();
        return session
                .createQuery("from PersonBirthIdentity  as p", PersonBirthIdentity.class)
                .list();
    }
}
