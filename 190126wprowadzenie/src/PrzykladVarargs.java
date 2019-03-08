public class PrzykladVarargs {
    public static void main(String[] args) {
            System.out.println("Otrzymane argumenty jeden po drugim : ");
            if (args.length > 0) {
                for(String arg : args) {
                    System.out.println(arg);
                }
            } else {
                System.out.println("Lista argumentow jest pusta...");
            }
    }

}
