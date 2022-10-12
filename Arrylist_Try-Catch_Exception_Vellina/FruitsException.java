public class FruitsException extends Exception {

  public FruitsException(String message) {
    super(message);
  }

  public String notNumber() {
    return "Your input is not a number.";
  }

}
