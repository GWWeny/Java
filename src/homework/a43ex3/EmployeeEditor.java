package homework.a43ex3;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class EmployeeEditor {
    public static void main(String[] args) {
        //定义列名和数据
        String[] columnNames={"employee_id","full_name","gender","department","position","salary"};
        Object[][] data={
                {1,"John Doe","Male","Admin","CEO",6500.0},
                {2,"Richard Castle","Male","Investigation","Writer",2600.0},
                {3,"Sheldon Cooper","Male","Lab","Scientist",1300.0},
                {4,"Penny","Female","Kitchen","Chef",1200.0}
        };
        //创建表格模型
        DefaultTableModel tableModel=new DefaultTableModel(data,columnNames){
            @Override
            public boolean isCellEditable(int row,int column){
                return false;// 禁止直接在表格中编辑
            }
        };

        //创建JTable
        JTable table=new JTable(tableModel);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//单行选择
        JScrollPane tableScrollPane=new JScrollPane(table);

        //创建表单组件
        JLabel lblId=new JLabel("Employee ID:");
        JLabel lblName=new JLabel("Full Name:");
        JLabel lblGender=new JLabel("Gender:");
        JLabel lblDepartment=new JLabel("Department:");
        JLabel lblPosition=new JLabel("Position:");
        JLabel lblSalary=new JLabel("Salary:");

        JTextField txtId=new JTextField();
        txtId.setEditable(false);//ID 不可编辑
        JTextField txtName=new JTextField();
        JComboBox<String> cmbGender=new JComboBox<>(new String[]{"Male","Female"});
        JTextField txtDepartment=new JTextField();
        JTextField txtPosition=new JTextField();
        JTextField txtSalary=new JTextField();

        //创建表单面板
        JPanel formPanel=new JPanel(new GridLayout(6,2,10,10));
        formPanel.setBorder(BorderFactory.createTitledBorder("Employee Records Editor"));
        formPanel.add(lblId);
        formPanel.add(txtId);
        formPanel.add(lblName);
        formPanel.add(txtName);
        formPanel.add(lblGender);
        formPanel.add(cmbGender);
        formPanel.add(lblDepartment);
        formPanel.add(txtDepartment);
        formPanel.add(lblPosition);
        formPanel.add(txtPosition);
        formPanel.add(lblSalary);
        formPanel.add(txtSalary);

        //添加表单选择监听器
        table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int selectedRow=table.getSelectedRow();
                if(selectedRow!=-1){
                    //更新表单数据
                    txtId.setText(tableModel.getValueAt(selectedRow,0).toString());
                    txtName.setText(tableModel.getValueAt(selectedRow,1).toString());
                    cmbGender.setSelectedItem(tableModel.getValueAt(selectedRow,2).toString());
                    txtDepartment.setText(tableModel.getValueAt(selectedRow,3).toString());
                    txtPosition.setText(tableModel.getValueAt(selectedRow,4).toString());
                    txtSalary.setText(tableModel.getValueAt(selectedRow,5).toString());
                }
            }
        });

        //创建主框架
        JFrame frame=new JFrame("Employee Records ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,400);
        frame.setLayout(new BorderLayout(10,10));

        // 将组件添加到框架
        frame.add(tableScrollPane, BorderLayout.CENTER);
        frame.add(formPanel, BorderLayout.SOUTH);

        // 显示框架
        frame.setVisible(true);
    }
}
