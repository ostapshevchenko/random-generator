package pl.decerto.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RandomGeneratedDto {

    private ActionType actionType;
    private Object firstGeneratedValue;
    private Object secondGeneratedValue;
    private Object result;
}
