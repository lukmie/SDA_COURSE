public abstract class HomePets {
    private String rase;
    private int age;
    private String gender;
    private Kaganiec kaganiec;

    public HomePets(String rase, int age, String gender) {
        this.rase = rase;
        this.age = age;
        this.gender = gender;
    }

    public String getRase() {
        return rase;
    }

    public void setRase(String rase) {
        this.rase = rase;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    abstract String talk();

    public void setKaganiec(Kaganiec kaganiec){
        this.kaganiec = kaganiec;
    }

    public Kaganiec podajKaganiec(){
        return this.kaganiec;
    }
}
