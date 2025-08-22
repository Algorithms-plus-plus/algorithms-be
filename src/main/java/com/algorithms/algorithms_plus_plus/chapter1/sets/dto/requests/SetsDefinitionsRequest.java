package com.algorithms.algorithms_plus_plus.chapter1.sets.dto.requests;

import java.util.Set;

public record SetsDefinitionsRequest<T>(Set<T> set1, Set<T> set2) {
}
