import java.util.Objects;

public class Sedan extends Car {
    public Car(String mark, String model, int year, String v_r_p) {
        this.mark = mark;
        this.model = model;
        this.year = year;
        this.v_r_p = v_r_p;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Objects.equals(mark, car.mark) && Objects.equals(model, car.model) && Objects.equals(v_r_p, car.v_r_p);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mark, model, year, v_r_p);
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", v_r_p='" + v_r_p + '\'' +
                '}';
    }
}

