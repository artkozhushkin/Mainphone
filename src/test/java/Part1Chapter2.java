import java.io.IOException;

public class Part1Chapter2 {

    public static void main (String[] args) throws IOException {

        for (int i = 0 ; (char) System.in.read() !='A'; i++) {
            System.out.println ( "Месяц"+ i) ;
        }

        int i;
        i= 5;

        System.out.println("Хотите узнать, в каком месяце сколько дней?");
                        System.out.println ("Укажи число и я определю количество дней");


if (i == 1) {
    System.out.println("Это месяц январь, в нём 31 день");
}
else if (i == 2)  {
    System.out.println("Это месяц-еврей, в нём 28 дней");
}
else if (i == 3){
    System.out.println("Это март , в нём 31 дней");
}
else if (i == 4){
    System.out.println("Это апрель , в нём 30 дней");
}

else if (i == 5){
    System.out.println("Это май , в нём 31 дней");
}

else if (i == 6){
    System.out.println("Это июнь, в нём 30 дней");
}
else if (i == 7){
    System.out.println("Это июль , в нём 31 дней");
}
else if (i == 8){
    System.out.println("Это август , в нём 31 дней");
}

else if (i == 9){
    System.out.println("Это сентябрь , в нём 30 дней");
}
else if (i == 10){
    System.out.println("Это октябрь , в нём 31 дней");
}
else if (i == 11){
    System.out.println("Это ноябрь , в нём 30 дней");}

    else if (i == 12){
        System.out.println("Это декабрь , в нём 31 дней");
    }

else if(i > 12){
    System.out.println("Перебор, дружок! Выучи мат.часть ");
}


    }
}
