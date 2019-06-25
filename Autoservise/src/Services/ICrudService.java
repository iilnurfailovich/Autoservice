package Services;

import java.util.List;

public interface ICrudService<T> {
    void Create(T entity);
    void Update(T entity);
    void Delete(long id);
    T Select(long id);
    List<T> SelectAll();
}
