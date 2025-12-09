class NeedForSpeed {

    private int speed;
    private int batteryDrain;
    private int meters;
    private int battery;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.battery = 100;
    }

    public boolean batteryDrained() {
        return (this.battery - this.batteryDrain) < 0;
    }

    public int distanceDriven() {
        return this.meters;
    }

    public void drive() {
        if(this.battery > 0){
            this.meters += this.speed;
            this.battery -= this.batteryDrain;    
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {

    private int distance;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        while(!car.batteryDrained()){
            car.drive();
        }
        
        return car.distanceDriven() >= this.distance;
    }
}
