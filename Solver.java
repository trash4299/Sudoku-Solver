

public class Solver
{
    public Square[][] things;
    public Solver()
    {
        things = new Square[9][9];
        for (int x=0;x<9;x++)
        {
            for(int p=0;p<9;p++)
            {
                things[x][p]= new Square();
            }
        }
        inputGui();
        inputValues();
        solvin();
        solutionGui();
    }
    
    public void inputGui()
    {
        TableGui beginning = new TableGui();
    }
    
    public void inputValues()
    {
        
		//System.out.print(nine.table.getModel().getValueAt(row_index, col_index));
    }
    
    public void solvin()
    {
        
    }
    
    public void solutionGui()
    {
        TableGui solved = new TableGui(things);
    }
    
    public boolean checkfinal(Square sample)
    {
        int num=0;
        if(sample.a==true)
            num++;
        if(sample.b==true)
            num++;
        if(sample.c==true)
            num++;
        if(sample.d==true)
            num++;
        if(sample.e==true)
            num++;
        if(sample.f==true)
            num++;
        if(sample.g==true)
            num++;
        if(sample.h==true)
            num++;
        if(sample.i==true)
            num++;
        if(num==1)
            return true;
        return false;
    }
    
    public void setFinal(Square in)
    {
        //ONLY USE WITH AN IF(CHECKfINAL==TRUE)
        if(in.a==true)
            in.finnum=1;
        else if(in.b==true)
            in.finnum=2;
        else if(in.c==true)
            in.finnum=3;
        else if(in.d==true)
            in.finnum=4;
        else if(in.e==true)
            in.finnum=5;
        else if(in.f==true)
            in.finnum=6;
        else if(in.g==true)
            in.finnum=7;
        else if(in.h==true)
            in.finnum=8;
        else if(in.i==true)
            in.finnum=9;
    }
}
