package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.BorderFactory;

import java.awt.Color;
import java.awt.event.ActionListener;

/**
 * This class represents the view of getting all portfolio's states.
 */
public class GetAllStateView extends JFrame implements IView {
  private JLabel display;
  private JButton exitButton;
  private JTextField input;
  private JTextArea sTextArea;

  /**
   * This is the constructor of this view. It will set up the places and id of the buttons and text
   * areas.
   *
   * @param caption the view's title
   */
  public GetAllStateView(String caption) {
    super(caption);
    setSize(900, 600);
    setLocation(200, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    //this.setLayout(new FlowLayout());
    this.setLayout(null);
    display = new JLabel("Get the state of all portfolios:");
    display.setBounds(20, 10, 800, 20);


    this.add(display);

    //the textfield
    input = new JTextField(10);

    //output area
    sTextArea = new JTextArea("Result will be displayed here.", 10, 20);
    JScrollPane scrollPane = new JScrollPane(sTextArea);
    sTextArea.setLineWrap(true);
    scrollPane.setBorder(BorderFactory.createTitledBorder("Result"));
    scrollPane.setBounds(20, 40, 820, 400);
    this.add(scrollPane);

    //exit button
    exitButton = new JButton("Exit");
    exitButton.setActionCommand("GetAllState Exit Button");
    exitButton.setBounds(20, 500, 80, 20);
    this.add(exitButton);


    setVisible(false);

  }

  @Override
  public void addActionListener(ActionListener actionListener) {
    exitButton.addActionListener(actionListener);
  }

  @Override
  public void resetFocus() {
    this.setFocusable(true);
    this.requestFocus();
  }

  @Override
  public void toggleColor() {
    if (this.display.getForeground().equals(Color.RED)) {
      this.display.setForeground(Color.BLACK);
    } else {
      this.display.setForeground(Color.RED);
    }
  }


  @Override
  public void setEchoOutput(String s) {
    sTextArea.setText(s);
  }

  @Override
  public String getInputString() {
    return "getallstate";
  }

  @Override
  public void clearInputString() {
    input.setText("");
  }


}

