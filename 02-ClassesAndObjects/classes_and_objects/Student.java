public class Student{
   //atrybuty:
   
   String name;
   int age;
   String ID;
   boolean isValid;
   int semesterNum;
   double avgGrade;   

   //metody:
   public void sayHello(){
       System.out.println("Hello!");
    }

   public void displayName(){
       System.out.println("I'm "+ this.name);
    }
    
   public void displayStudentData(){
       System.out.println("I'm "+ this.name + "\nSemester "+ this.semesterNum + "\nAvg grade "+ this.avgGrade);
    }

   public void displayAge(){
       System.out.println("I'm "+ this.age + " years old");
    }
    
   public void changeIDStatus(){
       this.isValid = !isValid;
    }
    
   public void displayStudentStatus(){
       System.out.println("My name is " + this.name + "my ID " + this.ID + "is " + this.isValid);
    }
   
    //w momencie uruchomienia programu mogę przekazać dane
   
   public static void main(String[] args){
       Student s1 = new Student(); //konstruktor sam się zrobił
       s1.name = "Ola";
       s1.age = 20;
       s1.ID = "s123234";
       s1.isValid = true;
       s1.semesterNum = 2;
       s1.avgGrade = 3.5;
       
       s1.sayHello();
       s1.displayStudentData();
       s1.changeIDStatus();
       s1.displayStudentStatus();
    }
    
}