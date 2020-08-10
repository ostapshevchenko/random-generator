package pl.decerto.operation.abstract_factory;

import pl.decerto.dto.DataType;
import pl.decerto.operation.factory.IntegerOperatorFactory;

public class FactoryProvider {
    public static AbstractOperatorFactory createFactory(DataType dataType) {
        switch (dataType) {
            case INTEGER:
            default:
                return new IntegerOperatorFactory();
        }
    }
}
