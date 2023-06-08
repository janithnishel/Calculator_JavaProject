package GUI;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.text.StyledEditorKit.FontFamilyAction;

public class operation extends JFrame {

	double f1, f2, sum = 0, mul = 1;
	String val = null;
	int a = 0, b = 0, c = 0, d = 0;

	public operation() {

		try {

			this.setVisible(true);

			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setLocation(500, 125);
			this.setSize(350, 500);
			this.setTitle("Calculator");

			BorderLayout bl = new BorderLayout();

			JPanel pane1 = new JPanel();
			JPanel pane2 = new JPanel();

			add(pane1, BorderLayout.NORTH);
			add(pane2, BorderLayout.CENTER);

			pane1.setBackground(Color.gray);
			pane2.setBackground(Color.yellow);

			TextField tf = new TextField(20);
			tf.setFont(new Font("", 0, 28));

			pane1.add(tf);

			GridLayout g = new GridLayout(4, 4);
			pane2.setLayout(g);

			Button b1 = new Button("1");
			Button b2 = new Button("2");
			Button b3 = new Button("3");
			Button b4 = new Button("4");
			Button b5 = new Button("5");
			Button b6 = new Button("6");
			Button b7 = new Button("7");
			Button b8 = new Button("8");
			Button b9 = new Button("9");
			Button b10 = new Button("0");
			Button b11 = new Button("+");
			Button b12 = new Button("-");
			Button b13 = new Button("*");
			Button b14 = new Button("/");
			Button b15 = new Button("=");
			Button b16 = new Button("C");

			b1.setFont(new Font("", 0, 30));
			b2.setFont(new Font("", 0, 30));
			b3.setFont(new Font("", 0, 30));
			b4.setFont(new Font("", 0, 30));
			b5.setFont(new Font("", 0, 30));
			b6.setFont(new Font("", 0, 30));
			b7.setFont(new Font("", 0, 30));
			b8.setFont(new Font("", 0, 30));
			b9.setFont(new Font("", 0, 30));
			b10.setFont(new Font("", 0, 30));
			b11.setFont(new Font("", 0, 30));
			b12.setFont(new Font("", 0, 30));
			b13.setFont(new Font("", 0, 30));
			b14.setFont(new Font("", 0, 30));
			b15.setFont(new Font("", 0, 30));
			b16.setFont(new Font("", 0, 30));

			pane2.add(b1);
			pane2.add(b2);
			pane2.add(b3);
			pane2.add(b4);
			pane2.add(b5);
			pane2.add(b6);
			pane2.add(b7);
			pane2.add(b8);
			pane2.add(b9);
			pane2.add(b10);
			pane2.add(b11);
			pane2.add(b12);
			pane2.add(b13);
			pane2.add(b14);
			pane2.add(b15);
			pane2.add(b16);
			/*
			 * pane2.add(b10); pane2.add(b11); pane2.add(b12); pane2.add(b13);
			 * pane2.add(b14); pane2.add(b15);
			 */

//            JMenu m = new JMenu();
//            jmb.add(m);
//            m.setLabel("File");
//            m.setLabel("View");
//            pane1.add(jmb);  

			MenuBar mb = new MenuBar();
			this.setMenuBar(mb);

			Menu m1 = new Menu("File");
			Menu m2 = new Menu("Edit");
			Menu m3 = new Menu("View");

			mb.add(m1);
			mb.add(m2);
			mb.add(m3);

			MenuItem mi1 = new MenuItem("New");
			MenuItem mi2 = new MenuItem("Save");

			MenuItem mi3 = new MenuItem("Exit");
			MenuItem mi4 = new MenuItem("Paste");
			MenuItem mi5 = new MenuItem("Show View");

			
			 
			
			m1.add(mi1);
			m1.add(mi2);
			m1.add(mi3);
			m2.add(mi4);
			m3.add(mi5);
           
			Button but = new Button();
			but.setName("Save");
			
            mi2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
					
			JOptionPane.showMessageDialog(rootPane,"Are you sure do you want to save ?");
					
				}
			}); 
			
			
            mi3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JOptionPane.showConfirmDialog(rootPane, "Are you sure want tot exit");				}
			});
			
			
			b1.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub

					String b1 = tf.getText();
					b1 += "1";
					tf.setText(b1);

				}
			});

			b2.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub

					String b2 = tf.getText();
					b2 += "2";
					tf.setText(b2);

				}
			});

			b3.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub

					String b3 = tf.getText();
					b3 += "3";
					tf.setText(b3);
				}
			});

			b4.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub

					String b4 = tf.getText();
					b4 += "4";
					tf.setText(b4);

				}
			});

			b5.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub

					String b5 = tf.getText();
					b5 += "5";
					tf.setText(b5);
				}
			});

			b6.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub

					String b6 = tf.getText();
					b6 += "6";
					tf.setText(b6);
				}
			});

			b7.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub

					String b7 = tf.getText();
					b7 += "7";
					tf.setText(b7);
				}
			});

			b8.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub

					String b8 = tf.getText();
					b8 += "8";
					tf.setText(b8);
				}
			});

			b9.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub

					String b9 = tf.getText();
					b9 += "9";
					tf.setText(b9);
				}
			});

			b10.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub

					String b10 = tf.getText();
					b10 += "0";
					tf.setText(b10);
				}
			});

			b11.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub

					f1 = Double.parseDouble(tf.getText());
					a = a + 1;
					if (b >= 1 || c >= 1 || d >= 1) {
						sum = sum - f1;
						mul = mul * f1;
						mul = (mul / f1);
					} else {
						sum = sum + f1;
					}
					tf.setText("");
					val = "+";
				}
			});

			b12.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub

					f1 = Double.parseDouble(tf.getText());
					b = b + 1;
					if (a >= 1 || c >= 1 || d >= 1) {
						sum = sum + f1;
						mul = mul * f1;
						mul = (mul / f1);
					} else {
						sum = sum - f1;

						if ((sum < 1) && (b >= 1)) {

							sum = 0;
							sum = f1 - sum;

						}
					}
					val = "-";
					tf.setText("");

				}
			});

			b13.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub

					f1 = Double.parseDouble(tf.getText());
					c = c + 1;
					if (a >= 1 || b >= 1 || d >= 1) {

						sum = sum + f1;
						sum = sum - f1;
						mul = (mul / f1);
					} else {
						mul = mul * f1;
					}
					val = "*";
					tf.setText("");
				}
			});

			b14.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub

					f1 = Double.parseDouble(tf.getText());
					d = d + 1;
					if (a >= 1 || b >= 1 || c >= 1) {
						sum = sum + f1;
						sum = sum - f1;
						mul = mul * f1;
					} else {
						mul = (mul / f1);

						if (mul < 1) {

							if (d >= 1) {
								mul = 1;
								mul = (f1 / mul);

								System.out.println("deviton");
							}
						}
					}
					val = "/";
					tf.setText("");
				}
			});

			b15.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub

					f2 = Double.parseDouble(tf.getText());
					double f = cal(sum, f2, mul, val);
					String res = String.valueOf(f);
					tf.setText(res);
					sum = 0;
					val = "";
					mul = 1;

				}
			});

			b16.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub

					tf.setText("");
					f1 = 0;
					f2 = 0;
					val = "";
					sum = 0;
					mul = 1;
					a = 0;
					b = 0;
					c = 0;
					d = 0;
				}
			});

		} catch (

		Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

	public double cal(double f, double s, double mul, String v) {
		double re = 0;

		double f0 = f;
		double s0 = s;
		String valu = v;
		Double mu = mul;

		if (valu == "+") {
			re = (f0 + s0);
		} else if (valu == "-") {
			re = (f0 - s0);

		} else if (valu == "*") {
			re = (mu * s0);
			System.out.println(re);
		} else {

			re = (mu / s0);

		}

		return re;

	}
}
