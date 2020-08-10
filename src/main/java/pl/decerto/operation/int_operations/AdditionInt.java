package pl.decerto.operation.int_operations;

import pl.decerto.operation.Operation;

public class AdditionInt implements Operation<Integer> {

    @Override
    public Integer apply(Integer first, Integer second) {
        return Integer.sum(first, second);
    }
}
