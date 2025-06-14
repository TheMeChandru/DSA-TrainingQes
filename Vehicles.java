public class Vehicles {
    public static void main(String[] args) {
       int total_wheels = 540;
       int total_vehicle = 200;
       int fW=0;
       int tW=0;
       if(total_wheels<2*total_vehicle ||total_wheels %2!=0||total_wheels>4*total_vehicle){
        System.out.println("Invalid");
       }
       else{
        fW=(total_wheels-(2*total_vehicle))/2;
        tW=total_vehicle-fW;
       }
       System.out.println("Four Weeler "+fW);
       System.out.println("Two Weeheler "+tW);
    }
    
}
