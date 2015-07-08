package gaoboshixi;

public class Score
{

	public static void main(String[] args)
	{
		  int i;
		  int j;
		  int[] total;
		  total=new int[20];
		  float[] aver;
	      aver=new float[5];
	      int [][]sco;
	      sco=new int[20][5];
	      System.out.print("core C++"+"\t");
    	  System.out.print("coreJava"+"\t");
    	  System.out.print("Servlet"+"\t");
    	  System.out.print("JSP"+"\t");
    	  System.out.print("EJB"+"\t");
    	  System.out.println();
	      for(i=0;i<20;i++)
	      {
	    	  for(j=0;j<5;j++)
	    	  {  
	    		  sco[i][j]=(int)(Math.random()*100);
	    	      System.out.print(sco[i][j]+"\t");
	    	  }
	    	  System.out.println();
	       }
	      for(i=0;i<20;i++)
	      {
	    	  for(j=0;j<5;j++)
	    	  {
               total[i]=sco[i][j]+total[i];
               aver[j]=aver[j]+sco[i][j];
	    	  }
	    	  System.out.print(total[i]+"\t");
	      }
	      System.out.println();
	      for(j=0;j<5;j++)
	    	  System.out.print(""+aver[j]/20+"\t");
	 }

}
