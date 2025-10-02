//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> cars = new  ArrayList<>();
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Toyota");
        cars.addFirst("Mercedes");
        cars.add("Volkswagen");
        cars.add("Mclaren");
        System.out.println(cars);
        cars.add(2, "lambo");
        System.out.println(cars);
        cars.removeIf(car -> car.toLowerCase().contains("a"));
        System.out.println(cars);


    }
}