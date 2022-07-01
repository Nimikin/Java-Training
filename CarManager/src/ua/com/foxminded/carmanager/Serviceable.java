package ua.com.foxminded.carmanager;

import javax.imageio.IIOException;

public interface Serviceable {
	
	public abstract boolean isReadyToService();
	
	public abstract void service();
	
	public int getDistanceOnService();
	
	public void addDistance(int additinalDistance) throws IIOException;
	
	public void addDistance(double additinalDistance) throws IIOException;
	
	public void addDistanceOnService(int additinalDistance) throws IIOException;
	
	public void addDistanceOnService(double additinalDistance) throws IIOException;

}
