package pl.decerto.generator.impl_int;

import org.apache.commons.math3.random.RandomDataGenerator;
import org.springframework.stereotype.Component;
import pl.decerto.generator.RandomValueGenerator;

@Component
public class ApacheIntRandomValueGenerator implements RandomValueGenerator<Integer> {

    @Override
    public Integer generateValue(Integer from, Integer to) {
        RandomDataGenerator randomDataGenerator = new RandomDataGenerator();
        return randomDataGenerator.nextInt(from, to);
    }
}