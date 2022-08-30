package model.repository;

import connection.SessionFactorySingleton;
import model.entity.AddressInformation;
import model.entity.Attachment;
import model.repository.genericCRUD.CRUDRepository;
import org.hibernate.SessionFactory;

import java.util.List;

public class AddressInformationRepository extends CRUDRepository<AddressInformation, Integer> {
    private final SessionFactory sessionFactory = SessionFactorySingleton.getInstance();

    public AddressInformation findById(Integer id) {
        var session = sessionFactory.getCurrentSession();
        return session
                .createQuery("from AddressInformation as a where a.id = :id", AddressInformation.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    public List<AddressInformation> findAll() {
        var session = sessionFactory.getCurrentSession();
        return session
                .createQuery("from AddressInformation as a", AddressInformation.class)
                .list();
    }
}
