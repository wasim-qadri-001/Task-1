import java.util.Scanner;
class BasicCalculator{
    public double addition(double a,double b){
        return a+b;
    }
    public double subtraction(double a,double b){
        return a-b;
    }
    public double multiplication(double a,double b){
        return a*b;
    }
    public double divison(double a,double b){
        return a/b;
    }
}
class calculator{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        BasicCalculator bc= new BasicCalculator();
        System.out.println("Enter Num1:");
        double n1=s.nextDouble();
        System.out.println("Enter Num2:");
        double n2=s.nextDouble();
        System.out.println("Choose Suitable operation to perform on two numbers\n");
        System.out.println("Addition - '+'");
        System.out.println("Subtraction - '-'");
        System.out.println("Multiplication - '*'");
        System.out.println("Divison - '/'");
        char op=s.next().charAt(0);
        switch(op){
            case '+' : System.out.println(bc.addition(n1,n2));
                        break;
            case '-' : System.out.println(bc.subtraction(n1,n2));
                        break;
            case '*' : System.out.println(bc.multiplication(n1,n2));
                        break;
            case '/' : System.out.println(bc.divison(n1,n2));
                        break;
            default  : System.out.println("Choose proper Operation!!!");
        }
    }
}