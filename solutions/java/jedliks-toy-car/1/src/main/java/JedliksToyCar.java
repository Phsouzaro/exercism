public class JedliksToyCar {

    private int battery;
    private int meters;

    public JedliksToyCar(){
        this.battery = 100;
    }
    
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + this.meters + " meters";
    }

    public String batteryDisplay() {
        return this.battery <= 0 ? "Battery empty" : "Battery at " + this.battery + "%";
    }

    public void drive() {
        if(this.battery > 0){
            this.battery -= 1;  
            this.meters += 20;
        }
    }
}