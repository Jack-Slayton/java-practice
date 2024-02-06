package com.server;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BoxMover extends JPanel {
    private int x = 50;
    private int y = 50;

    public BoxMover() {
        setFocusable(true);
        requestFocusInWindow();
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                switch(keyCode) {
                    case KeyEvent.VK_UP:
                        y -= 10;
                        break;
                    case KeyEvent.VK_DOWN:
                        y += 10;
                        break;
                    case KeyEvent.VK_LEFT:
                        x -= 10;
                        break;
                    case KeyEvent.VK_RIGHT :
                        x += 10;
                        break;
                }
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillRect(x, y, 50, 50);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Box Mover");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BoxMover boxMover = new BoxMover();
        frame.add(boxMover);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
