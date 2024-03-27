
public class HealthStation {

    private int weighingsNum = 0;

    public int weigh(Person person) {
        weighingsNum++;
        if (person.getWeight() >= 0) {
            return person.getWeight();
        } else {
            return -1;
        }
    }

    public void feed(Person person) {
        int newWeight = person.getWeight();
        person.setWeight(newWeight + 1);
    }

    public int weighings(){
        return weighingsNum;
   }
}





