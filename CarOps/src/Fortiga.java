
public class Fortiga extends Oxima{
	private int ofelimo_fortio=0;
	
	public Fortiga(String marka, String montelo, int etos, int of, String pinakida)
	{
		super(marka,montelo,etos,pinakida);
		this.ofelimo_fortio=of;
	}

	public int getOfelimo_fortio() {
		return ofelimo_fortio;
	}

	public void setOfelimo_fortio(int ofelimo_fortio) {
		this.ofelimo_fortio = ofelimo_fortio;
	}
	
	public void printData()
	{
		super.printData();
		System.out.println("Kybismos: "+ofelimo_fortio);
	}
}
