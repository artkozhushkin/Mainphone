public class TheHomeTask {


    int age;
    String name;
    double weight;
    boolean living;

    public static void main(String[] args){

        TheHomeTask MyGAnn = new TheHomeTask();
        MyGAnn.age = 22;
        MyGAnn.name = "Ann";
        MyGAnn.weight = 53;
        MyGAnn.living = true;

        System.out.println("\n Моя девушка Аня;" +
                "\n" + MyGAnn.age +"Возраст моей девушки;" +
                "\n" + MyGAnn.name + "Имя моей девушки;" +
                "\n" + MyGAnn.weight +"Вес моей девушки;" +
                "\n" + MyGAnn.living +"Состояние;");

    }
}