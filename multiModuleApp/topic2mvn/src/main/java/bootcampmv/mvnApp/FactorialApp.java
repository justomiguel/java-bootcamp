package bootcampmv.mvnApp;

/**
 * Hello world!
 *
 */
public class FactorialApp 
{
    private int fact;

    public int getFact() {
        return fact;
    }

    public void setFact(int fact) {
        this.fact = fact;
    }
    
    public FactorialApp(){

    }
    
    public int calculateFactorial(int fact){
      if(fact==0) return 1;   
      else return fact*calculateFactorial(fact-1); 
   } 
}
