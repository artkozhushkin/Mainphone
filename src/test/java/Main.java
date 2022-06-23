public class Main {

public static void main(String[] args) {

   Dog dog= new Dog("Rex", 3 , 6 );  /*название объекта */

    dog.sayGav();
    dog.setWeight(3);
    dog.getName();
dog.setName("Rex");

    System.out.println("Имя собаки" + dog.getName() + " " + "Вес собаки" + " " + dog.getWeight() + "Гав!" + " ");
    }


   }

