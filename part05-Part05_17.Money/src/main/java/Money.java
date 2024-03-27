
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public Money plus(Money addition) {
        int totalEuros = this.euros + addition.euros;
        int totalCents = this.cents + addition.cents;

        if (totalCents >= 100) {
            totalEuros++;
            totalCents -= 100;
        }

        Money newMoney = new Money(totalEuros, totalCents);
        return newMoney;
    }

    public boolean lessThan(Money compared){
        if (this.euros < compared.euros) {
            return true;
        } else if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        }
        return false;
    }

    public Money minus(Money decreaser) {

       int diffEuros = this.euros - decreaser.euros;
       int diffCents = this.cents - decreaser.cents;

       if (diffCents < 0) {
           diffEuros--;
           diffCents = 100 + diffCents;
       }

       if (diffEuros < 0 || (diffEuros == 0 && diffCents < 0)) {
           diffEuros = 0;
           diffCents = 0;
       }
        return new Money(diffEuros, diffCents);
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
