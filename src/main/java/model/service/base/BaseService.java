package model.service.base;

public interface BaseService<T, I> {
    void save(T t);

    void update(T t);

    void delete(I i);
}
