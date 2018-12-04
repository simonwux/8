package view;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;

public class SavePercentageView extends JFrame implements IView {
  private JLabel display, display2;
  private JButton echoButton, exitButton;
  private JTextField percentageName, fileName;
  private JTextArea sTextArea;

  public SavePercentageView(String caption) {
    super(caption);
    setSize(900, 600);
    setLocation(200, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //this.setResizable(false);
//		this.setMinimumSize(new Dimension(300,300));


    this.setLayout(new FlowLayout());
    this.setLayout(null);

    display = new JLabel("Investing plan's name.");
    display.setBounds(20, 10, 800, 20);
    this.add(display);

    //the textfield
    percentageName = new JTextField(5);
    percentageName.setBounds(20, 40, 200, 20);
    this.add(percentageName);

    //output area
    sTextArea = new JTextArea("Result will be displayed here.", 10, 20);
    JScrollPane scrollPane = new JScrollPane(sTextArea);
    sTextArea.setLineWrap(true);
    //scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
    scrollPane.setBorder(BorderFactory.createTitledBorder("Result"));
    scrollPane.setBounds(500, 20, 340, 470);
    this.add(scrollPane);

    display2 = new JLabel("File name");
    display2.setBounds(20, 80, 800, 20);
    this.add(display2);

    //the textfield
    fileName = new JTextField(10);
    fileName.setBounds(20, 110, 200, 20);
    this.add(fileName);

    //echobutton
    echoButton = new JButton("Save an investing plan");
    echoButton.setActionCommand("SavePercentage Echo Button");
    echoButton.setBounds(20, 460, 180, 20);
    this.add(echoButton);

    //exit button
    exitButton = new JButton("Exit");
    exitButton.setActionCommand("SavePercentage Exit Button");
    exitButton.setBounds(220, 460, 80, 20);
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
    return "savepercentage " + percentageName.getText() + " " + fileName.getText();
  }

  @Override
  public void clearInputString() {
    percentageName.setText("");
    fileName.setText("");
  }


}

