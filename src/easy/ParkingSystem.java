package easy;

public class ParkingSystem {
	private int[] park;

    public ParkingSystem(int big, int medium, int small) {
        park = new int[]{big, medium, small};
    }
    
    public boolean addCar(int carType) {
        if(park[carType-1] == 0){
            return false;
        }
        park[carType-1]--;
        return true;
    }
}
