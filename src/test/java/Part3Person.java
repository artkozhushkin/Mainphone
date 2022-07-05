import java.io.IOException;

public class Part3Person {


        int age;
        String Fullname;

        public Part3Person(String Fullname , int age ){
            this.Fullname= Fullname;
            this.age = age ;
        }
        public void talk(){
            System.out.println("Ну что, поговорим ?");
        }
        public void move(){
            System.out.println ("Мужик куда-то пошёл ");
        }
    public static void main(String[] args)  throws IOException {

            Part3Person person= new Part3Person ( "Max", 35);
            person.age = 35 ;
            person.Fullname = "Max";


            System.out.println("\n Мы создали какого-то мужика 35 лет. ну, примерно ему столько)" +
                    "\n" + person.age +"Возраст мужика" +
                    "\n" + person.Fullname + "Имя мужика" );



        }
    }


