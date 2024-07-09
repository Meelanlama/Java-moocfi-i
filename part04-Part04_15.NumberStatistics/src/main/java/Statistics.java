
public class Statistics {

    private int count;
    private int sum;

    //Constructor
    public Statistics() {
    }

    //Method for adding the number
    public void addNumber(int number) {
        this.sum += number; // Getting the sum
        this.count++;  //if number is added to sum then count increases
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return sum;
    }

    public double average() {
        if (this.sum != 0 && this.count != 0) {
            return (1.0 * this.sum / this.count);
        }
        return 0.0;
    }
}
