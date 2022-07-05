import java.io.IOException;

public class Part2 {


    public static void main( String[] args)  throws IOException{


        char ch, answer ='A';

        System.out.println("Наше предложение: КОРОВА ДАЁТ МОЛОКО!");

        ch = (char) System.in.read();


        if (ch==answer) {
            System.out.println("Н ш пр дл ж н: К Р В  Д Т  М Л К");
        }
        else if (ch > answer) {
            System.out.println ("а е  е о е ие: О О В  АЁ  О О О !");
        }
        else {
            System.out.println("Нашепредложение:КОРОВАДАЁТМОЛОКО!");
        }

    }
}
