//Anni Weng
//lab 02 - Arithmetic Calculations
//CSE 02 Feb 07, 2016
// Goal: print the number of minutes for each trip, number of counts for each trip, distance of each trip in miles. distance for the two trips combined
// bicycle cyclometer: neasure speed, distance, etc
public class Cyclometer {
    	// main method required for every Java program
   	public static void main(String[] args) {
   	    
   	    //input data
        int secsTrip1=480;  // the number of seconds for the first trip
       	int secsTrip2=3220;  // the number of seconds for the second trip
		int countsTrip1=1561;  // the number of counts (rotations) for the first trip
		int countsTrip2=9037; // the number of counts (rotations) for the second trip
	
		//intermediate variables
		double wheelDiameter=27.0,  // the diameter of wheel
  	    PI=3.14159, // the value of pi
  	    feetPerMile=5280,  // feet per mile
  	    inchesPerFoot=12,   // inches per foot
  	    secondsPerMinute=60;  // seconds per minute
	    double distanceTrip1, distanceTrip2,totalDistance;  // decalre variables: distance of the 1st trip, 2nd trip, and 3rd trip
	
	    System.out.println("Trip 1 took " + (secsTrip1/secondsPerMinute) + " minutes and had " + countsTrip1 + " counts.");
	    System.out.println("Trip 2 took " + (secsTrip2/secondsPerMinute) + " minutes and had " + countsTrip2 + " counts.");
    
        distanceTrip1 = countsTrip1 * wheelDiameter * PI;
        // Above gives distance in inches
        //(for each count, a rotation of the wheel travels the diameter in inches times PI)
	    distanceTrip1/=inchesPerFoot*feetPerMile; // Gives distance in miles
		distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;//calculate the second trip distance
		totalDistance=distanceTrip1+distanceTrip2;// calculate the final distance


        //Print out the output data.
        System.out.println("Trip 1 was " + distanceTrip1 + " miles");
	    System.out.println("Trip 2 was " + distanceTrip2 + " miles");
	    System.out.println("The total distance was " + totalDistance + " miles");


	}  //end of main method   
} //end of class