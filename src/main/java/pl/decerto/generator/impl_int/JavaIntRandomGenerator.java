package pl.decerto.generator.impl_int;

import org.springframework.stereotype.Component;
import pl.decerto.generator.RandomGenerator;

import java.util.Random;

@Component
public class JavaIntRandomGenerator implements RandomGenerator<Integer> {

    @Override
    public Integer generate(Integer from, Integer to) {
        Random random = new Random();
        return random.nextInt(to - from) + from;
    }
}
