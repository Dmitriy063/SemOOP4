package SemOOP4;

public interface Repository <T, ID> {
    void save(T t);
    void deleteById(ID id);
    T findById(ID id);
    ID update(T t, ID id);
}