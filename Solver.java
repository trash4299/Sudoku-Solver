

public class Solver
{
    private Square[][] enter;
    public Solver()
    {
        enter=inputGui();
        solutionGui(solvin());
    }
    
    public Square [][] inputGui()
    {
        TableGui beginning = new TableGui();
        return beginning.give();
    }
    
    public Square[][] solvin()
    {
        int num = 0;
        int temporary =0;
        do
        {
            temporary++;
            num=0;
            System.out.println(temporary);
            for(int alpha=0;alpha<9;alpha++)
            {
                System.out.print("  Alpha:"+alpha);
                for(int beta=0;beta<9;beta++)
                {
                    if(enter[alpha][beta].fin==false)
                    {
                        if(rowChecker(alpha,beta)==true)
                            num++;
                        if(columnChecker(alpha,beta)==true)
                            num++;
                        if(squareChecker(alpha,beta)==true)
                            num++;
                    }
                    if(horiSevenEight(beta)==true)
                        num++;
                    setFinal(enter[alpha][beta]);
                    if(vertSevenEight(beta)==true)
                        num++;
                    System.out.print("  Beta:"+beta);
                }
                if(vertSevenEight(alpha)==true)
                    num++;
            }
            System.out.println("    Num of changes: "+num);
        }while(num!=0);
        return enter;
    }
    
    public void solutionGui(Square [][] fin)
    {
        TableGui solved = new TableGui(fin);
    }
    
    private boolean columnChecker(int x, int y)
    {
        int counter = 0;
        for(int f=0;f<9;f++)
        {
            if(f!=x)
            {
                if(enter[f][y].fin==true)
                {
                    switch(enter[f][y].finnum)
                    {
                        case 1:enter[x][y].a=false;counter++;break;
                        case 2:enter[x][y].b=false;counter++;break;
                        case 3:enter[x][y].c=false;counter++;break;
                        case 4:enter[x][y].d=false;counter++;break;
                        case 5:enter[x][y].e=false;counter++;break;
                        case 6:enter[x][y].f=false;counter++;break;
                        case 7:enter[x][y].g=false;counter++;break;
                        case 8:enter[x][y].h=false;counter++;break;
                        case 9:enter[x][y].i=false;counter++;break;
                    }
                }
            }
        }
        if (counter>0)
            return true;
        return false;
    }
    
    private boolean rowChecker(int x, int y)
    {
        int counter = 0;
        for(int f=0;f<9;f++)
        {
            if(f!=y)
            {
                if(enter[x][f].fin==true)
                {
                    switch(enter[x][f].finnum)
                    {
                        case 1:enter[x][y].a=false;counter++;break;
                        case 2:enter[x][y].b=false;counter++;break;
                        case 3:enter[x][y].c=false;counter++;break;
                        case 4:enter[x][y].d=false;counter++;break;
                        case 5:enter[x][y].e=false;counter++;break;
                        case 6:enter[x][y].f=false;counter++;break;
                        case 7:enter[x][y].g=false;counter++;break;
                        case 8:enter[x][y].h=false;counter++;break;
                        case 9:enter[x][y].i=false;counter++;break;
                    }
                }
            }
        }
        if (counter>0)
            return true;
        return false;
    }
    
