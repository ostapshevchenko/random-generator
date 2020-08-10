package pl.decerto.generator.impl_int;

import org.apache.commons.math3.random.RandomDataGenerator;
import org.springframework.stereotype.Component;
import pl.decerto.generator.RandomGenerator;

@Component
public class ApacheIntRandomGenerator implements RandomGenerator<Integer> {

    @Override
    public Integer generate(Integer from, Integer to) {
        RandomDataGenerator randomDataGenerator = new RandomDataGenerator();
        return randomDataGenerator.nextInt(from, to);
    }
}