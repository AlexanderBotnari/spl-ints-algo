import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Aplication {

	public static void main(String[] args) {
		
	  List<Double> temps = new ArrayList<>(); 
	  System.out.print("     Mo      Tu      We      Th      Fi      Sa      Su");
      System.out.printf("\n--------------------------------------------------------");

      int i = 0;
      while( i < 31 ) {
            if(i == 7) {
	        System.out.println();
            }
    	temps.add(ThreadLocalRandom.current().nextDouble(-25 , 25 ));
        i++;
      }

      for (Double t : temps) {
    	  if(t == temps.get(14) || t == temps.get(21) || t == temps.get(28) || t == temps.get(7)) {
    		  System.out.println();
    	  }
		System.out.printf( "%8.1f", t );
	}
    	  
    	  
      Double max = 0.0,min = 0.0,avg = 0.0;
		  for( Double t: temps ) {          
			  if( t > max ){
	                max = t ;
	            }else if( t < min ){
	                min = t;
	            }
	            avg = (avg + t) / 31;
		  }
		    System.out.printf("\n The max temperature is : "+ "%.2f\n", max);
	        System.out.printf(" The min temperature is : " + "%.2f\n", min);
	        System.out.printf(" The avg temperature is : " + "%.2f\n", avg);
      }

}
