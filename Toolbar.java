import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JButton helloBtn;
	private JButton eloBtn;
	private StringListener textListener;
	
	public Toolbar() {
		helloBtn = new JButton("elo");
		eloBtn = new JButton("yo");
		
		helloBtn.addActionListener(this);
		eloBtn.addActionListener(this);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(helloBtn);
		add(eloBtn);
	}
	
	public void setStringListener(StringListener listener) {
		this.textListener = listener;
	}
	
	public void actionPerformed(ActionEvent e) {
		JButton clicked = (JButton)e.getSource();
		
		if(clicked == helloBtn) {
			if(textListener != null) {
				textListener.textEmmited("elo");
			}
		}
		else if (clicked == eloBtn) {
			if(textListener != null) {
				textListener.textEmmited("yo");
			}
		}
	}
}

