
public class Car {
	private String carMake;
	private String carModel;
	private int carYear;
	private double carPrice;
	public Car()
	{
		this.setCarMake(null);
		this.setCarModel(null);
		this.setCarYear(0);
		this.setCarPrice(0.0);
	}
	public String toString()
	{
		return getCarMake() +"\t" + getCarModel() + "\t"+ getCarYear() +"\t $ "+ getCarPrice();
	}
	public Car(String carMake,String carModel,int carYear,double carPrice)
	{
		this.setCarMake(carMake);
	    this.setCarModel(carModel);
	    this.setCarYear(carYear);
	    this.setCarPrice(carPrice);
		
	}
	public String getCarMake() {
		return carMake;
	}
	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public int getCarYear() {
		return carYear;
	}
	public void setCarYear(int carYear) {
		this.carYear = carYear;
	}
	public double getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}
	

}
