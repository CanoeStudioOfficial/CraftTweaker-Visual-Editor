package canoestudios.crafttweakervisualeditor;

import javax.swing.*;
import java.awt.*;

public class SimpleGUI extends JFrame {
    public SimpleGUI() {
        // 设置窗口标题
        super("简单GUI程序");

        // 设置窗口大小
        setSize(400, 300);

        // 设置窗口关闭行为
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 设置窗口居中显示
        setLocationRelativeTo(null);

        // 创建一个面板并添加组件
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // 添加标签
        JLabel label = new JLabel("欢迎使用简单GUI程序！");
        panel.add(label);

        // 添加按钮
        JButton button = new JButton("点击我");
        button.addActionListener(e -> JOptionPane.showMessageDialog(
                this,
                "按钮被点击了！",
                "提示",
                JOptionPane.INFORMATION_MESSAGE
        ));
        panel.add(button);

        // 将面板添加到窗口
        add(panel);

        // 设置窗口可见
        setVisible(true);
    }

    public static void main(String[] args) {
        // 在事件调度线程中创建GUI，确保线程安全
        SwingUtilities.invokeLater(SimpleGUI::new);
    }
}