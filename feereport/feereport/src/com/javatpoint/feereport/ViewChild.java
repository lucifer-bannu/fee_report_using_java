package com.javatpoint.feereport;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

public class ViewChild extends JFrame{
	static ViewChild frame;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	JTextArea textArea;
	private JTextField textField_10;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new ViewChild();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public ViewChild() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 450, 550);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	
	JLabel lblName = new JLabel("Name:");
	
	JLabel lblEmail = new JLabel("Email:");
	
	JLabel lblCourse = new JLabel("Course:");
	
	JLabel lblFee = new JLabel("Fee:");
	
	JLabel lblPaid = new JLabel("Paid:");
	
	JLabel lblDue = new JLabel("Due:");
	
	JLabel lblAddress = new JLabel("Address:");
	
	JLabel lblCity = new JLabel("City:");
	
	JLabel lblState = new JLabel("State:");
	
	JLabel lblCountry = new JLabel("Country:");
	
	JLabel lblContactNo = new JLabel("Contact No:");
	
	
	textField = new JTextField();
	textField.setColumns(10);
	
	textField_1 = new JTextField();
	textField_1.setColumns(10);
	
	textField_2 = new JTextField();
	textField_2.setColumns(10);
	
	textField_3 = new JTextField();
	textField_3.setColumns(10);
	
	textField_4 = new JTextField();
	textField_4.setColumns(10);
	
	textField_5 = new JTextField();
	textField_5.setColumns(10);
	
	textField_6 = new JTextField();
	textField_6.setColumns(10);
	
	textField_7 = new JTextField();
	textField_7.setColumns(10);
	
	textField_8 = new JTextField();
	textField_8.setColumns(10);
	
	textField_9 = new JTextField();
	textField_9.setColumns(10);
	
	textArea = new JTextArea();
	
	JLabel lblRollNo = new JLabel("Roll No:");
	textField_10 = new JTextField();
	textField_10.setColumns(10);
	
	JSeparator separator = new JSeparator();
	
	JButton btnEditStudent = new JButton("View Child details");
	btnEditStudent.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			String srollno=textField_10.getText();
			if(srollno==null||srollno.trim().equals("")){
				JOptionPane.showMessageDialog(ViewChild.this,"Please enteryour child rollno!");
			}else{
			int rollno=Integer.parseInt(srollno);
			Student s=StudentDao.getStudentByRollno(rollno);
			textField.setText(s.getName());
			textField_1.setText(s.getEmail());
			textField_2.setText(s.getCourse());
			textField_3.setText(String.valueOf(s.getFee()));
			textField_4.setText(String.valueOf(s.getPaid()));
			textField_5.setText(String.valueOf(s.getDue()));
			textArea.setText(s.getAddress());
			textField_6.setText(s.getCity());
			textField_7.setText(s.getState());
			textField_8.setText(s.getCountry());
			textField_9.setText(s.getContactno());
			}
		}
	});
	GroupLayout gl_contentPane = new GroupLayout(contentPane);
	gl_contentPane.setHorizontalGroup(
		gl_contentPane.createParallelGroup(Alignment.LEADING)
			.addGroup(gl_contentPane.createSequentialGroup()
				.addContainerGap()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
					.addComponent(lblName)
					.addComponent(lblCourse, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addComponent(lblFee, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addComponent(lblPaid, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addComponent(lblDue, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addComponent(lblAddress, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(lblRollNo, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblEmail, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)))
				.addGap(33)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(textField_5, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
						.addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
						.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
						.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
						.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
						.addComponent(textField, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
						.addComponent(textField_7, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
						.addComponent(textField_8, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
						.addComponent(textField_9, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
						.addComponent(textField_6, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
						.addComponent(textArea))
					.addGroup(gl_contentPane.createSequentialGroup()
						.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
						.addComponent(btnEditStudent)))
				.addContainerGap())
			.addGroup(gl_contentPane.createSequentialGroup()
				.addContainerGap()
				.addComponent(lblContactNo)
				.addContainerGap(356, Short.MAX_VALUE))
			.addGroup(gl_contentPane.createSequentialGroup()
				.addContainerGap()
				.addComponent(lblCountry, GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
				.addGap(350))
			.addGroup(gl_contentPane.createSequentialGroup()
				.addContainerGap()
				.addComponent(lblCity, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(383, Short.MAX_VALUE))
			.addGroup(gl_contentPane.createSequentialGroup()
				.addContainerGap()
				.addComponent(lblState, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(364, Short.MAX_VALUE))
			.addGroup(gl_contentPane.createSequentialGroup()
				.addGap(27)
				.addComponent(separator, GroupLayout.PREFERRED_SIZE, 351, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(46, Short.MAX_VALUE))
	);
	gl_contentPane.setVerticalGroup(
		gl_contentPane.createParallelGroup(Alignment.LEADING)
			.addGroup(gl_contentPane.createSequentialGroup()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
					.addComponent(lblRollNo)
					.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addComponent(btnEditStudent))
				.addGap(16)
				.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
					.addComponent(lblName)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
					.addComponent(lblEmail)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
					.addComponent(lblCourse)
					.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
					.addComponent(lblFee)
					.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
					.addComponent(lblPaid)
					.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
					.addComponent(lblDue)
					.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
					.addComponent(lblAddress)
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
					.addGroup(gl_contentPane.createSequentialGroup()
						.addComponent(lblCity)
						.addGap(18))
					.addGroup(gl_contentPane.createSequentialGroup()
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)))
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
					.addComponent(lblState)
					.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
					.addComponent(lblCountry)
					.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
					.addComponent(lblContactNo)
					.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(7))
	);
	contentPane.setLayout(gl_contentPane);

	}
}
