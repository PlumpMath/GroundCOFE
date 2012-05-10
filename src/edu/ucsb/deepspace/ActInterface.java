package edu.ucsb.deepspace;

public interface ActInterface {
	
	public static enum axisType {
		AZ, EL, BOTH;
	}
	
	//Associate the stage instance with the axes so that they can send information to the stage.
	//If there's a better way to implement this bi-directional communication between objects,
	//please let me know.
	public void registerStage(Stage stage);
	
	public void configure();
	
	public String info();
	
//	public void moveAbsolute(double goalPosInDeg);
//	
//	public void moveRelative(double numDeg, String moveType);
//	
//	public void moveEncoder(double numEncPulse);
	
	public boolean validMove(MoveCommand mc, double min, double max);
	
	/**
	 * Moves relative to the current position. <P>
	 * If type is is encoder, simply moves by amount. <BR>
	 * If type is degree, first converts amount to encoder pulses and then moves.
	 */
	public void moveRelative(MoveCommand mc);
	
	/**
	 * Moves to the absolute position specified by the mc. <P>
	 */
	public void moveAbsolute(MoveCommand mc);
	
	/**
	 * The position of the actuator in degrees. <P>
	 * Prevents the user from ever seeing a position like 540 degrees.
	 * @return absolutePos() % 360
	 */
	public double userPos();
	
	//public void moveEncVal(double numSteps);
	
	//public double currentDegPos();
	
//	public boolean allowedMove(String moveType, double min, double max, double amount);
	
	public void calibrate(double degVal);
	
	public void index();
	
//	public void setEncInd(double encInd);
//	public double getEncInd();
	
	public void setOffset(double indexOffset);
	public double getOffset();
	
	public boolean indexing();
	
	public void setIndexing(boolean indexing);
	
	//public boolean isMoving();
	
//	public double encValToDeg(double encVal);
	
	public void scan(ScanCommand sc);
	
	public void stopScanning();
	
	//public void update(DataGalil.GalilStatus status);

}