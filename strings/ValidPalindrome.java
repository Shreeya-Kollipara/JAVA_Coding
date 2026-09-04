public class ValidPalindrome {

    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";

        s=s.replaceAll("[^A-Za-z0-9]","").toLowerCase();

        int left=0;
        int right=s.length()-1;
        boolean valid=true;

        while(left<right) {
            if(s.charAt(left++)!=s.charAt(right--)) {
                valid=false;
                break;
            }
        }

        System.out.println(valid);
    }
}
