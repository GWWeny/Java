package homework.a44ex4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChooserDemo {
    public static void main(String[] args) {
        //创建主框架
        JFrame frame=new JFrame("JColorChooser Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        frame.setLayout(new BorderLayout());
        //创建颜色显示面板
        JPanel colorPanel=new JPanel();
        colorPanel.setBackground(Color.YELLOW);
        frame.add(colorPanel,BorderLayout.CENTER);

        //创建按钮
        JButton colorButton=new JButton("Get Color");
        frame.add(colorButton,BorderLayout.SOUTH);

        //按钮点击事件
        colorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //显示颜色选择对话框
                Color selectedColor=JColorChooser.showDialog(frame,"Choose a Color",Color.YELLOW);
                if(selectedColor!=null){
                    //将选择颜色应用到面板背景
                    colorPanel.setBackground(selectedColor);
                }
            }
        });
        //显示主框架
        frame.setVisible(true);
    }
}
