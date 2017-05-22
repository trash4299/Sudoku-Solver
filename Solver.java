

public class Solver
{
    public Solver()
    {
        solutionGui(solvin(inputGui()));
    }
    
    public Square [][] inputGui()
    {
        TableGui beginning = new TableGui();
        return beginning.give();
    }
    
    public Square[][] solvin(Square[][] enter)
    {
        
        
        Square [][] poop = new Square [9][9];
        return poop;
    }
    
    public void solutionGui(Square [][] fin)
    {
        TableGui solved = new TableGui(fin);
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
