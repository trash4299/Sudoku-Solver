
public class Solver
{
    public Square[][] enter;
    
    //TESTING
    public int[][] temptest;
    
    public static void main(String[] args) {
    	new Solver();
    }
    
    public Solver(){
        enter = new Square[9][9];
        for (int x=0;x<9;x++)
        {
            for(int p=0;p<9;p++)
            {
                enter[x][p]= new Square();
            }
        }
        
        //USED FOR TESTING
        /*
        int [][] temptest = {{0,1,5,4,6,9,7,3,8},{4,8,7,1,3,5,6,2,9},{6,9,3,8,7,2,4,1,5},{8,6,2,3,4,1,5,9,7},{5,4,9,2,8,7,3,6,1},{7,3,1,9,5,6,2,8,4},{9,2,4,5,1,3,8,7,6},{1,7,8,6,2,4,9,5,3},{3,5,6,7,9,8,1,4,2}};
        //int [][] temptest = {{2,0,0,3,0,0,0,0,0},{8,0,4,0,6,2,0,0,3},{0,1,3,8,0,0,2,0,0},{0,0,0,0,2,0,3,9,0},{5,0,7,0,0,0,6,2,1},{0,3,2,0,0,6,0,0,0,},{0,2,0,0,0,9,1,4,0},{6,0,1,2,5,0,8,0,9},{0,0,0,0,0,1,0,0,2}};
        
        for(int t=0;t<9;t++)
        {
            for(int h=0;h<9;h++)
            {
                if(temptest[t][h]!=0)
                {
                    enter[t][h].finnum=temptest[t][h];
                    enter[t][h].fin=true;
                    if(temptest[t][h]!=1)
                        enter[t][h].a=false;
                    if(temptest[t][h]!=2)
                        enter[t][h].b=false;
                    if(temptest[t][h]!=3)
                        enter[t][h].c=false;
                    if(temptest[t][h]!=4)
                        enter[t][h].d=false;
                    if(temptest[t][h]!=5)
                        enter[t][h].e=false;
                    if(temptest[t][h]!=6)
                        enter[t][h].f=false;
                    if(temptest[t][h]!=7)
                        enter[t][h].g=false;
                    if(temptest[t][h]!=8)
                        enter[t][h].h=false;
                    if(temptest[t][h]!=9)
                        enter[t][h].i=false;
                }
            }
        }
        //END TESTING
        */
        enter = inputGui();
        solutionGui(solvin());
    }
    
    public Square [][] inputGui() {
        TableGui beginning = new TableGui();
        return beginning.give();
    }
    
    public Square[][] solvin(){
        long num = 0;
        long temporary =0;
        do{
            temporary++;
            num=0;
            System.out.println(temporary);
            for(int alpha=0;alpha<9;alpha++) {
                System.out.print("  Alpha:"+alpha);
                for(int beta=0;beta<9;beta++){
                    if(enter[alpha][beta].fin==false){
                        if(rowChecker(alpha,beta)==true)
                            num++;
                        setFinal(enter[alpha][beta]);
                    }
                    if(enter[alpha][beta].fin==false){
                        if(columnChecker(alpha,beta)==true)
                            num++;
                        setFinal(enter[alpha][beta]);
                    }
                    if(enter[alpha][beta].fin==false){
                        if(squareChecker(alpha,beta)==true)
                            num++;
                        setFinal(enter[alpha][beta]);
                    }
                    if(horiEightNine(beta)==true)
                        num++;
                    if(vertEightNine(beta)==true)
                        num++;
                    if(boxEightNine(alpha,beta)==true)
                        num++;
                    System.out.print("  Beta:"+beta);
                }
                if(vertEightNine(alpha)==true)
                    num++;
            }
            System.out.println("    Num of changes: "+num);
        }while(num!=0);
        return enter;
    }
    
    public void solutionGui(Square [][] fin) {
        new TableGui(fin);
    }
    
