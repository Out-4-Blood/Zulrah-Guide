import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;
import javax.swing.border.Border;
import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

public class Zulrah extends JFrame implements NativeKeyListener {
    Container pane = getContentPane();
    MouseListener[] mouseListeners = pane.getMouseListeners();
    Border rd = BorderFactory.createLineBorder(Color.lightGray);
    JLabel zero,one,two,three,four,five,six,seven,eight,nine,ten;
    int shade;
    
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(GlobalScreen.class.getPackage().getName());
        logger.setLevel(Level.OFF);
        Zulrah gst = new Zulrah();
        try {
            GlobalScreen.registerNativeHook();
        }
        catch (NativeHookException ex) {
            System.err.println("There was a problem registering the native hook.");
            System.err.println(ex.getMessage());

            System.exit(1);
        }

        GlobalScreen.addNativeKeyListener(gst);
        gst.Grid1();
        
    }
    public void Grid1()
    {
        pane.setLayout(new GridLayout(0, 1));
        pane.setBackground(Color.WHITE);
        this.setTitle("Zulrah Guide");
        this.setAlwaysOnTop(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon icon = new ImageIcon("pics/start.png");
        zero = new JLabel(icon);
        zero.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent me) {
                    Remove();
                    Grid2();
            }
        });
        pane.add(zero);
        this.pack();
        this.setVisible(true);
    }
    public void Grid2()
    {
        pane.setLayout(new GridLayout(2, 3));
        this.setTitle("Start Pattern");
        zero = new JLabel("");
        zero.setBackground(Color.lightGray);
        zero.setOpaque(true);
        pane.add(zero);
        
        ImageIcon icon = new ImageIcon("pics/zul-all-1.png");
        one = new JLabel(icon);
        LabelSet(one , 1);
        one.setBackground(Color.lightGray);
        one.setOpaque(true);
        pane.add(one);
        
        JLabel two = new JLabel("");
        two.setBackground(Color.lightGray);
        two.setOpaque(true);
        pane.add(two);
        
        ImageIcon icon3 = new ImageIcon("pics/zul-oneandtwo-2.png");
        three = new JLabel(icon3);
        LabelSet(three , 2);
        three.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent me) {
                if(me.getButton() == MouseEvent.BUTTON1)
                {
                    Remove();
                    Grid3();
                }
            }
        });
        pane.add(three);
        ImageIcon icon4 = new ImageIcon("pics/zul-three-2.png");
        four = new JLabel(icon4);
        LabelSet(four , 2);
        four.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent me) {
                if(me.getButton() == MouseEvent.BUTTON1)
                {
                    Remove();
                    Grid6();
                }
            }
        });
        pane.add(four);
        ImageIcon icon5 = new ImageIcon("pics/zul-four-2.png");
        five = new JLabel(icon5);
        LabelSet(five , 2);
        five.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent me) {
                if(me.getButton() == MouseEvent.BUTTON1)
                {
                    Remove();
                    Grid7();
                }
            }
        });
        pane.add(five);
        
        this.pack();
        this.setVisible(true);
    }
    public void Grid3()
    {
        pane.setLayout(new GridLayout(0, 3));
        this.setTitle("Pattern One or Two");
        ImageIcon icon = new ImageIcon("pics/zul-oneandtwo-3.png");
        zero = new JLabel(icon);
        LabelSet(zero , 3);
        zero.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent me) {
                if(me.getButton() == MouseEvent.BUTTON3)
                {
                    Remove();
                    Grid2();
                }
            }
        });
        zero.setBackground(Color.lightGray);
        zero.setOpaque(true);
        pane.add(zero);
        
        ImageIcon icon1 = new ImageIcon("pics/zul-one-4.png");
        one = new JLabel(icon1);
        LabelSet(one , 4);
        one.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent me) {
                if(me.getButton() == MouseEvent.BUTTON3)
                {
                    Remove();
                    Grid2();
                }
                if(me.getButton() == MouseEvent.BUTTON1)
                {
                    Remove();
                    Grid4();
                }
            }
        });
        pane.add(one);
        ImageIcon icon2 = new ImageIcon("pics/zul-two-4.png");
        two = new JLabel(icon2);
        LabelSet(two , 4);
        two.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent me) {
                if(me.getButton() == MouseEvent.BUTTON3)
                {
                    Remove();
                    Grid2();
                }
                if(me.getButton() == MouseEvent.BUTTON1)
                {
                    Remove();
                    Grid5();
                }
            }
        });
        pane.add(two);
        
        this.pack();
        this.setVisible(true);
    }
    public void Grid4()
    {
    	shade = 0;
        pane.setLayout(new GridLayout(2, 3));
        this.setTitle("Pattern One");
        ImageIcon icon = new ImageIcon("pics/zul-one-5.png");
        zero = new JLabel(icon);
        LabelSet(zero , 5);
        zero.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent me) {
                if(me.getButton() == MouseEvent.BUTTON3)
                {
                    Remove();
                    Grid2();
                }
                if(me.getButton() == MouseEvent.BUTTON1)
                {
                    zero.setBackground(Color.lightGray);
                    zero.setOpaque(true);
                    pane.repaint();
                }
            }        });
        pane.add(zero);
        ImageIcon icon1 = new ImageIcon("pics/zul-one-6.png");
        one = new JLabel(icon1);
        LabelSet(one , 6);
        one.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent me) {
                if(me.getButton() == MouseEvent.BUTTON3)
                {
                    Remove();
                    Grid2();
                }
                if(me.getButton() == MouseEvent.BUTTON1)
                {
                    one.setBackground(Color.lightGray);
                    one.setOpaque(true);
                    pane.repaint();
                }
            }        });
        pane.add(one);
        ImageIcon icon2 = new ImageIcon("pics/zul-one-7.png");
        two = new JLabel(icon2);
        LabelSet(two , 7);
        two.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent me) {
                if(me.getButton() == MouseEvent.BUTTON3)
                {
                    Remove();
                    Grid2();
                }
                if(me.getButton() == MouseEvent.BUTTON1)
                {
                    two.setBackground(Color.lightGray);
                    two.setOpaque(true);
                    pane.repaint();
                }
            }        });
        pane.add(two);
        ImageIcon icon3 = new ImageIcon("pics/zul-one-8.png");
        three = new JLabel(icon3);
        LabelSet(three , 8);
        three.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent me) {
                if(me.getButton() == MouseEvent.BUTTON3)
                {
                    Remove();
                    Grid2();
                }
                if(me.getButton() == MouseEvent.BUTTON1)
                {
                    three.setBackground(Color.lightGray);
                    three.setOpaque(true);
                    pane.repaint();
                }
            }        });
        pane.add(three);
        ImageIcon icon4 = new ImageIcon("pics/zul-one-9.png");
        four = new JLabel(icon4);
        LabelSet(four, 9);
        four.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent me) {
                if(me.getButton() == MouseEvent.BUTTON3)
                {
                    Remove();
                    Grid2();
                }
                if(me.getButton() == MouseEvent.BUTTON1)
                {
                    four.setBackground(Color.lightGray);
                    four.setOpaque(true);
                    pane.repaint();
                }
            }        });
        pane.add(four);
        ImageIcon icon5 = new ImageIcon("pics/zul-oneandtwo-4.png");
        five = new JLabel(icon5);
        LabelSet(five , 10);
        five.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent me) {
                if(me.getButton() == MouseEvent.BUTTON3)
                {
                    Remove();
                    Grid2();
                }
                if(me.getButton() == MouseEvent.BUTTON1)
                {
                    five.setBackground(Color.lightGray);
                    five.setOpaque(true);
                    pane.repaint();
                }
            }        });
        pane.add(five);
        
        this.pack();
        this.setVisible(true);
    }
    public void Grid5()
    { 
    	shade = 0;
        pane.setLayout(new GridLayout(3, 3));
        this.setTitle("Pattern Two");
        ImageIcon icon = new ImageIcon("pics/zul-two-5.png");
        zero = new JLabel(icon);
        LabelSet(zero , 5);
        zero.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent me) {
                if(me.getButton() == MouseEvent.BUTTON3)
                {
                    Remove();
                    Grid2();
                }
                if(me.getButton() == MouseEvent.BUTTON1)
                {
                    zero.setBackground(Color.lightGray);
                    zero.setOpaque(true);
                    pane.repaint();
                }
            }        });
        pane.add(zero);
        ImageIcon icon1 = new ImageIcon("pics/zul-two-6.png");
        one = new JLabel(icon1);
        LabelSet(one , 6);
        one.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent me) {
                if(me.getButton() == MouseEvent.BUTTON3)
                {
                    Remove();
                    Grid2();
                }
                if(me.getButton() == MouseEvent.BUTTON1)
                {
                    one.setBackground(Color.lightGray);
                    one.setOpaque(true);
                    pane.repaint();
                }
            }        });
        pane.add(one);
        ImageIcon icon2 = new ImageIcon("pics/zul-two-7.png");
        two = new JLabel(icon2);
        LabelSet(two , 7);
        two.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent me) {
                if(me.getButton() == MouseEvent.BUTTON3)
                {
                    Remove();
                    Grid2();
                }
                if(me.getButton() == MouseEvent.BUTTON1)
                {
                    two.setBackground(Color.lightGray);
                    two.setOpaque(true);
                    pane.repaint();
                }
            }        });
        pane.add(two);
        ImageIcon icon3 = new ImageIcon("pics/zul-two-8.png");
        three = new JLabel(icon3);
        LabelSet(three , 8);
        three.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent me) {
                if(me.getButton() == MouseEvent.BUTTON3)
                {
                    Remove();
                    Grid2();
                }
                if(me.getButton() == MouseEvent.BUTTON1)
                {
                    three.setBackground(Color.lightGray);
                    three.setOpaque(true);
                    pane.repaint();
                }
            }        });
        pane.add(three);
        ImageIcon icon4 = new ImageIcon("pics/zul-two-9.png");
        four = new JLabel(icon4);
        LabelSet(four , 9);
        four.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent me) {
                if(me.getButton() == MouseEvent.BUTTON3)
                {
                    Remove();
                    Grid2();
                }
                if(me.getButton() == MouseEvent.BUTTON1)
                {
                    four.setBackground(Color.lightGray);
                    four.setOpaque(true);
                    pane.repaint();
                }
            }        });
        pane.add(four);
        ImageIcon icon5 = new ImageIcon("pics/zul-two-10.png");
        five = new JLabel(icon5);
        LabelSet(five, 10);
        five.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent me) {
                if(me.getButton() == MouseEvent.BUTTON3)
                {
                    Remove();
                    Grid2();
                }
                if(me.getButton() == MouseEvent.BUTTON1)
                {
                    five.setBackground(Color.lightGray);
                    five.setOpaque(true);
                    pane.repaint();
                }
            }
        });
        pane.add(five);
        ImageIcon icon6 = new ImageIcon("pics/zul-oneandtwo-4.png");
        six = new JLabel(icon6);
        LabelSet(six, 11);
        six.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent me) {
                if(me.getButton() == MouseEvent.BUTTON3)
                {
                    Remove();
                    Grid2();
                }
                if(me.getButton() == MouseEvent.BUTTON1)
                {
                    six.setBackground(Color.lightGray);
                    six.setOpaque(true);
                    pane.repaint();
                }
            }        });
        pane.add(six);
        
        this.pack();
        this.setVisible(true);
    }
    public void Grid6()
    {
    	shade = 0;
        pane.setLayout(new GridLayout(3, 3));
        this.setTitle("Pattern Three");
        ImageIcon icon = new ImageIcon("pics/zul-three-3.png");
        zero = new JLabel(icon);
        LabelSet(zero, 3);
        zero.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent me) {
                if(me.getButton() == MouseEvent.BUTTON3)
                {
                    Remove();
                    Grid2();
                }
                if(me.getButton() == MouseEvent.BUTTON1)
                {
                    zero.setBackground(Color.lightGray);
                    zero.setOpaque(true);
                    pane.repaint();
                }
            }
        });
        pane.add(zero);
        ImageIcon icon1 = new ImageIcon("pics/zul-three-4.png");
        one = new JLabel(icon1);
        LabelSet(one, 4);
        one.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent me) {
                if(me.getButton() == MouseEvent.BUTTON3)
                {
                    Remove();
                    Grid2();
                }
                if(me.getButton() == MouseEvent.BUTTON1)
                {
                    one.setBackground(Color.lightGray);
                    one.setOpaque(true);
                    pane.repaint();
                }
            }
        });
        pane.add(one);
        ImageIcon icon2 = new ImageIcon("pics/zul-three-5.png");
        two = new JLabel(icon2);
        LabelSet(two, 5);
        two.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent me) {
                if(me.getButton() == MouseEvent.BUTTON3)
                {
                    Remove();
                    Grid2();
                }
                if(me.getButton() == MouseEvent.BUTTON1)
                {
                    two.setBackground(Color.lightGray);
                    two.setOpaque(true);
                    pane.repaint();
                }
            }        });
        pane.add(two);
        ImageIcon icon3 = new ImageIcon("pics/zul-three-6.png");
        three = new JLabel(icon3);
        LabelSet(three, 6);
        three.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent me) {
                if(me.getButton() == MouseEvent.BUTTON3)
                {
                    Remove();
                    Grid2();
                }
                if(me.getButton() == MouseEvent.BUTTON1)
                {
                    three.setBackground(Color.lightGray);
                    three.setOpaque(true);
                    pane.repaint();
                }
            }        });
        pane.add(three);
        ImageIcon icon4 = new ImageIcon("pics/zul-three-7.png");
        four = new JLabel(icon4);
        LabelSet(four, 7);
        four.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent me) {
                if(me.getButton() == MouseEvent.BUTTON3)
                {
                    Remove();
                    Grid2();
                }
                if(me.getButton() == MouseEvent.BUTTON1)
                {
                    four.setBackground(Color.lightGray);
                    four.setOpaque(true);
                    pane.repaint();
                }
            }        });
        pane.add(four);
        ImageIcon icon5 = new ImageIcon("pics/zul-three-8.png");
        five = new JLabel(icon5);
        LabelSet(five, 8);
        five.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent me) {
                if(me.getButton() == MouseEvent.BUTTON3)
                {
                    Remove();
                    Grid2();
                }
                if(me.getButton() == MouseEvent.BUTTON1)
                {
                    five.setBackground(Color.lightGray);
                    five.setOpaque(true);
                    pane.repaint();
                }
            }        });
        pane.add(five);
        ImageIcon icon6 = new ImageIcon("pics/zul-threeandfour-1.png");
        six = new JLabel(icon6);
        LabelSet(six, 9);
        six.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent me) {
                if(me.getButton() == MouseEvent.BUTTON3)
                {
                    Remove();
                    Grid2();
                }
                if(me.getButton() == MouseEvent.BUTTON1)
                {
                    six.setBackground(Color.lightGray);
                    six.setOpaque(true);
                    pane.repaint();
                }
            }        });
        pane.add(six);
        ImageIcon icon7 = new ImageIcon("pics/zul-threeandfour-2.png");
        seven = new JLabel(icon7);
        LabelSet(seven, 10);
        seven.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent me) {
                if(me.getButton() == MouseEvent.BUTTON3)
                {
                    Remove();
                    Grid2();
                }
                if(me.getButton() == MouseEvent.BUTTON1)
                {
                    seven.setBackground(Color.lightGray);
                    seven.setOpaque(true);
                    pane.repaint();
                }
            }        });
        pane.add(seven);
        ImageIcon icon8 = new ImageIcon("pics/zul-threeandfour-3.png");
        eight = new JLabel(icon8);
        LabelSet(eight, 11);
        eight.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent me) {
                if(me.getButton() == MouseEvent.BUTTON3)
                {
                    Remove();
                    Grid2();
                }
                if(me.getButton() == MouseEvent.BUTTON1)
                {
                    eight.setBackground(Color.lightGray);
                    eight.setOpaque(true);
                    pane.repaint();
                }
            }        });
        pane.add(eight);
        
        this.pack();
        this.setVisible(true);
    }
    public void Grid7()
    {
    	shade = 1;
        pane.setLayout(new GridLayout(4, 3));
        this.setTitle("Pattern Four");
        ImageIcon icon1 = new ImageIcon("pics/zul-four-4.png");
        one = new JLabel(icon1);
        LabelSet(one, 3);
        one.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent me) {
                if(me.getButton() == MouseEvent.BUTTON3)
                {
                    Remove();
                    Grid2();
                }
                if(me.getButton() == MouseEvent.BUTTON1)
                {
                    one.setBackground(Color.lightGray);
                    one.setOpaque(true);
                    pane.repaint();
                }
            }        });
        pane.add(one);
        ImageIcon icon2 = new ImageIcon("pics/zul-four-5.png");
        two = new JLabel(icon2);
        LabelSet(two, 4);
        two.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent me) {
                if(me.getButton() == MouseEvent.BUTTON3)
                {
                    Remove();
                    Grid2();
                }
                if(me.getButton() == MouseEvent.BUTTON1)
                {
                    two.setBackground(Color.lightGray);
                    two.setOpaque(true);
                    pane.repaint();
                }
            }        });
        pane.add(two);
        ImageIcon icon3 = new ImageIcon("pics/zul-four-6.png");
        three = new JLabel(icon3);
        LabelSet(three, 5);
        three.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent me) {
                if(me.getButton() == MouseEvent.BUTTON3)
                {
                    Remove();
                    Grid2();
                }
                if(me.getButton() == MouseEvent.BUTTON1)
                {
                    three.setBackground(Color.lightGray);
                    three.setOpaque(true);
                    pane.repaint();
                }
            }        });
        pane.add(three);
        ImageIcon icon4 = new ImageIcon("pics/zul-four-7.png");
        four = new JLabel(icon4);
        LabelSet(four, 6);
        four.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent me) {
                if(me.getButton() == MouseEvent.BUTTON3)
                {
                    Remove();
                    Grid2();
                }
                if(me.getButton() == MouseEvent.BUTTON1)
                {
                    four.setBackground(Color.lightGray);
                    four.setOpaque(true);
                    pane.repaint();
                }
            }        });
        pane.add(four);
        ImageIcon icon5 = new ImageIcon("pics/zul-four-8.png");
        five = new JLabel(icon5);
        LabelSet(five, 7);
        five.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent me) {
                if(me.getButton() == MouseEvent.BUTTON3)
                {
                    Remove();
                    Grid2();
                }
                if(me.getButton() == MouseEvent.BUTTON1)
                {
                    five.setBackground(Color.lightGray);
                    five.setOpaque(true);
                    pane.repaint();
                }
            }        });
        pane.add(five);
        ImageIcon icon6 = new ImageIcon("pics/zul-four-9.png");
        six = new JLabel(icon6);
        LabelSet(six, 8);
        six.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent me) {
                if(me.getButton() == MouseEvent.BUTTON3)
                {
                    Remove();
                    Grid2();
                }
                if(me.getButton() == MouseEvent.BUTTON1)
                {
                    six.setBackground(Color.lightGray);
                    six.setOpaque(true);
                    pane.repaint();
                }
            }        });
        pane.add(six);
        ImageIcon icon7 = new ImageIcon("pics/zul-four-10.png");
        seven = new JLabel(icon7);
        LabelSet(seven, 9);
        seven.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent me) {
                if(me.getButton() == MouseEvent.BUTTON3)
                {
                    Remove();
                    Grid2();
                }
                if(me.getButton() == MouseEvent.BUTTON1)
                {
                    seven.setBackground(Color.lightGray);
                    seven.setOpaque(true);
                    pane.repaint();
                }
            }        });
        pane.add(seven);
        ImageIcon icon8 = new ImageIcon("pics/zul-threeandfour-1.png");
        eight = new JLabel(icon8);
        LabelSet(eight, 10);
        eight.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent me) {
                if(me.getButton() == MouseEvent.BUTTON3)
                {
                    Remove();
                    Grid2();
                }
                if(me.getButton() == MouseEvent.BUTTON1)
                {
                    eight.setBackground(Color.lightGray);
                    eight.setOpaque(true);
                    pane.repaint();
                }
            }        });
        pane.add(eight);
        ImageIcon icon9 = new ImageIcon("pics/zul-threeandfour-2.png");
        nine = new JLabel(icon9);
        LabelSet(nine, 11);
        nine.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent me) {
                if(me.getButton() == MouseEvent.BUTTON3)
                {
                    Remove();
                    Grid2();
                }
                if(me.getButton() == MouseEvent.BUTTON1)
                {
                    nine.setBackground(Color.lightGray);
                    nine.setOpaque(true);
                    pane.repaint();
                }
            }        });
        pane.add(nine);
        ImageIcon icon10 = new ImageIcon("pics/zul-threeandfour-3.png");
        ten = new JLabel(icon10);
        LabelSet(ten, 12);
        ten.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent me) {
                if(me.getButton() == MouseEvent.BUTTON3)
                {
                    Remove();
                    Grid2();
                }
                if(me.getButton() == MouseEvent.BUTTON1)
                {
                    ten.setBackground(Color.lightGray);
                    ten.setOpaque(true);
                    ten.repaint();
                }
            }
        });
        pane.add(ten);
        
        this.pack();
        this.setVisible(true);
    }
    public void Remove()
    {
    	for (MouseListener mouseListener : mouseListeners) {
            pane.removeMouseListener(mouseListener);
        }
        pane.removeAll();
    }
    public void LabelSet(JLabel ref, int id)
    {
        ref.setText("  " + id);
        ref.setHorizontalTextPosition(JLabel.LEFT);
        ref.setVerticalTextPosition(JLabel.TOP);
        ref.setBorder(rd);
    }
    public void Shade()
	{
		if (shade == 0)
		{
			zero.setBackground(Color.lightGray);
            zero.setOpaque(true);
            pane.repaint();
            shade++;
            return;
		}
		if (shade == 1)
		{
			one.setBackground(Color.lightGray);
            one.setOpaque(true);
            pane.repaint();
            shade++;
            return;
		}
		if (shade == 2)
		{
			two.setBackground(Color.lightGray);
            two.setOpaque(true);
            pane.repaint();
            shade++;
            return;
		}
		if (shade == 3)
		{
			three.setBackground(Color.lightGray);
            three.setOpaque(true);
            pane.repaint();
            shade++;
            return;
		}
		if (shade == 4)
		{
			four.setBackground(Color.lightGray);
            four.setOpaque(true);
            pane.repaint();
            shade++;
            return;
		}
		if (shade == 5)
		{
			five.setBackground(Color.lightGray);
            five.setOpaque(true);
            pane.repaint();
            shade++;
            return;
		}
		if (shade == 6)
		{
			six.setBackground(Color.lightGray);
            six.setOpaque(true);
            pane.repaint();
            shade++;
            return;
		}
		if (shade == 7)
		{
			seven.setBackground(Color.lightGray);
            seven.setOpaque(true);
            pane.repaint();
            shade++;
            return;
		}
		if (shade == 8)
		{
			eight.setBackground(Color.lightGray);
            eight.setOpaque(true);
            pane.repaint();
            shade++;
            return;
		}
		if (shade == 9)
		{
			nine.setBackground(Color.lightGray);
            nine.setOpaque(true);
            pane.repaint();
            shade++;
            return;
		}
		if (shade == 10)
		{
			ten.setBackground(Color.lightGray);
            ten.setOpaque(true);
            pane.repaint();
            shade++;
            return;
		}
	}
	@Override
	public void nativeKeyTyped(NativeKeyEvent nativeEvent) {
		
		
	}
	@Override
	public void nativeKeyPressed(NativeKeyEvent nativeEvent) {
		if (nativeEvent.getKeyCode() == NativeKeyEvent.VC_1) {
			if (this.getTitle() == "Zulrah Guide")
			{
				Remove();
            	Grid2();
            	return;
			}
			if (this.getTitle() == "Start Pattern")
			{
				Remove();
            	Grid3();
            	return;
			}
			if (this.getTitle() == "Pattern One or Two")
			{
				Remove();
            	Grid4();
            	return;
			}
			if (this.getTitle() == "Pattern One")
			{
				Shade();
                return;
			}
			if (this.getTitle() == "Pattern Two")
			{
				Shade();
                return;
			}
			if (this.getTitle() == "Pattern Three")
			{
				Shade();
                return;
			}
			if (this.getTitle() == "Pattern Four")
			{
				Shade();
                return;
			}
        }
		if (nativeEvent.getKeyCode() == NativeKeyEvent.VC_2) {
			if (this.getTitle() == "Zulrah Guide")
			{
				Remove();
				Grid2();
				return;
			}
			if (this.getTitle() == "Start Pattern")
			{
				Remove();
				Grid6();
				return;
			}
			if (this.getTitle() == "Pattern One or Two")
			{
			Remove();
            Grid5();
			}
        }
		if (nativeEvent.getKeyCode() == NativeKeyEvent.VC_3) {
			if (this.getTitle() == "Zulrah Guide")
			{
				Remove();
				Grid2();
				return;
			}
			if (this.getTitle() == "Start Pattern")
			{
				Remove();
				Grid7();
				return;
			}
        }
		if (nativeEvent.getKeyCode() == NativeKeyEvent.VC_4) {
			Remove();
			Grid2();
        }
	}
	@Override
	public void nativeKeyReleased(NativeKeyEvent nativeEvent) {
		
	}
}
