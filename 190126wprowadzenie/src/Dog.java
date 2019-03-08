public class Dog extends HomePets {

    private String rase;
    private int age;
    private String gender;
    private Kaganiec kaganiec;

    public Dog(String rase, int age, String gender) {
        super(rase, age, gender);
    }

    public String talk() {
        return "Woof!!";
    }

    public void setKaganiec(Kaganiec kaganiec){
        this.kaganiec = kaganiec;
    }

    public Kaganiec podajKaganiec(){
        return this.kaganiec;
    }
}
