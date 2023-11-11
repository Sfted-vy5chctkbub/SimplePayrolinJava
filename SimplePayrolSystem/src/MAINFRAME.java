import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MAINFRAME extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField RatePerHourtxt;
	private JTextField HourPerDaytxt;
	private JTextField employeenametxt;
	private JTextField NumberOfDaysWorkedtxt;
	private JTextField TAXofMoWagetxt;
	private JTextField PhilHealthtxt;
	private JTextField SSStxt;
	private JTextField GrossSalarytxt;
	private JTextField Deductiontxt;
	private JTextField GROSSSALARYtxt;
	private JTextField TotalDeductiontxt;
	private JTextField NetrSalarytxt;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MAINFRAME frame = new MAINFRAME();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MAINFRAME() {
		setFont(new Font("Dialog", Font.BOLD, 13));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1005, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmployeename = new JLabel("Employee Name:");
		lblEmployeename.setFont(new Font("Dialog", Font.BOLD, 12));
		lblEmployeename.setBounds(12, 47, 117, 15);
		contentPane.add(lblEmployeename);
		
		
		RatePerHourtxt = new JTextField();
		RatePerHourtxt.setBounds(126, 102, 114, 19);
		contentPane.add(RatePerHourtxt);
		RatePerHourtxt.setColumns(10);
		
		JLabel lblRatePerHr = new JLabel("Rate Per Hour:");
		lblRatePerHr.setBounds(12, 104, 117, 15);
		contentPane.add(lblRatePerHr);
		
		HourPerDaytxt = new JTextField();
		HourPerDaytxt.setBounds(126, 159, 114, 19);
		contentPane.add(HourPerDaytxt);
		HourPerDaytxt.setColumns(10);
		
		JLabel lblHourPerDay = new JLabel("Hour Per Day:");
		lblHourPerDay.setBounds(12, 159, 117, 15);
		contentPane.add(lblHourPerDay);
		
		employeenametxt = new JTextField();
		employeenametxt.setBounds(126, 45, 114, 19);
		contentPane.add(employeenametxt);
		employeenametxt.setColumns(10);
		
		JLabel lblNoOfDayWorked = new JLabel("Number of  days worked:");
		lblNoOfDayWorked.setBounds(12, 214, 185, 15);
		contentPane.add(lblNoOfDayWorked);
		
		NumberOfDaysWorkedtxt = new JTextField();
		NumberOfDaysWorkedtxt.setBounds(193, 212, 114, 19);
		contentPane.add(NumberOfDaysWorkedtxt);
		NumberOfDaysWorkedtxt.setColumns(10);
		
		JLabel lblDeductionOfSalary = new JLabel("DEDUCTION OF SALARY:");
		lblDeductionOfSalary.setForeground(new Color(224, 27, 36));
		lblDeductionOfSalary.setFont(new Font("Dialog", Font.BOLD, 13));
		lblDeductionOfSalary.setBounds(366, 47, 217, 15);
		contentPane.add(lblDeductionOfSalary);
		
		JLabel lblTaxofMonthlyWage = new JLabel("TAX  15% of Monthly Wage:");
		lblTaxofMonthlyWage.setBounds(320, 104, 217, 15);
		contentPane.add(lblTaxofMonthlyWage);
		
		TAXofMoWagetxt = new JTextField();
		TAXofMoWagetxt.setBounds(529, 102, 114, 19);
		contentPane.add(TAXofMoWagetxt);
		TAXofMoWagetxt.setColumns(10);
		TAXofMoWagetxt.setEditable(false);
		
		
		JLabel lblPhilhealth = new JLabel("Philhealth 5%:");
		lblPhilhealth.setBounds(420, 161, 117, 15);
		contentPane.add(lblPhilhealth);
		
		PhilHealthtxt = new JTextField();
		PhilHealthtxt.setBounds(529, 159, 114, 19);
		contentPane.add(PhilHealthtxt);
		PhilHealthtxt.setColumns(10);
		PhilHealthtxt.setEditable(false);
		
		JLabel lblSSS = new JLabel("SSS 2%");
		lblSSS.setBounds(455, 214, 70, 15);
		contentPane.add(lblSSS);
		
		SSStxt = new JTextField();
		SSStxt.setBounds(529, 212, 114, 19);
		contentPane.add(SSStxt);
		SSStxt.setColumns(10);
		SSStxt.setEditable(false);
		
		JLabel lblGrossSlry = new JLabel("Gross Salary:");
		lblGrossSlry.setBounds(744, 104, 120, 15);
		contentPane.add(lblGrossSlry);
		
		GrossSalarytxt = new JTextField();
		GrossSalarytxt.setBounds(856, 102, 114, 19);
		contentPane.add(GrossSalarytxt);
		GrossSalarytxt.setColumns(10);
		GrossSalarytxt.setEditable(false);
		
		JLabel lblDeduction = new JLabel("Deduction:");
		lblDeduction.setBounds(762, 161, 81, 15);
		contentPane.add(lblDeduction);
		
		Deductiontxt = new JTextField();
		Deductiontxt.setBounds(856, 159, 114, 19);
		contentPane.add(Deductiontxt);
		Deductiontxt.setColumns(10);
		Deductiontxt.setEditable(false);
		
		JLabel lblGROSSSALARY = new JLabel("GROSS SALARY :");
		lblGROSSSALARY.setFont(new Font("Dialog", Font.BOLD, 16));
		lblGROSSSALARY.setBounds(12, 307, 172, 15);
		contentPane.add(lblGROSSSALARY);
		
		GROSSSALARYtxt = new JTextField();
		GROSSSALARYtxt.setBounds(193, 306, 114, 19);
		contentPane.add(GROSSSALARYtxt);
		GROSSSALARYtxt.setColumns(10);
		GROSSSALARYtxt.setEditable(false);
		
		JLabel lblTotalDeduction = new JLabel("TOTAL DEDUCTION : ");
		lblTotalDeduction.setFont(new Font("Dialog", Font.BOLD, 16));
		lblTotalDeduction.setBounds(339, 307, 217, 15);
		contentPane.add(lblTotalDeduction);
		
		TotalDeductiontxt = new JTextField();
		TotalDeductiontxt.setBounds(529, 306, 114, 19);
		contentPane.add(TotalDeductiontxt);
		TotalDeductiontxt.setColumns(10);
		TotalDeductiontxt.setEditable(false);
		
		JLabel lblNetSalary = new JLabel("NET SALARY :");
		lblNetSalary.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNetSalary.setBounds(706, 306, 137, 16);
		contentPane.add(lblNetSalary);
		
		NetrSalarytxt = new JTextField();
		NetrSalarytxt.setBounds(856, 306, 114, 19);
		contentPane.add(NetrSalarytxt);
		NetrSalarytxt.setColumns(10);
		NetrSalarytxt.setEditable(false);
		
		JLabel lblSimplepayrolSystem = new JLabel("Simple Payrol System");
		lblSimplepayrolSystem.setFont(new Font("Dialog", Font.BOLD, 18));
		lblSimplepayrolSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblSimplepayrolSystem.setBounds(408, 12, 235, 23);
		contentPane.add(lblSimplepayrolSystem);
		
		JButton btnCOMPUTE = new JButton("COMPUTE");
		btnCOMPUTE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 String employeeName = employeenametxt.getText();
	                double ratePerHour = Double.parseDouble(RatePerHourtxt.getText());
	                double hoursPerDay = Double.parseDouble(HourPerDaytxt.getText());
	                double daysWorked = Double.parseDouble(NumberOfDaysWorkedtxt.getText());

	             // Calculate gross salary
	                double grossSalary = ratePerHour * hoursPerDay * daysWorked;
	                GrossSalarytxt.setText(String.format("%.2f", grossSalary));
	                
	              // Calculate deductions
	                double taxDeduction = grossSalary * 0.15;
	                double philhealthDeduction = grossSalary * 0.05;
	                double sssDeduction = grossSalary * 0.02;
	              
	             // Update deduction text fields
	                TAXofMoWagetxt.setText(String.format("%.2f", taxDeduction));
	                PhilHealthtxt.setText(String.format("%.2f", philhealthDeduction));
	                SSStxt.setText(String.format("%.2f", sssDeduction));
	                
	             // Calculate total deduction   
	                double totalDeduction = taxDeduction + philhealthDeduction + sssDeduction;
	                Deductiontxt.setText(String.format("%.2f", totalDeduction));
	                
	             // Update gross salary and total deduction text fields
	                GROSSSALARYtxt.setText(String.format("%.2f", grossSalary));
	                TotalDeductiontxt.setText(String.format("%.2f", totalDeduction));
	                
	             // Calculate net salary
	                double netSalary = grossSalary - totalDeduction;
	                NetrSalarytxt.setText(String.format("%.2f", netSalary));

			}
		});
		btnCOMPUTE.setForeground(new Color(26, 95, 180));
		btnCOMPUTE.setBounds(452, 368, 117, 25);
		contentPane.add(btnCOMPUTE);
	}

	
}
