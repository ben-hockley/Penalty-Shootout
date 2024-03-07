import javax.swing.*;
import java.awt.*;

public class Home extends JFrame {
    JPanel TitlePanel = new JPanel();
    JPanel ButtonPanel = new JPanel();
    JLabel Title = new JLabel("PENALTY SHOOTOUT");
    JButton PlayButton = new JButton("Play");

    Home(){
        this.setTitle("Penalty Shootout");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,500);
        this.setResizable(false);
        this.setLayout(new BorderLayout());
        this.setVisible(true);

        Title.setFont(new Font("SansSerif Bold",Font.BOLD,80));
        Title.setForeground(Color.white);
        Title.setVisible(true);

        PlayButton.addActionListener(e -> startGame());
        PlayButton.setVisible(true);

        TitlePanel.setPreferredSize(new Dimension(1000,300));
        TitlePanel.setBackground(Color.blue);
        TitlePanel.add(Title);

        ButtonPanel.setPreferredSize(new Dimension(1000,200));
        ButtonPanel.setBackground(Color.green);
        ButtonPanel.add(PlayButton);

        this.add(TitlePanel,BorderLayout.NORTH);
        this.add(ButtonPanel,BorderLayout.SOUTH);
    }
    void startGame(){
        // hide title and play button
        Title.setVisible(false);
        PlayButton.setVisible(false);
    }
}
