public class Cat extends HomePets {

    private String rase;
    private int age;
    private String gender;
    private Kaganiec kaganiec;


    public Cat(String rase, int age, String gender) {
        super(rase, age, gender);
    }

    public String talk(){
        return "Meoow!!";
    }

    public void setKaganiec(Kaganiec kaganiec){
        this.kaganiec = kaganiec;
    }

    public Kaganiec podajKaganiec(){
        return this.kaganiec;
    }


}
