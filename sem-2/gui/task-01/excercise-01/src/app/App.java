package app;

public class App {
    public static void main(String[] args) {
        MyWater.reportStock();
        MyWater.addLarge(3);
        MyWater.addMedium(2);
        MyWater.addSmall(1);
        MyWater.reportStock();
        MyWater.setVolumeLARGE(3.0);
        MyWater.setVolumeMEDIUM(1.5);
        MyWater.setVolumeSMALL(1);
        MyWater.reportStock();
        MyWater.resetVolumes();
        MyWater.reportStock();
        MyWater.resetStock();
        MyWater.reportStock();
    }
}