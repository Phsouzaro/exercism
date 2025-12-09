
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.birdsPerDay;
    }
    
    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        boolean hadZeroBirds = false;
        for(int howMuch : birdsPerDay){
            if(howMuch == 0){
                hadZeroBirds = true;
            }
        }
        return hadZeroBirds;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int totalSum = 0;
        for(int i = 0; i < numberOfDays && i < birdsPerDay.length; i++){
            totalSum += birdsPerDay[i];
        }
        return totalSum;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for(int howMuch : birdsPerDay){
            if(howMuch >= 5){
                busyDays++;
            }
        }
        return busyDays;
    }
}
