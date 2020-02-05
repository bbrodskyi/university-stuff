public class CalculatingDevice {
    private String name;

    public CalculatingDevice (String n) {
        this.name = n;
    }

    public String calculate(double x, double y) {
        double sum = x + y;
        return((this.name + ": " + x + " + " + y + " = " + sum));
    }

    public static void printRes(CalculatingDevice[] a, double x, double y) {
        for (CalculatingDevice device : a) {
            System.out.println(device.calculate(x, y)); 
        }
    }
}