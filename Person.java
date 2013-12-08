public class Person{

    // instance variables 
    private String _firstName, _lastName;
    private Face _myFace;


    //********** constructors *****************************
    // postcondtion: represents John Doe with a random Face
    public Person(){
 _firstName = "John";
 _lastName = "Doe";
 _myFace = new Face();
    }

    // postcondition: _firstName and _lastName are initialized
    //                _myFace the default Face
    public Person(String firstName, String lastName){
 this(); // refers to Person()
 _firstName = firstName;
 _lastName = lastName;
    }

    // postcondtion: _firstName, _lastName, _myFace are initialized
    public Person(String firstName, String lastName, Face face){
 this(firstName,lastName); // refers to Person(String,String)
 _myFace = face;
       
    }


    //********* accessor methods *********************************
    public String getFirstName(){
 return _firstName;
    }

    public String getLastName(){
 return _lastName;
    }

    public Face getFace(){
 return _myFace;
    }

    //********  modifier methods *********************************
    // postcondition: returns old firstName
    public String setFirstName(String firstName){
 String ans = _firstName;
 _firstName = firstName;
 return ans;
    }
    // postcondition: returns old lastName
    public String setLastName(String lastName){
 String ans = _lastName;
 _lastName = lastName;
 return ans;
    }
 
    // postcondition: returns old Face
    public Face setFace(Face newFace){
 Face ans = _myFace;
 _myFace = newFace;
 return ans;
    }


    // overwrite toString
    // postcondition: returns a Face followed by first and last names
    /* ex .
       |||||||
       | o o | 
       |  ^  |
       | (-) |
       John Doe
    */
    public String toString(){
 
 return _myFace + "\n" + _firstName + "  " + _lastName;

    }


    public static void main(String [] args){
 Person p1 = new Person();
 Person p2 = new Person("Mary", "Lee");
 Person p3 = new Person("Gary", "Smith", new Face("&&&&&&&",
        "| x x |",
        "| (*) |",
        "|  v  |"));

 System.out.println (p1);
 System.out.println (p2);
 System.out.println (p3);
 



 // swap the first names of p1 and p2

 // swap the hair styles of p2 and p3