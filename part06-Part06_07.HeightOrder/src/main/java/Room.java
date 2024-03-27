import java.util.ArrayList;

public class Room {
    private ArrayList<Person> people;

    public Room() {

    people = new ArrayList<>();

    }

    public ArrayList<Person> getPersons(){
        return people;
    }

    public void add(Person person) {

        people.add(person);

    }

    public boolean isEmpty() {


        if (people.isEmpty()) {
            return true;
        }
        return false;
    }

    public Person shortest() {

        if (people.isEmpty()) {
            return null;
        }

        Person returnObj = this.people.get(0);

        for (Person human : people) {
            if (returnObj.getHeight() > human.getHeight()) {
                returnObj = human;
            }
        }
        return returnObj;
    }

    public Person take() {

        if (people.isEmpty()) {
            return null;
        }

        Person shorty = shortest();

        people.remove(shorty);
        return shorty;
    }


}
