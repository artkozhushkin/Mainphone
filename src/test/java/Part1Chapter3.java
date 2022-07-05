import java.util.ArrayList;
import java.util.List;


public class Part1Chapter3 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        int a = 1;
        int b = 100;

        for (int i = a; i < b; i++) {
            if (i % 5 == 0){
                list.add(i);
            }
        }
        System.out.println("Числа кратные 5: " + list);

    }
}
