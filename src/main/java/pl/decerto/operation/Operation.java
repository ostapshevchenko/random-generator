package pl.decerto.operation;

public interface Operation<T> {
    T apply(T firstRandomObject, T secondRandomObject);
}