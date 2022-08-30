package model.repository;

import connection.SessionFactorySingleton;
import model.entity.MilitaryServiceInformation;
import model.repository.genericCRUD.CRUDRepository;
import org.hibernate.SessionFactory;

import java.util.List;

public class MilitaryServiceInformationRepository extends CRUDRepository<MilitaryServiceInformation, Integer> {
    private final SessionFactory sessionFactory = SessionFactorySingleton.getInstance();

    public MilitaryServiceInformation findById(Integer id) {
        var session = sessionFactory.getCurrentSession();
        return session
                .createQuery("from MilitaryServiceInformation as m where m.id = :id", MilitaryServiceInformation.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    public List<MilitaryServiceInformation> findAll() {
        var session = sessionFactory.getCurrentSession();
        return session
                .createQuery("from MilitaryServiceInformation as m", MilitaryServiceInformation.class)
                .list();
    }
}

