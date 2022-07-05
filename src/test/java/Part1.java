import java.io.IOException;

public class Part1 {

    public static void main(String[] args) throws IOException {

        int name = 8;
        String nameString;

        switch(name) {

            case 1: nameString="Понедельник";
                    break;
            case 2: nameString="Вторник";
                break;
            case 3: nameString="Среда";
                break;
            case 4: nameString="Четверг";
                break;
            case 5: nameString="Пятница";
                break;
            case 6:
               case 7: nameString="Выходные";
                break;

            default: nameString="Нам тоже не хватает дней в неделю(((";
            break;
        }

          System.out.println (nameString);


    }
}
