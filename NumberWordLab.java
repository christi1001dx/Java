public class NumberWorldLab{

public class NumberWord implements Comparable{

       private int _num;
       private String _word;

       public NumberWord(){
       	      _num = 0;
	      _word = "zero";
       }

       // pre: n >= 0
       public NumberWord(int n){
       	      _num = n;
	      _word = convertToEng(n);
       }
       
       //*********** question 1 **********************
       // pre: 0<= n < 10
       // post: digits(3) -> "three"
    private static digits(int n){
	String ans = "";
	            if (n ==1)
	        	ans = "one";
	            else if (n==2)
			ans = "two";
                    else if(n==3
			ans = "three";
		    else if (n==4)
		      ans = "four";
		    else if (n==5)
	 	 ans = "five";
		    else if (n==6)
			ans = "six";
		    else if (n == 7)
		    ans = "seven";
		    else if (n == 8)
		    ans = "eight";
		    else (n == 9)
		    ans = "nine";
		       
		     return ans;

       }
       
       //*********** question 2 **********************
       // pre: 10 <= n < 20
       // post: teens(11) -> "eleven"
       private static teens(int n)
       {
	   String ans = "";
	   if (n == 11);
	   ans = "eleven";
	   else if (n == 12)
	   ans = "twelve";
	   else if (n == 13)
	   ans = "thirteen";
	   else if (n == 14)
	   ans = "fourteen";
	   else if (n == 15)
	   ans = "fifteen";
	   else if (n == 16)
	   ans = "sixteen";
	   else if (n == 17)
	   ans = "seventeen";
	   else if (n == 18)
	   ans = "eighteen";
	   else
	       ans = "nineteen";
	   return ans;

 }

       //*********** question 3 **********************
       // pre: 10 <= n < 100 and n is multiple of 10
       // post : tensPrefix(10) -> "ten"
       //        tensPrefix(20) -> "twenty"
          private static tensPrefix(int n){
        	String ans = "";
		if (n == 10)
		    ans = "ten";
		else if (n == 20)
		    ans = "twenty";
		else if (n == 30)
		    ans = "thirty";
		else if (n == 40)
		    ans = "forty";
		else if (n == 50)
		    ans = "fifty";
		else if (n == 60)
		    ans = "sixty";
		else if (n == 70)
		    ans = "seventy";
		else if (n ==80)
		    ans = "eighty";
		else 
		    ans = "ninety";


       }

       //*********** question 4 **********************
       // ****Write a recursive solution. The code shouldn't
       // ****be too long.
       // pre:  0 <= n <= Integer.MAX_VALUE
       // post: returns a string of word representing 
       //       the number
       public static String convertToEng(int n) 
       { // your code goes here }

       public int intValue(){
       	       return _num;
       }

       public String toString(){
       	      return _word;
       }

       //*********** question 5 **********************
       public boolean equals(Object rhs)
       { //your code goes here }

      //*********** question 6 **********************
       
       public int compareTo(Object rhs)
       {  // your code goes here }

      //*********** question 7 **********************
      public static void main(String [] args){
         // create an array of NumberWord objects with length 20

	 // initialize the array with random integers from 0 to Integer.MAX_VALUE

         // print the values in the array so the output looks like
         //   2   twenty
	 //   14  fourteen
	 //   etc.

	 // BogoSort the array

	 // print the array
      
      }

}
