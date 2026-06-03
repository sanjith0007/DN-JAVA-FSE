import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class StreamAPI {

    public static void main(String[] args) {

        List<Integer> dataList =
                Arrays.asList(10,11,12,13,14,15,16);

        List<Integer> evenValues =
                dataList.stream()
                        .filter(number -> number % 2 == 0)
                        .collect(Collectors.toList());

        System.out.println(evenValues);
    }
}

/*
Output:
[10, 12, 14, 16]
*/