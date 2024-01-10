package Interfaces;

public class Car implements Engine,Break {

    @Override
    public void brake() {
        System.out.println("i brake like a normal car");
    }

    @Override
    public void start() {
        System.out.println("i starts like a normal car");

    }

    @Override
    public void stop() {
        System.out.println("i Stop like a normal car");

    }

    @Override
    public void acc() {
        System.out.println("i accelerate like a normal car");

    }
}
