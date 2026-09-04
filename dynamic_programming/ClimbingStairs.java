public class ClimbingStairs {

    public static void main(String[] args) {
        int n=5;

        int one=1;
        int two=1;

        for(int i=2;i<=n;i++) {
            int current=one+two;
            one=two;
            two=current;
        }

        System.out.println(two);
    }
}
