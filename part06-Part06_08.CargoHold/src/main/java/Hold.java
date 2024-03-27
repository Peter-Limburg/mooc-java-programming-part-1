import java.util.ArrayList;

public class Hold {

    private int maximumWeight;
    private ArrayList<Suitcase> cases;
    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.cases = new ArrayList<>();
    }

    public int getMaximumWeight() {
        return maximumWeight;
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Suitcase suitcase : cases) {
            totalWeight += suitcase.totalWeight();
        }
        return totalWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (totalWeight() + suitcase.totalWeight() <= maximumWeight) {
            cases.add(suitcase);
        }
    }

    public void printItems() {
        for (Suitcase suitcase : cases) {
            suitcase.printItems();
        }
    }

    public String toString() {
        int suitcaseCount = cases.size();
        return suitcaseCount + (suitcaseCount == 1 ? " suitcase" : " suitcases") + " (" + totalWeight() + " kg)";
    }

}
