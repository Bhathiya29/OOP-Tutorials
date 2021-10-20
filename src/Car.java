public class Car {
    private String licensePlate;
    private double speed; // kilometers per hour
    private double maxSpeed; // kilometers per hour
    // constructors
    public Car(String licensePlate1, double maxSpeed1) {
        this.licensePlate = licensePlate1;
        this.speed = 0.0;
        if (maxSpeed1 >= 0.0) {
            maxSpeed = maxSpeed1;
        }
        else {
            maxSpeed = 0.0;
        }
    }
/*********************************************/
    /* Code for overloaded constructor goes here */
/*********************************************/

    public Car(String licensePlate,double speed1,double maxSpeed1){
        this.licensePlate=licensePlate;
        this.maxSpeed=maxSpeed1;
        if(speed1<0){this.speed=0;}
        else if(speed1>maxSpeed){this.speed=maxSpeed;}
        else {speed=speed1;}

    }

    public void print(){
        System.out.println("Current Speed :"+speed);
        System.out.println("Maximum Speed :"+maxSpeed);
        System.out.println("License Plate :"+licensePlate);
    }
}