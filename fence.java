public class fence{

    public static String fence (int posts){
    	String ans = "|";
	for (int a = posts; a > 1; a--){
	    ans += "--|";

	}

	return ans;
      }

    public static String fenceR(int posts){
	    if (posts ==1 )
		return "|";
	    else 
		return "|--" + fenceR (posts - 1);

	}
	//fence R(3) --> "|--" + fenceR(2)	  

    public static String reverseR(String w){
	if (w.length() == 1)
	    return w;
	else 
	    return reverseR (w.substring(1)) + w.substring(0,1);
		

    }

    public static String factorialR(String w){
	int ans = 1;
	    if (n > 0)
		ans = ans * n * factorialR (n-1);
	return ans;


    } 


    public static int factorial (int n){
	int ans = 1;
	    for (int i = n; i >0; i--){
		ans *= i;
	    }
	return ans;


    }

    // returns (34)--> "34", (123456789) --> "123,345,678";
    public static int numberWithCommas(int a){
	string number = "a";
        string ans = args[0];
	for (int i = n; i>0; i-3)
{
    ans % 1000 = i;
		ans = i + "" + ".";
	}
	return ans;

}




//reverseR ("cat") returns "t" + "a" + "c



/*
    public static int factorialB (int n){
	number = "n";
	if ( n =< 1)	  
	    {
		return 1;
		else;
		    
		return factorialB(n -1)* number. args [number.length()])  
	       

		    } 
*/ 
    
    public static void main(String[] args){

	    int n = Integer.parseInt(args [0]);
	    System.out.println(fence(n));
	    Systen.out.println(numberWithCommas (n));
	}



}