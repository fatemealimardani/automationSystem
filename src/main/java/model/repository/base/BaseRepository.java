package model.repository.base;

public interface BaseRepository<T, I> {
    void save(T t);

    void update(T t);

    void delete(I i);
}
