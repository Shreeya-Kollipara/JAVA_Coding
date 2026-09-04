public class Anagram {

    public static void main(String[] args) {
        String a="listen";
        String b="silent";

        if(a.length()!=b.length()) {
            System.out.println(false);
            return;
        }

        int[] count=new int[26];

        for(int i=0;i<a.length();i++) {
            count[a.charAt(i)-'a']++;
            count[b.charAt(i)-'a']--;
        }

        boolean result=true;

        for(int x:count) {
            if(x!=0) {
                result=false;
                break;
            }
        }

        System.out.println(result);
    }
}
