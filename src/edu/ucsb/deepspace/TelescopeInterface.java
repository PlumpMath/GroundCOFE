package edu.ucsb.deepspace;

public interface TelescopeInterface {
	
	public void moveAbsolute(MoveCommand az, MoveCommand el);
	
	public void moveRelative(MoveCommand az, MoveCommand el);
	
	public void moveSingle(double amount, Axis axis);
	
	public void move(MoveCommand mc);
	
	public boolean validMove(MoveCommand mc, double min, double max);
	
	
	
	public void setVelocity(double azVel, double elVel);
	
	public boolean isMoving();
	
	public void stop(Axis axis);
	
	
	
	public void setOffsets(double azOffset, double elOffset);
	
	public double getOffset(Axis axis);
	
	public void calibrate(Coordinate c);
	
	
	
	/**
	 * Returns the user position.<P>
	 * Basically, the absolute position modulus 360 degrees.
	 */
	public double getUserPos(Axis axis);
	
	/**
	 * Returns the absolute position of the axis.
	 */
	public double getAbsolutePos(Axis axis);
	
	
	
	public void scan(ScanCommand azSc, ScanCommand elSc);
	
	public void stopScanning();
	
	
	
	/**
	 * Turns the motors on or off.
	 */
	public void motorControl(boolean azOnOff, boolean elOnOff);
	
	/**
	 * Returns true if motor is on, false if not.
	 */
	public boolean motorState(Axis axis);
	
	/**
	 * Updates the motor state.
	 */
	public void queryMotorState();
	
	/**
	 * Toggles the motor on or off.
	 */
	public void motorToggle(Axis axis);
	
	
	
	/**
	 * Returns true if the specified axis is currently indexing.
	 */
	public boolean isIndexing(Axis axis);
	
	/**
	 * Begin the indexing procedure for this axis.
	 */
	public void index(Axis axis);
	
}