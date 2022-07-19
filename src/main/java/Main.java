public class Main {
  public static void main(String[] args) {
    BonusService service = new BonusService();

    long amount = 1000_60;
    boolean registered = true;
    long expected = 30;


   long actual  = service.calculate(amount, registered);
    assertEquals(expected, actual);
    



  }

  private static void assertEquals(long expected, long actual) {
  }
}

