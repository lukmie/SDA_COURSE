public class Developer extends Human {

    private String section;

    public Developer(int age, String gender, String country, String section) {
        super(age, gender, country);
        this.section = section;
        System.out.println("Constructor Developer");
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

}
