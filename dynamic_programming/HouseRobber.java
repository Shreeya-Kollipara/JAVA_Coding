public class HouseRobber {

    public static void main(String[] args) {
        int[] money={2,7,9,3,1};

        int prev=0;
        int current=0;

        for(int amount:money) {
            int next=Math.max(current,prev+amount);
            prev=current;
            current=next;
        }

        System.out.println(current);
    }
}