    private boolean columnChecker(int x, int y) {
        int counter = 0;
        for(int f=0;f<9;f++) {
            if(f!=x){
                if(enter[f][y].fin==true) {
                    switch(enter[f][y].finnum) {
                        case 1:if(enter[x][y].a!=false){enter[x][y].a=false;counter++;}break;
                        case 2:if(enter[x][y].b!=false){enter[x][y].b=false;counter++;}break;
                        case 3:if(enter[x][y].c!=false){enter[x][y].c=false;counter++;}break;
                        case 4:if(enter[x][y].d!=false){enter[x][y].d=false;counter++;}break;
                        case 5:if(enter[x][y].e!=false){enter[x][y].e=false;counter++;}break;
                        case 6:if(enter[x][y].f!=false){enter[x][y].f=false;counter++;}break;
                        case 7:if(enter[x][y].g!=false){enter[x][y].g=false;counter++;}break;
                        case 8:if(enter[x][y].h!=false){enter[x][y].h=false;counter++;}break;
                        case 9:if(enter[x][y].i!=false){enter[x][y].i=false;counter++;}break;
                    }
                }
            }
        }
        if (counter>0)
            return true;
        return false;
    }
    
    private boolean rowChecker(int x, int y) {
        int counter = 0;
        for(int f=0;f<9;f++) {
            if(f!=y){
                if(enter[x][f].fin==true) {
                    switch(enter[x][f].finnum) {
                        case 1:if(enter[x][y].a!=false){enter[x][y].a=false;counter++;}break;
                        case 2:if(enter[x][y].b!=false){enter[x][y].b=false;counter++;}break;
                        case 3:if(enter[x][y].c!=false){enter[x][y].c=false;counter++;}break;
                        case 4:if(enter[x][y].d!=false){enter[x][y].d=false;counter++;}break;
                        case 5:if(enter[x][y].e!=false){enter[x][y].e=false;counter++;}break;
                        case 6:if(enter[x][y].f!=false){enter[x][y].f=false;counter++;}break;
                        case 7:if(enter[x][y].g!=false){enter[x][y].g=false;counter++;}break;
                        case 8:if(enter[x][y].h!=false){enter[x][y].h=false;counter++;}break;
                        case 9:if(enter[x][y].i!=false){enter[x][y].i=false;counter++;}break;
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
                        if(x!=q)
                        {
                            if(y!=w)
                            {
                                if(enter[q][w].fin==true)
                                {
                                    switch(enter[q][w].finnum)
                                    {
                                        case 1:if(enter[x][y].a!=false){enter[x][y].a=false;counter++;}break;
                                        case 2:if(enter[x][y].b!=false){enter[x][y].b=false;counter++;}break;
                                        case 3:if(enter[x][y].c!=false){enter[x][y].c=false;counter++;}break;
                                        case 4:if(enter[x][y].d!=false){enter[x][y].d=false;counter++;}break;
                                        case 5:if(enter[x][y].e!=false){enter[x][y].e=false;counter++;}break;
                                        case 6:if(enter[x][y].f!=false){enter[x][y].f=false;counter++;}break;
                                        case 7:if(enter[x][y].g!=false){enter[x][y].g=false;counter++;}break;
                                        case 8:if(enter[x][y].h!=false){enter[x][y].h=false;counter++;}break;
                                        case 9:if(enter[x][y].i!=false){enter[x][y].i=false;counter++;}break;
                                    }
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
                    for(int w=3;w<=5;w++)
                    {
                        if(x!=q)
                        {
                            if(y!=w)
                            {
                                if(enter[q][w].fin==true)
                                {
                                    switch(enter[q][w].finnum)
                                    {
                                        case 1:if(enter[x][y].a!=false){enter[x][y].a=false;counter++;}break;
                                        case 2:if(enter[x][y].b!=false){enter[x][y].b=false;counter++;}break;
                                        case 3:if(enter[x][y].c!=false){enter[x][y].c=false;counter++;}break;
                                        case 4:if(enter[x][y].d!=false){enter[x][y].d=false;counter++;}break;
                                        case 5:if(enter[x][y].e!=false){enter[x][y].e=false;counter++;}break;
                                        case 6:if(enter[x][y].f!=false){enter[x][y].f=false;counter++;}break;
                                        case 7:if(enter[x][y].g!=false){enter[x][y].g=false;counter++;}break;
                                        case 8:if(enter[x][y].h!=false){enter[x][y].h=false;counter++;}break;
                                        case 9:if(enter[x][y].i!=false){enter[x][y].i=false;counter++;}break;
                                    }
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
                    for(int w=6;w<=8;w++)
                    {
                        if(x!=q)
                        {
                            if(y!=w)
                            {
                                if(enter[q][w].fin==true)
                                {
                                    switch(enter[q][w].finnum)
                                    {
                                        case 1:if(enter[x][y].a!=false){enter[x][y].a=false;counter++;}break;
                                        case 2:if(enter[x][y].b!=false){enter[x][y].b=false;counter++;}break;
                                        case 3:if(enter[x][y].c!=false){enter[x][y].c=false;counter++;}break;
                                        case 4:if(enter[x][y].d!=false){enter[x][y].d=false;counter++;}break;
                                        case 5:if(enter[x][y].e!=false){enter[x][y].e=false;counter++;}break;
                                        case 6:if(enter[x][y].f!=false){enter[x][y].f=false;counter++;}break;
                                        case 7:if(enter[x][y].g!=false){enter[x][y].g=false;counter++;}break;
                                        case 8:if(enter[x][y].h!=false){enter[x][y].h=false;counter++;}break;
                                        case 9:if(enter[x][y].i!=false){enter[x][y].i=false;counter++;}break;
                                    }
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
                for(int q=3;q<=5;q++)
                {
                    for(int w=0;w<=2;w++)
                    {
                        if(x!=q)
                        {
                            if(y!=w)
                            {
                                if(enter[q][w].fin==true)
                                {
                                    switch(enter[q][w].finnum)
                                    {
                                        case 1:if(enter[x][y].a!=false){enter[x][y].a=false;counter++;}break;
                                        case 2:if(enter[x][y].b!=false){enter[x][y].b=false;counter++;}break;
                                        case 3:if(enter[x][y].c!=false){enter[x][y].c=false;counter++;}break;
                                        case 4:if(enter[x][y].d!=false){enter[x][y].d=false;counter++;}break;
                                        case 5:if(enter[x][y].e!=false){enter[x][y].e=false;counter++;}break;
                                        case 6:if(enter[x][y].f!=false){enter[x][y].f=false;counter++;}break;
                                        case 7:if(enter[x][y].g!=false){enter[x][y].g=false;counter++;}break;
                                        case 8:if(enter[x][y].h!=false){enter[x][y].h=false;counter++;}break;
                                        case 9:if(enter[x][y].i!=false){enter[x][y].i=false;counter++;}break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            else if(y<=5)
            {
                for(int q=3;q<=5;q++)
                {
                    for(int w=3;w<=5;w++)
                    {
                        if(x!=q)
                        {
                            if(y!=w)
                            {
                                if(enter[q][w].fin==true)
                                {
                                    switch(enter[q][w].finnum)
                                    {
                                        case 1:if(enter[x][y].a!=false){enter[x][y].a=false;counter++;}break;
                                        case 2:if(enter[x][y].b!=false){enter[x][y].b=false;counter++;}break;
                                        case 3:if(enter[x][y].c!=false){enter[x][y].c=false;counter++;}break;
                                        case 4:if(enter[x][y].d!=false){enter[x][y].d=false;counter++;}break;
                                        case 5:if(enter[x][y].e!=false){enter[x][y].e=false;counter++;}break;
                                        case 6:if(enter[x][y].f!=false){enter[x][y].f=false;counter++;}break;
                                        case 7:if(enter[x][y].g!=false){enter[x][y].g=false;counter++;}break;
                                        case 8:if(enter[x][y].h!=false){enter[x][y].h=false;counter++;}break;
                                        case 9:if(enter[x][y].i!=false){enter[x][y].i=false;counter++;}break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            else
            {
                for(int q=3;q<=5;q++)
                {
                    for(int w=6;w<=8;w++)
                    {
                        if(x!=q)
                        {
                            if(y!=w)
                            {
                                if(enter[q][w].fin==true)
                                {
                                    switch(enter[q][w].finnum)
                                    {
                                        case 1:if(enter[x][y].a!=false){enter[x][y].a=false;counter++;}break;
                                        case 2:if(enter[x][y].b!=false){enter[x][y].b=false;counter++;}break;
                                        case 3:if(enter[x][y].c!=false){enter[x][y].c=false;counter++;}break;
                                        case 4:if(enter[x][y].d!=false){enter[x][y].d=false;counter++;}break;
                                        case 5:if(enter[x][y].e!=false){enter[x][y].e=false;counter++;}break;
                                        case 6:if(enter[x][y].f!=false){enter[x][y].f=false;counter++;}break;
                                        case 7:if(enter[x][y].g!=false){enter[x][y].g=false;counter++;}break;
                                        case 8:if(enter[x][y].h!=false){enter[x][y].h=false;counter++;}break;
                                        case 9:if(enter[x][y].i!=false){enter[x][y].i=false;counter++;}break;
                                    }
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
                for(int q=6;q<=8;q++)
                {
                    for(int w=0;w<=2;w++)
                    {
                        if(x!=q)
                        {
                            if(y!=w)
                            {
                                if(enter[q][w].fin==true)
                                {
                                    switch(enter[q][w].finnum)
                                    {
                                        case 1:if(enter[x][y].a!=false){enter[x][y].a=false;counter++;}break;
                                        case 2:if(enter[x][y].b!=false){enter[x][y].b=false;counter++;}break;
                                        case 3:if(enter[x][y].c!=false){enter[x][y].c=false;counter++;}break;
                                        case 4:if(enter[x][y].d!=false){enter[x][y].d=false;counter++;}break;
                                        case 5:if(enter[x][y].e!=false){enter[x][y].e=false;counter++;}break;
                                        case 6:if(enter[x][y].f!=false){enter[x][y].f=false;counter++;}break;
                                        case 7:if(enter[x][y].g!=false){enter[x][y].g=false;counter++;}break;
                                        case 8:if(enter[x][y].h!=false){enter[x][y].h=false;counter++;}break;
                                        case 9:if(enter[x][y].i!=false){enter[x][y].i=false;counter++;}break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            else if(y<=5)
            {
                for(int q=6;q<=8;q++)
                {
                    for(int w=3;w<=5;w++)
                    {
                        if(x!=q)
                        {
                            if(y!=w)
                            {
                                if(enter[q][w].fin==true)
                                {
                                    switch(enter[q][w].finnum)
                                    {
                                        case 1:if(enter[x][y].a!=false){enter[x][y].a=false;counter++;}break;
                                        case 2:if(enter[x][y].b!=false){enter[x][y].b=false;counter++;}break;
                                        case 3:if(enter[x][y].c!=false){enter[x][y].c=false;counter++;}break;
                                        case 4:if(enter[x][y].d!=false){enter[x][y].d=false;counter++;}break;
                                        case 5:if(enter[x][y].e!=false){enter[x][y].e=false;counter++;}break;
                                        case 6:if(enter[x][y].f!=false){enter[x][y].f=false;counter++;}break;
                                        case 7:if(enter[x][y].g!=false){enter[x][y].g=false;counter++;}break;
                                        case 8:if(enter[x][y].h!=false){enter[x][y].h=false;counter++;}break;
                                        case 9:if(enter[x][y].i!=false){enter[x][y].i=false;counter++;}break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            else
            {
                for(int q=6;q<=8;q++)
                {
                    for(int w=6;w<=8;w++)
                    {
                        if(x!=q)
                        {
                            if(y!=w)
                            {
                                if(enter[q][w].fin==true)
                                {
                                    switch(enter[q][w].finnum)
                                    {
                                        case 1:if(enter[x][y].a!=false){enter[x][y].a=false;counter++;}break;
                                        case 2:if(enter[x][y].b!=false){enter[x][y].b=false;counter++;}break;
                                        case 3:if(enter[x][y].c!=false){enter[x][y].c=false;counter++;}break;
                                        case 4:if(enter[x][y].d!=false){enter[x][y].d=false;counter++;}break;
                                        case 5:if(enter[x][y].e!=false){enter[x][y].e=false;counter++;}break;
                                        case 6:if(enter[x][y].f!=false){enter[x][y].f=false;counter++;}break;
                                        case 7:if(enter[x][y].g!=false){enter[x][y].g=false;counter++;}break;
                                        case 8:if(enter[x][y].h!=false){enter[x][y].h=false;counter++;}break;
                                        case 9:if(enter[x][y].i!=false){enter[x][y].i=false;counter++;}break;
                                    }
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
    
    public boolean vertEightNine(int c) {
        int counte = 0;
        int differenc = 0;
        for(int r=0;r<9;r++){
            if(enter[c][r].fin==true) {
                counte++;
                differenc+=enter[c][r].finnum;
            }
        }
        if(counte==8) {
            int missin = 45-differenc;
            for(int r=0;r<9;r++)
            {
                if(enter[c][r].fin==false)
                {
                    enter[c][r].fin=true;
                    enter[c][r].finnum=missin;
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean horiEightNine(int d) {
        int counte = 0;
        int differenc = 0;
        for(int r=0;r<9;r++) {
            if(enter[r][d].fin==true) {
                counte++;
                differenc= differenc+enter[r][d].finnum;
            }
        }
        if(counte==8) {
            int missin = 45-differenc;
            for(int r=0;r<9;r++) {
                if(enter[r][d].fin==false) {
                    enter[r][d].fin=true;
                    enter[r][d].finnum=missin;
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean boxEightNine(int apple, int banana)
    {
        int counte = 0;
        int differenc = 0;
        int xsection = 0;
        int ysection = 0;
        if(apple<=2) {
            xsection = 1;
            if(banana<=2) {
                ysection = 1;
                for(int q=0;q<=2;q++) {
                    for(int w=0;w<=2;w++) {
                        if(q!=apple) {
                            if(w!=banana)
                                if(enter[q][w].fin==true) {
                                    counte++;
                                    differenc+=enter[apple][banana].finnum;
                                }
                        }
                    }
                }
            }
            else if(banana<=5) {
                ysection = 2;
                for(int q=0;q<=2;q++) {
                    for(int w=2;w<=5;w++) {
                        if(apple!=q) {
                            if(banana!=w) {
                                if(enter[q][w].fin==true) {
                                    counte++;
                                    differenc+=enter[apple][banana].finnum;
                                }
                            }
                        }
                    }
                }
            }
            else {
                ysection = 3;
                for(int q=0;q<=2;q++) {
                    for(int w=6;w<=8;w++) {
                        if(apple!=q) {
                            if(banana!=w) {
                                if(enter[q][w].fin==true) {
                                    counte++;
                                    differenc+=enter[apple][banana].finnum;
                                }
                            }
                        }
                    }
                }
            }
        }
        else if(apple<=5) {
            xsection = 2;
            if(banana<=2) {
                ysection = 1;
                for(int q=3;q<=5;q++) {
                    for(int w=0;w<=2;w++) {
                        if(apple!=q) {
                            if(banana!=w) {
                                if(enter[q][w].fin==true) {
                                    counte++;
                                    differenc+=enter[apple][banana].finnum;
                                }
                            }
                        }
                    }
                }
            }
            else if(banana<=5) {
                ysection = 2;
                for(int q=3;q<=5;q++) {
                    for(int w=3;w<=5;w++) {
                        if(apple!=q) {
                             if(banana!=w) {
                                if(enter[q][w].fin==true) {
                                    counte++;
                                    differenc+=enter[apple][banana].finnum;
                                }
                            }
                        }
                    }
                }
            }
            else {
                ysection = 3;
                for(int q=3;q<=5;q++) {
                    for(int w=6;w<=8;w++) {
                        if(apple!=q) {
                            if(banana!=w) {
                                if(enter[q][w].fin==true) {
                                    counte++;
                                    differenc+=enter[apple][banana].finnum;
                                }
                            }
                        }
                    }
                }
            }
        }
        else {
            xsection = 3;
            if(banana<=2) {
                ysection = 1;
                for(int q=6;q<=8;q++) {
                    for(int w=0;w<=2;w++) {
                        if(apple!=q) {
                            if(banana!=w) {
                                if(enter[q][w].fin==true) {
                                    counte++;
                                    differenc+=enter[apple][banana].finnum;
                                }
                            }
                        }
                    }
                }
            }
            else if(banana<=5) {
                ysection = 2;
                for(int q=6;q<=8;q++) {
                    for(int w=3;w<=5;w++) {
                        if(apple!=q) {
                            if(banana!=w) {
                                if(enter[q][w].fin==true) {
                                    counte++;
                                    differenc+=enter[apple][banana].finnum;
                                }
                            }
                        }
                    }
                }
            }
            else {
                ysection = 3;
                for(int q=6;q<=8;q++) {
                    for(int w=6;w<=8;w++) {
                        if(apple!=q) {
                            if(banana!=w) {
                                if(enter[q][w].fin==true) {
                                    counte++;
                                    differenc+=enter[apple][banana].finnum;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (counte==8) {
            for(int fin=1*xsection;fin<10;fin++) {
                for(int ally=1*ysection;fin<10;ally++) {
                    if(enter[fin-1][ally-1].fin==false) {
                        enter[fin-1][ally-1].fin = true;
                        enter[fin-1][ally-1].finnum = 45 - differenc;
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public boolean checkFinal(Square sample) {
        if(sample.fin==false) {
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
    
    public void setFinal(Square in) {
       if(checkFinal(in)==true) {
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
