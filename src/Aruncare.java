
public class Aruncare  {  

	private int indexAruncare; // nr aruncarii
	private int indexFrame;  // frame-ul de care apartine
	private int nrPopice; // cate popice s-au daramat la aruncarea curenta
	
	//Constructor
	public Aruncare() {
		indexAruncare = 0;
		indexFrame = 0;
		nrPopice = 0;
	}
	
	// ??? System.in
	public void setAruncare(int nrPopice, int indexFrame) throws AruncareInvalida {
		if(nrPopice<=10 && nrPopice>=0) {
			this.nrPopice = nrPopice;
		    this.indexFrame = indexFrame;
		}
		else {
			throw new AruncareInvalida(); 
		}
	}

	public boolean isStrike() { 
		return ( this.nrPopice == 10 ) ;
	}
	// get
	public int getFrame() {
		return indexFrame;
	}
	public int getIndexAruncare() {
		return indexAruncare;
	}
	public int getNrPopice() {
		return nrPopice;
	}

	
}
