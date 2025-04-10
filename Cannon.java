import java.awt.*;
import java.awt.event.KeyEvent;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Cannon {
    private Color color;
    private int x,y;
    private int letterX, letterY;
    private boolean hit;
    public Cannon(){
        color = Color.red;
    }
    public void paint(Graphics g){
        g.setColor(color);
        g.fillPolygon(new int[]{375, 525, 675}, new int[]{775, 530, 775},3);
        drawLaser(g);
    }
    public void drawLaser(Graphics g) {
        if (hit) {
            g.drawLine(525,530, letterX, letterY);
        }
        hit = false;
    }
    public void keyPressed(KeyEvent e, ArrayList<Letter> l){
        System.out.println(e.getKeyChar());

        for(Letter letter: l){
            if(e.getKeyChar() == letter.getLetter().charAt(0)){
                l.remove(letter);
                int rand = (int) (Math.random()*3)+1;
                if(rand == 1){
                    l.add(new Letter());
                }   if(rand == 2){
                    l.add(new FastLetter());
                }   if(rand == 3){
                    l.add(new UpsideDown());
                }   if(rand == 4){
                    l.add(new Onomatopoeia());
                }
                hit = true;
                letterX = letter.getxPos();
                letterY = letter.getyPos();
            }

        }
        if(e.getKeyChar() == '!'){
            for(Letter letter: l){
                if(letter.getLetter().length() >1){
                    l.remove(letter);
                    int rand = (int) (Math.random()*3)+1;
                    if(rand == 1){
                        l.add(new Letter());
                    }   if(rand == 2){
                        l.add(new FastLetter());
                    }   if(rand == 3){
                        l.add(new UpsideDown());
                    }   if(rand == 4){
                        l.add(new Onomatopoeia());
                    }
                    hit = true;
                    letterX = letter.getxPos();
                    letterY = letter.getyPos();
                }
            }
        }
    }
}
