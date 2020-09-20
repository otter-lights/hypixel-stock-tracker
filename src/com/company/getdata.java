package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;
import java.net.URL;
import java.net.URLConnection;

import com.google.gson.*;


public class getdata implements ActionListener {

    private JFrame frame;
    private JLabel title;
    private JComboBox<String> minions;
    private JLabel output;
    private JButton submit;
    private JComboBox<String> selectRate;

    getdata(){
        guiMaker();
    }

    public void guiMaker(){
        frame = new JFrame();
        frame.setLayout(null);
        Color bg = new Color (103,142,199);
        frame.getContentPane().setBackground(bg);

        String[] minionList = new String[] {"Wheat", "Carrot", "Potato", "Pumpkin", "Melon", "Mushroom",
                                            "Cocoa Beans", "Cactus", "Sugar Cane", "Cow", "Pig",
                                            "Chicken", "Sheep", "Rabbit", "Nether Wart"};

        String[] rateList = new String[] {"1","2","3","4","5","6","7","8","9","10","11"};

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(400,400));

        submit = new JButton();
        submit.setText("Submit");
        submit.setBounds(10,150,100,50);
        frame.getContentPane().add(submit);

        title = new JLabel("Josef's Project");
        title.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        title.setBounds(10,10,200,50);
        frame.getContentPane().add(title);

        minions = new JComboBox<>(minionList);
        minions.setBounds(10,75,100,50);
        minions.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        frame.getContentPane().add(minions);

        selectRate = new JComboBox<>(rateList);
        selectRate.setBounds(125,75,50,50);
        selectRate.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        frame.getContentPane().add(selectRate);

        output = new JLabel();
        output.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        output.setBounds(10,250,300,50);
        frame.getContentPane().add(output);

        frame.setVisible(true);
        submit.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String selectedMinion = (String) minions.getSelectedItem();
        String rate = (String) selectRate.getSelectedItem();
        int iRate = Integer.parseInt(rate);
        iRate = iRate - 1;

        String[] items;
        int[] enchant;
        double[] values;
        double[] level;

