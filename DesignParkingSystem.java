class ParkingSystem {
    int b,m,s;
    public ParkingSystem(int big, int medium, int small) {
        b=big;m=medium;s=small;
    }
    
    public boolean addCar(int carType) {
        if(carType==1){
            if(b==0){
                return false;
            }
            b--;
            return true;
        }
        else if(carType==2){
            if(m==0){
                return false;
            }
            m--;
            return true;
        }
        else{
            if(s==0){
                return false;
            }
            s--;
            return true;
        }
    }
}
