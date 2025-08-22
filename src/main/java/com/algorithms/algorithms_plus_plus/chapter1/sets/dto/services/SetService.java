package com.algorithms.algorithms_plus_plus.chapter1.sets.dto.services;

import com.algorithms.algorithms_plus_plus.chapter1.sets.dto.requests.SetsDefinitionsRequest;
import com.algorithms.algorithms_plus_plus.chapter1.sets.dto.responses.SetsDefinitionsResponse;

import java.util.Set;

public interface SetService {
    <T extends Number> SetsDefinitionsResponse<T> getDefinitions(SetsDefinitionsRequest<T> body);
    <T extends Number> Set<T> getSymmetricDiff(SetsDefinitionsRequest<T> body);
}
