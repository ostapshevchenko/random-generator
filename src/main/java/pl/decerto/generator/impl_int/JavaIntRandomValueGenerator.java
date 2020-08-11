package pl.decerto.generator.impl_int;

import org.springframework.stereotype.Component;
import pl.decerto.generator.RandomValueGenerator;

import java.util.Random;

@Component
public class JavaIntRandomValueGenerator implements RandomValueGenerator<Integer> {

    @Override
    public Integer generateValue(Integer from, Integer to) {
        Random random = new Random();
        return random.nextInt(to - from) + from;
    }
}
