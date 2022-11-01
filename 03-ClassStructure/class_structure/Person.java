public class Person {
    //atrybuty
    String name;
    double weight;
    double height;

    public Person(String name){
        this.name = name;
    }

    public Person(String name, double weight, double height){
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    //metody

    public void setWeightAndHeight(double weight, double height){
        this.weight = weight;
        this.height = height;
    }

    public double calculateBMI(){
        return this.weight/(this.height * this.height * 0.0001);
    }

    public void displayRecord(){
        if(calculateBMI() < 18.5){
            System.out.println("BMI too low " + calculateBMI());
        }else if(calculateBMI() > 24.9){
            System.out.println("BMI too high " + calculateBMI());
        }else{
            System.out.println("Correct BMI " + calculateBMI());
        }
    }

    public static void main(String[] args){
        Person p1 = new Person("Kamila", 43, 163);
        p1.calculateBMI();
        p1.displayRecord();

        Person p2 = new Person("Ala", 60, 160);
        p2.calculateBMI();
        p2.displayRecord();

        Person p3 = new Person("Edward", 100, 175);
        p3.calculateBMI();
        p3.displayRecord();
    }
}
