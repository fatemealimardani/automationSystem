package model.repository;

import connection.SessionFactorySingleton;
import model.entity.PersonEducation;
import model.repository.genericCRUDRepository.CRUDRepository;
import org.hibernate.SessionFactory;

import java.util.List;

public class PersonEducationRepository extends CRUDRepository<PersonEducation, Integer> {
    private final SessionFactory sessionFactory = SessionFactorySingleton.getInstance();

    public PersonEducation findById(Integer id) {
        var session = sessionFactory.getCurrentSession();
        return session
                .createQuery("from PersonEducation as p where p.id = :id", PersonEducation.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    public List<PersonEducation> findAll() {
        var session = sessionFactory.getCurrentSession();
        return session
                .createQuery("from PersonEducation as p", PersonEducation.class)
                .list();
    }
}
