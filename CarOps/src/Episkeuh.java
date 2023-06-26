import java.util.*;

public class Episkeuh {
	private ArrayList<ErgasiaEpiskeuhs> Episkeues = new ArrayList<>();
	private ArrayList<TyposAntallaktikou> Antallaktika = new ArrayList<>();
	private int[] temaxia = {0,0,0,0,0,0,0,0,0,0};
	private static int i=0;
	private int diarkeia;
	
	public Episkeuh(ErgasiaEpiskeuhs epi,TyposAntallaktikou ant, int tem, int diarkeia)
	{
		Episkeues.add(epi);
		Antallaktika.add(ant);
		this.diarkeia=diarkeia;
		temaxia[i]=tem;
		i++;
	}
	
	public ArrayList<ErgasiaEpiskeuhs> getErgasies()
	{
		return Episkeues;
	}
	
	public ArrayList<TyposAntallaktikou> getAntallaktika()
	{
		return Antallaktika;
	}

	public int getDiarkeia() {
		return diarkeia;
	}

	public void setDiarkeia(int diarkeia) {
		this.diarkeia = diarkeia;
	}

	public void addErgEpiskeuhs(ErgasiaEpiskeuhs epi)
	{
		Episkeues.add(epi);
	}
	
	public void addTypAntallaktikou(TyposAntallaktikou ant, int tem)
	{
		Antallaktika.add(ant);
		temaxia[i]=tem;
		i++;
	}
	
	public int getTotalCost()
	{
		int kosterg=0;
		int kostant=0;
		int x=0;
		for (ErgasiaEpiskeuhs ee : Episkeues)
		{
			kosterg += ee.getKostos();
		}
		
		for (TyposAntallaktikou ta : Antallaktika)
		{
			kostant += ta.getPrice()*temaxia[x];
			x++;
		}
		
		return kosterg+kostant;
	}
}
