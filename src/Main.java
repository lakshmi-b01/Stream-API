import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(5,3,1,4,2);

        // Helps to perform streams and not affect the input nums list.
        // Once you consume the stream, you cannot reuse it.
        Stream<Integer> data = nums.stream();
        data.forEach(n -> System.out.print(n + " "));
        System.out.println();
        System.out.println();

        // To count the number of values in data
        long count = nums.stream().count();
        System.out.println("count: " + count);
        System.out.println();

        // To sort the data
        nums.stream()
                .sorted()
                .forEach(n -> System.out.print(n + " "));
        System.out.println();
        System.out.println();

        // To map/change each value in nums
        nums.stream()
                .map(n -> n*2)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();
        System.out.println();

        // To filter data
        nums.stream()
                .filter(n -> n > 2)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        List<Integer> filterNums = nums.stream()
                .filter(n -> n % 2 == 1)
                .sorted()
                .map(n -> n*n)
                .collect(Collectors.toList());
        System.out.println(filterNums);
        System.out.println();

        // Reduce - example - to do sum of squares
        int sum = nums.stream()
                .map(n -> n*n)
                .reduce(0, (c,e) -> c+e);
        System.out.println(sum);
        System.out.println();

    }
}