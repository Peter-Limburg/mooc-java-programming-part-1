
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        int ownSize = this.squares;
        int comparedSize = compared.squares;
        if (ownSize > comparedSize){
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared){

        int ownPrice = this.squares * pricePerSquare;
        int comparedPrice = compared.squares * compared.pricePerSquare;
        int difference = ownPrice - comparedPrice;
        if (difference < 0) {
            difference *= -1;
        }
        return difference;
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int ownPrice = this.squares * pricePerSquare;
        int comparedPrice = compared.squares * compared.pricePerSquare;
        if (ownPrice > comparedPrice) {
            return true;
        }
        return false;
    }

}