    private boolean squareChecker(int x, int y)
    {
        int counter =0;
        if(x<=2)
        {
            if(y<=2)
            {
                for(int q=0;q<=2;q++)
                {
                    for(int w=0;w<=2;w++)
                    {
                         if(x!=q && y!=w)
                         {
                             if(enter[q][w].fin==true)
                             {
                                 switch(enter[q][w].finnum)
                                 {
                                     case 1:enter[x][y].a=false;counter++;break;
                                     case 2:enter[x][y].b=false;counter++;break;
                                     case 3:enter[x][y].c=false;counter++;break;
                                     case 4:enter[x][y].d=false;counter++;break;
                                     case 5:enter[x][y].e=false;counter++;break;
                                     case 6:enter[x][y].f=false;counter++;break;
                                     case 7:enter[x][y].g=false;counter++;break;
                                     case 8:enter[x][y].h=false;counter++;break;
                                     case 9:enter[x][y].i=false;counter++;break;
                                 }
                             }
                         }
                    }
                }
            }
            else if(y<=5)
            {
                for(int q=0;q<=2;q++)
                {
                    for(int w=2;w<=5;w++)
                    {
                         if(x!=q && y!=w)
                         {
                             if(enter[q][w].fin==true)
                             {
                                 switch(enter[q][w].finnum)
                                 {
                                     case 1:enter[x][y].a=false;counter++;break;
                                     case 2:enter[x][y].b=false;counter++;break;
                                     case 3:enter[x][y].c=false;counter++;break;
                                     case 4:enter[x][y].d=false;counter++;break;
                                     case 5:enter[x][y].e=false;counter++;break;
                                     case 6:enter[x][y].f=false;counter++;break;
                                     case 7:enter[x][y].g=false;counter++;break;
                                     case 8:enter[x][y].h=false;counter++;break;
                                     case 9:enter[x][y].i=false;counter++;break;
                                 }
                             }
                         }
                    }
                }
            }
            else
            {
                for(int q=0;q<=2;q++)
                {
                    for(int w=5;w<=8;w++)
                    {
                         if(x!=q && y!=w)
                         {
                             if(enter[q][w].fin==true)
                             {
                                 switch(enter[q][w].finnum)
                                 {
                                     case 1:enter[x][y].a=false;counter++;break;
                                     case 2:enter[x][y].b=false;counter++;break;
                                     case 3:enter[x][y].c=false;counter++;break;
                                     case 4:enter[x][y].d=false;counter++;break;
                                     case 5:enter[x][y].e=false;counter++;break;
                                     case 6:enter[x][y].f=false;counter++;break;
                                     case 7:enter[x][y].g=false;counter++;break;
                                     case 8:enter[x][y].h=false;counter++;break;
                                     case 9:enter[x][y].i=false;counter++;break;
                                 }
                             }
                         }
                    }
                }
            }
        }
        else if(x<=5)
        {
            if(y<=2)
            {
                for(int q=2;q<=5;q++)
                {
                    for(int w=0;w<=2;w++)
                    {
                         if(x!=q && y!=w)
                         {
                             if(enter[q][w].fin==true)
                             {
                                 switch(enter[q][w].finnum)
                                 {
                                     case 1:enter[x][y].a=false;counter++;break;
                                     case 2:enter[x][y].b=false;counter++;break;
                                     case 3:enter[x][y].c=false;counter++;break;
                                     case 4:enter[x][y].d=false;counter++;break;
                                     case 5:enter[x][y].e=false;counter++;break;
                                     case 6:enter[x][y].f=false;counter++;break;
                                     case 7:enter[x][y].g=false;counter++;break;
                                     case 8:enter[x][y].h=false;counter++;break;
                                     case 9:enter[x][y].i=false;counter++;break;
                                 }
                             }
                         }
                    }
                }
            }
            else if(y<=5)
            {
                for(int q=2;q<=5;q++)
                {
                    for(int w=2;w<=5;w++)
                    {
                         if(x!=q && y!=w)
                         {
                             if(enter[q][w].fin==true)
                             {
                                 switch(enter[q][w].finnum)
                                 {
                                     case 1:enter[x][y].a=false;counter++;break;
                                     case 2:enter[x][y].b=false;counter++;break;
                                     case 3:enter[x][y].c=false;counter++;break;
                                     case 4:enter[x][y].d=false;counter++;break;
                                     case 5:enter[x][y].e=false;counter++;break;
                                     case 6:enter[x][y].f=false;counter++;break;
                                     case 7:enter[x][y].g=false;counter++;break;
                                     case 8:enter[x][y].h=false;counter++;break;
                                     case 9:enter[x][y].i=false;counter++;break;
                                 }
                             }
                         }
                    }
                }
            }
            else
            {
                for(int q=2;q<=5;q++)
                {
                    for(int w=5;w<=8;w++)
                    {
                         if(x!=q && y!=w)
                         {
                             if(enter[q][w].fin==true)
                             {
                                 switch(enter[q][w].finnum)
                                 {
                                     case 1:enter[x][y].a=false;counter++;break;
                                     case 2:enter[x][y].b=false;counter++;break;
                                     case 3:enter[x][y].c=false;counter++;break;
                                     case 4:enter[x][y].d=false;counter++;break;
                                     case 5:enter[x][y].e=false;counter++;break;
                                     case 6:enter[x][y].f=false;counter++;break;
                                     case 7:enter[x][y].g=false;counter++;break;
                                     case 8:enter[x][y].h=false;counter++;break;
                                     case 9:enter[x][y].i=false;counter++;break;
                                 }
                             }
                         }
                    }
                }
            }
        }
        else
        {
            if(y<=2)
            {
                for(int q=5;q<=8;q++)
                {
                    for(int w=0;w<=2;w++)
                    {
                         if(x!=q && y!=w)
                         {
                             if(enter[q][w].fin==true)
                             {
                                 switch(enter[q][w].finnum)
                                 {
                                     case 1:enter[x][y].a=false;counter++;break;
                                     case 2:enter[x][y].b=false;counter++;break;
                                     case 3:enter[x][y].c=false;counter++;break;
                                     case 4:enter[x][y].d=false;counter++;break;
                                     case 5:enter[x][y].e=false;counter++;break;
                                     case 6:enter[x][y].f=false;counter++;break;
                                     case 7:enter[x][y].g=false;counter++;break;
                                     case 8:enter[x][y].h=false;counter++;break;
                                     case 9:enter[x][y].i=false;counter++;break;
                                 }
                             }
                         }
                    }
                }
            }
            else if(y<=5)
            {
                for(int q=5;q<=8;q++)
                {
                    for(int w=2;w<=5;w++)
                    {
                         if(x!=q && y!=w)
                         {
                             if(enter[q][w].fin==true)
                             {
                                 switch(enter[q][w].finnum)
                                 {
                                     case 1:enter[x][y].a=false;counter++;break;
                                     case 2:enter[x][y].b=false;counter++;break;
                                     case 3:enter[x][y].c=false;counter++;break;
                                     case 4:enter[x][y].d=false;counter++;break;
                                     case 5:enter[x][y].e=false;counter++;break;
                                     case 6:enter[x][y].f=false;counter++;break;
                                     case 7:enter[x][y].g=false;counter++;break;
                                     case 8:enter[x][y].h=false;counter++;break;
                                     case 9:enter[x][y].i=false;counter++;break;
                                 }
                             }
                         }
                    }
                }
            }
            else
            {
                for(int q=5;q<=8;q++)
                {
                    for(int w=5;w<=8;w++)
                    {
                         if(x!=q && y!=w)
                         {
                             if(enter[q][w].fin==true)
                             {
                                 switch(enter[q][w].finnum)
                                 {
                                     case 1:enter[x][y].a=false;counter++;break;
                                     case 2:enter[x][y].b=false;counter++;break;
                                     case 3:enter[x][y].c=false;counter++;break;
                                     case 4:enter[x][y].d=false;counter++;break;
                                     case 5:enter[x][y].e=false;counter++;break;
                                     case 6:enter[x][y].f=false;counter++;break;
                                     case 7:enter[x][y].g=false;counter++;break;
                                     case 8:enter[x][y].h=false;counter++;break;
                                     case 9:enter[x][y].i=false;counter++;break;
                                 }
                             }
                         }
                    }
                }
            }
        }
        if (counter>0)
            return true;
        return false;
    }    
    
