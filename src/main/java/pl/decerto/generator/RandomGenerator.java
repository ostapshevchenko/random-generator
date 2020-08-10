package pl.decerto.generator;

public interface RandomGenerator<T> {
    T generate(Integer from, Integer to);
}
