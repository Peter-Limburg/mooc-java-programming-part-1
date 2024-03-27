public class Bird {

    private String name;
    private String latin;
    private int count;


    public Bird(String name, String latin, int count) {
        this.name = name;
        this.latin = latin;
        this.count = 0;
    }

    public void increaseCount(int amount) {
        this.count += amount;
    }
    public String getName() {
        return name;
    }

    public String getLatin() {
        return latin;
    }

    public int getCount() {
        return count;
    }
}
