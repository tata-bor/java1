package HomeWork8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {

    private final JButton[] jButtons;

    public MyWindow(int [][]map, IContinueGame continueGame) {
        setTitle("Test Window");
        jButtons = new JButton[9];
        setLayout(new GridLayout(3,3));
        for (int i = 0; i < 9; i++) {
            jButtons[i] = new JButton("#");
            int finalI = i;
            jButtons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    map[finalI%3][finalI/3] = 1;
                    continueGame.Execute();
                }
            });
            add(jButtons[i]);
        }
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        setVisible(true);
    }

    public void Redraw(int[][] map){
        for(int x = 0; x < 3; x++)
            for(int y = 0; y < 3; y++){
                if(map[x][y] == 0){
                    jButtons[x + y*3].setText("");
                    jButtons[x + y*3].setEnabled(true);
                }
                if(map[x][y] == 1){
                    jButtons[x + y*3].setText("x");
                    jButtons[x + y*3].setEnabled(false);
                }
                if(map[x][y] == 2){
                    jButtons[x + y*3].setText("0");
                    jButtons[x + y*3].setEnabled(false);
                }
            }
    }


}
