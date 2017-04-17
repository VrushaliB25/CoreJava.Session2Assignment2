
public class Session2Assignment2 {
	public static void main(String s[])
	{
	    /* To Write a program to print the following pattern:
		  a
		a b a
	  a b c b a
		a b a
		  a   */
		int noOfColumns=1;    
	       int a = 96;
	      
	       	int noOfSpaces=3; 
	     
	       for (int i=1; i<=5; i++)
	       {
	    	   int k=0;
	    	  	for (int j=1; j<=noOfSpaces; j++)
	    	  	{
	    	  		System.out.print(" ");
	    	  		
	    	  	}
	    	  		    	  
	    	   for (int j=1; j<=noOfColumns; j++)
	    	   {
	    		   int middleColumn = (noOfColumns)/2+1;
	    		 
	    		  
	    		   if (j<=i)
	    		   {
	    			  if (j>middleColumn)  
	    			  {
	    				  k--;
	    			  }
	    			  else
	    			   {
	    				  k++;
	    			   }
	    			 
	    			   
	    		   }
	    		   else
	    		   {
	    			 k--; 
	    		   }
	    		   System.out.print(""+ (char)(a+k)); 
	    		   
	    	   }
	    	   System.out.println();
	    	  
	    	   if (i<3)
	    	   {
	    		   noOfColumns=noOfColumns+2; 
	    		   noOfSpaces=noOfSpaces-1;
	    	   }
	    	   else
	    	   {
	    		   noOfColumns=noOfColumns-2; 
	    		   noOfSpaces=noOfSpaces+1;
	    		      		   
	    		   
	    	   }
	    	   
	    	   }
	    	   
	       }
	       
	}
	       

	       