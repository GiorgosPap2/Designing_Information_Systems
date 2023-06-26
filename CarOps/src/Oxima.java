
public class Oxima {
	private String marka = "";
	private String montelo = "";
	private int etoskat=0;
	private String pinakida = "";
	
	public Oxima(String marka, String montelo, int etos, String pinakida)
	{
		this.marka=marka;
		this.montelo=montelo;
		this.etoskat=etos;
		this.pinakida=pinakida;
	}
	
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getMontelo() {
		return montelo;
	}
	public void setMontelo(String montelo) {
		this.montelo = montelo;
	}
	public int getEtoskat() {
		return etoskat;
	}
	public void setEtoskat(int etoskat) {
		this.etoskat = etoskat;
	}
	
	public String getPinakida(){
		return pinakida;
	}
	
	public void setPinakida(String pinakida){
		this.pinakida=pinakida;
	}
	
	public void printData()
	{
		System.out.println("Marka oximatos: "+ marka +", Montelo: "+ montelo +", Etos kataskeuhs: "+etoskat);
	}
}
