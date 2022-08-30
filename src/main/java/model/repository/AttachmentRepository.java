package model.repository;

import connection.SessionFactorySingleton;
import model.entity.Attachment;
import model.repository.genericCRUD.CRUDRepository;
import org.hibernate.SessionFactory;

import java.util.List;

public class AttachmentRepository extends CRUDRepository<Attachment, Integer> {
    private final SessionFactory sessionFactory = SessionFactorySingleton.getInstance();

    public Attachment findById(Integer id) {
        var session = sessionFactory.getCurrentSession();
        return session
                .createQuery("from Attachment as a where a.id = :id", Attachment.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    public List<Attachment> findAll() {
        var session = sessionFactory.getCurrentSession();
        return session
                .createQuery("from Attachment as a", Attachment.class)
                .list();
    }
}
