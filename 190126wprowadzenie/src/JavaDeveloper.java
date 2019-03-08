import java.sql.SQLOutput;

public class JavaDeveloper extends Developer {

    private String level;
    private int salary;

    public JavaDeveloper(int age, String gender, String country, String section, String level, int salary) {
        super(age, gender, country, section);
        this.level = level;
        this.salary = salary;
        System.out.println("Constructor JavaDeveloper");
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    protected void changeAge(String str) {
        System.out.println(str + " test");;
    }

}
