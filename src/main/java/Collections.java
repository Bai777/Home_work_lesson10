import java.util.*;

public class Collections {
    public static void main(String[] args) {
        int count = 0;

        List<String> list = Arrays.asList("Ара-ра-ра", "Байбак", "Барклай", "Беляк", "Бокс флинт", "Борзая", "В штык", "Вавакать", "Векша", "Вешняк", "Витые стволы", "Ара-ра-ра", "Витые стволы", "Ара-ра-ра", "Вешняк", "Гнать в пяту", "Беляк", "Ара-ра-ра", "Гнать в пяту", "В штык");

        Map<String, Integer> repeatMap = new HashMap<>();
        for (String s : list) {
            if (repeatMap.containsKey(s)){
                repeatMap.put(s, repeatMap.get(s) + 1);
            }
            else repeatMap.put(s, 1);
        }
        for (Integer repeatCount : repeatMap.values()) {
            if (repeatCount > 1)
                count++;
        }

        Set<String> resultList = new HashSet<>(list);
        System.out.println(resultList);
        System.out.println( "Number of unique places = " + resultList.size());
        System.out.println("Number of Strings repeated = " + count);
    }

}
