import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextAreaPanel extends JPanel {
	private JTextField searchText;
	private JButton searchBtn;
	
	public TextAreaPanel() {
		setSize(100, 100);
		
		searchText = new JTextField(20);
		searchText.setEditable(true);
		searchBtn = new JButton("Search");
		
		setLayout(new FlowLayout());
		setVisible(true);
		
		
		add(searchBtn, FlowLayout.LEFT);
		add(searchText, FlowLayout.LEFT);
		
	}
	   
}
