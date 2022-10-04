import javax.swing.JFrame;

public class TargetViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();  // create frame object
        // set frame attributes
        frame.setSize(1000, 1000);
        frame.setTitle("Targets");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // initialize a TargetComponent() component object
        TargetComponent component = new TargetComponent();
        // add the component to the frame
        frame.add(component);

        frame.setVisible(true);
    }
}