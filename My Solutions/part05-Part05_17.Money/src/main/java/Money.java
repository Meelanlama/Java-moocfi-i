
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        // Checks if cents is greater than 99. So it can convert to euros.
        if (cents > 99) {
            euros = euros + cents / 100; // If there are more than 99 cents. Than it converts the cents into euros by
                                         // dividing with 100. . For example, if cents is 150, this line would add 1 to
                                         // euros (since 150 cents is equal to 1 euro and 50 cents).
            cents = cents % 100; // Now updating the value of cents
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    // It has 'final' classs fields for euros and cents. So we cant directly modify
    // the fields.So creating a new 'Money' object with updated value and return it.
    public Money plus(Money addition) {
        int newEuros = this.euros + addition.euros; // Adding the current euros(this) to the euros passed as parameter
                                                    // of object(addition)
        int newCents = this.cents + addition.cents;

        if (newCents > 99) {
            newEuros = newEuros + newCents / 100;
            newCents = newCents % 100;
        }

        Money newMoney = new Money(newEuros, newCents); // Creating a new money object with the updated value of euros
                                                        // // and cents
        return newMoney; // returning the newObject value
    }

    // Shortform of plus method
    // public Money plus(Money addition){
    // Money newMoney = new Money((this.euros + addition.euros), (this.cents +
    // addition.cents));
    // return newMoney;
    // }

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        } else if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        }
        return false;
    }

    public Money minus(Money decreaser) {
        int minusEuro = this.euros - decreaser.euros; // decreasing the euros of paramater euros from current euros
        int minusCent = this.cents - decreaser.cents;

        // if the cent is negative from decreasing then
        if (minusCent < 0) {
            minusEuro--; // one euro is minus as cents is negative
            minusCent = 100 + minusCent; // i.e adding 1 euros(100 cent) to the negative cents
        }

        // if euros is in negative then it should be 0;
        if (minusEuro < 0) {
            minusEuro = 0;
            minusCent = 0;
        }
        Money minusMoney = new Money(minusEuro, minusCent);
        return minusMoney;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
}
