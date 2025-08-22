package com.algorithms.algorithms_plus_plus.chapter1.sets.dto.services;

import com.algorithms.algorithms_plus_plus.chapter1.sets.dto.requests.SetsDefinitionsRequest;
import com.algorithms.algorithms_plus_plus.chapter1.sets.dto.responses.SetsDefinitionsResponse;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class SetServiceImp implements SetService {
    @Override
    public <T extends Number> SetsDefinitionsResponse<T> getDefinitions(SetsDefinitionsRequest<T> body) {
        var set1 = body.set1();
        var set2 = body.set2();
        return new SetsDefinitionsResponse<>(isSubset(set1, set2), getUnion(set1, set2),
                getIntersection(set1, set2), getDiff(set1, set2), getDiff(set2, set1));
    }

    @Override
    public <T extends Number> Set<T> getSymmetricDiff(SetsDefinitionsRequest<T> body) {
        var set1 = body.set1();
        var set2 = body.set2();

        var union = getUnion(set1, set2);
        var intersection = getIntersection(set1, set2);

        return getDiff(union, intersection);
    }

    private static <T extends Number> Set<T> getDiff(Set<T> set1, Set<T> set2) {
        var s1 = new HashSet<>(set1);
        var s2 = new HashSet<>(set2);
        s1.removeAll(s2);
        return s1;
    }

    private static <T extends Number> Set<T> getIntersection(Set<T> set1, Set<T> set2) {
        var s1 = new HashSet<>(set1);
        var s2 = new HashSet<>(set2);
        s1.retainAll(s2);
        return s1;
    }

    private static <T extends Number> Set<T> getUnion(Set<T> set1, Set<T> set2) {
        var s1 = new HashSet<>(set1);
        var s2 = new HashSet<>(set2);
        s1.addAll(s2);
        return s1;
    }

    private static <T extends Number> boolean isSubset(Set<T> set1, Set<T> set2) {
        return set2.containsAll(set1);
    }
}
