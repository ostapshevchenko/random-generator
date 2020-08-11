package pl.decerto.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RandomGeneratedDto {

    private ActionType actionType;
    private Object result;
    private List<Object> generatedValues;
}
