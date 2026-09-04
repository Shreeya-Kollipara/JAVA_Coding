public class StringCompression {

    public static void main(String[] args) {
        String s="aaabbc";
        StringBuilder result=new StringBuilder();

        int i=0;

        while(i<s.length()) {
            int j=i;

            while(j<s.length()&&s.charAt(j)==s.charAt(i))
                j++;

            result.append(s.charAt(i));
            result.append(j-i);

            i=j;
        }

        System.out.println(result);
    }
}
