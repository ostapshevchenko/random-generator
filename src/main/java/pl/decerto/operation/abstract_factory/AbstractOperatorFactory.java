package pl.decerto.operation.abstract_factory;

import pl.decerto.dto.ActionType;
import pl.decerto.operation.Operation;

public interface AbstractOperatorFactory<T> {
    Operation<T> getOperation(ActionType actionType);
}
