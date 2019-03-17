class Solver
{
    private Square[][] enter;

    public static void main(String[] args) {
        new Solver();
    }

    private Solver() {
        enter = new Square[9][9];
        for (int x = 0; x < 9; x++) {
            for(int p = 0; p < 9; p++) {
                enter[x][p]= new Square();
            }
        }
        enter = inputGui();
        solutionGui(solvin());
    }

    private Square [][] inputGui() {
        TableGui beginning = new TableGui();
        return beginning.give();
    }

    private Square[][] solvin(){
        int finals = 0;
        do{
            for(int alpha = 0; alpha < 9; alpha++) {
                for(int beta = 0; beta < 9; beta++){
                    if(!enter[alpha][beta].fin) {
                        rowChecker(alpha,beta);
                        setFinal(enter[alpha][beta]);
                    }
                    if(!enter[alpha][beta].fin){
                        columnChecker(alpha,beta);
                        setFinal(enter[alpha][beta]);
                    }
                    if(!enter[alpha][beta].fin){
                        squareChecker(alpha,beta);
                        setFinal(enter[alpha][beta]);
                    }
                    rowPossibilities(beta);
                    horiEightNine(beta);
                    vertEightNine(beta);
                    boxEightNine(alpha,beta);
                }
                vertEightNine(alpha);
                colPossibilities(alpha);
            }
            for(int ex = 0; ex < 9; ex++){
                for(int why = 0; why < 9; why++) {
                    if(enter[ex][why].fin)
                        finals++;
                }
            }
        }while(finals!=81);
        return enter;
    }

    private void solutionGui(Square[][] fin) {
        new TableGui(fin);
    }

    private void columnChecker(int x, int y) {
        for(int f = 0; f < 9; f++) {
            if(f!=x){
                if(enter[f][y].fin) {
                    switch(enter[f][y].finnum) {
                        case 1:if(enter[x][y].a){enter[x][y].a = false;}break;
                        case 2:if(enter[x][y].b){enter[x][y].b = false;}break;
                        case 3:if(enter[x][y].c){enter[x][y].c = false;}break;
                        case 4:if(enter[x][y].d){enter[x][y].d = false;}break;
                        case 5:if(enter[x][y].e){enter[x][y].e = false;}break;
                        case 6:if(enter[x][y].f){enter[x][y].f = false;}break;
                        case 7:if(enter[x][y].g){enter[x][y].g = false;}break;
                        case 8:if(enter[x][y].h){enter[x][y].h = false;}break;
                        case 9:if(enter[x][y].i){enter[x][y].i = false;}break;
                    }
                }
            }
        }
    }

    private void rowChecker(int x, int y) {
        for(int f=0;f<9;f++) {
            if(f!=y){
                if(enter[x][f].fin) {
                    switch(enter[x][f].finnum) {
                        case 1:if(enter[x][y].a){enter[x][y].a = false;}break;
                        case 2:if(enter[x][y].b){enter[x][y].b = false;}break;
                        case 3:if(enter[x][y].c){enter[x][y].c = false;}break;
                        case 4:if(enter[x][y].d){enter[x][y].d = false;}break;
                        case 5:if(enter[x][y].e){enter[x][y].e = false;}break;
                        case 6:if(enter[x][y].f){enter[x][y].f = false;}break;
                        case 7:if(enter[x][y].g){enter[x][y].g = false;}break;
                        case 8:if(enter[x][y].h){enter[x][y].h = false;}break;
                        case 9:if(enter[x][y].i){enter[x][y].i = false;}break;
                    }
                }
            }
        }
    }

    private void squareChecker(int x, int y) {
        int a = x/3;
        int b = y/3;

        for(int r=(3*a);r<(3*a+3);r++) {
            for(int s=(3*b);s<(3*b+3);s++) {
                if(x!=r && y!=s) {
                    if(enter[r][s].fin) {
                        switch(enter[r][s].finnum) {
                            case 1:if(enter[x][y].a){enter[x][y].a = false;}break;
                            case 2:if(enter[x][y].b){enter[x][y].b = false;}break;
                            case 3:if(enter[x][y].c){enter[x][y].c = false;}break;
                            case 4:if(enter[x][y].d){enter[x][y].d = false;}break;
                            case 5:if(enter[x][y].e){enter[x][y].e = false;}break;
                            case 6:if(enter[x][y].f){enter[x][y].f = false;}break;
                            case 7:if(enter[x][y].g){enter[x][y].g = false;}break;
                            case 8:if(enter[x][y].h){enter[x][y].h = false;}break;
                            case 9:if(enter[x][y].i){enter[x][y].i = false;}break;
                        }
                    }
                }
            }
        }
    }

    private void vertEightNine(int c) {
        int counte = 0;
        int differenc = 0;
        for(int r = 0; r < 9; r++) {
            if(enter[c][r].fin) {
                counte++;
                differenc+=enter[c][r].finnum;
            }
        }
        if(counte == 8) {
            for(int r = 0; r < 9; r++) {
                if(!enter[c][r].fin) {
                    enter[c][r].fin = true;
                    enter[c][r].finnum = 45-differenc;
                }
            }
        }
    }

    private void horiEightNine(int d) {
        int counte = 0;
        int differenc = 0;
        for(int r = 0; r < 9; r++) {
            if(enter[r][d].fin) {
                counte++;
                differenc+=enter[r][d].finnum;
            }
        }
        if(counte == 8) {
            for(int r = 0; r < 9; r++) {
                if(!enter[r][d].fin) {
                    enter[r][d].fin = true;
                    enter[r][d].finnum = 45 - differenc;
                }
            }
        }
    }

    private void boxEightNine(int apple, int banana) {
        int counte = 0;
        int differenc = 0;
        int xsection = apple/3;
        int ysection = banana/3;

        for(int g= 3*xsection; g < (3*xsection+2); g++) {
            for(int h = 3*ysection; h < (3*ysection+2); h++) {
                if(g!=xsection && h!=ysection && enter[g][h].fin) {
                    counte++;
                    differenc+=enter[apple][banana].finnum;
                }
            }
        }
        if (counte == 8) {
            for(int xx = xsection; xx - xsection < 3; xx++) {
                for(int yy = ysection; yy - ysection < 3; yy++) {
                    if(!enter[xx][yy].fin) {
                        enter[xx][yy].fin = true;
                        enter[xx][yy].finnum = 45 - differenc;
                    }
                }
            }
        }
    }

    private boolean checkFinal(Square sample) {
        if(!sample.fin) {
            int yeck=0;
            if(sample.a)
                yeck++;
            if(sample.b)
                yeck++;
            if(sample.c)
                yeck++;
            if(sample.d)
                yeck++;
            if(sample.e)
                yeck++;
            if(sample.f)
                yeck++;
            if(sample.g)
                yeck++;
            if(sample.h)
                yeck++;
            if(sample.i)
                yeck++;
            if(yeck == 1)
                return true;
        }
        return false;
    }

    private void setFinal(Square in) {
        if(checkFinal(in)) {
            if(in.a)
                in.finnum = 1;
            else if(in.b)
                in.finnum = 2;
            else if(in.c)
                in.finnum = 3;
            else if(in.d)
                in.finnum = 4;
            else if(in.e)
                in.finnum = 5;
            else if(in.f)
                in.finnum = 6;
            else if(in.g)
                in.finnum = 7;
            else if(in.h)
                in.finnum = 8;
            else if(in.i)
                in.finnum = 9;
            in.fin = true;
        }
    }

    private void colPossibilities(int colum) {
        int aa = 0;
        int bb = 0;
        int cc = 0;
        int dd = 0;
        int ee = 0;
        int ff = 0;
        int gg = 0;
        int hh = 0;
        int ii = 0;
        for(int eye = 0; eye < 9; eye++) {
            if(!enter[colum][eye].fin) {
                if(enter[colum][eye].a)
                    aa++;
                if(enter[colum][eye].b)
                    bb++;
                if(enter[colum][eye].c)
                    cc++;
                if(enter[colum][eye].d)
                    dd++;
                if(enter[colum][eye].e)
                    ee++;
                if(enter[colum][eye].f)
                    ff++;
                if(enter[colum][eye].g)
                    gg++;
                if(enter[colum][eye].h)
                    hh++;
                if(enter[colum][eye].i)
                    ii++;

                if(aa == 1) {
                    for(int rack = 0; rack < 9; rack++) {
                        if(!enter[colum][rack].fin) {
                            if(enter[colum][rack].a) {
                                enter[colum][rack].fin = true;
                                enter[colum][rack].finnum = 1;
                                break;
                            }
                        }
                    }
                }
                if(bb == 1) {
                    for(int rack = 0; rack < 9; rack++) {
                        if(!enter[colum][rack].fin) {
                            if(enter[colum][rack].b) {
                                enter[colum][rack].fin = true;
                                enter[colum][rack].finnum = 2;
                                break;
                            }
                        }
                    }
                }
                if(cc == 1) {
                    for(int rack = 0; rack < 9; rack++) {
                        if(!enter[colum][rack].fin) {
                            if(enter[colum][rack].c =true) {
                                enter[colum][rack].fin = true;
                                enter[colum][rack].finnum = 3;
                                break;
                            }
                        }
                    }
                }
                if(dd == 1) {
                    for(int rack = 0; rack < 9; rack++) {
                        if(!enter[colum][rack].fin) {
                            if(enter[colum][rack].d) {
                                enter[colum][rack].fin = true;
                                enter[colum][rack].finnum = 4;
                                break;
                            }
                        }
                    }
                }
                if(ee == 1) {
                    for(int rack = 0; rack < 9; rack++) {
                        if(!enter[colum][rack].fin) {
                            if(enter[colum][rack].e) {
                                enter[colum][rack].fin = true;
                                enter[colum][rack].finnum = 5;
                                break;
                            }
                        }
                    }
                }
                if(ff == 1) {
                    for(int rack = 0; rack < 9; rack++) {
                        if(!enter[colum][rack].fin) {
                            if(enter[colum][rack].f) {
                                enter[colum][rack].fin = true;
                                enter[colum][rack].finnum = 6;
                                break;
                            }
                        }
                    }
                }
                if(gg == 1) {
                    for(int rack = 0; rack < 9; rack++) {
                        if(!enter[colum][rack].fin) {
                            if(enter[colum][rack].g) {
                                enter[colum][rack].fin = true;
                                enter[colum][rack].finnum = 7;
                                break;
                            }
                        }
                    }
                }
                if(hh == 1) {
                    for(int rack = 0; rack < 9; rack++) {
                        if(!enter[colum][rack].fin) {
                            if(enter[colum][rack].h) {
                                enter[colum][rack].fin = true;
                                enter[colum][rack].finnum = 8;
                                break;
                            }
                        }
                    }
                }
                if(ii == 1) {
                    for(int rack = 0; rack < 9; rack++) {
                        if(!enter[colum][rack].fin) {
                            if(enter[colum][rack].i) {
                                enter[colum][rack].fin = true;
                                enter[colum][rack].finnum = 9;
                                break;
                            }
                        }
                    }
                }
            }
        }
    }

    private void rowPossibilities(int ro) {
        int aa = 0;
        int bb = 0;
        int cc = 0;
        int dd = 0;
        int ee = 0;
        int ff = 0;
        int gg = 0;
        int hh = 0;
        int ii = 0;
        for(int eye = 0; eye < 9; eye++) {
            if(!enter[eye][ro].fin) {
                if(enter[eye][ro].a)
                    aa++;
                if(enter[eye][ro].b)
                    bb++;
                if(enter[eye][ro].c)
                    cc++;
                if(enter[eye][ro].d)
                    dd++;
                if(enter[eye][ro].e)
                    ee++;
                if(enter[eye][ro].f)
                    ff++;
                if(enter[eye][ro].g)
                    gg++;
                if(enter[eye][ro].h)
                    hh++;
                if(enter[eye][ro].i)
                    ii++;

                if(aa == 1) {
                    for(int rack = 0; rack < 9; rack++) {
                        if(!enter[rack][ro].fin) {
                            if(enter[rack][ro].a) {
                                enter[rack][ro].fin = true;
                                enter[rack][ro].finnum = 1;
                                break;
                            }
                        }
                    }
                }
                if(bb == 1) {
                    for(int rack = 0; rack < 9; rack++) {
                        if(!enter[rack][ro].fin) {
                            if(enter[rack][ro].b) {
                                enter[rack][ro].fin = true;
                                enter[rack][ro].finnum = 2;
                                break;
                            }
                        }
                    }
                }
                if(cc == 1) {
                    for(int rack = 0; rack < 9; rack++) {
                        if(!enter[rack][ro].fin) {
                            if(enter[rack][ro].c =true) {
                                enter[rack][ro].fin = true;
                                enter[rack][ro].finnum = 3;
                                break;
                            }
                        }
                    }
                }
                if(dd == 1) {
                    for(int rack = 0; rack < 9; rack++) {
                        if(!enter[rack][ro].fin) {
                            if(enter[rack][ro].d) {
                                enter[rack][ro].fin = true;
                                enter[rack][ro].finnum = 4;
                                break;
                            }
                        }
                    }
                }
                if(ee == 1) {
                    for(int rack = 0; rack < 9; rack++) {
                        if(!enter[rack][ro].fin) {
                            if(enter[rack][ro].e) {
                                enter[rack][ro].fin = true;
                                enter[rack][ro].finnum = 5;
                                break;
                            }
                        }
                    }
                }
                if(ff == 1) {
                    for(int rack= 0 ; rack < 9; rack++) {
                        if(!enter[rack][ro].fin) {
                            if(enter[rack][ro].f) {
                                enter[rack][ro].fin = true;
                                enter[rack][ro].finnum = 6;
                                break;
                            }
                        }
                    }
                }
                if(gg == 1) {
                    for(int rack = 0; rack < 9; rack++) {
                        if(!enter[rack][ro].fin) {
                            if(enter[rack][ro].g) {
                                enter[rack][ro].fin = true;
                                enter[rack][ro].finnum = 7;
                                break;
                            }
                        }
                    }
                }
                if(hh == 1) {
                    for(int rack = 0; rack < 9; rack++) {
                        if(!enter[rack][ro].fin) {
                            if(enter[rack][ro].h) {
                                enter[rack][ro].fin = true;
                                enter[rack][ro].finnum = 8;
                                break;
                            }
                        }
                    }
                }
                if(ii == 1) {
                    for(int rack = 0; rack < 9; rack++) {
                        if(!enter[rack][ro].fin) {
                            if(enter[rack][ro].i) {
                                enter[rack][ro].fin = true;
                                enter[rack][ro].finnum = 9;
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
}
