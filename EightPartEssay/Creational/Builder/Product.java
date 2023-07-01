package EightPartEssay.Creational.Builder;

public class Product {
    private String carWheel;
    private String carBody;
    private String carBrand;

    public String getCarWheel() {
        return carWheel;
    }

    public void setCarWheel(String carWheel) {
        this.carWheel = carWheel;
    }

    public String getCarBody() {
        return carBody;
    }

    public void setCarBody(String carBody) {
        this.carBody = carBody;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    @Override
    public String toString() {
        return "Product [carWheel=" + carWheel + ", carBody=" + carBody + ", carBrand=" + carBrand + "]";
    }

}
