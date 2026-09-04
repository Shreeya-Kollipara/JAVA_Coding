import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            char i=sc.next().charAt(0);
            int a=sc.nextInt();
            int y=sc.nextInt(); 
            double pre=0;
            if (i=='H') {
                if(a<25) {
                    pre=500;
                } 
                else if(a<=50){
                    pre=1000;
                } 
                else{
                    pre=1500;
                }
            } 
            else if(i=='L') 
            {
                if(a<25){
                    pre=300;
                } 
                else if(a<=50){
                    pre=600;
                } 
                else{
                    pre=900;
                }
            }
            double discount=y*5;
            if(discount>25){
                discount=25;
            }
            pre-=pre*(discount/100);
            System.out.printf("%d\n",(int)pre);
        }
        sc.close();
    }
}
