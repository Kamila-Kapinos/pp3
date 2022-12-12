public class Family {
    
    private Person[] people;

    public Family(Person[] people) {
        this.people = people;
    }

    public int adults(){
        
        int counter = 0;
        for(Person person: people){
            if(person.getAge() >= 18){
                counter ++;
            }
        }
        return counter;
    }

}
