public class Hexadecimal{

       private final static String HEXDIGITS = "0123456789ABCDEF";

       private String _hex;

       public Hexadecimal(){
       	      _hex = "0";
       }

       // pre: n >= 0
       public Hexadeciaml(int n) {
       	      _hex = convertToHex(n);
       }


      // **************Question 1*********************
      // post: converts an decimal number to a hexadecimal
      //       Use a loop
      public static String convertToHex(int n) {
	  String ans = "";
	  if (n < 10 ) 
	      ans = "n";
	  else if (n = 11)
	      ans = "B";
	  else if (n = 12)
	      ans = "C";
	  else if (n = 13)
	      ans = "D";
	  else if (n = 14)
	      ans = "E";
	  else if (n = 15)
	      ans = "F";
	  else{
	      while (n > 0 ){
		  ans = n % 16 + ans;
		  n /= 16;
	  }
	  
}

      // **************Question 2*********************
      // post: converts an decimal number to a hexadecimal
      //       Use recursion
      public static String convertToHex(int n) {

	  String ans;
	  if (n == 0)
	      ans = "0";
	  else if ( n == 1) 
	      ans = "1";
	  else ans = converToHex(n% 16);
	  return ans;
}
  
      

      // **************Question 3*********************
      // post: converts a hexadecimal to an integer
      //       Use a loop
      public int intValue(){}


      // **************Question 4*********************
      // posts: converts a hexadecimal to an integer
      //        Use recursion
      public int intValueR(){}


      public String toString(){
             return _hex;

      }

      // **************Question 5*********************
      // overwrite the equals method
      public boolean equals(Object rhs){}



      // ************ Question 6 *********************
      // Complete the main method 
      public static void main(String [] args){

         Hexadecimal[] dataH = new Hexadecimal[10];
	 Integer [] dataI = new Integer[10];
		 
         // initialize dataH with random hexadecimal numbers
         // from 0 to 100;
      

	 // initialize dataI with the equivalent integers found
         // in dataH

         // perform a linear search on dataH with the target dataH[9] 

         // find the frequency of dataH[9] in dataH.
        
	 // find the sum of dataI : write a static method to do this.
	 // find the sum of dataH : reuse the static method 

      }



}