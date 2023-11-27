
public class Statistics {

    private int count;
    private int sum;

    public Statistics() {
        // initialize the variable numberCount here
    }

    public void addNumber(int number) {
        this.sum += number;
        this.count++;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return sum;
    }

    public double average() {
        if (count != 0) {
            return ((double) sum / count);
        } else return 0;
    }
}
