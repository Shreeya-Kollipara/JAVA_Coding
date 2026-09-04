import java.util.Scanner;

abstract class MedicalProcedure{
    double baseCost;
    int complexity;
    public MedicalProcedure(){
    }
    double setBaseCost(double baseCost){
        this.baseCost=baseCost;
        return this.baseCost;
    }
    int setComplexity(int complexity){
        this.complexity=complexity;
        return this.complexity;
    }
    abstract double calculateCost();
}

class DiagnosticTest extends MedicalProcedure{
    public DiagnosticTest(){
        super();
    }
    @Override
    public double calculateCost(){
        double res=baseCost+10*complexity;
        if(complexity>3){
            res-=0.05*res;
        }
        return res;
    }
}

class MinorSurgery extends MedicalProcedure{
    public MinorSurgery(){
        super();
    }
    @Override
    public double calculateCost(){
        double res=baseCost+50*complexity;
        if(complexity>2){
            res-=0.03*res;
        }
        return res;
    }
}

class MajorSurgery extends MedicalProcedure{
    public MajorSurgery(){
        super();
    }
    @Override
    public double calculateCost(){
        double res=baseCost+100*complexity;
        if(complexity>1){
            res-=0.02*res;
        }
        return res;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int procedureType=scanner.nextInt();
        double baseCost=scanner.nextDouble();
        int complexity=scanner.nextInt();
        MedicalProcedure procedure=null;
        switch(procedureType) {
            case 1:
                procedure=new DiagnosticTest();
                break;
            case 2:
                procedure=new MinorSurgery();
                break;
            case 3:
                procedure=new MajorSurgery();
                break;
            default:
                System.out.println("Invalid service type");
                System.exit(1);
        }
        procedure.setBaseCost(baseCost);
        procedure.setComplexity(complexity);
        System.out.printf("Total Cost: %.2f\n",procedure.calculateCost());
        scanner.close();
    }
}

