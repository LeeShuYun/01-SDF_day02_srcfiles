package main;

import java.util.Date;

import models.Car;
import models.TurboChargedCar;

public class Main {
    public static void main(String[] args){

        Car myCar = new Car("SAA123123");
        Car myOtherCar = new TurboChargedCar("asdfjlkj");
        Date date = new Date();
        //to use the other package together
        java.sql.Date otherDate = new java.sql.Date(123L);

        myCar.setColour("red");
        myCar.setMake("Honda");
        myCar.setRegistration("S12345");
        myCar.setRegistrationDate(new Date());

        myCar.horn();
        System.out.printf("color: %s, make: %s, registration: %s\n", myCar.getColour(), myCar.getMake(), myCar.getRegistration());

        myCar.accelerate();
        myCar.accelerate();
        myCar.accelerate();

        System.out.printf("accleration: %d\n", myCar.getAcceleration());

        //so if we are absolutely sure our item is a TurboChargedCar in disguise we can cast it back
        if (myOtherCar instanceof TurboChargedCar){
            //cast the turbo type car object
            TurboChargedCar turbo = (TurboChargedCar)myOtherCar;
            turbo.setTurbo(true);
        }
    }
}
