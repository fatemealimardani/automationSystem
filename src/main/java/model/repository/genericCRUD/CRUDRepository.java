package model.repository.genericCRUD;

import connection.SessionFactorySingleton;
import model.entity.base.BaseEntity;
import model.repository.base.BaseRepository;
import org.hibernate.SessionFactory;

import java.io.Serializable;

public class CRUDRepository<T extends BaseEntity, I extends Serializable> implements BaseRepository<T, I> {
    private final SessionFactory sessionFactory = SessionFactorySingleton.getInstance();

    @Override
    public void save(T t) {
        var session = sessionFactory.getCurrentSession();
        session.save(t);
    }

    @Override
    public void update(T t) {
        var session = sessionFactory.getCurrentSession();
        session.update(t);
    }

    @Override
    public void delete(I i) {
        var session = sessionFactory.getCurrentSession();
        session.delete(i);
    }
}
