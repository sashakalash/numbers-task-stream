import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> result = new ArrayList<>();
        System.out.print("plain: \n");
        for (int value : intList) {
            if (value > 0 && value % 2 == 0) {
                result.add(value);
            }
        }
        Collections.sort(result);
        for (int value : result) {
            System.out.print(value + " ");
        }
        System.out.print("\nstream: \n");
        StreamMain stream = new StreamMain();
    }
}