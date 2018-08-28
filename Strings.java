

public class Strings
{
   public static String uniqueLetters(String str)
   {
	   String output="";
      for(int i =0;i<str.length();i++)
      {
    	  int count = 0;
     
    	 for(int j =0; j<str.length();j++)
    	 {
    		 if(str.substring(i, i+1).equals(str.substring(j,j+1)))
    		 {
    			 count++;
    		 }
        
         }
    	 if(count<2)
    	 {
    		 output=output+str.substring(i,i+1);
    	 }
   
      }
	return output;
   }
}

