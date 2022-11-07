import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class StudentGrades {
    String studentName;
    double[] grades;
    int numberOfGrades;
    private double[] availableGrades = {2.0, 3.0, 3.5, 4.0, 4.5, 5.0, 5.5};
   
    public boolean checkGrade(double grade){
        
        for(double el : availableGrades){
            if(grade == el){
                return true;
            }
        }
        return false;
    }  
    
    
    public StudentGrades(String name, double[] grades){
        this.studentName = name;
        try{
            for(double grade : grades){
                if(!checkGrade(grade)){
                    throw new Exception("Error...");  
                }
            } 
        this.grades = grades;
        }catch (Exception err) {
                System.out.println("Wrong grade: " + err.getMessage());
            }
    }

    public StudentGrades(String name, int numberOfGrades){
        this.studentName = name;
        this.numberOfGrades = numberOfGrades;
        Random random = new Random();
        this.grades = new double[this.numberOfGrades];
        int index;
        double grade;
        for(int i = 0; i < this.numberOfGrades; i++){
            index = random.nextInt(7);
            grade = availableGrades[index];
            this.grades[i] = grade; 
        }
    }

    public StudentGrades(String name){
        this.studentName = name;
        int n;  
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter the number of grades you want to store: ");  
        n=sc.nextInt();  
        this.grades = new double[n];  
        System.out.println("Enter the grades: ");  
        for(int i=0; i<n; i++)  
        {     
            try {
                String s = sc.next();
                double g = Double.valueOf(s);
                if(!checkGrade(g)) {
                    throw new Exception("Error...");
                }
                this.grades[i]=g;

            } catch (Exception err) {
                System.out.println("Wrong number: " + err.getMessage());
                i--;
            }  
        }  
        sc.close();
    }

    public double lowestGrade(){
        double min = 5.5;
        for(double el : this.grades){
            if(el < min){
                min = el;
            }
        }return min;
    }

    public double highestGrade(){
        double max = 0;
        for(double el : this.grades){
            if(el > max){
                max = el;
            }
        }return max;
    }

    public double calculateGradesNum(){
        double counter = 0;
        for(int i=0; i < this.grades.length; i++){
            counter ++;
        }return counter;
    }

    public double calculateAvg(){
        
        double suma = 0;
        for(double el : this.grades){
            suma += el;
        }return Math.round(suma * 100.0 /calculateGradesNum())/100.0;
    }

    public void displayStudentData(){
        System.out.println("Name: " + this.studentName + "\nGrades: " + Arrays.toString(this.grades)
                            + "\nNumber of grades: " + calculateGradesNum() 
                            + "\nHighest grade: " + highestGrade() 
                            + "\nLowest grade: " + lowestGrade() + "\nAverage: " + calculateAvg());
    }

    public static void main(String[] args){
        double[] a = {3.5, 4.5, 4.1, 2.0, 5.0, 3.5, 3.0}; 
        StudentGrades sg1 = new StudentGrades("Amanda", a);
        sg1.calculateGradesNum();
        sg1.highestGrade();
        sg1.lowestGrade();
        sg1.calculateAvg();
        sg1.calculateGradesNum();
        sg1.displayStudentData();
        // System.out.println("halo");

        StudentGrades sg2 = new StudentGrades("James");
        sg2.calculateGradesNum();
        sg2.highestGrade();
        sg2.lowestGrade();
        sg2.calculateAvg();
        sg2.calculateGradesNum();
        sg2.displayStudentData();
    }

}


