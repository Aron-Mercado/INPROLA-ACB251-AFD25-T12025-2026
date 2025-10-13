public class Calculator implements SampleCalculator {

    private int sum=0;
    private int difference=0;
    private int product=0;
    private int quotient=0;
    public void add(int i) {

        sum += i;
    }
    public void subtract(int i) {

        difference -= i;
    }
    public void multiply(int i) {

        product *= i;
    }
    public void divide(int i) {

        quotient /= i;
    }

}