package pl.decerto.mapper;

import pl.decerto.dto.ActionType;
import pl.decerto.dto.RandomGeneratedDto;
import pl.decerto.operation.Operation;

import java.io.Serializable;
import java.util.List;

public class RandomGeneratorMapper {

    public static RandomGeneratedDto mapToRandomGeneratedDto(List<Serializable> randomNumbers, ActionType actionType, Operation operation) {
        return randomNumbers.size() == 2 ? RandomGeneratedDto.builder()
                .firstGeneratedValue(randomNumbers.get(0))
                .secondGeneratedValue(randomNumbers.get(1))
                .result(operation.apply(randomNumbers.get(0), randomNumbers.get(1)))
                .actionType(actionType)
                .build() :
                new RandomGeneratedDto();
    }
}
