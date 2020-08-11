package pl.decerto.operation.int_operations;

import pl.decerto.operation.Operation;

import java.util.List;

public class AdditionInt implements Operation<Integer> {

    @Override
    public Integer apply(List<Integer> generatedValues) {
        return generatedValues.stream().reduce(0, Integer::sum);
    }
}
