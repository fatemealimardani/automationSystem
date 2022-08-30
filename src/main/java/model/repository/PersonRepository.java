package model.repository;

import connection.SessionFactorySingleton;
import model.entity.Person;
import model.repository.genericCRUDRepository.CRUDRepository;
import org.hibernate.SessionFactory;

import java.util.List;

public class PersonRepository extends CRUDRepository<Person, Integer> {
    private final SessionFactory sessionFactory = SessionFactorySingleton.getInstance();

    public Person findById(Integer id) {
        var session = sessionFactory.getCurrentSession();
        return session
                .createQuery("from Person as p where p.id = :id", Person.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    public List<Person> findAll() {
        var session = sessionFactory.getCurrentSession();
        return session
                .createQuery("from Person  as p", Person.class)
                .list();
    }
}
