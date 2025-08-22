package com.algorithms.algorithms_plus_plus.chapter1.sets.dto.responses;

import java.util.Set;

public record SetsDefinitionsResponse<T extends Number>
        (boolean subset, Set<T> union, Set<T> intersection, Set<T> diff1, Set<T> diff2) {
}
