import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.lang.Math;
/**
 * Write a description of class Level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level extends World
{
    Color color=new Color(0,0,0);
    int average;
   GreenfootImage initial = getBackground();
     GreenfootImage current = getBackground();


    // Color temp =  getBackground().getColorAt(x,y);
    //average=(temp.getRed()+temp.getBlue()+temp.getGreen())/3;
    /**
     * Constructor for objects of class Level.
     * 
     */
    public Level()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }

    public void act()
    {

        MouseInfo my = Greenfoot.getMouseInfo();
        if (my!=null)
        {
            if (Greenfoot.mouseClicked(null))
            {
                if(my.getY()>200)
                {brightness2(my.getY());}
                else
                    brightness(my.getY());
            }
        }
    }
public void test()
{

   setBackground("face.jpg"); 
   repaint();
}
    private void brightness2(int k)
    {
        int i= Math.round(k/200);

        for(int x=0;x<600;x++)
        {
            for(int y=0;y<400;y++)
            {
                for ( int c=0; c<=i; c++)
                {
                    Color col1= initial.getColorAt(x,y);
                    Color col2= col1.darker();
                    current.setColorAt(x,y,col2); 
                    
                }
                //getBackground().setColorAt(x,y,new Color(average,average,average));
            }
        }
        setBackground(current);
    }

    private void brightness(int m)
    {
        int n = Math.round(m/200);

        for (int x=0; x<598; x++)
        {
            for (int y=0; y<398; y++)
            {
                for ( int i=0; i<=n; i++)
                {
                    
                    Color col1= initial.getColorAt(x,y);
                    Color col2= col1.darker();
                    current.setColorAt(x,y,col2); 
                }
                //Color col= image.getColorAt(x,y).brighter();
                //image.setColorAt(x,y,col); 
            }
        }
        setBackground(current);
    }


//     private void temperature( int x, int y, int a)
//     {
//         Color col= image.getColorAt(x,y);
//         int r= col.getRed();
//         int g= col.getGreen();
//         int b= col.getBlue();
//         if(a<=7)
//         {
//             Color col1 = new Color(0,0,b);
//             image.setColorAt(x,y, col1);
//         }
//         if(a>7&&a<16)
//         {
//             Color col1 = new Color(r,0,0);
//             image.setColorAt(x,y, col1);
//         }
//         if(a>=16)
//         {
//             Color col1 = new Color(0,g,0);
//             image.setColorAt(x,y, col1);
//         }
// 
//         // image.setColorAt(x,y, col1());
//     }

//     public void temperatureall(int a)
//     {
//         for (int x=0; x<598; x++)
//         {
//             for (int y=0; y<398; y++)
//             { temperature(x,y,a);
// 
//             }
//         }
//     }

}
