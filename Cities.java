import java.awt.*;

public class Cities {
    private Color color;
    private int x,y;
    public Cities(int xPos, int yPos){
        color = Color.DARK_GRAY;
        x = xPos;
        y = yPos;
    }
    public void paint(Graphics g){
        g.setColor(color);
//        int x = 75;
//        int y = 550;
//        for(int i = 0;i<5;i++){
//            g.fillRect(x,y,100,225);
//            x+=200;
//        }
        g.fillRect(x,y,100,225);
        g.setColor(Color.YELLOW);
        g.fillRect(x+10,y+10,25,25);
        g.fillRect(x+65,y+10,25,25);
        g.fillRect(x+10,y+65,25,25);
        g.fillRect(x+65,y+65,25,25);
        g.fillRect(x+65,y+120,25,25);
        g.fillRect(x+10,y+120,25,25);
        g.fillRect(x+10,y+175,25,25);
        g.fillRect(x+65,y+175,25,25);

    }



}
