import java.time.LocalDate;

public class Car {
    private Long id;
    private String model;
    private String name;
    private double price;
    private LocalDate issudDate;
    private CarType carType;


    public Car() {

    }
    public Car( Long id,String model, String name, double price, LocalDate issudDate, CarType carType) {
        this.id = id;
        this.model = model;
        this.name = name;
        this.price = price;
        this.issudDate = issudDate;
        this.carType = carType;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getIssudDate() {
        return issudDate;
    }

    public void setIssudDate(LocalDate issudDate) {
        this.issudDate = issudDate;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", issudDate=" + issudDate +
                ", carType=" + carType +
                '}';
    }
}


