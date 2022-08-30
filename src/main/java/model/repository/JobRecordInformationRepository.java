package model.repository;

import connection.SessionFactorySingleton;
import model.entity.JobRecordInformation;
import model.repository.genericCRUD.CRUDRepository;
import org.hibernate.SessionFactory;

import java.util.List;

public class JobRecordInformationRepository extends CRUDRepository<JobRecordInformation, Integer> {
    private final SessionFactory sessionFactory = SessionFactorySingleton.getInstance();

    public JobRecordInformation findById(Integer id) {
        var session = sessionFactory.getCurrentSession();
        return session
                .createQuery("from JobRecordInformation as j where j.id = :id", JobRecordInformation.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    public List<JobRecordInformation> findAll() {
        var session = sessionFactory.getCurrentSession();
        return session
                .createQuery("from JobRecordInformation as j", JobRecordInformation.class)
                .list();
    }
}
