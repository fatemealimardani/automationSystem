package model.repository;

import connection.SessionFactorySingleton;
import model.entity.PersonSkill;
import model.repository.genericCRUD.CRUDRepository;
import org.hibernate.SessionFactory;

import java.util.List;

public class PersonSkillRepository extends CRUDRepository<PersonSkill, Integer> {
    private final SessionFactory sessionFactory = SessionFactorySingleton.getInstance();

    public PersonSkill findById(Integer id) {
        var session = sessionFactory.getCurrentSession();
        return session
                .createQuery("from PersonSkill as p where p.id = :id", PersonSkill.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    public List<PersonSkill> findAll() {
        var session = sessionFactory.getCurrentSession();
        return session
                .createQuery("from PersonSkill as p", PersonSkill.class)
                .list();
    }
}
