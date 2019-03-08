public class Human {
    private int age;
    private String gender;
    private String country;

    public Human(int age, String gender, String country) {
        this.age = age;
        this.gender = gender;
        this.country = country;
        System.out.println("Constructor Human");
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    protected void changeAge(int i) {
        this.age = age + i;
    }


}
