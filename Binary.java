public class Binary {
    private int _num;
    private String _binary;

    // pre: n>= 0; 
   
    public Binary(){
	_num=0
        _binary="0"
   }
    public Binary(int n){
	_num = n
        _binary = ConvertToBin(n);
    }
    private static String convertToBin(int n){
	/*	String ans = "";
	if (n == 0)
	    n= "0";
	while (n > 0 ){

	    ans += n%2;
	    n/2;
		}				
	return ans;
    }
	*/

	String ans = "";
	for (i=-1; i < n; i++){
	    ans += n % 2;
	    n= n/2;
	}


    }
}