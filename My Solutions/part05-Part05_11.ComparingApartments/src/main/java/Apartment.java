
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;
//    private int price = princePerSquare * squares;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        int ownSquare = this.squares;
        int comparedSquare = compared.squares;
        if (ownSquare > comparedSquare) {
            return true;
        }
        return false;

        // Small code that directly give true or false for boolean // If its larger than it gives true. Otherwise return type is always false.
        //  return this.squares > compared.squares;
    }

    public int priceDifference(Apartment compared) {
        int ownPrice = this.princePerSquare * this.squares;
        int comparedPrice = compared.princePerSquare * compared.squares;

        if (ownPrice > comparedPrice) {
            return ownPrice - comparedPrice;
        }
        return comparedPrice - ownPrice;
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int ownPrice = this.princePerSquare * this.squares;
        int comparedPrice = compared.princePerSquare * compared.squares;

        if (ownPrice > comparedPrice) {
            return true;
        }
        return false;

        // return(this.princePerSquare * this.squares) > (compared.princePerSquare * compared.squares);
    }
}
