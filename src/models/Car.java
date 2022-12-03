package models;

import java.util.Date;

//This is a car class. We're learning classes today. Each class in Java is in a file on its own.
//Java is a pure OOP language, everything is an object in Java. 

public class Car{
    // Properties
    // these are also called class members 
    // always set these to private so people don't accidentally change them.
    // to change these, use getters and setters instead.
    private String colour;
    private String make;
    private String registration;
    private Date registrationDate;
    private Integer acceleration = 0;

    // constructors =======================================================================================
    // overloaded constructors don't look at return types, it only looks at parameters
    // when we add a constructor the default constructor disappears.
    // default looks like this:
    public Car() {}

    // these custom constructors allow you to set the car object with certain attributes at creation
    // instead of having to reach for setters after creation. It's convenient for our users.

    // this custom constructor will force every new car object to require a registration number on creation
    public Car(String registration) {
        this.registration = registration;
    }

    //while this one will require a registration and colour on object creation
    public Car(String registration, String colour) {
        this.registration = registration;
        this.colour = colour;
    }
    //this one will require a registration, colour and make on creation.
    public Car(String registration, String colour, String make) {
        this.registration = registration;
        this.colour = colour;
        this.make = make;
    }

    // access methods to the members ======================================================================
    // the naming patterns for access getter and setter methods: getName, setName
    // gives a lot of control over what you can do, independant of the state of the actual member itself
    public String getColour() {
        return this.colour.toLowerCase();
    }

    public void setColour(String newColour) {
        this.colour = newColour;
    }

    public String getMake() {
        return this.make;
    }

    //two ways of making this setter reject any make of car that isn't honda mazda or toyota
    public void setMake(String newMake) {
        /*or method */
        if (newMake.toLowerCase().equals("honda") 
           || newMake.toLowerCase().equals("mazda") 
           || newMake.toLowerCase().equals("toyota")){
            this.make = newMake;
        }else{
            System.out.println("Sorry it's not Honda, Toyota or Mazda. Not accepted.");
        }
        
        /*//switch case method
        //this method looks more elegant and readable than the or method.
        switch (newMake){
            case "honda":
            case "toyota":
            case "mazda":
                this.make = newMake;
            default:
        }        */
    }

    public String getRegistration() {
        return this.registration;
    }

    public void setRegistration(String registration) {
        //when constructor is forcing users to set registration on creation, this becomes redundant
        //so we can comment it out without breaking old code. This is the power of getters setters.
        //do remember to note this change in documentation 
        //this.registration = registration;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }
    public Integer getAcceleration() {
        return this.acceleration;
    }

    // Behaviour - methods that affect the car capabilities
    public void horn() {
        System.out.println("horn horn horn");
    }

    //allows you to accelerate the car with a multiplier n
    public void accelerate(Integer n, Integer fac){
        for (Integer i = 0; i < n; i++ ){
            this.accelerate();
        }
    }

    public void accelerate(){
        if (this.acceleration < 200 )
            this.acceleration++;
    }
    public void decelerate(){
        if (this.acceleration > 0){
            this.acceleration--;
        }
    }
    
}