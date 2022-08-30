package model.service.genericCRUDService;

import connection.SessionFactorySingleton;
import model.entity.base.BaseEntity;
import model.repository.genericCRUDRepository.CRUDRepository;
import model.service.base.BaseService;
import org.hibernate.SessionFactory;

import java.io.Serializable;

public class CRUDService<T extends BaseEntity, I extends Serializable> implements
        BaseService<T, I> {
    private final SessionFactory sessionFactory = SessionFactorySingleton.getInstance();
    private final CRUDRepository crudRepository = new CRUDRepository();

    @Override
    public void save(T t) {
        try (var session = sessionFactory.getCurrentSession()) {
            var transaction = session.getTransaction();
            try {
                transaction.begin();
                crudRepository.save(t);
                transaction.commit();
            } catch (Exception e) {
                transaction.rollback();
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public void update(T t) {
        try (var session = sessionFactory.getCurrentSession()) {
            var transaction = session.getTransaction();
            try {
                transaction.begin();
                crudRepository.update(t);
                transaction.commit();
            } catch (Exception e) {
                transaction.rollback();
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public void delete(I i) {
        try (var session = sessionFactory.getCurrentSession()) {
            var transaction = session.getTransaction();
            try {
                transaction.begin();
                crudRepository.delete(i);
                transaction.commit();
            } catch (Exception e) {
                transaction.rollback();
                System.out.println(e.getMessage());
            }
        }
    }
}
