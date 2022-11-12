public class Person {
    private String name;
    private int age;

    Person(String name, int adult){
        this.name = name;
        this.age = adult;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public boolean isAdult(){
        if(getAge() >= 18){
            return true;
        }else{
            return false;
        }
    }

    public String toString(){
        return getName() + "," + getAge();
    }

}
