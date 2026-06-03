import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class LambdaExpressions {

    public static void main(String[] args) {

        List<String> cityNames = new ArrayList<>();

        cityNames.add("Chennai");
        cityNames.add("Delhi");
        cityNames.add("Bangalore");

        Collections.sort(cityNames,
                (firstWord, secondWord) ->
                        firstWord.compareTo(secondWord));

        System.out.println(cityNames);
    }
}

/*
Output:
[Bangalore, Chennai, Delhi]
*/