package edu.ncsu.monopoly;

public interface IOwnable {

	String getName();

	Player getProprietary();

	int getPrice();

	void playAction();

	void setProprietary(Player owner);

	String toString();

	boolean isAvailable();

	void setAvailable(boolean available);

}