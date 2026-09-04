public class Varargs {
    static int sum(int... numbers) {
        int total=0;

        for(int x:numbers)
            total+=x;

        return total;
    }

    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4));
    }
}
