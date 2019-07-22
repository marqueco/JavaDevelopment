package PAC6;


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
        int result = 0;
        result += sum;
        return result;
    }
    
    public double average(){
        double result = 0.0;
        result += (sum * 1.0) / amountOfNumbers;
        return result;
    }
}
