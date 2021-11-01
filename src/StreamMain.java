import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain {
    public StreamMain() {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        Stream<Integer> stream = intList.stream();
        stream.filter(v -> v > 0)
                .filter(v -> v % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .map(v -> v  + " ")
                .forEach(System.out::print);
    }
}