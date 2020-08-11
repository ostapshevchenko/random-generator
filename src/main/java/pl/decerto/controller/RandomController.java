package pl.decerto.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.decerto.dto.ActionType;
import pl.decerto.dto.DataType;
import pl.decerto.dto.RandomGeneratedDto;
import pl.decerto.service.RandomValuesService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/random-api")
public class RandomController {

    private final RandomValuesService randomValuesService;

    @GetMapping
    public ResponseEntity<RandomGeneratedDto> getRandomIntSum(@RequestParam(value = "from") Integer from, @RequestParam(value = "to") Integer to,
                                                              @RequestParam(value = "actionType") ActionType actionType,
                                                              @RequestParam(value = "dataType") DataType dataType) {
        return ResponseEntity.status(HttpStatus.OK).body(randomValuesService.getResult(from, to, actionType, dataType));
    }

}
