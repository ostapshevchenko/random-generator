package pl.decerto.operation.factory;

import pl.decerto.dto.ActionType;
import pl.decerto.operation.Operation;
import pl.decerto.operation.abstract_factory.AbstractOperatorFactory;
import pl.decerto.operation.int_operations.AdditionInt;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class IntegerOperatorFactory implements AbstractOperatorFactory<Integer> {
    static Map<ActionType, Operation<Integer>> operationMap = new HashMap<>();

    static {
        operationMap.put(ActionType.ADDITION, new AdditionInt());
    }

    public Operation<Integer> getOperation(ActionType actionType) {
        return Optional.ofNullable(operationMap.get(actionType)).orElseGet(AdditionInt::new);
    }
}
