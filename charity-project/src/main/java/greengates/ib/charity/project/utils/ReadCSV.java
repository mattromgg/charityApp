package greengates.ib.charity.project.utils;


import java.util.Scanner;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.List;
import java.util.ArrayList;

import java.net.URL;

public class ReadCSV {

    private String fileName;
    private List<List<String>> donations;
    public static final String COMMA_DELIMITER = ",";

    public ReadCSV(String fileName){
        this.fileName = fileName;
        this.donations = new ArrayList<>();
    }

    public List<List<String>> getDonations(){
        return donations;
    }

    public void read(){
        System.out.println("Reading file: " + this.fileName);
        // Reading file: data.csv
        
        try{
            ClassLoader classLoader = getClass().getClassLoader();
            System.out.println(classLoader.getResource(this.fileName));
            File file = new File(classLoader.getResource(this.fileName).getFile());
            System.out.println("File read =" + file);
            Scanner scanner = new Scanner(file);
            System.out.println("Scanner =" + scanner);
            
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
                donations.add(getDonationFromLine(line));
            }
            scanner.close();
        } catch (Exception e){
            System.out.println("Error reading file: " + this.fileName);
            System.out.println(e.getMessage());
        }
    }

    private List<String> getDonationFromLine(String line) {
        //System.out.println(line.get(7));
        List<String> values = new ArrayList<String>();
        // Regular expression to match either quoted or non-quoted fields
        Pattern pattern = Pattern.compile("(?:\"([^\"]*)\"|([^\",]*))" + Pattern.quote(COMMA_DELIMITER));
        Matcher matcher = pattern.matcher(line + COMMA_DELIMITER); // Adding COMMA_DELIMITER at the end to match the last field

        while (matcher.find()) {
            String value = matcher.group(1);
            if (value == null) {
                value = matcher.group(2);
            }
            values.add(value);
        }
        return values;
    }


}