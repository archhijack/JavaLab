public class GarbageCollection {										//Class
	public void Bin(boolean stat) { 									//Member Function, Access Specifier
    	if(stat==true){													//Data Member, Control Statement
    		System.out.println("The Bin is full.");
    	}
    	else
    		System.out.println("The Bin is empty.");
  	}

  	public static void main(String[] args) {		 					//Main
  		boolean[] binStat = {true, false, true, true, false};			//Array
    	GarbageCollection bins = new GarbageCollection();				//Object of class to call non-static function
    	for(int i=0; i<binStat.length; i++){							//Loop
    		bins.Bin(binStat[i]);										//Calling Function
    	}
  	}
}