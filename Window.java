import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Window extends JFrame {
    // extends - inherits from the class after
    // is-a relationship; window is a JFrame
    // all public non constructors can be accessed
    private Game game;
    public Window(){
        setSize(1080,800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        game = new Game(this);
        add(game);
        setVisible(true);
        // add any item above set visible for display when instantiated
        addKeyListener(new KeyListener() { // quick fix adds the required methods

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) { /** this runs when the key e is
             pressed, which is specified in the paramter of keyPrasssed() */
                game.keyPressed(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        setFocusable(true);

        while(true){
            repaint();
            move();
            try{
                Thread.sleep(60);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void paint(Graphics g){
        super.paint(g);
//        game.paint(g);
    }
    public void move(){
        game.move();
    }
}
