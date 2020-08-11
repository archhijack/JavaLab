public class GarbageCollection {										//Class
	public void Bin(boolean stat, int num) {				 			//Member Function, Access Specifier
		System.out.print("Bin "+num+" "); 								
    	if(stat==true){													//Data Member, Control Statement
    		System.out.print("is full.");
    	}
    	else
    		System.out.print("is empty.");
    	System.out.println();
  	}

  	public static void main(String[] args) {		 					//Main
  		boolean[] binStat = {true, false, true, true, false};			//Array
    	GarbageCollection bins = new GarbageCollection();				//Object of class to call non-static function
    	for(int i=0; i<binStat.length; i++){							//Loop
    		bins.Bin(binStat[i], i+1);									//Calling Function
    	}
  	}
}