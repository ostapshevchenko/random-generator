package pl.decerto.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.decerto.dto.ActionType;
import pl.decerto.dto.DataType;
import pl.decerto.dto.RandomGeneratedDto;
import pl.decerto.generator.RandomGeneratorProvider;
import pl.decerto.generator.RandomValueGenerator;
import pl.decerto.mapper.RandomGeneratorMapper;
import pl.decerto.operation.Operation;
import pl.decerto.operation.abstract_factory.AbstractOperatorFactory;
import pl.decerto.operation.abstract_factory.FactoryProvider;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RandomValuesService {

    private final RandomGeneratorProvider randomGeneratorProvider;

    public RandomGeneratedDto getResult(Integer from, Integer to, ActionType actionType, DataType dataType) {
        List<RandomValueGenerator> randomValueGenerators = randomGeneratorProvider.getValueGenerators(dataType);
        List<Object> randomGeneratedValues = randomValueGenerators.stream().map(rG -> rG.generateValue(from, to)).collect(Collectors.toList());

        AbstractOperatorFactory factory = FactoryProvider.createFactory(dataType);
        Operation operation = factory.getOperation(actionType);
        return RandomGeneratorMapper.mapToRandomGeneratedDto(randomGeneratedValues, actionType, operation);
    }
}
