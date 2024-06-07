//Medical Organisation where sservices are defined
package OOP_Interface;

public interface IndianMedical extends WHO {
	
	public void oncologyServices();

	public void orthoServices();
	
	//common
	public void emergencyService();
}