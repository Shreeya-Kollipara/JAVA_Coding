import java.util.*;

public class WordBreak {

    public static void main(String[] args) {
        String s="leetcode";

        Set<String> words=new HashSet<>();
        words.add("leet");
        words.add("code");

        boolean[] dp=new boolean[s.length()+1];
        dp[0]=true;

        for(int i=1;i<=s.length();i++) {
            for(int j=0;j<i;j++) {
                if(dp[j]&&words.contains(s.substring(j,i))) {
                    dp[i]=true;
                    break;
                }
            }
        }

        System.out.println(dp[s.length()]);
    }
}
