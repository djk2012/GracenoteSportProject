/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gracenotesports;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListModel;

/**
 *
 * @author ding
 */
public class SoccerDataGUI extends JFrame {

    private static final int WINDOW_WIDTH = 1200; // define the window's width
    private static final int WINDOW_LENGTH = 500;// define the window's height

    private JPanel bannerPanel;
    private JPanel dataSearchPanel;
    private JPanel dataShowPanel;

    private JList dataViewList;
    private JList dataItemList;
    private JList SearchtemList;

    private ListModel dataListLM;
    private DefaultListModel dataListCartDLM;

    private JScrollPane scrollPane1;

    private JLabel panelTitle;
    private JLabel searchTitle;
    private JLabel viewLabel;

    private JComboBox dropDownList;

    private JButton searchSelectedBut;
    private JButton showAllBut;

    private JTextField searchField;

    private ListModel searchItem;

    GracenoteSports gs = new GracenoteSports();
    private ArrayList<Data> datalist = gs.getDataList();   //Inital the data in the datalist

    private String selectedDropDownlistColumn;

    // define the value of menu item in thedropdownlist 
    private String[] searchContent = {"----choose column----","actionId", "competition",
        "matchId", "date", "action", "period", "startTime", "endtime", "homeOrAway", "teamId", "team", "personId", "person", "function", "shirtNr", "actionReason", "actionInfo", "actionInfo", "subperson"};

    // Initial the layout of soccerDataGUI
    public SoccerDataGUI() throws IOException {
        setTitle("GracenoteSports System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setSize(WINDOW_WIDTH, WINDOW_LENGTH);
        buildBannerPanel();
        buildSearchPanel();
        buildViewPanel();
        add(bannerPanel, BorderLayout.NORTH);
        add(dataSearchPanel, BorderLayout.CENTER);
        add(dataShowPanel, BorderLayout.SOUTH);
        setVisible(true);
        pack();
    }

    // define layout of BannerPanel
    public void buildBannerPanel() {

        bannerPanel = new JPanel();
        setLayout(new BorderLayout());
        String labelText = "<html><b COLOR=RED> Welcome to GracenoteSports !</b>";
        JLabel bannerLabel = new JLabel(labelText);
        bannerLabel.setFont(new Font("Serif", Font.BOLD, 28));
        bannerPanel.add(bannerLabel);
    }
   
    // build layout of SearchPanel
    public void buildSearchPanel() {

        dataSearchPanel = new JPanel();
        dataSearchPanel.setLayout(new GridLayout(1, 3));
        dataSearchPanel.setPreferredSize(new Dimension(50, 50));

        dropDownList = new JComboBox();
        InitDropdownList();
        dropDownList.addActionListener(new dropDownListListener());

        searchField = new JTextField();

        searchSelectedBut = new JButton("Search");
        searchSelectedBut.addActionListener(new searchButtonListener());

        showAllBut = new JButton("Show All");
        showAllBut.addActionListener(new showAllButtonListener());

        dataSearchPanel.add(dropDownList);
        dataSearchPanel.add(searchField);
        dataSearchPanel.add(searchSelectedBut);
        dataSearchPanel.add(showAllBut);

    }
    
     // build layout of ViewPanel
    public void buildViewPanel() {
        dataShowPanel = new JPanel();
        dataShowPanel.setLayout(new BorderLayout());

        dataViewList = new JList();
        dataViewList.setVisibleRowCount(5);

        SearchtemList = new JList();

        scrollPane1 = new JScrollPane(dataViewList);
        scrollPane1.setPreferredSize(new Dimension(700, 400));
        viewLabel = new JLabel("Data View ");

        dataShowPanel.add(viewLabel, BorderLayout.NORTH);
        dataShowPanel.add(scrollPane1);

    }

    // Intial the dropdownlist'values
    public void InitDropdownList() {

        for (int i = 0; i < searchContent.length; i++) {
            dropDownList.addItem(searchContent[i]);
        }
    }

    // implement the actionLister of SearchButton
    public class searchButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            ArrayList<Data> al = new ArrayList();
            String inputItem = searchField.getText();
            String compareItem = null;
            
            for (int i = 0; i < datalist.size(); i++) {
                switch (selectedDropDownlistColumn) {
                    case "actionId":
                        // Statements
                        compareItem = datalist.get(i).getActionId();
                        break; // optional                  
                    case "competition":
                        // Statements
                        compareItem = datalist.get(i).getCompetition();
                        break;
                    case "matchId":
                        // Statements
                        compareItem = datalist.get(i).getMatchId();
                        break;
                    case "date":
                        // Statements
                        compareItem = datalist.get(i).getDate();
                        break;
                    case "action":
                        // Statements
                        compareItem = datalist.get(i).getAction();
                        break;
                    case "period":
                        // Statements
                        compareItem = datalist.get(i).getPeriod();
                        break;
                    case "startTime":
                        // Statements
                        compareItem = datalist.get(i).getStartTime();
                        break;
                    case "endtime":
                        // Statements
                        compareItem = datalist.get(i).getEndtime();
                        break;
                    case "homeOrAway":
                        // Statements
                        compareItem = datalist.get(i).getHomeOrAway();
                        break;
                    case "teamId":
                        // Statements
                        compareItem = datalist.get(i).getTeamId();
                        break;
                    case "team":
                        // Statements
                        compareItem = datalist.get(i).getTeam();
                        break;
                    case "personId":
                        // Statements
                        compareItem = datalist.get(i).getPersonId();
                        break;
                    case "person":
                        // Statements
                        compareItem = datalist.get(i).getPerson();
                        break;
                    case "function":
                        // Statements
                        compareItem = datalist.get(i).getFunction();
                        break;
                    case "shirtNr":
                        // Statements
                        compareItem = datalist.get(i).getShirtNr();
                        break;
                    case "actionReason":
                        // Statements
                        compareItem = datalist.get(i).getActionReason();
                        break;
                    case "actionInfo":
                        // Statements
                        compareItem = datalist.get(i).getActionInfo();
                        break;
                    case "subperson":
                        // Statements
                        compareItem = datalist.get(i).getSubperson();
                        break;
                    // You can have any number of case statements.
                    default: // Optional
                    // Statements
                }

                if (inputItem.equals(compareItem)) {
                    al.add(datalist.get(i));
                }

            }

            dataViewList.setModel(new DefaultListModel());
            for (int i = 0; i < al.size(); i++) {
                ((DefaultListModel) dataViewList.getModel()).addElement(al.get(i).toString());
                
            }
        }

    }

    // implement the actionLister of showButton
    public class showAllButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            dataViewList.setModel(new DefaultListModel());
            
            for (int i = 0; i < datalist.size(); i++) {
                ((DefaultListModel) dataViewList.getModel()).addElement(datalist.get(i).toString());               
            }           
        }

    }

    // implement the actionLister of dropdownlist
    public class dropDownListListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            selectedDropDownlistColumn = ((JComboBox) e.getSource()).getSelectedItem().toString();
        }

    }

    public static void main(String[] args) throws IOException {

        new SoccerDataGUI();
    }

}
