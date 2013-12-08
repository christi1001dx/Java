import java.lang.Math ;

public class QuadSolver{
  public static void main(String[] args) {
   double a = Double.parseDouble (args [0]);
   double b = Double.parseDouble (args [1]);
   double c = Double.parseDouble (args [2]);
   
   double discriminant = b * b - 4 * a * c;
   double quadratic1 = (b * -1 + Math.sqrt(discriminant)) / 2 * a;
   double quadratic2 = (b * -1 - Math.sqrt(discriminant)) / 2 * a;
   
  System.out.println ("a" + " + " + "b" + "=" + (a+b));
  System.out.println ("a" + " + " + "b" + "=" + (a-b));
  System.out.println (discriminant);
  System.out.println ( "Positive" + " = " + (quadratic1));
  System.out.println ( "Negative" + " = " + (quadratic2));
    

}
  
}