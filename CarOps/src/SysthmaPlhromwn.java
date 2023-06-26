
public class SysthmaPlhromwn {
	private double[] plhrwmes = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	private static int count = 0;
	
	public void KataxwrhshPlhrvmhs( double plhrwmh )
	{
		plhrwmes[count]=plhrwmh;
		count++;
		
		System.out.println("The payment was successfully completed!");
	}
	
	public boolean Diathesimothta()
	{
		if (plhrwmes[0]==0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}
