package oop_second.second_task.company;

import oop_second.second_task.company.vehicles.Car;
import oop_second.second_task.company.vehicles.SportCar;
import oop_second.second_task.company.vehicles.carBuilder;

public class Application {
    public static void main(String[] args) {
        Car car = SportCar.getSportCar();

        System.out.println(SportCar.toString());
    }
}
