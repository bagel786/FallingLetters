import java.awt.*;

public class Letter {
    final int SIZE = 25;
    // letter has a font
    private Font font;
    private Color color;
    private int yVel;
    private int xVel;
    private int xPos, yPos;
    private String let;
    final String[] letters =  new String[]{"a", "b", "c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    final Color[] colors = new Color[]{Color.BLUE,Color.CYAN,Color.DARK_GRAY,Color.green,Color.magenta,Color.YELLOW, Color.PINK};
    final String[] sounds = new String[]{"bing","boom","wham","buzz", "clap","crash","beep","clink"};


    public Letter(){
        font = new Font("Arial", Font.BOLD, (int) (Math.random()*30)+10);
        color = colors[(int) (Math.random()*colors.length)];
        let = letters[(int) (Math.random()*letters.length)];
        xPos = (int) (Math.random()*1000);
        yPos = (int) (Math.random()*300);
        yVel = 4;
        xVel = 0;
    }
    public Letter(int y){
        yVel = y;
        font = new Font("Arial", Font.BOLD, (int) (Math.random()*30)+10);
        color = colors[(int) (Math.random()*colors.length)];
        let = letters[(int) (Math.random()*letters.length)];
        xPos = (int) (Math.random()*1000);
        yPos = (int) (Math.random()*300);
        xVel = 0;
    }
    public Letter(String s, int z){
        let = sounds[z].toUpperCase()+"!!!!";
        yVel = 4;
        font = new Font("Arial", Font.BOLD, (int) (Math.random()*30)+10);
        color = colors[(int) (Math.random()*colors.length)];
        xPos = (int) (Math.random()*1000);
        yPos = (int) (Math.random()*300);
        xVel = 0;

    }
    public Letter(int s, String l){
        font = new Font("Arial", Font.BOLD, s);
        color = colors[(int) (Math.random()*colors.length)];
        let = letters[(int) (Math.random()*letters.length)];
        xPos = (int) (Math.random()*1000);
        yPos = (int) (Math.random()*300);
        yVel = 4;
        xVel = 0;

    }
    public void paint(Graphics g){
        g.setColor(color);
        g.setFont(font);
        g.drawString(let, xPos,yPos);
    }
    public void move(){
        xPos +=xVel;
        yPos+=yVel;
    }
    public int getxPos(){
        return xPos;
    }
    public int getyPos(){
        return yPos;
    }
    public String getLetter(){
        return let;
    }
}
