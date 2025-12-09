public class CarsAssemble {

    private static final int CARS_PRODUCED_PER_HOUR = 221;

    public double productionRatePerHour(int speed) {
        double factor = switch (speed) {
            case 10 -> 0.77;
            case 9  -> 0.80;
            default -> (speed >= 5) ? 0.90 : 1.00;
        };     
        
        return speed * CARS_PRODUCED_PER_HOUR * factor;            
    }

    public int workingItemsPerMinute(int speed) {
        return (int) Math.floor(productionRatePerHour(speed) / 60);
    }
}
