package models;

public class TurboChargedCar extends Car {
    //the turbo switch for the car - doesn't accelerate fast if it's false
    private Boolean turbo = false;
    
    //inherits all car methods and members but doesn't inherit a custom constructor
    //if we got a custom constructor with args, it will complain uness we declare a constructor manually
    public TurboChargedCar(String registration){
        //super line has to be the first line besides comments
        super(registration); 
    }

    //overriding the parent class. the () are optional if you don't have params
    @Override()
    public void accelerate(){
        if (this.turbo){
            super.accelerate();
            super.accelerate();
            super.accelerate();
            super.accelerate();
            super.accelerate();
            System.out.println("Vrooooooom!!");
        }else{
            super.accelerate();
            System.out.println("Pfttt.....");
        }
    }

    public Boolean getTurbo() {
        return turbo;
    }

    public void setTurbo(Boolean turbo) {
        this.turbo = turbo;
    }

    

    
}
