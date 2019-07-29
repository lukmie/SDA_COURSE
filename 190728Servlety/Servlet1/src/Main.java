public class Main {
    public static void main(String[] args) {
//        System.out.println(reverseWords("The greatest victory is that which requires no battle"));
        int n = 111;
        double newN = Math.round(Math.sqrt(n));
        System.out.println(nearestSq(n));
        System.out.println(newN);

    }

    public static String reverseWords(String str){
        String[] tab = str.split(" ");
        String newStr = "";
        for (int i = tab.length-1; i >= 0; i--) {
            newStr += tab[i] + " ";
        }
        return newStr.trim();
    }

    public static int nearestSq(final int n){
        double newN = Math.round(Math.sqrt(n));
        return (int)(newN*newN);
    }
}
