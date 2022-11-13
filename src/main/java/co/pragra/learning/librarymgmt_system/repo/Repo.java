package co.pragra.learning.librarymgmt_system.repo;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface Repo<T> {

T create (T t);
List<T> getAll(String sql, Map<String,Object>params);
Optional<T> getById(int id);
T update(T t);
T deleteById(int id);

}

