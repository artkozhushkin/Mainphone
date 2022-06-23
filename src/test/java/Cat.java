public class Cat {

    int age;
    double weight;
    String name;
    boolean living;

    public static void main(String[] args) {

        Cat murzik = new Cat();
        murzik.name = "murzik";
        murzik.age = 5;
        murzik.weight = 7;
        murzik.living = true;

        System.out.println( "murzik age"+" " + "murzik name" +" "+ "murzik weight" +" "+  "murzik living;" +
                murzik.age + "Возраст Мурзика;" +
              murzik.name + "Имя Мурзика;" +
               murzik.weight + "Вес Мурзика;" +
               murzik.living + "Состояние Мурзика;");

    }
}