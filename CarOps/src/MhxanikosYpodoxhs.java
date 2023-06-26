import java.util.ArrayList;

public class MhxanikosYpodoxhs extends Mhxanikoi{
	private ArrayList<String> vlaves = new ArrayList<>();
	private ArrayList<ErgasiaEpiskeuhs> ergasies = new ArrayList<>();
	private ArrayList<Oxima> oximata = new ArrayList<>();
	Grammateia grammateia = new Grammateia();
	
	public MhxanikosYpodoxhs(String on, String epi, Grammateia gram)
	{
		super(on,epi);
		this.grammateia = gram;
	}
	
	public void addVlavh(String vlavh)
	{
		vlaves.add(vlavh);
	}
	
	public boolean KataxorisiArithmouPinakidas(String arpin)
	{
		int i;
		oximata = grammateia.getOximata();
		for (i=0;i<oximata.size();i++)
		{
			Oxima oxima = oximata.get(i);
			if (oxima.getPinakida().equals(arpin))
			{
				System.out.println("Marka: "+ oxima.getMarka()+", Montelo: "+oxima.getMontelo()+", Etos Kataskeuhs: "+oxima.getEtoskat());
				return true;
			}
		}
		return false;
	}
	
	public void KataxorisiOximatos(Oxima ox)
	{
		grammateia.DhmioyrgiaKartelasOximatos(ox);
	}
	
	public void KatagrafiErgasiwn_Pliroforiwn(ErgasiaEpiskeuhs erg)
	{
		ergasies.add(erg);
	}
	
	public void printData()
	{
		super.printData();
		for (String i : vlaves)
		{
			System.out.println("Vlavh :"+i);
		}
	}
}
