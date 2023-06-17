import javax.swing.*;

public class GameFrame extends JFrame {


    GameFrame(){

        //Snake Game
        this.add(new GamePanel());
     //  GamePanel Panel = new GamePanel();
       // this.add(Panel);
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        //Restart Snake Game








    }

}
