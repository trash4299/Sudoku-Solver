 
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
public  class TableExample extends JFrame
{
    public TableExample()
    {
        /*
        String[] columns = new String[] {"A", "B", "C", "D","E","F","G","H","I"};
        Object[][] data = new Object[][] 
        {
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0}
        };
        JTable table = new JTable(data, columns);
        */
        JTable table = new JTable(9,9);
        this.add(new JScrollPane(table));
        this.setTitle("Table Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        this.pack();
        this.setVisible(true);
    }
     
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TableExample();
            }
        });
    }   
}