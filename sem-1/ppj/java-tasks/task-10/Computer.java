public class Computer extends Calculator {
    public Computer(String name) {
        super(name);
    }

    @Override
    public String calculate(double x, double y) {
        double mult = x * y;
        double div = x / y;
        String sumAndNeg = super.calculate(x, y);
        return(sumAndNeg + "; " + x + " * " + y + " = " + mult
                + "; " + x + " / " + y + " = " + div         
        );
    }
}