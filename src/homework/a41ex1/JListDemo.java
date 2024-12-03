package homework.a41ex1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JListDemo {
    public static void main(String[] args) {
        //主框架
        JFrame frame = new JFrame("JList Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(1,2,5,5));

        //左侧列表
        DefaultListModel<String> leftModel = new DefaultListModel<>();
        leftModel.addElement("RED");
        leftModel.addElement("GREEN");
        leftModel.addElement("BLUE");
        leftModel.addElement("PINK");
        leftModel.addElement("YELLOW");
        leftModel.addElement("CYAN");
        JList<String> leftList = new JList<>(leftModel);
        leftList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane leftScrollPane = new JScrollPane(leftList);

        //右侧JList列表
        DefaultListModel<String> rightModel = new DefaultListModel<>();
        JList<String> rightList = new JList<>(rightModel);
        JScrollPane rightScrollPane = new JScrollPane(rightList);

        //中间按钮面板
        /*JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(2,1,5,5));
        JButton toRightButton = new JButton(">>");
        JButton toLeftButton = new JButton("<<");
        buttonPanel.add(toRightButton);
        buttonPanel.add(toLeftButton);*/


        //鼠标监听事件
        leftList.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                if(e.getClickCount()==2){
                    int selectIndex=leftList.locationToIndex(e.getPoint());
                    if(selectIndex!=-1){
                        String selectedItem=leftModel.getElementAt(selectIndex);
                        rightModel.addElement(selectedItem);//添加到右侧列表
                        leftModel.remove(selectIndex);//从左侧列表移除
                    }
                }
            }
        });

        // 右键菜单（右侧列表撤回到左侧）
        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem moveBackItem = new JMenuItem("撤回到左侧");
        popupMenu.add(moveBackItem);

        // 右键监听
        rightList.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (SwingUtilities.isRightMouseButton(e)) { // 检测右键
                    int selectedIndex = rightList.locationToIndex(e.getPoint());
                    if (selectedIndex != -1) {
                        rightList.setSelectedIndex(selectedIndex); // 选中右键点击的项
                        popupMenu.show(rightList, e.getX(), e.getY()); // 显示菜单
                    }
                }
            }
        });

        // 撤回功能
        moveBackItem.addActionListener(e -> {
            int selectedIndex = rightList.getSelectedIndex();
            if (selectedIndex != -1) {
                String selectedItem = rightModel.getElementAt(selectedIndex);
                leftModel.addElement(selectedItem); // 添加回左侧列表
                rightModel.removeElementAt(selectedIndex); // 从右侧列表移除
            }
        });

        //将组件添加到框架中
        frame.add(leftScrollPane);
        frame.add(rightScrollPane);


        //显示框架
        frame.setVisible(true);
    }
}
