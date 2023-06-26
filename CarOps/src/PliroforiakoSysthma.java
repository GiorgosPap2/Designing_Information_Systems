
public class PliroforiakoSysthma {
	
	public static int DhmiourgiaKwd()
	{
		int i=-1;
		i++;
		return i;
	}
	
	public boolean DiathesimothtaSysthmatosPlhromwn(SysthmaPlhromwn sys)
	{
		 return sys.Diathesimothta();
	}
	
	public void MhniaiaAnafora(Katalogos kat)
	{
		System.out.println("\nMhniaia Anafora:\n");
		System.out.println("\nPelates: ");
		for (Pelates pel: kat.getPelates())
		{
			System.out.println(pel.getOnoma() +"-"+ pel.getEpitheto() +"-"+ pel.getThlefono() +"-"+ pel.getDiefthynsh() +"-"+ pel.getEmail());
		}
		System.out.println("\nOximata: ");
		for (Oxima ox: kat.getOxhmata())
		{
			System.out.println(ox.getMarka() +"-"+ ox.getMontelo() +"-"+ ox.getEtoskat() +"-"+ ox.getPinakida());
		}
		System.out.println("\nEsoda: " + kat.getEsoda() + "€\n");
		System.out.println("Rantebou: ");
		for (String rant: kat.getRantevou())
		{
			System.out.println(rant);
		}
	}
}
