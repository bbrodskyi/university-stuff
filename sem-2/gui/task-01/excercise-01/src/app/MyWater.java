package app;

public class MyWater {
  public static double LARGE = 2.0, MEDIUM = 1.0, SMALL = 0.5;
  private static int[] stock = { 0, 0, 0 };

  // Volume getters
  public static void getVolumeLARGE() {
    System.out.println("LARGE: " + LARGE + "l");
  }

  public static void getVolumeMEDIUM() {
    System.out.println("MEDIUM: " + MEDIUM + "l");
  }

  public static void getVolumeSMALL() {
    System.out.println("SMALL: " + SMALL + "l");
  }

  // Volume setters
  public static void setVolumeLARGE(double newVol) {
    LARGE = newVol;
    System.out.println("New LARGE volume set to: " + newVol);
  }

  public static void setVolumeMEDIUM(double newVol) {
    MEDIUM = newVol;
    System.out.println("New MEDIUM volume set to: " + newVol);
  }

  public static void setVolumeSMALL(double newVol) {
    SMALL = newVol;
    System.out.println("New SMALL volume set to: " + newVol);
  }

  // Static methods for adding bottles to the stock
  public static void addLarge(int n) {
    stock[0] += n;
    System.out.println(n + " large bottles added");
    System.out.println("->");
  }

  public static void addMedium(int n) {
    stock[1] += n;
    System.out.println(n + " medium bottles added");
    System.out.println("->");
  }

  public static void addSmall(int n) {
    stock[2] += n;
    System.out.println(n + " small bottles added");
    System.out.println("->");
  }

  // Static methods to report on the stock
  public static void reportStock() {
    System.out.println("We have got " + MyWater.getTotalCount() + " bottles of water in stock.");
    System.out.println("We have got " + MyWater.getTotalVolume() + " liters of water in stock.");
    MyWater.reportLarge();
    MyWater.reportMedium();
    MyWater.reportSmall();
    System.out.println("--------------------------------");
  }

  public static void reportLarge() {
    System.out.println("Large bottles count: " + MyWater.getLargeCount());
    System.out.println("Large bottles volume: " + MyWater.getLargeVolume() + "l");
  }

  public static void reportMedium() {
    System.out.println("Medium bottles count: " + MyWater.getMediumCount());
    System.out.println("Medium bottles volume: " + MyWater.getMediumVolume() + "l");
  }

  public static void reportSmall() {
    System.out.println("Small bottles count: " + MyWater.getSmallCount());
    System.out.println("Small bottles volume: " + MyWater.getSmallVolume() + "l");
  }

  // Static methods to get volumes
  public static double getTotalVolume() {
    double volume = MyWater.getLargeVolume() + MyWater.getMediumVolume() + MyWater.getSmallVolume();
    return volume;
  }

  public static double getLargeVolume() {
    return stock[0] * LARGE;
  }

  public static double getMediumVolume() {
    return stock[1] * MEDIUM;
  }

  public static double getSmallVolume() {
    return stock[2] * SMALL;
  }

  // Static methods to get counts
  public static int getTotalCount() {
    int count = MyWater.getLargeCount() + MyWater.getMediumCount() + MyWater.getSmallCount();
    return count;
  }

  public static int getLargeCount() {
    return stock[0];
  }

  public static int getMediumCount() {
    return stock[1];
  }

  public static int getSmallCount() {
    return stock[2];
  }

  // Resets
  public static void resetVolumes() {
    LARGE = 2.0;
    MEDIUM = 1.5;
    SMALL = 0.5;
    System.out.println("Volumes reset completed");
  }

  public static void resetStock() {
    stock[0] = 0;
    stock[1] = 0;
    stock[2] = 0;
    System.out.println("Stock reset completed");
  }
}