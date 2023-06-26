import java.util.*;

public class Mhxanikoi {
	private String onoma="";
	private String epitheto="";
	
	public Mhxanikoi(String on, String epi)
	{
		this.onoma=on;
		this.epitheto=epi;
	}

	public String getOnoma() {
		return onoma;
	}

	public void setOnoma(String onoma) {
		this.onoma = onoma;
	}

	public String getEpitheto() {
		return epitheto;
	}

	public void setEpitheto(String epitheto) {
		this.epitheto = epitheto;
	}
	
	public void PliroforiesErgasion(ArrayList<ErgasiaEpiskeuhs> episkeues)
	{
		int x=1;
		for (ErgasiaEpiskeuhs i : episkeues)
		{
			System.out.println("Episkeuh "+ x +": "+ i.getErgasia());
			x++;
		}
	}
	
	public void printData()
	{
		System.out.println("Onoma Mhxanikou: "+ onoma +", Epitheto: "+ epitheto);
	}
}
