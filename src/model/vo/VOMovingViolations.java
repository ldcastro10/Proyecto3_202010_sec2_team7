package model.vo;

/**
 * Representation of a Trip object
 */
public class VOMovingViolations {
	

	// ---------------------------------------------------------
	// Atributos
	// ---------------------------------------------------------

	private int OBJECTID;

	private String LOCATION;
	
	private String TICKETISSUEDATE;
	
	private double TOTALPAID;
	
	private String ACCIDENTINDICATOR;
	
	private String VIOLATIONCODE;

	private String VIOLATIONDESC;

	private String STREETSEGID;

	private String ADDRESS_ID;
	
	private double XCOORD;

	private double YCOORD;
	
	private double FINEAMT;
	
	private double PENALTY1;
	
	private double PENALTY2;

	// -------------------------------------------------------
	// Constructor
	// -------------------------------------------------------
	
	public VOMovingViolations(int pId, String pLocation, String pDate, double pTotalPaid, String indicador,
			String descripcion, String violationCode, double fineamt, double penalty1, double penalty2, 
			String addressId, String streetSegId)
	{
		this.OBJECTID = pId;
		this.LOCATION = pLocation;
		this.TICKETISSUEDATE= pDate;
		this.TOTALPAID = pTotalPaid;
		this.ACCIDENTINDICATOR = indicador;
		this.VIOLATIONDESC = descripcion;
		this.VIOLATIONCODE = violationCode;
		this.FINEAMT = fineamt;
		this.PENALTY1 = penalty1; 
		this.PENALTY2 = penalty2;
		this.STREETSEGID = streetSegId;
		this.ADDRESS_ID = addressId;
	}

	// -------------------------------------------------------
	// Metodos
	// -------------------------------------------------------

	
	@Override
	public String toString() {
		return "VOMovingViolations [objectId()=" + objectId() + ",\n getLocation()=" + getLocation()
				+ ",\n getTicketIssueDate()=" + getTicketIssueDate() + ",\n getTotalPaid()=" + getTotalPaid()
				+ ",\n getAccidentIndicator()=" + getAccidentIndicator() + ",\n getViolationDescription()="
				+ getViolationDescription() + ",\n getStreetSegId()=" + getStreetSegId() + ",\n getAddressId()="
				+ getAddressId() + "]\n\n";
	}


	/**
	 * @return id - Identificador �nico de la infracci�n
	 */
	public int objectId() {
		return this.OBJECTID;
	}	
	
	public String getViolationCode(){
		return this.VIOLATIONCODE;
	}
	
	/**
	 * @return location - Direcci�n en formato de texto.
	 */
	public String getLocation() {
		return this.LOCATION;
	}

	/**
	 * @return date - Fecha cuando se puso la infracci�n .
	 */
	public String getTicketIssueDate() {
		return this.TICKETISSUEDATE;
	}
	
	/**
	 * @return totalPaid - Cuanto dinero efectivamente pag� el que recibi� la infracci�n en USD.
	 */
	public double getTotalPaid() {
		return this.TOTALPAID;
	}
	
	/**
	 * @return accidentIndicator - Si hubo un accidente o no.
	 */
	public String  getAccidentIndicator() {
		return this.ACCIDENTINDICATOR;
	}
		
	/**
	 * @return description - Descripci�n textual de la infracci�n.
	 */
	public String  getViolationDescription() {
		return this.VIOLATIONDESC;
	}
	
	public String getStreetSegId() {
		return this.STREETSEGID;
	}
	
	public String getAddressId() {
		return this.ADDRESS_ID;
	}
	
	public double getXCoord() {
		return this.XCOORD;
	}
	
	public double getYCoord() {
		return this.YCOORD;
	}
	
	public double getFineAMT() {
		return this.FINEAMT;
	}
	
	public double getPenalty1() {
		return this.PENALTY1;
	}
	
	public double getPenalty2() {
		return this.PENALTY2;
	}

}