        switch(selectedMinion) {
            case "Wheat":
                items = new String[]{"ENCHANTED_HAY_BLOCK", "ENCHANTED_SEEDS"};
                enchant = new int[]{1296, 160};
                values = new double[]{1.0,1.0};
                level = new double[]{2,2,2.31,2.31,2.73,2.73,3,3,3.33,3.33,3.75};
                starter(items, level[iRate], enchant, values);
                break;
            case "Carrot":
                items = new String[]{"ENCHANTED_CARROT"};
                enchant = new int[]{160};
                values = new double[]{4.0};
                level = new double[]{1.5,1.5,1.67,1.67,1.88,1.88,2.14,2.14,2.5,2.5,3};
                starter(items, level[iRate], enchant, values);
                break;
            case "Potato":
                items = new String[]{"ENCHANTED_POTATO"};
                enchant = new int[]{160};
                values = new double[]{4.0};
                level = new double[]{1.5,1.5,1.67,1.67,1.88,1.88,2.14,2.14,2.5,2.5,3};
                starter(items, level[iRate], enchant, values);
                break;
            case "Melon":
                items = new String[]{"ENCHANTED_MELON"};
                enchant = new int[]{160};
                values = new double[]{4.0};
                level = new double[]{2.5,2.5,2.67,2.67,2.86,2.86,3.24,3.24,3.75,3.75,4.62};
                starter(items, level[iRate], enchant, values);
                break;
            case "Mushroom":
                items = new String[]{"ENCHANTED_RED_MUSHROOM", "ENCHANTED_BROWN_MUSHROOM"};
                enchant = new int[]{160,160};
                values = new double[]{1.0,1.0};
                level = new double[]{1,1,1.07,1.15,1.15,1.3,1.3,1.5,1.5,1.88};
                starter(items, level[iRate], enchant, values);
                break;
            case "Cocoa Beans":
                items = new String[]{"ENCHANTED_COCOA"};
                enchant = new int[]{160};
                values = new double[]{3.0};
                level = new double[]{1.11,1.11,1.2,1.2,1.3,1.3,1.43,1.43,1.67,1.67,2};
                starter(items, level[iRate], enchant, values);
                break;
            case "Cactus":
                items = new String[]{"ENCHANTED_CACTUS_GREEN"};
                enchant = new int[]{160};
                values = new double[]{3.0};
                level = new double[]{1.11,1.11,1.2,1.2,1.3,1.3,1.43,1.43,1.67,1.67,2};
                starter(items, level[iRate], enchant, values);
                break;
            case "Sugar Cane":
                items = new String[]{"ENCHANTED_SUGAR_CANE"};
                enchant = new int[]{25600};
                values = new double[]{3.0};
                level = new double[]{1.36,1.36,1.5,1.5,1.67,1.67,1.88,1.88,2.07,2.07,2.5};
                starter(items, level[iRate], enchant, values);
                break;
            case "Cow":
                items = new String[]{"ENCHANTED_LEATHER", "ENCHANTED_RAW_BEEF"};
                enchant = new int[]{576, 160};
                values = new double[]{1.0,1.0};
                level = new double[]{1.15,1.15,1.25,1.25,1.36,1.36,1.5,1.5,1.76,1.76,2.31};
                starter(items, level[iRate], enchant, values);
                break;
            case "Pig":
                items = new String[]{"ENCHANTED_GRILLED_PORK"};
                enchant = new int[]{25600};
                values = new double[]{1.0};
                level = new double[]{1.15,1.15,1.25,1.25,1.36,1.36,1.5,1.5,1.76,1.76,2.31};
                starter(items, level[iRate], enchant, values);
                break;
            case "Chicken":
                items = new String[]{"ENCHANTED_RAW_CHICKEN", "ENCHANTED_FEATHER", "SUPER_EGG"};
                enchant = new int[]{160, 160, 20736};
                values = new double[]{1.0,1.0,1.0};
                level = new double[]{1.15,1.15,1.25,1.25,1.36,1.36,1.5,1.5,1.76,1.76,2.31};
                starter(items, level[iRate], enchant, values);
                break;
            case "Sheep":
                items = new String[]{"ENCHANTED_MUTTON"};
                enchant = new int[]{160};
                values = new double[]{1.0};
                level = new double[]{1.15,1.15,1.25,1.25,1.36,1.36,1.5,1.5,1.76,1.76,2.31};
                starter(items, level[iRate], enchant, values);
                break;
            case "Rabbit":
                items = new String[]{"ENCHANTED_RABBIT_HIDE", "ENCHANTED_RABBIT_FOOT", "ENCHANTED_RABBIT"};
                enchant = new int[]{576, 160, 160};
                values = new double[]{0.35,0.35,1};
                level = new double[]{1.15,1.15,1.25,1.25,1.36,1.36,1.5,1.5,1.76,1.76,2.31};
                starter(items, level[iRate], enchant, values);
                break;
            case "Nether Wart":
                items = new String[]{"ENCHANTED_NETHER_STALK"};
                enchant = new int[]{160};
                values = new double[]{3.0};
                level = new double[]{0.6,0.6,0.64,0.64,0.68,0.68,0.73,0.73,0.79,0.79,0.94};
                starter(items, level[iRate], enchant, values);
                break;
        }

    }

    public void starter(String[] items, double rate, int[] enchant, double[] values){
        double totalProfit = 0;
        for(int i = 0; i < items.length; i++){
            try{
                Downloader(items[i]);
            }
            catch (IOException e){
                e.printStackTrace();
            }
            JsonPrimitive price = jsonParse();
            double profit = calculator(price, rate, enchant[i], values[i]);
            totalProfit += profit;
        }
        int profitInt = (int) totalProfit;
        System.out.println(profitInt);
        output.setText("Your Daily Profit Is " + profitInt + " Coins");
    }

    public static double calculator(JsonPrimitive price, double rate, int enchant, double values){
        int intPrice = price.getAsInt();
        double amount = (rate / enchant) * values;
        double efficency = amount * intPrice;
        double profit = efficency * 60 * 24;
        System.out.println(profit);
        return(profit);
    }


    public static JsonPrimitive jsonParse() {
        JsonParser parser = new JsonParser();
        Object obj = null;
        try {
            obj = parser.parse(new FileReader("item.json"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        JsonObject json = (JsonObject) obj;
        JsonObject info = (JsonObject) json.get("product_info");
        JsonObject status = (JsonObject) info.get("quick_status");
        JsonPrimitive sellPrice = (JsonPrimitive) status.get("sellPrice");
        System.out.println(sellPrice);
        return sellPrice;
    }


    public static void Downloader(String id)throws IOException{
        URL url = new URL("https://api.hypixel.net/skyblock/bazaar/product?key=c6caacf1-7c9a-41d6-81bc-91eed6ccff4a&productId=" + id);

        URLConnection con = url.openConnection();
        InputStream is = con.getInputStream();

        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File ("item.json")));
        StringBuffer sb = new StringBuffer();

        String line = null;

        while((line = br.readLine()) != null){
            System.out.println(line);
            sb.append(line);
            bw.write(line);
            bw.flush();
        }
        bw.close();
        System.out.println("File Created");
    }
}
