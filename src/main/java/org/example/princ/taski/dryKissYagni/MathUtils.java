package org.example.princ.taski.dryKissYagni;

import java.util.Arrays;
import java.util.List;

public class MathUtils {
    public static int calculateSum(int[] numbers) {
        return Arrays.stream(numbers).sum();
    }
    
    public static int calculateSum(List<Integer> numbers) {
        return numbers.stream().mapToInt(Integer::intValue).sum();
    }
}