package homework.a42ex2;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ProductTableDemo {
    public static void main(String[] args) {
        //定义列名
        String[] columnNames={"编号","商品名称","价格","促销品"};
        //定义表格数据
        Object[][] product={
                {"A0001","牙刷",55,true},
                {"B0003","洗发精",375,true},
                {"A1258","可乐",25,false},
                {"B1534","抹布",80,false},
                {"B5582","电池",60,false},
                {"B1752","铅笔",12,true},
        };
        //创建表格模型
        DefaultTableModel tableModel=new DefaultTableModel(product,columnNames){
            @Override
            public Class<?> getColumnClass(int column){
                if(column==2) return Integer.class;//价格列,整形
                if(column==3) return Boolean.class;//促销品列，布尔类型
                return String.class;//字符串类型
            }
        };
        //创建JTable
        JTable table=new JTable(tableModel);
        //设置表格的外观
        table.setRowHeight(25);//行高
        table.setFont(new Font("微软雅黑", Font.PLAIN,14));//字体
        table.getTableHeader().setFont(new Font("微软雅黑", Font.BOLD,14));//表头字体

        //创建滚动面板并添加表头
        JScrollPane scrollPane=new JScrollPane(table);

        //创建主框架
        JFrame frame=new JFrame("商品列表");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,300);
        frame.setLayout(new BorderLayout());
        frame.add(scrollPane,BorderLayout.CENTER);

        //显示框架
        frame.setVisible(true);
    }
}
