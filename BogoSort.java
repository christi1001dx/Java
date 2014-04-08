public class BogoSort{

    public static void swap (int i, int j, Object[] x){

	Object temp = x[i];
	x[i] = x [j];
	x[j] = temp;
    
	public static void shuffle (object [] x){
    int randPos;
    for (int i = x.length -1 ; i > 0;, i--){
	randPos = (int)(Math.random() * (i+1));
	swap(i, randPos, x);	
    }
    }
     public static void print(object [] x){
	 for (object temp : x)
	     System.out.print(temp + "");
	 System.out.println();
     }

  
    public static boolean isSorted (Comparable [] x){
	boolean ans = true;
	for (int i = x.length -1; i>0; i--)
	    if (x [i].compareTo (x[i-1] < 0)}
	ans = false;
	break;
    } 
   
    public static void boboSort ((Comparable[] x){
	    if ( ! isSorted(x)){
		shuffle(x);
		bogoSort(x);
	    }
	}


    public static void main (String[] args){
	String [] data = {"apples", "bacon", "turkey"};
	System.out.println (print (data));
	System.out.println (shuffle (data));
	System.out.println (swap (data));

    }

}
