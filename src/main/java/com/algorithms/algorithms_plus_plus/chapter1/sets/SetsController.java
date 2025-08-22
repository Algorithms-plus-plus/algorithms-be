package com.algorithms.algorithms_plus_plus.chapter1.sets;

import com.algorithms.algorithms_plus_plus.chapter1.sets.dto.requests.SetsDefinitionsRequest;
import com.algorithms.algorithms_plus_plus.chapter1.sets.dto.responses.SetsDefinitionsResponse;
import com.algorithms.algorithms_plus_plus.chapter1.sets.dto.services.SetService;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("api/v1/sets")
@CrossOrigin(origins = "http://localhost:4200")
public record SetsController(SetService setService) {

    @PostMapping("definitions")
    public <T extends Number> SetsDefinitionsResponse<T> getDefinitions(@RequestBody SetsDefinitionsRequest<T> body) {
        return setService.getDefinitions(body);
    }

    @PostMapping("symmetric-difference")
    public <T extends Number> Set<T> getSymmetricDiff(@RequestBody SetsDefinitionsRequest<T> body) {
        return setService.getSymmetricDiff(body);
    }
}
