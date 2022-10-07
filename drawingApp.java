import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

//Canvas class

//End of Canvas class


//Structure of GUI eg. Layout components and panels
public class drawingApp extends JFrame{

    public drawingApp(){
        JFrame frame = new JFrame();
        frame.setPreferredSize(new Dimension(1200, 1100));

        frame.setLayout(new BorderLayout());

        JMenuBar menuBar = new JMenuBar();
        menuBar.setPreferredSize(new Dimension(1200, 30));
        JMenu fileMenu = new JMenu("File");
        JMenuItem fileSaveMenuItem = new JMenuItem("Save");
        JMenuItem fileLoadMenuItem = new JMenuItem("Load");
        JMenuItem fileExitMenuItem = new JMenuItem("Exit");
        fileMenu.add(fileSaveMenuItem);
        fileMenu.add(fileLoadMenuItem);
        fileMenu.add(fileExitMenuItem);
        menuBar.add(fileMenu);

        JMenu helpMenu = new JMenu("Help");
        JMenuItem helpAboutMenuItem = new JMenuItem("About");
        helpMenu.add(helpAboutMenuItem);
        menuBar.add(helpMenu);

        frame.add(menuBar, BorderLayout.PAGE_START);

        //Canvas
        JPanel canvas = new JPanel();
        canvas.setBorder(new TitledBorder(new EtchedBorder(), "Canvas Panel"));            
        canvas.setPreferredSize(new Dimension(1000, 400));
        frame.add(canvas, BorderLayout.CENTER);


        //Control Panel 
        JPanel controPanel = new JPanel();
        controPanel.setBorder(new TitledBorder(new EtchedBorder(), "Control Panel"));            
        controPanel.setPreferredSize(new Dimension(200, 1000));
        frame.add(controPanel, BorderLayout.LINE_START);


        //Start of control panel components. Update in practical
        ButtonGroup group = new ButtonGroup();
        JRadioButton line = new JRadioButton("Line ");
        line.setSelected(true);
        JRadioButton rectangle = new JRadioButton("Rectangle ");
        JRadioButton oval = new JRadioButton("Oval ");
        JRadioButton freehand = new JRadioButton("Freehand ");
        group.add(line);
        group.add(rectangle);
        group.add(oval);
        group.add(freehand);

        controPanel.add(line);
        controPanel.add(rectangle);
        controPanel.add(oval);
        controPanel.add(freehand);

        //End of control panel components


        //Message Area
        JPanel messageArea = new JPanel();
        messageArea.setBorder(new TitledBorder(new EtchedBorder(), "Message Area"));            
        messageArea.setPreferredSize(new Dimension(1200, 250));
        frame.add(messageArea, BorderLayout.PAGE_END);

        JTextArea textArea = new JTextArea(
        "This is an editable JTextArea. " +
        "A text area is a \"plain\" text component, " +
        "which means that although it can display text " +
        "in any font, all of the text is in the same font."
        );

        textArea.setPreferredSize(new Dimension(300, 50));

        messageArea.add(textArea);

        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.pack();
        frame.setVisible(true);

    }
    //End of structure class



    //Listener classes

    //End of Listener classes



    //Draw method

    //End of Draw method


    //Main method
    public static void main(String[] args) {
        /*drawingApp newWindow = */ new drawingApp();
    }
    //End of main method
}