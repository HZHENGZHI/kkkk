/*
 * serch_ticket_mian_jm.java
 *
 * Created on __DATE__, __TIME__
 */

package MyEclipseGen;

import java.awt.*;
import java.io.IOException;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;
import javax.xml.crypto.Data;

import model.today_train_list;
import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;
import org.jb2011.lnf.beautyeye.ch3_button.BEButtonUI;

import org.jdesktop.swingx.JXDatePicker;
import server.Client;

/**
 *
 * @author  __USER__
 */
public class search_ticket_mian_jm extends javax.swing.JFrame {

	/** Creates new form serch_ticket_mian_jm */
	public search_ticket_mian_jm() {
		initComponents();
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jTextField2 = new javax.swing.JTextField();
		jTextField3 = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		jButton2 = new javax.swing.JButton();
		jButton2.setBackground(new java.awt.Color(252, 225, 225));
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
		jLabel16 = new javax.swing.JLabel();
		jLabel17 = new javax.swing.JLabel();
		jLabel18 = new javax.swing.JLabel();
		Date date=new Date();
		datepick.setBounds(88,195,231,24);
		datepick.setDate(date);
		jPanel1.add(datepick);

		history=new javax.swing.JLabel("历史订单");
		history.setIcon(new ImageIcon("src/icon/icons8-order-history-16.png"));
		history.setBounds(625,0,80,15);
		jPanel1.add(history);
		//System.out.println(data);
		jPanel1.setBackground(new java.awt.Color(246, 198, 198));
		jLabel1.setText("\u51fa\u53d1\u5730");
		jLabel1.setIcon(new ImageIcon("src/icon/icons8-location-16.png"));
		jLabel2.setText("\u76ee\u7684\u5730");
		jLabel2.setIcon(new ImageIcon("src/icon/icons8-location-16.png"));
		jLabel3.setText("\u51fa\u53d1\u65f6\u95f4");
		jLabel3.setIcon(new ImageIcon("src/icon/icons8-calendar-28-16.png")); // NOI18N
		jButton1.setText("\u67e5\u8be2");
		jButton1.setBackground(new java.awt.Color(252, 225, 225));
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton1ActionPerformed(evt);
				} catch (UnknownHostException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 18));
		jLabel4.setText("\u67e5\u8be2\u5217\u8f66\u4fe1\u606f");

		jButton2.setText("\u5e38\u7528\u67e5\u8be2");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14));
		jLabel5.setText("\u6700\u65b0\u53d1\u5e03");

		jLabel6.setText("\u5019\u8865\u8f66\u7968\u64cd\u4f5c\u8bf4\u660e");

		jLabel7
				.setText("\u5173\u4e8e\u8c03\u6574\u4e92\u8054\u7f51\u3001\u7535\u8bdd\u8ba2\u7968\u8d77\u552e\u65f6\u95f4\u516c\u544a");

		jLabel10
				.setText("\u4e2d\u56fd\u94c1\u8def\u6b66\u6c49\u603b\u5c40\u96c6\u56e2\u6709\u9650\u516c\u53f8\u5173\u4e8e2019\u5e7411\u670818\u65e5\u90e8\u5206\u65c5..");

		jLabel11
				.setText("\u4e2d\u56fd\u94c1\u8def\u5e7f\u5dde\u5c40\u96c6\u56e2\u6709\u9650\u516c\u53f8\u5173\u4e8e2019\u5e7411\u670819\u65e5\u90e8\u5206\u65c5..");

		jLabel12
				.setText("\u4e2d\u56fd\u94c1\u8def\u5e7f\u5dde\u5c40\u96c6\u56e2\u6709\u9650\u516c\u53f8\u5173\u4e8e2019\u5e7411\u670818\u65e5\u90e8\u5206\u65c5..");

		jLabel13.setText("\u7248\u6743\u6240\u67092008-2019");

		jLabel14
				.setText("\u4e2d\u56fd\u94c1\u9053\u79d1\u5b66\u7814\u7a76\u9662\u96c6\u56e2");

		jLabel15.setText("\u4eacICP\u5907050202493\u53f7-4");

		jLabel16.setText("|");

		jLabel17.setText("\u4eacICP\u8bc1150437\u53f7");

		jLabel18.setText("\u4e2a\u4eba\u4fe1\u606f");
		jLabel18.setIcon(new ImageIcon("src/icon/icons8-person-16.png")); // NOI18N
		jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				try {
					check_information(evt);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				jLabel18MouseEntered(evt);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				jLabel18MouseExited(evt);
			}
		});

		history.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				try {
					check_histroy(evt);
				} catch (IOException e) {
					e.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				histroyMouseEntered(evt);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				histroyMouseExited(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel1Layout
										.createSequentialGroup()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				188,
																				188,
																				188)
																		.addComponent(
																				jLabel13))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel4)
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.TRAILING)
																														.addComponent(
																																jLabel2)
																														.addComponent(
																																jLabel3)
																														.addComponent(
																																jLabel1))
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																jTextField2,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																232,
																																Short.MAX_VALUE)
																														.addComponent(
																																jTextField1,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																232,
																																Short.MAX_VALUE)
																														.addComponent(
																																jButton1,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																232,
																																javax.swing.GroupLayout.PREFERRED_SIZE))))))
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel1Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								false)
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addGap(
																												40,
																												40,
																												40)
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																jLabel6)
																														.addComponent(
																																jLabel7)
																														.addComponent(
																																jLabel12)
																														.addComponent(
																																jLabel11)
																														.addComponent(
																																jLabel10,
																																javax.swing.GroupLayout.Alignment.TRAILING)))
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addGap(
																												8,
																												8,
																												8)
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																jLabel5)
																														.addGroup(
																																jPanel1Layout
																																		.createSequentialGroup()
																																		.addGap(
																																				99,
																																				99,
																																				99)
																																		.addGroup(
																																				jPanel1Layout
																																						.createParallelGroup(
																																								javax.swing.GroupLayout.Alignment.LEADING)
																																						.addComponent(
																																								jLabel9)
																																						.addComponent(
																																								jLabel8)))))
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								jPanel1Layout
																										.createSequentialGroup()
																										.addGap(
																												130,
																												130,
																												130)
																										.addComponent(
																												jButton2,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												94,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												Short.MAX_VALUE)
																										.addComponent(
																												jLabel18)))
																		.addGap(
																				30,
																				30,
																				30))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				98,
																				98,
																				98)
																		.addComponent(
																				jLabel14)
																		.addContainerGap(
																				166,
																				Short.MAX_VALUE))))
						.addGroup(
								jPanel1Layout.createSequentialGroup().addGap(
										199, 199, 199).addComponent(jLabel15)
										.addGap(18, 18, 18).addComponent(
										jLabel16).addGap(18, 18, 18)
										.addComponent(jLabel17)
										.addContainerGap(228, Short.MAX_VALUE)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
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
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addContainerGap()
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addGroup(
																																jPanel1Layout
																																		.createSequentialGroup()
																																		.addGap(
																																				70,
																																				70,
																																				70)
																																		.addGroup(
																																				jPanel1Layout
																																						.createParallelGroup(
																																								javax.swing.GroupLayout.Alignment.BASELINE)
																																						.addComponent(
																																								jLabel1)
																																						.addComponent(
																																								jTextField1,
																																								javax.swing.GroupLayout.PREFERRED_SIZE,
																																								javax.swing.GroupLayout.DEFAULT_SIZE,
																																								javax.swing.GroupLayout.PREFERRED_SIZE)))
																														.addComponent(
																																jLabel4))
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED))
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								jPanel1Layout
																										.createSequentialGroup()
																										.addContainerGap(
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												Short.MAX_VALUE)
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																jLabel18)
																														.addGroup(
																																jPanel1Layout
																																		.createSequentialGroup()
																																		.addGap(
																																				43,
																																				43,
																																				43)
																																		.addComponent(
																																				jLabel5)
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																		.addComponent(
																																				jLabel6))
																														.addComponent(
																																jButton2,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																35,
																																javax.swing.GroupLayout.PREFERRED_SIZE))
																										.addGap(
																												14,
																												14,
																												14)))
																		.addGap(
																				22,
																				22,
																				22)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel2)
																						.addComponent(
																								jLabel8)
																						.addComponent(
																								jTextField2,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jLabel11))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addContainerGap(
																				112,
																				Short.MAX_VALUE)
																		.addComponent(
																				jLabel7)
																		.addGap(
																				39,
																				39,
																				39)))
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel9)
														.addComponent(jLabel10))
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				13,
																				13,
																				13)
																		.addComponent(
																				jLabel3)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(
																				jButton1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel12)))
										.addGap(26, 26, 26)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel14)
														.addComponent(jLabel13))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel16)
														.addComponent(jLabel15)
														.addComponent(jLabel17))
										.addGap(22, 22, 22)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.PREFERRED_SIZE));

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)
			throws Exception {
		// TODO add your handling code here:
		//System.out.print("222");
		String startlocat=jTextField1.getText();
		String endlocat=jTextField2.getText();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String data=simpleDateFormat.format(datepick.getDate());
		String starttime= data;

		if(startlocat.equals("")==true||endlocat.equals("")||starttime.equals(""))
		{
			System.out.println("1231231231");
			JOptionPane.showMessageDialog(this, "请检查是否存在未填信息");
		}
		else
		{
			dispose();
			Client.gettablemassage(startlocat,endlocat,starttime);
			new train_list();
		}

	}

	private void check_information(java.awt.event.MouseEvent evt) throws IOException {
		System.out.println("1233");
		new person_information_jm();
		// TODO add your handling code here:
	}

	private void jLabel18MouseEntered(java.awt.event.MouseEvent evt) {
		jLabel18.setForeground(Color.red);
		// TODO add your handling code here:
	}

	private void jLabel18MouseExited(java.awt.event.MouseEvent evt) {
		jLabel18.setForeground(Color.black);
		// TODO add your handling code here:
	}

	private void check_histroy(java.awt.event.MouseEvent evt) throws Exception {
		System.out.println("1233");
		new history_order();
		// TODO add your handling code here:
	}

	private void histroyMouseEntered(java.awt.event.MouseEvent evt) {
		history.setForeground(Color.red);
		// TODO add your handling code here:
	}

	private void histroyMouseExited(java.awt.event.MouseEvent evt) {
		history.setForeground(Color.black);
		// TODO add your handling code here:
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		new search_ticket_mian_jm().setVisible(true);

	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	public static final javax.swing.JButton jButton1 = new javax.swing.JButton();
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel17;
	public  javax.swing.JLabel jLabel18;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JLabel history;
	private javax.swing.JPanel jPanel1;

	public javax.swing.JTextField jTextField1;
	public javax.swing.JTextField jTextField2;
	public javax.swing.JTextField jTextField3;
	public JXDatePicker datepick=new JXDatePicker();
	public String startlocat,endlocat,starttime;
	// End of variables declaration//GEN-END:variables

}