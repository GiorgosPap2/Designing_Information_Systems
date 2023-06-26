import java.util.*;

public class EpibleponMixanikos extends Mhxanikoi{
	private ArrayList<TyposAntallaktikou> antallaktika = new ArrayList<>();
	private ArrayList<ErgasiaEpiskeuhs> ToDoErgasies = new ArrayList<>();
	
	public EpibleponMixanikos(String on, String epi, TyposAntallaktikou anta) {
		super(on, epi);
		antallaktika.add(anta);
	}
	public EpibleponMixanikos(String on, String epi, ArrayList<TyposAntallaktikou> ant) {
		super(on, epi);
		this.antallaktika = ant;
	}
	
	public void addAnt(TyposAntallaktikou ant)
	{
		antallaktika.add(ant);
	}
	
	public void AnathesiErgasion(ErgasiaEpiskeuhs erg)
	{
		ToDoErgasies.add(erg);
		System.out.println("H kataxwrhsh ths ergasias exei ginei me epityxia!");
	}
	
	public boolean OloklirwshEpiskeuhs()
	{
		boolean ol=false;
		for (int i = 0;i<ToDoErgasies.size();i++)
		{
			ErgasiaEpiskeuhs todo=ToDoErgasies.get(i);
			TyposAntallaktikou ant=antallaktika.get(i);
			if (!todo.equals(null) && !ant.equals(null))
				ol=true;
		}
		
		return ol;
	}
}
