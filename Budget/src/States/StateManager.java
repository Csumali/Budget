package States;

import java.awt.HeadlessException;
//import java.awt.event.ComponentAdapter;
//import java.awt.event.ComponentEvent;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;

public class StateManager extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 977693761657240777L;
	protected JLayeredPane pane;
	protected State mainScreen;
	protected State loginPage;

	public StateManager() throws HeadlessException {
		super("BudGET");
		State.sm = this;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pane = getLayeredPane();
		loginPage = new LoginPage();
		settings();
		add(loginPage);
	}

	protected void initMain() {
		mainScreen = new Main();
	}
	
	private void settings() {

		setSize(1280, 720);
		setVisible(true);
	}
	
	
// Main runnable program, creates a State Manager
	public static void main(String[] args) {
		StateManager sm = new StateManager();
	}
}