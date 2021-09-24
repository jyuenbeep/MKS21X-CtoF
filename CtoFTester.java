// the functions should have the celcius/fahrenheit input as parameters as doubles
// the functions should return the converted value as a double

public class CtoFTester {
  public static void main (String[] args) {
    System.out.println(celsiusToFahrenheit(40.0));
    System.out.println(fahrenheitToCelcius(108.0));
  }
  public static double celsiusToFahrenheit(double celsius) {
    return ((celsius*(1.8))+32);
  }
  public static double fahrenheitToCelcius(double fahrenheit) {
    return ((fahrenheit-32)*(0.56));
  }
}
