import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;



public class Game extends JPanel {
    private Window win;
    private ArrayList<Letter> let;
    private String[] letters;
    private Color[] colors;
    private Cities[] cities;
    private Cannon cannon;
    private int x,y;

    public Game(Window w){ // has - a relationship
        win = w;
//        letters = new String[]{"a", "b", "c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
//        colors = new Color[]{Color.BLUE,Color.CYAN,Color.DARK_GRAY,Color.green,Color.magenta,Color.YELLOW, Color.PINK};
        let = new ArrayList<Letter>();
        cities = new Cities[5];
        cannon = new Cannon();
        x = 75;
        y = 550;
        for(int i = 0;i<5;i++){
            cities[i] = new Cities(x,y);
            if(i == 1){
                x+=400;
            }
            else x+=200;
        }

        for(int i =0;i<5;i++){
            let.add(new Letter());
            let.add(new UpsideDown());
            let.add(new FastLetter());
            let.add(new Onomatopoeia());
        }

    }
    public void paint(Graphics g){
//        super.paint(g);
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0,0,win.getWidth(),win.getHeight());
        for(Letter l:let){
            l.paint(g);
        }
        for(Cities c: cities){
            c.paint(g);
        }
        cannon.paint(g);
        for(int i =0;i<let.size();i++){
            if(let.get(i).getyPos()>775){
                let.remove(i);
                int rand = (int) (Math.random()*3)+1;
                if(rand == 1){
                    let.add(new Letter());
                }   if(rand == 2){
                    let.add(new FastLetter());
                }   if(rand == 3){
                    let.add(new UpsideDown());
                }   if(rand == 4){
                    let.add(new Onomatopoeia());
                }
            }
        }
    }
    public void move(){
        for(Letter l:let){
            l.move();
        }


    }
    public void keyPressed(KeyEvent e){
        System.out.println(e.getKeyChar());
        cannon.keyPressed(e, let);
    }

}


