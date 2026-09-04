import java.util.Scanner;
class Project{
    String name;
    double rate;
    double hr;
    String type;
    public Project(String name,double rate,double hr,String type){
        this.name=name;
        this.rate=rate;
        this.hr=hr;
        this.type=type;
    }
    public double calculateRevenue(){
        double br=0;
        if(type.equals("Regular")){
            br=hr*rate;
        } else if(type.equals("HighPriority")){
            br=hr*rate*1.5;
        } else if(type.equals("LongTerm")){
            br=hr*rate*0.9;
        }

        if(name.equals("SpecialProject")){
            br+=1000;
        }
        return br;
    }

    public static double calculateTotalRevenue(Project[] projects){
        double totalRevenue=0;
        for(Project project:projects){
            totalRevenue+=project.calculateRevenue();
        }
        if(totalRevenue<5000){
            totalRevenue*=1.1;
        }
        return totalRevenue;
    }
    public void displayDetails(){
        System.out.printf("%.2f%n",calculateRevenue());
    }
}

public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        scanner.nextLine();
        Project[] projects=new Project[n];
        for(int i=0;i<n;i++){
            String name=scanner.nextLine();
            double rate=scanner.nextDouble();
            double hrs=scanner.nextDouble();
            scanner.nextLine();
            String type=scanner.nextLine();
            projects[i]=new Project(name,rate,hrs,type);
        }
        for(Project project:projects){
            project.displayDetails();
        }
        double totalRevenue=Project.calculateTotalRevenue(projects);
        System.out.printf("%.2f\n",totalRevenue);
        scanner.close();
    }
}
