
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.table.TableColumnModel;
public class TableGui extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
    public JTable table;
    private boolean in;
    public Square [][] elbow;
    
    @Override
    public void actionPerformed(ActionEvent ae){}
    public TableGui() {
        elbow = new Square[9][9];
        for (int x=0;x<9;x++) {
            for(int p=0;p<9;p++) {
                elbow[x][p]= new Square();
            }
        }
        in = false;
        JPanel p = new JPanel();
        JTable table = new JTable(9,9);
        table.setRowHeight(40);
        TableColumnModel columnModel = table.getColumnModel();
        for(int x=0;x<9;x++) {
            columnModel.getColumn(x).setPreferredWidth(15);
        }
        this.setTitle("Enter Known Values");
        JButton b1 = new JButton("Solve!");
        p.add(b1);
        p.add(new JScrollPane(table));
        this.add(p);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                in = true;
            }
        }); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        this.pack();
        this.setVisible(true);
        while(in == false){
        }
        setVisible(false);
        
        for(int a=0;a<9;a++) {
            for(int b=0;b<9;b++) {
                String temp = (String) table.getModel().getValueAt(a,b);
                if(temp!=null&&temp!="") {
                    int schlep = Integer.parseInt(temp);
                    elbow[a][b].finnum = schlep;
                    elbow[a][b].fin=true;
                    if(schlep!=1)
                        elbow[a][b].a=false;
                    if(schlep!=2)
                        elbow[a][b].b=false;
                    if(schlep!=3)
                        elbow[a][b].c=false;
                    if(schlep!=4)
                        elbow[a][b].d=false;
                    if(schlep!=5)
                        elbow[a][b].e=false;
                    if(schlep!=6)
                        elbow[a][b].f=false;
                    if(schlep!=7)
                        elbow[a][b].g=false;
                    if(schlep!=8)
                        elbow[a][b].h=false;
                    if(schlep!=9)
                        elbow[a][b].i=false;
                }
            }
        }
    }
    
    public Square[][] give() {
        return elbow;
    }
    
    public TableGui(Square [][] end) {
        JPanel p = new JPanel();
        JTable table = new JTable(9,9);
        table.setRowHeight(40);
        TableColumnModel columnModel = table.getColumnModel();
        for(int x=0;x<9;x++) {
            columnModel.getColumn(x).setPreferredWidth(15);
        }
        p.add(new JScrollPane(table));
        this.add(p);
        this.setTitle("Solved Sudoku!");
        for(int x=0; x<9;x++) {
            for(int y=0; y<9;y++) {
                table.setValueAt(end[x][y].finnum,x,y);
            }
        }    
        this.pack();
        this.setVisible(true);
    }
}
