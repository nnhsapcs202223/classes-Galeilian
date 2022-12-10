
public class VendingMachine
{
    /*
     * Methods:
     *      Insert token, increase token amounts
     *      Export Cans, decrease cans amounts
     *      Refill Cans, add cans amounts
     */

    private int tokens;
    private int cans;
    
    /**
     * Insert one token into the vending machine
     * 
     * @Add 1 token and subtract 1 can
     */
    public void insertToken() 
    {
        this.tokens ++;
        this.cans --;
    }
    
    /**
     * Add number of cans of soda into this vending machine.
     * 
     * @param Addcans the number cans of soda add into this vending machine
     */
    public void fillUp(int addcans)
    {
        this.cans += addcans;
    }
    
    /**
     * Returns the current token amounts
     * 
     * @Return the current token amounts
     */
    public int getTokenCount()
    {
        return this.tokens;
    }
    
    /**
     * Returns the current number of cans of soda
     * 
     * @Returns the current number of cans of soda
     */
    public int getCanCount()
    {
        return this.cans;
    }
    
    /**
     * Constructs a new VendingMachiine object with 10 initial cans of soda
     */
    public VendingMachine(){
        this.tokens = 0;
        this.cans = 10;
    }
    
    /**
     * Constructs a new MileageTracker object with the specified number of initial cans of soda
     *      
     *  @param initialCans the number of cans initially in the vending machine
     */
    public VendingMachine(int initialCans){
        this.tokens = 0;
        this.cans = initialCans;
    }
}