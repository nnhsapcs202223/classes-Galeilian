
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class DowntownAtNight implements Runnable {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new DowntownAtNight());
    }
    
    private DrawingPanel drawingPanel;

    @Override
    public void run() {
        JFrame frame = new JFrame("Downtown At Night");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        drawingPanel = new DrawingPanel();
        frame.add(drawingPanel, BorderLayout.CENTER);
        
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }
    
    public void repaint() {
        drawingPanel.repaint();
    }
    
    public class DrawingPanel extends JPanel {
        
        private static final long serialVersionUID = 1L;
        
        private final int width, height, margin;
        
        private final Dimension floor;
        private final Dimension window;
        
        private final Random random;

        public DrawingPanel() {
            this.width = 600;
            this.height = 450;
            this.margin = 10;
            this.setBackground(Color.BLACK);
            this.setPreferredSize(new Dimension(width + margin + margin, 
                    height + margin + margin));
            this.addMouseListener(new NewDowntownListener());
            this.random = new Random();
            
            // 12 buildings, 5 windows per building floor, 
            this.floor = new Dimension(50, 25);
            this.window = new Dimension(4, 10);
        }
        
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            
            Color moonColor = new Color(252, 195, 106);
            Color buildingColor = new Color(100, 100, 100);
            Color windowOnColor = new Color(200, 200, 0);
            
            int x = width - margin - margin;
            int y = margin;
            g.setColor(moonColor);
            g.fillOval(x - 100, y - 100, 200, 200);
            
            x = margin;
            
            for (int building = 0; building < 12; building++) {
                int floors = random.nextInt(14) + 2;
                int buildingHeight = floors * floor.height;
                y = height + margin - buildingHeight;
                g.setColor(buildingColor);
                g.fillRect(x, y, floor.width, buildingHeight);
                g.setColor(Color.BLACK);
                g.drawRect(x, y, floor.width, buildingHeight);
                
                y = height + margin;
                for (int level = 0; level < floors; level++) {
                    int xf = x + 5;
                    y -= (window.height + 2);
                    for (int i = 0; i < 5; i++) {
                        boolean isOn = (random.nextInt(4) == 1);
                        if (isOn) {
                            g.setColor(windowOnColor);
                        } else {
                            g.setColor(Color.BLACK);
                        }
                        g.fillRect(xf, y, window.width, window.height);
                        xf += 9;
                    }
                    y -= floor.height - window.height - 2;
                }
                
                x += floor.width;
            }
        }
    }
    
    public class NewDowntownListener extends MouseAdapter {

        @Override
        public void mouseReleased(MouseEvent event) {
            repaint();
        }
        
    }

}