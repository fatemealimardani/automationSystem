package model.repository;

import connection.SessionFactorySingleton;
import model.entity.PersonSocialMedia;
import model.repository.genericCRUDRepository.CRUDRepository;
import org.hibernate.SessionFactory;

import java.util.List;

public class PersonSocialMediaRepository extends CRUDRepository<PersonSocialMedia, Integer> {
    private final SessionFactory sessionFactory = SessionFactorySingleton.getInstance();

    public PersonSocialMedia findById(Integer id) {
        var session = sessionFactory.getCurrentSession();
        return session
                .createQuery("from PersonSocialMedia as p where p.id = :id", PersonSocialMedia.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    public List<PersonSocialMedia> findAll() {
        var session = sessionFactory.getCurrentSession();
        return session
                .createQuery("from PersonSocialMedia as p", PersonSocialMedia.class)
                .list();
    }
}
