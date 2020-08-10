package pl.decerto.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.decerto.dto.ActionType;
import pl.decerto.dto.DataType;
import pl.decerto.dto.RandomGeneratedDto;
import pl.decerto.generator.RandomGenerator;
import pl.decerto.generator.RandomGeneratorProvider;
import pl.decerto.mapper.RandomGeneratorMapper;
import pl.decerto.operation.Operation;
import pl.decerto.operation.abstract_factory.AbstractOperatorFactory;
import pl.decerto.operation.abstract_factory.FactoryProvider;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RandomIntService {

    private final RandomGeneratorProvider randomGeneratorProvider;

    public RandomGeneratedDto getResult(Integer from, Integer to, ActionType actionType, DataType dataType) {
        List<? extends RandomGenerator<? extends Serializable>> randomGenerators = randomGeneratorProvider.getRandomGenerators(dataType);
        List<Serializable> randomObjects = randomGenerators.stream().map(rG -> rG.generate(from, to)).collect(Collectors.toList());
        AbstractOperatorFactory factory = FactoryProvider.createFactory(dataType);
        Operation operation = factory.getOperation(actionType);
        return RandomGeneratorMapper.mapToRandomGeneratedDto(randomObjects, actionType, operation);
    }
}
