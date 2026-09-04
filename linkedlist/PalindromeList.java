public class PalindromeList {

    public static void main(String[] args) {
        int[] values={1,2,2,1};
        boolean palindrome=true;

        for(int i=0;i<values.length/2;i++) {
            if(values[i]!=values[values.length-1-i]) {
                palindrome=false;
                break;
            }
        }

        System.out.println(palindrome);
    }
}
