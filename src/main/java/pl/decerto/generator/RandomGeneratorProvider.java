package pl.decerto.generator;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pl.decerto.dto.DataType;

import java.io.Serializable;
import java.util.List;

@Component
@RequiredArgsConstructor
public class RandomGeneratorProvider {

    private final List<RandomGenerator<Integer>> integerGenerators;

    public List<? extends RandomGenerator<? extends Serializable>> getRandomGenerators(DataType dataType) {
        switch (dataType) {
            case INTEGER:
            default:
                return integerGenerators;
        }
    }

}
