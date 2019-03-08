public class Czlowiek {

    private String name;

    Czlowiek(String mName){
        this.name = mName;
    }

    public String getName(){
        return name;
    }

    public void setName(String mName){
        this.name = mName;
    }

    public static void main(String[] args) {
        Czlowiek cz = new Czlowiek("Brajan");
        System.out.println(cz.getName());
        cz.setName("Adam");
        System.out.println(cz.getName());
    }
}
