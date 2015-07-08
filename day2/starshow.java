import java.util.Scanner;
public class starshow 
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("ÇëÊäÈëĞĞÊı£º");
		Scanner scanner=new Scanner(System.in);
		int hangshu=scanner.nextInt();
		int i,j,k;
		for(i=1;i<=hangshu;i++)
		{
			for(j=1;j<=(hangshu-i);j++)
			{
			System.out.print(" ");
			}
			for(k=1;k<=(i*2-1);k++)
			{
				System.out.print("*");
			}
			System.out.println();
			
			
		}	
	}
}


