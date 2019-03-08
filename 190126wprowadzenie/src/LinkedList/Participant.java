package LinkedList;

import java.util.Objects;

public class Participant {
    private static int PARTICIPANT_ID = 0;
    private int id;
    private String name;
    private int age;
    public Participant(String name, int age){
        this.name = name;
        this.age = age;
        this.id = PARTICIPANT_ID++;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Participant)) return false;
        Participant that = (Participant) o;
        return getId() == that.getId() &&
                getAge() == that.getAge() &&
                Objects.equals(getName(), that.getName());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getAge());
    }
    @Override
    public String toString() {
        return "Participant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
