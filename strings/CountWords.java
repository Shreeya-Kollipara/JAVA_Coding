public class CountWords {

    public static void main(String[] args) {
        String s="Java makes coding fun";

        String[] words=s.trim().split("\\s+");

        System.out.println(words.length);
    }
}
