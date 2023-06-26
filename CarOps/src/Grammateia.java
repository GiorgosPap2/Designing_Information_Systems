import java.util.*;

public class Grammateia {
	private ArrayList<Pelates> pelates = new ArrayList<Pelates>();
	private ArrayList<Oxima> oximata = new ArrayList<Oxima>();
	private String meres = new String();
	private String mhnes = new String();
	private String ores = new String();
	private ArrayList<String> rantevou = new ArrayList<String>();
	
	public Grammateia()
	{}
	
	public ArrayList<Pelates> getPelates() {
		return pelates;
	}

	public ArrayList<Oxima> getOximata() {
		return oximata;
	}
	
	public ArrayList<String> getRantebou() {
		return rantevou;
	}

	public void DhmioyrgiaKartelasPelath( Pelates pelaths )
	{
		pelates.add(pelaths);
		System.out.println("Customer card has been succesfully created!");
	}
	
	public void DhmioyrgiaKartelasOximatos( Oxima oxima)
	{
		oximata.add(oxima);
		System.out.println("Vehicle card has been succesfully created!");
	}
	
	public void DhmioyrgiaRantevou( Pelates pelaths, String mera, String mhnas, String ora )
	{
		if ( meres.equals(mera) && mhnes.equals(mhnas) && ores.equals(ora) ) // morfh oras: 0000
		{
			System.out.println("There is an appointment set for this date!");
		}
		else 
		{
			String rantev = mera + '-' + mhnas + '-' + ora;
	        rantevou.add(rantev);
			System.out.println("The appointment was successfully completed!");
		}
	}
}
