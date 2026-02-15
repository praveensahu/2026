package old;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8 {

    public static void main(String[] args) {
        String str = "praveen";
        str.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity()
                        , LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst();


    }

}
