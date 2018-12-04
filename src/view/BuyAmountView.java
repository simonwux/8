package view;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;

public class BuyAmountView extends JFrame implements IView {
  private JLabel display, display2, display3, display4;
  private JButton echoButton, exitButton;
  private JTextField portfolioName, date, companyName, amount;
  private JTextArea sTextArea;


  public BuyAmountView(String caption) {
    super(caption);
    setSize(900, 600);
    setLocation(200, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //this.setResizable(false);
//		this.setMinimumSize(new Dimension(300,300));


    this.setLayout(new FlowLayout());
    this.setLayout(null);

    //output area
    sTextArea = new JTextArea("Result will be displayed here.", 10, 20);
    JScrollPane scrollPane = new JScrollPane(sTextArea);
    sTextArea.setLineWrap(true);
    //scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
    scrollPane.setBorder(BorderFactory.createTitledBorder("Result"));
    scrollPane.setBounds(500, 20, 340, 470);
    this.add(scrollPane);

    display = new JLabel("Portfolio's name");
    display.setBounds(20, 10, 800, 20);
    this.add(display);

    //the textfield
    portfolioName = new JTextField(5);
    portfolioName.setBounds(20, 40, 200, 20);
    this.add(portfolioName);

    display2 = new JLabel("Company's name");
    display2.setBounds(20, 80, 800, 20);
    this.add(display2);

    //the textfield
    companyName = new JTextField(8);
    companyName.setBounds(20, 110, 200, 20);
    this.add(companyName);

    display3 = new JLabel("Amount of investment");
    display3.setBounds(20, 150, 800, 20);
    this.add(display3);

    //the textfield
    amount = new JTextField(8);
    amount.setBounds(20, 180, 200, 20);
    this.add(amount);

    display4 = new JLabel("Date: yyyyMMdd or N/n");
    display4.setBounds(20, 220, 800, 20);
    this.add(display4);

    //the textfield
    date = new JTextField(8);
    date.setBounds(20, 250, 200, 20);
    this.add(date);

    //echobutton
    echoButton = new JButton("Buy a stock");
    echoButton.setActionCommand("BuyAmount Echo Button");
    echoButton.setBounds(20, 460, 150, 20);
    this.add(echoButton);

    //exit button
    exitButton = new JButton("Exit");
    exitButton.setActionCommand("BuyAmount Exit Button");
    exitButton.setBounds(190, 460, 80, 20);
    this.add(exitButton);


    //pack();
    setVisible(false);

  }

  @Override
  public void addActionListener(ActionListener actionListener) {
    echoButton.addActionListener(actionListener);
    exitButton.addActionListener(actionListener);
  }


  /*
      In order to make this frame respond to keyboard events, it must be within strong focus.
      Since there could be multiple components on the screen that listen to keyboard events,
      we must set one as the "currently focussed" one so that all keyboard events are
      passed to that component. This component is said to have "strong focus".

      We do this by first making the component focusable and then requesting focus to it.
      Requesting focus makes the component have focus AND removes focus from whoever had it
      before.
       */
  @Override
  public void resetFocus() {
    this.setFocusable(true);
    this.requestFocus();
  }

  @Override
  public void toggleColor() {
    if (this.display.getForeground().equals(Color.RED))
      this.display.setForeground(Color.BLACK);
    else
      this.display.setForeground(Color.RED);
  }


  @Override
  public void setEchoOutput(String s) {
    sTextArea.setText(s);
  }

  @Override
  public String getInputString() {
    return "buya " + portfolioName.getText() + " " + companyName.getText() + " "
            + amount.getText() + " " + date.getText();
  }

  @Override
  public void clearInputString() {
    portfolioName.setText("");
    date.setText("");
    companyName.setText("");
    amount.setText("");
  }


}

