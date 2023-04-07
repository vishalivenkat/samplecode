package workouts;

public class Pyramid_numer {
	
	public static void main(String args[])
	{
	int row=4;
	int number=10;
	
	for(int i=row;i>=1;--i)
	{
		for(int j=1;j<=i;++j)
		{
			System.out.println( number+" " );

			
			number--;
		}
		System.out.println();
	}
	
	

}
}