import java.util.*;

public class Pelates {
	private String onoma = new String();
	private String epitheto = new String();
	private String thlefono = new String();
	private String diefthynsh = new String();
	private String email = new String();
	
	public Pelates( String onoma, String epitheto,String thlefono, String diefthynsh,  String email)
	{
		this.onoma = onoma;
		this.epitheto = epitheto;
		this.thlefono = thlefono;
		this.diefthynsh = diefthynsh;
		this.email = email;
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

	public String getThlefono() {
		return thlefono;
	}

	public void setThlefono(String thlefono) {
		this.thlefono = thlefono;
	}

	public String getDiefthynsh() {
		return diefthynsh;
	}

	public void setDiefthynsh(String diefthynsh) {
		this.diefthynsh = diefthynsh;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean ApofashEpiskevhs()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to procced with the repair of the vehicle?(Yes/No)");
		String answer = sc.nextLine();
		boolean apof;
		
		if ( answer.equals("Yes"))
		{
			apof = true;
		}
		else
		{
			apof = false;
		}
		sc.close();
		return apof;
	}
	
	public void PrintData()
	{
		System.out.println("Ta stoixeia tou pelath einai ta ekshs: \n Onoma: " + onoma + "\n" +
																	  "Epitheto: " + epitheto + "\n" +
																	  "Thlefono: " + thlefono + "\n" +
																	  "Diefthynsh: " + diefthynsh + "\n" +
																	  "Email: " + email + "\n" );
	}
}
