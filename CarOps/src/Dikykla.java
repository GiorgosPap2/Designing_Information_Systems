
public class Dikykla extends Oxima{
	private int kybismos=0;
	
	public Dikykla(String marka, String montelo, int etos, int kyb, String pinakida)
	{
		super(marka,montelo,etos,pinakida);
		this.kybismos=kyb;
	}
	
	public int getKybismos() {
		return kybismos;
	}

	public void setKybismos(int kybismos) {
		this.kybismos = kybismos;
	}

	public void printData()
	{
		super.printData();
		System.out.println("Kybismos: "+kybismos);
	}
}
