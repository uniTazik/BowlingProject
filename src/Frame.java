
public class Frame {
	// Poate implementam split????? 
	private int indexFrame; // <=10
	private int scor; // scor total pana la frame-ul curent 
	private boolean esteGata; // daca s-au efectuat toate aruncarile pe acest frame
	private boolean esteScorFinal; // daca scorul a fost calculat (relevant pt strike-uri
	private Aruncare[] aruncari; // array cu 1 , 2 sau 3 elemente
	private int nrAruncari;
	
	
	//Constructor
	public Frame() {
		this.indexFrame = 0;
		this.scor = 0;
		this.esteGata = false;
		this.esteScorFinal = false;
		this.aruncari = new Aruncare[3]; 
		this.nrAruncari = 0;
	}
	
	private boolean eValid (Aruncare aruncare) { // Acest cod trebuie verificat!
		if ( this.nrAruncari == 0 ) // e prima aruncare dintr-un frame
			return true ;
		if ( this.indexFrame == 10 ) // De adaugat spare
			if (this.aruncari[this.nrAruncari -1 ].isStrike() ||
					( this.nrAruncari == 2 && this.aruncari[0].getNrPopice() + this.aruncari[1].getNrPopice() == 1 ) )  
				// daca aruncarea trecuta a fost strike, sau ultimele doua au format un spare orice aruncare este valida
				return true; 
		return (aruncare.getNrPopice() + this.aruncari[this.nrAruncari - 1].getNrPopice() <= 10 ) ;
		// altfel, daca ultimele doua aruncari sunt sub 10 este valid.
	}
	public void setAruncare(Aruncare aruncare) throws FrameInvalid{ // De validat strikeuri, spareuri, updatat score
		if(eValid(aruncare)) {
				this.aruncari[nrAruncari] = aruncare;
				this.nrAruncari++;
				
				if((this.nrAruncari == 2 || aruncare.isStrike()) && this.indexFrame <= 10) {
					this.esteGata = true; 
				}
			}
		else throw new FrameInvalid(); 
	}
		
	
	

	
	
	
	
}
