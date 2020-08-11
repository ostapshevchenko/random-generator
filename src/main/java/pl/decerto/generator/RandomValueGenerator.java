package pl.decerto.generator;

public interface RandomValueGenerator<T> {
    T generateValue(Integer from, Integer to);
}
