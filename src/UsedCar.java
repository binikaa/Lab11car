
public class UsedCar extends Car {
	private Double mileage;
	
	public String toString()
	{
		return getCarMake() +"\t" + getCarModel() + "\t"+ getCarYear() +"\t $ "+ getCarPrice()+" (Used) "+ getMileage() + " miles";
	}
	public UsedCar(String carMake,String carModel,int carYear,double carPrice,double mileage)
	{
		this.setCarMake(carMake);
	    this.setCarModel(carModel);
	    this.setCarYear(carYear);
	    this.setCarPrice(carPrice);
	    this.mileage = mileage;
		
	}
	public double getMileage() {
		return mileage;
	}
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

}
