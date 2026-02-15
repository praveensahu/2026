package old;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static void main(String[] args) {
        List<Integer> arr = List.of(1,2,3,4,4,5,5,67,8);
        arr.stream().distinct().collect(Collectors.toSet());
        Set<Integer> test = new HashSet<>();
        System.out.println(test.add(1));

      int val =  arr.stream().max(Comparator.comparingInt(Integer::intValue)).get().intValue();
        System.out.println(val);
    }
}