    public boolean vertSevenEight(int c)
    {
        int counte = 0;
        int differenc = 0;
        boolean checki = false;
        for(int r=0;r<9;r++)
        {
            if(enter[c][r].fin==true)
            {
                counte++;
                differenc= differenc+enter[c][r].finnum;
            }
        }
        if(counte==7)
        {
            int missin = 45-differenc;
            for(int r=0;r<9;r++)
            {
                if(enter[c][r].fin==false)
                {
                    enter[c][r].fin=true;
                    enter[c][r].finnum=differenc;
                }
                checki=true;
            }
        }
        if(checki==true)
            return true;
        return false;
    }
    
    public boolean horiSevenEight(int d)
    {
        int counte = 0;
        int differenc = 0;
        boolean checki = false;
        for(int r=0;r<9;r++)
        {
            if(enter[r][d].fin==true)
            {
                counte++;
                differenc= differenc+enter[r][d].finnum;
            }
        }
        if(counte==7)
        {
            int missin = 45-differenc;
            for(int r=0;r<9;r++)
            {
                if(enter[r][d].fin==false)
                {
                    enter[r][d].fin=true;
                    enter[r][d].finnum=differenc;
                }
                checki=true;
            }
        }
        if(checki==true)
            return true;
        return false;
    }
    
    public boolean checkFinal(Square sample)
    {
        if(sample.fin==false)
        {
            int yeck=0;
            if(sample.a==true)
                yeck++;
            if(sample.b==true)
                yeck++;
            if(sample.c==true)
                yeck++;
            if(sample.d==true)
                yeck++;
            if(sample.e==true)
                yeck++;
            if(sample.f==true)
                yeck++;
            if(sample.g==true)
                yeck++;
            if(sample.h==true)
                yeck++;
            if(sample.i==true)
                yeck++;
            if(yeck==1)
            return true;
        }
        return false;
    }
    
    public void setFinal(Square in)
    {
       if(checkFinal(in)==true)
       {
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
            in.fin=true;
       }
    }
}
