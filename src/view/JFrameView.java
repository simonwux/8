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
 * This class represents the main view of this stock trading system..
 */
public class JFrameView extends JFrame implements IView {
  private JLabel display;
  private JButton echoButton;
  private JButton exitButton;
  private JButton createButton;
  private JButton getAllStateButton;
  private JButton getStateButton;
  private JButton determineCostButton;
  private JButton determineFeeButton;
  private JButton determineValueButton;
  private JButton buyButton;
  private JButton buyPercentageButton;
  private JButton buyAmountButton;
  private JButton createFixedButton;
  private JButton createPercentageButton;
  private JButton savePortfolioButton;
  private JButton savePercentageButton;
  private JButton loadPortfolioButton;
  private JButton loadPercentageButton;
  private JTextField input;
  private JTextArea sTextArea;

  /**
   * This is the constructor of this view. It will set up the places and id of the buttons and text
   * areas.
   *
   * @param caption the view's title
   */
  public JFrameView(String caption) {
    super(caption);
    setSize(900, 600);
    setLocation(200, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    this.setLayout(null);
    display = new JLabel("Welcome to the stock trading system.");
    display.setBounds(20, 10, 800, 20);


    this.add(display);

    //the textfield
    input = new JTextField(20);
    input.setBounds(20, 40, 240, 20);
    this.add(input);

    //output area
    sTextArea = new JTextArea("You can input: create, createfixed, createp, buy, buya, buyp, "
            + "determinecost, determinevalue, determinefee, getstate, "
            + "getallstate, saveportfolio, loadportfolio, savepercentage, or loadpercentage\n\n"
            + "Result will be displayed here.", 10, 20);
    JScrollPane scrollPane = new JScrollPane(sTextArea);
    sTextArea.setLineWrap(true);
    scrollPane.setBorder(BorderFactory.createTitledBorder("Result"));
    scrollPane.setBounds(20, 60, 340, 400);
    this.add(scrollPane);

    //echobutton
    echoButton = new JButton("Go");
    echoButton.setActionCommand("Echo Button");
    echoButton.setBounds(280, 40, 80, 20);
    this.add(echoButton);

    //createButton
    createButton = new JButton("Create an empty portfolio");
    createButton.setActionCommand("Create Button");
    createButton.setBounds(400, 40, 200, 20);
    this.add(createButton);

    //getAllStateButton
    getAllStateButton = new JButton("Get all state");
    getAllStateButton.setActionCommand("GetAllState Button");
    getAllStateButton.setBounds(620, 40, 200, 20);
    this.add(getAllStateButton);

    //getStateButton
    getStateButton = new JButton("Get state");
    getStateButton.setActionCommand("GetState Button");
    getStateButton.setBounds(400, 100, 200, 20);
    this.add(getStateButton);

    //determineCostButton
    determineCostButton = new JButton("Determine Cost");
    determineCostButton.setActionCommand("DetermineCost Button");
    determineCostButton.setBounds(620, 100, 200, 20);
    this.add(determineCostButton);


    //determineCostButton
    determineFeeButton = new JButton("Determine Fee");
    determineFeeButton.setActionCommand("DetermineFee Button");
    determineFeeButton.setBounds(400, 160, 200, 20);
    this.add(determineFeeButton);


    //determineValueButton
    determineValueButton = new JButton("Determine Value");
    determineValueButton.setActionCommand("DetermineValue Button");
    determineValueButton.setBounds(620, 160, 200, 20);
    this.add(determineValueButton);

    //buyButton
    buyButton = new JButton("Buy a stock by shares");
    buyButton.setActionCommand("Buy Button");
    buyButton.setBounds(400, 220, 200, 20);
    this.add(buyButton);

    //buyPercentageButton
    buyPercentageButton = new JButton("Buy an investing plan");
    buyPercentageButton.setActionCommand("BuyPercentage Button");
    buyPercentageButton.setBounds(620, 220, 200, 20);
    this.add(buyPercentageButton);

    //buyAmountButton
    buyAmountButton = new JButton("Buy a stock by amount");
    buyAmountButton.setActionCommand("BuyAmount Button");
    buyAmountButton.setBounds(400, 280, 200, 20);
    this.add(buyAmountButton);

    //createFixedButton
    createFixedButton = new JButton("Create a fixed portfolio");
    createFixedButton.setActionCommand("CreateFixed Button");
    createFixedButton.setBounds(620, 280, 200, 20);
    this.add(createFixedButton);

    //createPercentageButton
    createPercentageButton = new JButton("Create an investing plan");
    createPercentageButton.setActionCommand("CreatePercentage Button");
    createPercentageButton.setBounds(400, 340, 200, 20);
    this.add(createPercentageButton);

    //savePortfolioButton
    savePortfolioButton = new JButton("Save a portfolio");
    savePortfolioButton.setActionCommand("SavePortfolio Button");
    savePortfolioButton.setBounds(620, 340, 200, 20);
    this.add(savePortfolioButton);

    //savePercentageButton
    savePercentageButton = new JButton("Save an investing plan");
    savePercentageButton.setActionCommand("SavePercentage Button");
    savePercentageButton.setBounds(400, 400, 200, 20);
    this.add(savePercentageButton);

    //loadPortfolioButton
    loadPortfolioButton = new JButton("Load a portfolio");
    loadPortfolioButton.setActionCommand("LoadPortfolio Button");
    loadPortfolioButton.setBounds(620, 400, 200, 20);
    this.add(loadPortfolioButton);

    //loadPercentageButton
    loadPercentageButton = new JButton("Load an investing plan");
    loadPercentageButton.setActionCommand("LoadPercentage Button");
    loadPercentageButton.setBounds(400, 460, 200, 20);
    this.add(loadPercentageButton);

    //exit button
    exitButton = new JButton("Exit");
    exitButton.setActionCommand("Exit Button");
    exitButton.setBounds(620, 460, 200, 20);
    this.add(exitButton);


    setVisible(true);

  }

  @Override
  public void addActionListener(ActionListener actionListener) {
    echoButton.addActionListener(actionListener);
    createButton.addActionListener(actionListener);
    exitButton.addActionListener(actionListener);
    getAllStateButton.addActionListener(actionListener);
    getStateButton.addActionListener(actionListener);
    determineCostButton.addActionListener(actionListener);
    determineFeeButton.addActionListener(actionListener);
    determineValueButton.addActionListener(actionListener);
    buyButton.addActionListener(actionListener);
    buyPercentageButton.addActionListener(actionListener);
    buyAmountButton.addActionListener(actionListener);
    createFixedButton.addActionListener(actionListener);
    createPercentageButton.addActionListener(actionListener);
    savePortfolioButton.addActionListener(actionListener);
    savePercentageButton.addActionListener(actionListener);
    loadPortfolioButton.addActionListener(actionListener);
    loadPercentageButton.addActionListener(actionListener);
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
    return input.getText();
  }

  @Override
  public void clearInputString() {
    input.setText("");
  }


}

