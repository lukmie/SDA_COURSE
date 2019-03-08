import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("border coli", 12, "male");
        Cat cat1 = new Cat("perski", 1,"male");
        Kaganiec kaganiec = new Kaganiec(36, "brown");
//        Dog dog2 = new Dog("jamnik", 2, "female");

//        Dog[] list = {dog1, dog2};

//        for (Dog dog : list) {
//            System.out.print(dog.getAge() + " ");
//            System.out.print(dog.getRase() + " ");
//            System.out.print(dog.getGender() + " ");
////            System.out.printf("Pies %s ma %d lat%n", p.getName(), p.getAge());
//            System.out.println();
//        }
        HomePets[] list = {dog1, cat1};
        dog1.setKaganiec(kaganiec);
        for (HomePets pet: list) {
            if(pet.podajKaganiec() != null){
                System.out.println(pet.talk() + " " + pet.podajKaganiec().getColor());
            }
        }

//        System.out.println(dog1.talk());
//        System.out.println(cat1.talk());

//        Room r1 = new Room(12.1,5.5);
//
//        Room r2 = new Room(2.4,5.,6.3);

//        Room[] rooms = {r1, r2};
//
//        for (Room room : rooms) {
//            System.out.printf("Pokoj ma %.2fm^2 i %.2fm^3%n", room.getArea(), room.getVolume());
//        }












//        JavaDeveloper jd1 = new JavaDeveloper(28, "male", "Poland", "developer", "junior", 3200);
//        System.out.println(jd1.getAge());
//        System.out.println("************************");
//        Developer d1 = new Developer(31, "male", "England", "devOps");
//        System.out.println(d1.getAge());
//        System.out.println("************************");
//        jd1.changeAge(12);
//        System.out.println(jd1.getAge());
//        jd1.changeAge("100 lat");











    }
}
