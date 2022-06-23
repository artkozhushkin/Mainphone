import java.io.IOException;

public class Practicer {

    public static void main(String[] args) throws IOException {

        int name = 1 ;
        String nameString;

        switch (name){

            case 1: nameString="Anuta";
            break;
            case 2: nameString="Olya";
                break;
            case 3: nameString="Katya";
                break;
            case 4: nameString="Masha";
                break;
            case 5: nameString="Dasha";
                break;
            default: nameString="Сейчас получишь скалкой по голове!";
            break;
        }
System.out.println(nameString);
    }

}