import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TextPanel extends JPanel {
	private JTextArea textArea;
	private static final long serialVersionUID = 1L;

	public TextPanel() {
		textArea = new JTextArea();
		setLayout(new BorderLayout());
		add(textArea, BorderLayout.CENTER);
	}
	
	public void appendText(String text) {
		textArea.append(text);
	}
}

