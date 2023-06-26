import java.util.*;

public class Katalogos{
	private ArrayList<Pelates> pelates = new ArrayList<Pelates>();
	private ArrayList<Oxima> oxhmata = new ArrayList<Oxima>();
	private ArrayList<String> rantevou = new ArrayList<String>();
	private double totalesoda = 0;
	
	public Katalogos(Pelates pelaths, Oxima oxhma, double esoda, String rantevou )
	{
		totalesoda += esoda;
		this.oxhmata.add(oxhma);
		this.pelates.add(pelaths);
		this.rantevou.add(rantevou);
	}
	
	public Katalogos()
	{}
	
	public double getTotalEsoda()
	{
		return totalesoda;
	}

	public ArrayList<Pelates> getPelates() {
		return pelates;
	}

	public void setPelates(Grammateia gram) {
		this.pelates = gram.getPelates();
	}

	public ArrayList<Oxima> getOxhmata() {
		return oxhmata;
	}

	public void setOxhmata(Grammateia gram) {
		this.oxhmata = gram.getOximata();
	}

	public double getEsoda() {
		return totalesoda;
	}

	public void addEsoda(double esoda) {
		this.totalesoda += esoda;
	}

	public ArrayList<String> getRantevou() {
		return rantevou;
	}

	public void setRantevou(Grammateia gram) {
        this.rantevou = gram.getRantebou();
	}
}
