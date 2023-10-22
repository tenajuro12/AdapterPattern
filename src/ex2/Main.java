package ex2;

public class Main {
    public static void main(String[] args) {
        Sensor sensor = new Adapter(new FahrenheiteSensor());
        FahrenheiteSensor fahrenheiteSensor= new FahrenheiteSensor();

        System.out.println("Fahrenheite temperature = " + fahrenheiteSensor.getFahrenheiteTemperature());
        System.out.println("Celsius temperature = " + sensor.getTemperature());
    }
}
