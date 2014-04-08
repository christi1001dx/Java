public class NumberWithCommasR{


    public static String NumberWithCommasR(int n){

	String ans = "";
	String temp = "00";
	if (n < 1000)
	    ans += n;
	else{
	    temp += n% 1000;
	    temp = temp.substring(temp.length() - 3);
       	    ans = NumberWithCommasR(n/1000) + "," + n % 1000;

	}
	return ans;

    }

    public static String numberWithCommasI(int n){
	String ans = "";
	String temp = "";
	for (; n > 0 ; n /= 1000){
	    temp = "00" + n %1000;
	    temp = temp.substring(temp.length() -3 );
	    ans += "," + temp + ans;
	    
	}

	ans =  n + ans;
	return ans;

    }

	public static void main(String [] args){
	    Integer temp;
	    for (String x: args){
		temp = Integer.parseInt(x);
	   
	    System.out.println(NumberWithCommasR(temp)); 
	    System.out.println(numberWithCommasI(temp));
}

	}


}