public class Reformatory {

    private int total; 
    
    public int weight(Person person) {
        // return the weight of the person
        total++;
        return person.getWeight();
    }
    
    public void feed(Person person)
    {
        int weight = person.getWeight();
        person.setWeight(weight + 1);
    }
    
    public int totalWeightsMeasured(){
        
       
        return total;
    }
}
