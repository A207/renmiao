package exercise;

public class zhishu 
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
      boolean b=true;
      int a=0;
      for(int i=2;i<=100;i++)
      {
    	  for(int j=2;j<i;j++)
    	  {
    		  if (i%j==0)
    			{
    			 b=false;
    			 a++;
    		      break;
    		    }
    		  b=true;
    		  
    	  }
    	  if(b==true)
    		 System.out.println(i);
      }
      System.out.println("ÖÊÊý£º"+(99-a));
	}

}
