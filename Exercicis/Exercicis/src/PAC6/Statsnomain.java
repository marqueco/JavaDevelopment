
public class NumberStatistics {
    
    private int amountOfNumbers;
    private int sum;
    
    
    public NumberStatistics(){
        this.amountOfNumbers = 0;
           
}
    public void addNumber(int number){
        amountOfNumbers++;
        sum += number;
    }
    
    public int amountOfNumbers(){
        return amountOfNumbers; 
    }
    
    public int sum(){
        return sum;
    }
    
    public double average(){
        double result = (sum * 1.0) / amountOfNumbers;
        return result;
    }
}
