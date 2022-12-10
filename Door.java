public class Door
{
    private boolean isOpened;
    private String name;

    /*  
     * 
     * public void Front()
     *    {
     *        this.isOpened = false;
     *        this.name = "";
     *        //Front frontDoor = new Front();
     *    }
     *    
     */

    private String HELP;

    public void open()
    {
        this.isOpened = true;
    }

    public void close()
    {
        this.isOpened = false;
    }

    public Door(boolean isOpened1, String name1)
    {
        this.isOpened = isOpened1;
        this.name = name1;
    }

    public String getName()
    {
        return this.name;
    }

    public boolean getIsOpened()
    {
        return this.isOpened;
    }

    public void setName(String newName)
    {
        this.name = newName;
    }
    
    public void setIsOpened(String newIsOpen)
    {
        this.name = newIsOpen;
    }
}
