public class Cube {

    // instance variable
    private int edgeLength;
    //constructor
    public Cube(int edgeLength) {
        this.edgeLength = edgeLength;
    }
    // method to calculate and return volume
    public int volume() {
        int volume = (this.edgeLength * this.edgeLength * this.edgeLength);
        return volume;
    }

    @Override
    public String toString() {
        return "The length of the edge is " + this.edgeLength + " and the volume " + this.volume();
    }
}
