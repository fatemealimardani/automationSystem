package model.repository;

import connection.SessionFactorySingleton;
import model.entity.PhysicalConditionInformation;
import model.repository.genericCRUD.CRUDRepository;
import org.hibernate.SessionFactory;

import java.util.List;

public class PhysicalConditionInformationRepository extends CRUDRepository<PhysicalConditionInformation, Integer> {
    private final SessionFactory sessionFactory = SessionFactorySingleton.getInstance();

    public PhysicalConditionInformation findById(Integer id) {
        var session = sessionFactory.getCurrentSession();
        return session
                .createQuery("from PhysicalConditionInformation as p where p.id = :id", PhysicalConditionInformation.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    public List<PhysicalConditionInformation> findAll() {
        var session = sessionFactory.getCurrentSession();
        return session
                .createQuery("from PhysicalConditionInformation as p", PhysicalConditionInformation.class)
                .list();
    }
}
