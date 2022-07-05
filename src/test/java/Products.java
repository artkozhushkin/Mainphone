import java.io.IOException;

public class Products {

    public static void main(String[] args ) throws IOException {

        int product = 1;
        String productString;

        switch (product) {

            case 1: productString = "Kolbasa";
               break;
            case 2: productString = "Hleb";
                break;
            case 3: productString = "Maslo";
                break;
            case 4: productString = "Myaso";
                break;
            case 5: productString = "Milo";
                break;
            case 6: productString = "Yatsa";
                break;
            case 7: productString = "Pivo";
                break;
            case 8: productString = "Sok";
                break;
            default: productString = "Мне кажется, я что-то забыл!";
            break;
        }

        System.out.println(productString);
    }
}
