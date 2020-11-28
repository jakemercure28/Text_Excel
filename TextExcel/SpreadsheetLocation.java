

//Update this file with your own code.

public class SpreadsheetLocation implements Location
{
    public void Location (String cell) {
       String collums = "";
       String rows = "";
       collums = cell.substring(0);
       rows = cell.substring(1);
    }
    
    
    
    
    
    @Override
    public int getRow()
    {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getCol()
    {
        // TODO Auto-generated method stub
        return 0;
    }
    
    public SpreadsheetLocation(String cellName)
    {
        // TODO: Fill this out with your own code
    }

}
