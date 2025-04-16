import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class OrderMenu extends JFrame {

    public OrderMenu() {
        setTitle("TBRMS - Menu");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        String[] foodItems = {"Burger", "Pizza", "Salad", "Fries"};
        JList<String> menuList = new JList<>(foodItems);
        add(new JScrollPane(menuList), BorderLayout.CENTER);

        JButton orderButton = new JButton("Place Order");
        add(orderButton, BorderLayout.SOUTH);

        orderButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selected = menuList.getSelectedValue();
                if (selected != null) {
                    JOptionPane.showMessageDialog(null, "Order placed for: " + selected);
                    // Here you can also add inventory updates
                } else {
                    JOptionPane.showMessageDialog(null, "Select an item first.");
                }
            }
        });

        setVisible(true);
    }
}