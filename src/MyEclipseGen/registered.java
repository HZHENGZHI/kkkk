/*
 * registered.java
 *
 * Created on __DATE__, __TIME__
 */

package MyEclipseGen;

import java.io.IOException;

import javax.swing.*;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;
import org.jb2011.lnf.beautyeye.ch3_button.BEButtonUI;

import server.Client;

/**
 *
 * @author  __USER__
 */
public class registered extends javax.swing.JFrame {

	/** Creates new form registered */
	public registered() {
		initComponents();
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		jLabel12 = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();
		jLabel14 = new javax.swing.JLabel();
		jLabel15 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jLabel16 = new javax.swing.JLabel();



		jPanel1.setBackground(new java.awt.Color(246, 198, 198));

		username.setText(" ");

		jLabel1.setIcon(new ImageIcon("src/icon/icons8-person-16.png")); // NOI18N
		jLabel1.setText("\u7528\u6237\u540d");

		jLabel2.setIcon(new ImageIcon("src/icon/icons8-password-16.png")); // NOI18N
		jLabel2.setText("\u5bc6\u7801");

		jLabel3.setIcon(new ImageIcon("src/icon/icons8-password-16.png")); // NOI18N
		jLabel3.setText("\u786e\u8ba4\u5bc6\u7801");

		jLabel4.setIcon(new ImageIcon("src/icon/icons8-flag-filled-16.png")); // NOI18N
		jLabel4.setText("\u56fd\u7c4d");

		jLabel5.setIcon(new ImageIcon("src/icon/icons8-gender-16.png")); // NOI18N
		jLabel5.setText("\u6027\u522b");

		jLabel6.setIcon(new ImageIcon("src/icon/icons8-birthday-16.png")); // NOI18N
		jLabel6.setText("\u751f\u65e5");

		jLabel7.setIcon(new ImageIcon("src/icon/icons8-location-16.png")); // NOI18N
		jLabel7.setText("\u51fa\u751f\u5730");

		jLabel8.setIcon(new ImageIcon("src/icon/icons8-phone-16.png")); // NOI18N
		jLabel8.setText("\u624b\u673a\u53f7");

		jLabel9.setIcon(new ImageIcon("src/icon/icons8-email-16.png")); // NOI18N
		jLabel9.setText("Email");

		jLabel10.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14));
		jLabel10.setText("\u7528\u6237\u4fe1\u606f");

		jLabel11.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14));
		jLabel11.setText("\u8bc1\u4ef6\u4fe1\u606f");

		jLabel13.setIcon(new ImageIcon("src/icon/icons8-id-verified-16.png")); // NOI18N
		jLabel13.setText("\u8bc1\u4ef6\u7c7b\u578b");

		jLabel14.setIcon(new ImageIcon("src/icon/icons8-token-card-code-16.png")); // NOI18N
		jLabel14.setText("\u8bc1\u4ef6\u53f7\u7801");

		jLabel15.setIcon(new ImageIcon("src/icon/icons8-calendar-28-16.png")); // NOI18N
		jLabel15.setText("\u6709\u6548\u65e5\u671f");

		jButton1.setBackground(new java.awt.Color(245, 168, 168));
		jButton1.setText("\u6ce8\u518c");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jLabel16.setIcon(new ImageIcon("src/icon/icons8-name-16.png")); // NOI18N
		jLabel16.setText("\u771f\u5b9e\u59d3\u540d");

		F.setBackground(new java.awt.Color(246, 198, 198));
		F.setText("\u7537");

		M.setBackground(new java.awt.Color(246, 198, 198));
		M.setText("\u5973");

		ID_TYPE.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"中国居民身份证", "港澳居民来往内地通行证", "台湾居民来往大陆通行证", "护照" }));

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				35,
																				35,
																				35)
																		.addComponent(
																				jLabel10))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addGap(
																												28,
																												28,
																												28)
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.TRAILING)
																														.addComponent(
																																jLabel14)
																														.addComponent(
																																jLabel13)
																														.addComponent(
																																jLabel15)
																														.addGroup(
																																jPanel1Layout
																																		.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.LEADING)
																																		.addComponent(
																																				jLabel16)
																																		.addComponent(
																																				jLabel11))))
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addGap(
																												20,
																												20,
																												20)
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.TRAILING)
																														.addComponent(
																																jLabel6)
																														.addComponent(
																																jLabel2)
																														.addComponent(
																																jLabel4)
																														.addComponent(
																																jLabel3)
																														.addComponent(
																																jLabel5)
																														.addComponent(
																																jLabel1)
																														.addComponent(
																																jLabel7)
																														.addGroup(
																																jPanel1Layout
																																		.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.LEADING)
																																		.addComponent(
																																				jLabel12)
																																		.addGroup(
																																				jPanel1Layout
																																						.createParallelGroup(
																																								javax.swing.GroupLayout.Alignment.TRAILING)
																																						.addComponent(
																																								jLabel9)
																																						.addComponent(
																																								jLabel8))))))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								ID_TYPE,
																								0,
																								202,
																								Short.MAX_VALUE)
																						.addComponent(
																								id_number,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								202,
																								Short.MAX_VALUE)
																						.addComponent(
																								effice_date,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								202,
																								Short.MAX_VALUE)
																						.addComponent(
																								read_name,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								202,
																								Short.MAX_VALUE)
																						.addGroup(
																								jPanel1Layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING,
																												false)
																										.addComponent(
																												passwword1)
																										.addComponent(
																												password2)
																										.addGroup(
																												jPanel1Layout
																														.createSequentialGroup()
																														.addPreferredGap(
																																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																														.addGroup(
																																jPanel1Layout
																																		.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.LEADING)
																																		.addComponent(
																																				nationlity,
																																				javax.swing.GroupLayout.DEFAULT_SIZE,
																																				192,
																																				Short.MAX_VALUE)
																																		.addComponent(
																																				birthday,
																																				javax.swing.GroupLayout.DEFAULT_SIZE,
																																				192,
																																				Short.MAX_VALUE)
																																		.addComponent(
																																				bronlocat,
																																				javax.swing.GroupLayout.DEFAULT_SIZE,
																																				192,
																																				Short.MAX_VALUE)
																																		.addComponent(
																																				phone_number,
																																				javax.swing.GroupLayout.DEFAULT_SIZE,
																																				192,
																																				Short.MAX_VALUE)
																																		.addComponent(
																																				Email,
																																				javax.swing.GroupLayout.DEFAULT_SIZE,
																																				192,
																																				Short.MAX_VALUE)
																																		.addGroup(
																																				jPanel1Layout
																																						.createSequentialGroup()
																																						.addComponent(
																																								F)
																																						.addGap(
																																								18,
																																								18,
																																								18)
																																						.addComponent(
																																								M))))
																										.addComponent(
																												username)))))
										.addGap(24, 24, 24)).addGroup(
								jPanel1Layout.createSequentialGroup().addGap(
										124, 124, 124).addComponent(jButton1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										103,
										javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(100, Short.MAX_VALUE)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(jLabel10)
										.addGap(23, 23, 23)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																username,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel1))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel2)
														.addComponent(
																passwword1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel3)
														.addComponent(
																password2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel4)
														.addComponent(
																nationlity,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel5)
														.addComponent(F)
														.addComponent(M))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel6)
														.addComponent(
																birthday,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																bronlocat,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel7))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																phone_number,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel8))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																Email,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel9))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel11)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(jLabel12)
														.addGroup(
																jPanel1Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																		.addComponent(
																				read_name,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jLabel16)))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel13)
														.addComponent(
																ID_TYPE,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel14)
														.addComponent(
																id_number,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel15)
														.addComponent(
																effice_date,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												14, Short.MAX_VALUE)
										.addComponent(
												jButton1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												25,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap()));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>
	//GEN-END:initComponents


	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		Client clinent = new Client();
		String user_name = username.getText();
		String pw = passwword1.getText();
		String pw1 = password2.getText();
		String nation = nationlity.getText();
		String birth = birthday.getText();
		String born = bronlocat.getText();
		String phonenumber = phone_number.getText();
		String email = Email.getText();
		String readname = read_name.getText();
		String idtype = (String) ID_TYPE.getSelectedItem();
		String idnumber = id_number.getText();
		String efficedate = effice_date.getText();
		System.out.println(idtype);
		String F1 = F.getText();
		String M1 =M.getText();
		//System.out.println(idtype+M1+F1);
		int num=idnumber.length();
		System.out.println(num);
		if (pw.equals(pw1)&&F.isSelected()==true) {
			try {
				Client.resgin(user_name, pw, readname, nation, F1, birth,
						born, phonenumber, email, idtype, idnumber, efficedate);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			JOptionPane.showMessageDialog(this, "注册成功");
			this.dispose();
			new login().setVisible(true);
		}
		
		if (pw.equals(pw1)&&M.isSelected()==true) {
			try {
				Client.resgin(user_name, pw, readname, nation, M1, birth,
						born, phonenumber, email, idtype, idnumber, efficedate);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			JOptionPane.showMessageDialog(this, "注册成功");
			this.dispose();
			new login().setVisible(true);
		} if(pw.equals(pw1)==false) {
			JOptionPane.showMessageDialog(this, "密码不一致");
		}
		
		
		
		
	}

	private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		new registered().setVisible(true);
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	public static final javax.swing.JTextField Email = new javax.swing.JTextField();
	public static final javax.swing.JRadioButton F = new javax.swing.JRadioButton();
	public static final javax.swing.JComboBox ID_TYPE = new javax.swing.JComboBox();
	public static final javax.swing.JRadioButton M = new javax.swing.JRadioButton();
	public static final javax.swing.JTextField birthday = new javax.swing.JTextField();
	public static final javax.swing.JTextField bronlocat = new javax.swing.JTextField();
	public static final javax.swing.JFormattedTextField effice_date = new javax.swing.JFormattedTextField();
	public static final javax.swing.JTextField id_number = new javax.swing.JTextField();
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	public static final javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
	public static final javax.swing.JTextField nationlity = new javax.swing.JTextField();
	public static final javax.swing.JPasswordField password2 = new javax.swing.JPasswordField();
	public static final javax.swing.JPasswordField passwword1 = new javax.swing.JPasswordField();
	public static final javax.swing.JTextField phone_number = new javax.swing.JTextField();
	public static final javax.swing.JTextField read_name = new javax.swing.JTextField();
	public static final javax.swing.JTextField username = new javax.swing.JTextField();
	// End of variables declaration//GEN-END:variables

}