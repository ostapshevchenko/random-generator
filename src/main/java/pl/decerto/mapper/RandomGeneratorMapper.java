package pl.decerto.mapper;

import pl.decerto.dto.ActionType;
import pl.decerto.dto.RandomGeneratedDto;
import pl.decerto.operation.Operation;

import java.io.Serializable;
import java.util.List;

public class RandomGeneratorMapper {

    public static RandomGeneratedDto mapToRandomGeneratedDto(List<Serializable> generatedValues, ActionType actionType, Operation operation) {
        return generatedValues.size() == 2 ? RandomGeneratedDto.builder()
                .generatedValues(generatedValues)
                .result(operation.apply(generatedValues))
                .actionType(actionType)
                .build() :
                new RandomGeneratedDto();
    }
}
