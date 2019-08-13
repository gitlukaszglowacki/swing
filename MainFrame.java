import java.awt.BorderLayout;
import javax.swing.JFrame;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private Toolbar toolbar;
	private TextPanel textPanel;
	private FormPanel formPanel;

	public MainFrame() {
		super("Swing");
		toolbar = new Toolbar();
		textPanel = new TextPanel();
		formPanel = new FormPanel();

		toolbar.setStringListener(new StringListener() {
			public void textEmmited(String text) {
				textPanel.appendText(text);
			}
		});
		
		add(toolbar, BorderLayout.NORTH);
		add(textPanel, BorderLayout.CENTER);
		add(formPanel, BorderLayout.WEST);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 500);
		setVisible(true);
	}
}

