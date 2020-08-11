package pl.decerto.operation;

import java.util.List;

public interface Operation<T> {
    T apply(List<T> generatedValues);
}