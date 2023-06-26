import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Katalogos kat = new Katalogos();
		
		Grammateia gram = new Grammateia();
		
		Pelates pelaths1 = new Pelates("Georgios","Pamak","6958352754","Pamak 14","pamak@gmail.com");
		gram.DhmioyrgiaKartelasPelath(pelaths1);
		Pelates pelaths2 = new Pelates("Baggelhs","Auth","6958355754","Auth 14","auth@gmail.com");
		gram.DhmioyrgiaKartelasPelath(pelaths2);
		kat.setPelates(gram);
		
		Oxima oxima1 = new Oxima("Toyota","Supra",1997,"NHE1234");
		gram.DhmioyrgiaKartelasOximatos(oxima1);
		Oxima oxima2 = new Oxima("Ford","Ranger",2015,"AHE1674");
		gram.DhmioyrgiaKartelasOximatos(oxima2);
		kat.setOxhmata(gram);
		
		gram.DhmioyrgiaRantevou(pelaths1, "04", "06", "1030");
		gram.DhmioyrgiaRantevou(pelaths2, "04", "06", "1230");
		kat.setRantevou(gram);
		
		MhxanikosYpodoxhs mhxyp = new MhxanikosYpodoxhs("Lefteris","Georgiou",gram);
		
		mhxyp.KataxorisiArithmouPinakidas("AHE1674");
		
		ErgasiaEpiskeuhs ErgasiaEpiskeuhs1 = new ErgasiaEpiskeuhs("Allagh ladiwn",20);
		ErgasiaEpiskeuhs ErgasiaEpiskeuhs2 = new ErgasiaEpiskeuhs("Allagh filtrou kampinas",5);
		ErgasiaEpiskeuhs ErgasiaEpiskeuhs3 = new ErgasiaEpiskeuhs("Synthrhsh frenwn",30);
		
		ArrayList<ErgasiaEpiskeuhs> erep = new ArrayList<ErgasiaEpiskeuhs>();
		
		erep.add(ErgasiaEpiskeuhs1);
		erep.add(ErgasiaEpiskeuhs2);
		erep.add(ErgasiaEpiskeuhs3);
		
		for (ErgasiaEpiskeuhs i : erep)
		{
			System.out.println("Onoma Episkeuhs: "+ i.getErgasia() +", Kostos: "+i.getKostos()+"€");
		}
		
		TyposAntallaktikou TyposAntallaktikou1 = new TyposAntallaktikou("Syskeuasia ladiwn 4lt",30);
		TyposAntallaktikou TyposAntallaktikou2 = new TyposAntallaktikou("Filtro ladiou",20);
		TyposAntallaktikou TyposAntallaktikou3 = new TyposAntallaktikou("Filtro kampinas",30);
		TyposAntallaktikou TyposAntallaktikou4 = new TyposAntallaktikou("Takaki frenwn empros troxou",5);
		TyposAntallaktikou TyposAntallaktikou5 = new TyposAntallaktikou("Takaki frenwn pisw troxou",5);
		TyposAntallaktikou TyposAntallaktikou6 = new TyposAntallaktikou("Ygro frenwn",10);
		
		ArrayList<TyposAntallaktikou> typan = new ArrayList<TyposAntallaktikou>();
		
		typan.add(TyposAntallaktikou1);
		typan.add(TyposAntallaktikou2);
		typan.add(TyposAntallaktikou3);
		typan.add(TyposAntallaktikou4);
		typan.add(TyposAntallaktikou5);
		typan.add(TyposAntallaktikou6);
		
		for (TyposAntallaktikou i : typan)
		{
			System.out.println("Onoma Antallaktikou: "+ i.getType() +", Kostos ana temaxio: "+ i.getPrice()+"€");
		}
		
		Episkeuh Episkeuh1 = new Episkeuh(ErgasiaEpiskeuhs1, TyposAntallaktikou1, 1, 1);
		Episkeuh1.addErgEpiskeuhs(ErgasiaEpiskeuhs2);
		Episkeuh1.addTypAntallaktikou(TyposAntallaktikou2, 1);
		Episkeuh1.addTypAntallaktikou(TyposAntallaktikou3, 1);
		
		System.out.println("Diarkeia episkeuhs 1: "+ Episkeuh1.getDiarkeia() +", Synoliko kostos episkeuhs: "+ Episkeuh1.getTotalCost()+"€");
		
		Episkeuh Episkeuh2 = new Episkeuh(ErgasiaEpiskeuhs3, TyposAntallaktikou4, 4, 2);
		Episkeuh2.addTypAntallaktikou(TyposAntallaktikou5, 4);
		Episkeuh2.addTypAntallaktikou(TyposAntallaktikou6, 1);
		
		System.out.println("Diarkeia episkeuhs 2: "+ Episkeuh2.getDiarkeia() +", Synoliko kostos episkeuhs: "+ Episkeuh2.getTotalCost()+"€");
		
		System.out.println("Episkeuh 1\n");
		
		if (pelaths1.ApofashEpiskevhs()==true)
		{
			mhxyp.PliroforiesErgasion(Episkeuh1.getErgasies());
			
			EpibleponMixanikos epimhx = new EpibleponMixanikos("Giorgakis", "Daxtilakis", Episkeuh1.getAntallaktika());
			epimhx.AnathesiErgasion(ErgasiaEpiskeuhs1);
			epimhx.AnathesiErgasion(ErgasiaEpiskeuhs2);
			boolean ol = epimhx.OloklirwshEpiskeuhs();
			boolean ok=true;
			do{
				if (ol==true)
				{
					System.out.println("H episkeuh oloklirothike me epityxia!");
				}
				else
				{
					System.out.println("H episkeuh den oloklirothike.");
					ok=false;
				}
			}while(ok==false);
			
			SysthmaPlhromwn systpl = new SysthmaPlhromwn();
			kat.addEsoda(105);
			systpl.KataxwrhshPlhrvmhs(105);
			
			PliroforiakoSysthma plsyst = new PliroforiakoSysthma();
			boolean diathesimothta = plsyst.DiathesimothtaSysthmatosPlhromwn(systpl);
			if(diathesimothta==true)
			{
				System.out.println("To systhma plhromwn me karta einai diathesimo!");
			}
			else
			{
				System.out.println("To systhma plhromwn me karta den einai diathesimo, plhrwmh me metrhta.");
			}
			plsyst.MhniaiaAnafora(kat);
		}
		else
		{
			System.exit(0);
		}
	}
}
