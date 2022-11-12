public class TestPerson {
    public static void main(String[] args){
        Person p = new Person("Anna",21); 
        p.getAge();
        p.isAdult();
        System.out.println(p.isAdult());
        p.setAge(17); 
        System.out.println(p.isAdult());
        System.out.println(p);
    }
}
