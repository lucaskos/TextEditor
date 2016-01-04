import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JToolBar;

public class Toolbar extends JToolBar implements ActionListener {
	/*
	 * do poprawki
	 * petla ! albo arraylist
	 */
	private JButton btn_new = new JButton("new");
	private JButton btn_open = new JButton("open");
	private JButton btn_save = new JButton("save");
	private JButton btn_close = new JButton("close");
	
	
	public Toolbar(){
		setFloatable(false);
		setLayout(new FlowLayout());
		add(btn_new);
		add(btn_open);
		add(btn_save);
		add(btn_close);
		btn_new.addActionListener(this);
		btn_open.addActionListener(this);
		btn_save.addActionListener(this);
		btn_close.addActionListener(this);
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		JButton clicked = (JButton) e.getSource();
		
		if(clicked == btn_close){
			System.out.println("exit");
			System.exit(0);
		}
		if(clicked == btn_new){
			System.out.println("new");
		}
		if(clicked == btn_open) {
			System.out.println("open");
		}
		if(clicked == btn_save) {
			System.out.println("saving...");
		}
	}

}
