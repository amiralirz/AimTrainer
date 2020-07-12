import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Aim_Trainer_Application{

    public static void main(String[] args){
        Random rnd = new Random();

        JFrame f1 = new JFrame("Test");
        JRootPane rp = f1.getRootPane();
        Container content = f1.getContentPane();
        f1.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        f1.setSize(500,520);
        f1.setResizable(false);
        content.setBackground(new Color(rnd.nextInt(255),rnd.nextInt(255),rnd.nextInt(255)));

        MouseListener exit_b = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                f1.dispose();
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }
        };

        JMenuBar mb = new JMenuBar();
        JMenu options = new JMenu("Options");
        JMenu exit = new JMenu("Exit");
        exit.addMouseListener(exit_b);
        JMenuItem op = new JMenuItem("Target options");
        options.add(op);
        mb.add(options);
        mb.add(exit);
        f1.setJMenuBar(mb);

        LayoutManager mgr = new GroupLayout(content);
        f1.setLayout(mgr);

//        JCheckBox cb = new JCheckBox();
//        cb.setBounds(1,1,20,20);
//        content.add(cb);

        JButton b1 = new JButton();
        b1.setBounds(225,225,20,20);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                content.setBackground(new Color(rnd.nextInt(255),rnd.nextInt(255),rnd.nextInt(255)));
                b1.setBounds(rnd.nextInt(480),225,20,20);
            }
        });
        content.add(b1);
        f1.setVisible(true);
    }
}