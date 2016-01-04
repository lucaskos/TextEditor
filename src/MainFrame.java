import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;

public class MainFrame extends JFrame{
	
	private TextPanel textPanel;
	private Toolbar toolbar;
	private TextAreaPanel textAreaPanel;
	
	public MainFrame() {
		Image img = new ImageIcon("new_window.png").getImage();
		setIconImage(img);
		setIconImage(Toolkit.getDefaultToolkit().getImage("new_window.png"));
		setIconImage(new ImageIcon("new_window.png").getImage());
		 try
	        {
	        // The read(), static method of ImageIO class
	        // takes InputStream object pointing to the image file
	        setIconImage(ImageIO.read(new FileInputStream("new_window.png")));
	        }catch(Exception e){}
		setLayout(new BorderLayout());
		//setBounds(0, 0, 400, 400);
		setTitle("Simple Text Editor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getScreenSize();
		//setSize(600, 600);
		//setLocation(100, 100);
		
		//setExtendedState(Frame.MAXIMIZED_BOTH);
//		setLocationByPlatform(true);
//		setResizable(true);
		setVisible(true);
		
		//String title = this.getTitle();
		//System.out.println(title);
		
		toolbar = new Toolbar();
		add(toolbar, BorderLayout.NORTH);
		
		textPanel = new TextPanel();
		add(textPanel, BorderLayout.CENTER);
		
		textAreaPanel = new TextAreaPanel();
		add(textAreaPanel, BorderLayout.SOUTH);
		
	}
	public void getScreenSize() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenWidth = screenSize.width;
		int screenHeight = screenSize.height;
		setFrameSize(screenWidth, screenHeight);
	}
	private void setFrameSize(int x, int y) {
		super.setSize(x/2, y/2);
		
		//System.out.println(x + " " + y);
	}
}
