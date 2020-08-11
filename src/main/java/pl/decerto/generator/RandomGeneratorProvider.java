package pl.decerto.generator;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pl.decerto.dto.DataType;

import java.util.List;

@Component
@RequiredArgsConstructor
public class RandomGeneratorProvider {

    private final List<RandomValueGenerator> integerGenerators;

    public List<RandomValueGenerator> getValueGenerators(DataType dataType) {
        switch (dataType) {
            case INTEGER:
            default:
                return integerGenerators;
        }
    }

}
