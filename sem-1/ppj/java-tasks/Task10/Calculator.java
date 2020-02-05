public class Calculator extends CalculatingDevice {
    public Calculator(String name) {
        super(name);
    }

    @Override
    public String calculate(double x, double y) {
        double difference = x - y;
        String sum = super.calculate(x, y);
        return(sum + "; " + x + " - " + y + " = " + difference);
    }
}