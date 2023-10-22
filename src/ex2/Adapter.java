package ex2;

public class Adapter extends Sensor {
    private FahrenheiteSensor fahrenheiteSensor;

    public Adapter(FahrenheiteSensor fahrenheiteSensor) {
        this.fahrenheiteSensor = fahrenheiteSensor;
    }

    @Override
    public double getTemperature() {
    return (fahrenheiteSensor.getFahrenheiteTemperature()-32.0)*5/9;
    }

}
