import java.awt.BorderLayout;
import java.awt.Font;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.BoxLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class guiPanel extends JPanel{
	
	Timer t_segundos;
	TimerTask tarea;
	JLabel labelHoras , lh;
	JLabel labelMinutos, lm;
	JLabel labelSegundos, ls;
	JPanel panel;
	JPanel panel2;
	int horas = 23, minutos = 59, segundos = 55;

	
	public guiPanel () {
		
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		labelHoras    = new JLabel(Integer.toString(horas) + " :");
		labelMinutos  = new JLabel(Integer.toString(minutos) + " :");
		labelSegundos = new JLabel(Integer.toString(segundos));
		
		labelHoras.setFont(new Font("Tahoma", 1, 36));
		labelMinutos.setFont(new Font("Tahoma", 1, 36));
		labelSegundos.setFont(new Font("Tahoma", 1, 36));
		
		
		t_segundos = new Timer();
		tarea = new TimerTask() {
			
			@Override
			public void run() {
				
				segundos++;
				
				
				if(segundos == 60) {
					segundos = 0;
					minutos++;
					System.out.println(minutos);
					labelMinutos.setText(Integer.toString(minutos) + " :");
				}
				
				if(minutos == 60) {
					minutos = 0;
					horas++;
					System.out.println(horas);
					labelMinutos.setText(Integer.toString(minutos) + " :");
					labelHoras.setText(Integer.toString(horas) + " :");
				}
				
				if(horas >23) {
					horas = 0;
					labelHoras.setText(Integer.toString(horas) + " :");
					
				}
				
				labelSegundos.setText(Integer.toString(segundos));
				
				
				
				
			}
		};
		
		t_segundos.schedule(tarea, 10, 1000);
		
		panel = new JPanel();
		lh = new JLabel("H");
		lm = new JLabel("    M");
		ls = new JLabel("    S");
		
		lh.setFont(new Font("Tahoma", 1, 36));
		lm.setFont(new Font("Tahoma", 1, 36));
		ls.setFont(new Font("Tahoma", 1, 36));
		
		
		
		panel.add(lh);
		panel.add(lm);
		panel.add(ls);
		
		
		panel2 = new JPanel();
		panel2.add(labelHoras);
		panel2.add(labelMinutos);
		panel2.add(labelSegundos);
		
		
		add(panel);
		add(panel2);
		
}
}