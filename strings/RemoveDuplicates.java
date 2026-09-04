public class RemoveDuplicates {

    public static void main(String[] args) {
        String s="programming";
        boolean[] seen=new boolean[256];
        StringBuilder result=new StringBuilder();

        for(char c:s.toCharArray()) {
            if(!seen[c]) {
                seen[c]=true;
                result.append(c);
            }
        }

        System.out.println(result);
    }
}
