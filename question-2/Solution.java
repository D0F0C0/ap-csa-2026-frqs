public class Bottle{
    private double currentAmount;
    private double max;

    public Bottle(double amt){
        max = amt;
        currentAmount = amt;
    }

    public double updateAmount(double a){
        
        currentAmount = currentAmount - a;

        if(currentAmount < 0.25 * max){
            
            currentAmount  = max;
        }

        return currentAmount;

    }

}
