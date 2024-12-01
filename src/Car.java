
public class Car implements Comparable<Car> {

    private final String brand;
    private final long modelYear;
    private final String modelName;


   public Car(String brand, String modelName, long modelYear) {
       //--------------------------------------------------------
       // Summary: Constructor to initialize a car object with brand, model name, and model year.
       // Precondition: 'brand' and 'modelName' must be non-null strings, and 'modelYear' must be a positive integer.
       // Postcondition: A new Car object is created with the provided values.
       //--------------------------------------------------------
       this.brand = brand;
       this.modelName = modelName;
       this.modelYear = modelYear;
   }

    public String getBrand() {

       return brand;
    }

    public String getModelName() {

       return modelName;
    }

    public long getModelYear() {

        return modelYear;
    }

    public String toString() {
        return "Car -> "+ "Brand = " + brand +  ", Model = " + modelName +  ", Year = " + modelYear ;
    }

    @Override
    public int compareTo(Car o) {
        //--------------------------------------------------------
        // Summary: Compares this car object with another car object for ordering by model year, brand, and model name.
        // The cars are compared first by model year, then by brand, and finally by model name if necessary.
        // Precondition: Both car objects are non-null.
        // Postcondition: Returns a positive integer if this car is greater,
        // a negative integer if this car is smaller, or 0 if both cars are equal.
        //--------------------------------------------------------
        if (this.modelYear > o.getModelYear()) {return +1;}
        if (this.modelYear < o.getModelYear()) {return -1;}
        if (this.modelYear == o.getModelYear()) {return 0;}
        if(this.brand.compareTo(o.getBrand()) == 0){return 1;}
        if(this.brand.compareTo(o.getBrand()) != 0){return -1;}
        if (this.modelName.compareTo(o.getModelName()) == 0){return 1;}
        if(this.modelName.compareTo(o.getModelName()) != 0){return -1;}

        return 0;
    }
}
