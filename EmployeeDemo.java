import java.util.Scanner;
import java.util.*;
class EmpDemo{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Enter no. of employees");
        int n=scan.nextInt();
        
        Employee[] e = new Employee[n];
        for(int i=0;i<n;i++){
            e[i]=new Employee();
            e[i].GetEmpData(); 
        }
        System.out.println("Name"+"\t\t\t" + "Year of joining"+"\t\t\t"+"Salary"+"\t\t\t"+ "Address"+"\t\t\t");
        for(int i=0;i<n;i++){
            e[i].PrintDetails();


    }
}
}
