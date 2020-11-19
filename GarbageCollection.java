import java.util.Scanner;

class GarbageCollectedMay
{
	int garbage = 30;
}

class InvalidReadException extends Exception{  
 InvalidReadException(String s){  
  super(s);  
 }  
}  

public class GarbageCollection extends GarbageCollectedMay
{										//Class
	private int binNo;			//variables
  private String areaName; //change the name accordingly\
	static int count;//will get memory only once and retain its value
	private static String msg = "Have A Great Day!\nSave Nature!\n";
	int garbage = super.garbage + 20;
	final int GarbageLimit = 100; //final variable cannot be changed

	static { //Static block to initialise static variable
		count = 0;
	}

	//static method to change the value of static variable
  static void change()
	{
   count = 0;
  }

	abstract class Garbage{    //Abstract Class
		abstract int printGarbage();
	}

	class April extends Garbage{    //Class extending abstract class
		int printGarbage(){return 27;}
	}

	class March extends Garbage{    //Class extending abstract class
		int printGarbage(){return 10;}
	}

	public static class NestedStaticClass
	{ //Static Class
    // Only static members of Outer class
    // is directly accessible in nested
    // static class
    public void printMessage()
  	{
      // Try making 'message' a non-static
      // variable, there will be compiler error
      System.out.println("Thank You For Using Garbage Collection Management System\n" + msg);
    }
  }

  static void validate(int garbage, int garbageLimit)throws InvalidReadException{
  		if(garbage > garbageLimit){
				throw new InvalidReadException("Garbage Overload. Cleanup Immediately.");
			}
  }

	GarbageCollection()
	{
		//Default constructor
		// Scanner sc = new Scanner(System.in);
		// System.out.println("Enter Bin Number: ");
	 //  	binNo = sc.nextInt();
		binNo = 100;
	  	areaName = "New Hampshire";
		count++;//incrementing the value of static variable
		// System.out.println("Bins Reset to: " + count);

		/*if(garbage > GarbageLimit){
			System.out.println("Garbage Overload. Cleanup Immediately.");
		}*/
		
			try{
				validate(garbage, GarbageLimit);
			}
			catch(Exception e){
				System.out.println(e.toString());
			}
	}
	GarbageCollection(int num1, StringBuffer str)
	{
	  //Parameterized constructor
	  binNo = num1;
	  areaName = str.toString();
	}

	void printG(String s) //Overloading
	{
		March m = new March();
		April a = new April();
		System.out.println("\nTotal Garbage Collected in March = " + m.printGarbage());
		System.out.println("Total Garbage Collected in April = " + a.printGarbage());
		System.out.println("Total Garbage Collected in May = " + super.garbage);	//prints garbage of GarbageCollectedMay class
	}

	void printG(){
		System.out.println("Total Garbage Collected in June = " + garbage);//prints garbage of GarbageCollection class
	}

  //Getter and setter methods
	public int getbinNo() {
	       return binNo;
	}

	public void setbinNo(int binNo) {
	       this.binNo = binNo;
	}

	public String getareaName() {
	       return areaName;
	}

	public void setareaName(String areaName) {
	       this.areaName = areaName;
	}

	//Till here getter and setter methods

	//function overloading
	// public void disp(char c)
 //  {
 //        System.out.println(c);
 //  }

	// public void disp(char c, int num)
 //  {
 //        System.out.println(c + " "+num);
 //  }
	//Till here

	public void Bin(boolean stat, int num)
	{				 			//Member Function, Access Specifier
		System.out.print("Bin "+num+" ");
    	if(stat==true)
			{													//Data Member, Control Statement
    		System.out.print("is full.");
    	}
    	else
    		System.out.print("is empty.");
    	System.out.println();
  }

  public static void main(String[] args)
	{		 					//Main
  		boolean[] binStat = {true, false, false, true, false};			//Array
    	GarbageCollection bins = new GarbageCollection();				//Object of class to call non-static function
    	for(int i=0; i<binStat.length; i++)
			{							//Loop
    		bins.Bin(binStat[i], i+1);									//Calling Function
    	}
			//This object creation would call the default constructor
    		System.out.println("The current Garbage Status in Bangalore is:\n");
			GarbageCollection myobj = new GarbageCollection();

			System.out.println("------------ Next Area ------------");

			System.out.println("\nArea Name is: "+myobj.getareaName());
			System.out.println("Bin Number is: " + myobj.getbinNo());

			System.out.println("------------ Next Area ------------");

			// System.out.println("\nEnter Area Name to Clean Up: ");
			Scanner sc = new Scanner(System.in);
			try{
				StringBuffer aName = new StringBuffer(args[0]);
				System.out.println("\nArea Name to Clean Up: " + aName);
				System.out.println("\nEnter Bin Number: ");
				int bno = sc.nextInt();
				GarbageCollection myobj4 = new GarbageCollection(bno, aName);
				System.out.println("Area Name is: "+myobj4.getareaName());
				System.out.println("Bin Number is: " + myobj4.getbinNo());
			}
			catch (ArrayIndexOutOfBoundsException e){
				System.out.println(e.toString());
			}

			System.out.println("------------ Cleanup Complete ------------");

			GarbageCollection myobj2 = new GarbageCollection();//Increasing count variable through this.
			GarbageCollection.change();//Calling change method
			System.out.println("\nBins Reset to: " + count);

			System.out.println("------------ Cleanup Summary ------------");

			GarbageCollection myobj3 = new GarbageCollection();
			myobj3.printG("curr"); //Calls the function to print garbage
			myobj3.printG();

			/*This object creation would call the parameterized
			 * constructor StudentData(int, String)*/
			// Scanner sc = new Scanner(System.in);
			// System.out.println("Enter Bin Number: ");
			// int bno = sc.nextInt();
			

      // myobj.disp('a');
      // myobj.disp('a',10);

      System.out.println("------------------------------------------");

			// Create instance of nested Static class
      GarbageCollection.NestedStaticClass printer = new GarbageCollection.NestedStaticClass();
      // Call non static method of nested
      // static class
      printer.printMessage();

			//Command Line
			//When executing the file type something in front of it and it will print that line
			// for(int i = 0; i<args.length; i++) {
   //       System.out.println("args[" + i + "]: " + args[i]);
   //    }

			// Garbage g;
			// g= new March();
			// System.out.println("Garbage Collected in March: "+g.printGarbage()+" kg");
			// g= new April();
			// System.out.println("Garbage Collected in April: "+g.printGarbage()+" kg");
  }
}
