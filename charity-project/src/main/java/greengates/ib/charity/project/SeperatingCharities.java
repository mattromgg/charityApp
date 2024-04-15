package greengates.ib.charity.project;
// in this class we have the readcsv method split
//this has everything with seeing the actual code
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;

import java.util.Map;

/*
ik this is super inefficient, working on a method for this
 */

public class SeperatingCharities {
    ArrayList<String> allTheCharities = new ArrayList<>(Arrays.asList("Tagtune", "Wikibox", "Roombo", "Trudoo", "Yakitri", "Tagfeed", "Podcat", "Kwimbee", "Minyx", "Ntags", "Thoughtstorm", "Devpulse", "Kaymbo", "Jabbersphere", "Gigabox", "Meemm", "Gigazoom", "Dabvine", "Skilith", "Realcube", "Gabvine", "Pixoboo", "Skyble", "Babbleblab", "Shuffletag", "Thoughtsphere", "Centimia", "Snaptags", "Leenti", "Dynava", "Buzzster", "Twitterworks", "Shufflester", "DabZ", "Meezzy", "Eire", "Izio", "Photobean", "Yodoo"));

    ArrayList<String> Tagtune = new ArrayList<>();
    ArrayList<String> Wikibox = new ArrayList<>();
    ArrayList<String> Roombo = new ArrayList<>();
    ArrayList<String> Trudoo = new ArrayList<>();
    ArrayList<String> Yakitri = new ArrayList<>();
    ArrayList<String> Tagfeed = new ArrayList<>();
    ArrayList<String> Podcat = new ArrayList<>();
    ArrayList<String> Kwimbee = new ArrayList<>();
    ArrayList<String> Minyx = new ArrayList<>();
    ArrayList<String> Ntags = new ArrayList<>();
    ArrayList<String> Thoughtstorm = new ArrayList<>();
    ArrayList<String> Devpulse = new ArrayList<>();
    ArrayList<String> Kaymbo = new ArrayList<>();
    ArrayList<String> Jabbersphere = new ArrayList<>();
    ArrayList<String> Gigabox = new ArrayList<>();
    ArrayList<String> Meemm = new ArrayList<>();
    ArrayList<String> Gigazoom = new ArrayList<>();
    ArrayList<String> Dabvine = new ArrayList<>();
    ArrayList<String> Skilith = new ArrayList<>();
    ArrayList<String> Realcube = new ArrayList<>();
    ArrayList<String> Gabvine = new ArrayList<>();
    ArrayList<String> Pixoboo = new ArrayList<>();
    ArrayList<String> Skyble = new ArrayList<>();
    ArrayList<String> Babbleblab = new ArrayList<>();
    ArrayList<String> Shuffletag = new ArrayList<>();
    ArrayList<String> Thoughtsphere = new ArrayList<>();
    ArrayList<String> Centimia = new ArrayList<>();
    ArrayList<String> Snaptags = new ArrayList<>();
    ArrayList<String> Leenti = new ArrayList<>();
    ArrayList<String> Dynava = new ArrayList<>();
    ArrayList<String> Buzzster = new ArrayList<>();
    ArrayList<String> Twitterworks = new ArrayList<>();
    ArrayList<String> Shufflester = new ArrayList<>();
    ArrayList<String> DabZ = new ArrayList<>();
    ArrayList<String> Meezzy = new ArrayList<>();
    ArrayList<String> Eire = new ArrayList<>();
    ArrayList<String> Izio = new ArrayList<>();
    ArrayList<String> Photobean = new ArrayList<>();
    ArrayList<String> Yodoo = new ArrayList<>();

    public String[] splitAsterric(String line) {
        if (line.contains("*")) {
            return line.split("\\*");
        }
        return new String[0];
    }


    // so in this one, it is actually reading the csv file, and based on the different charity
    // it is sorting them into different arraylists ive created
    public void readCSV() {


        String csvFile = "CSV File"; // this is actually defining the CSV File, its calling it and giving it a name of CSV File
        List<List<String>> records = new ArrayList<>(); //this creates an array of Strings named 'records'
        String line; // defining a String Line
        String[] data; //definng a list of Strings named data
        // Constructor

        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("CSV File"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        List<String> charities = Arrays.asList(   "Tagtune", "Wikibox", "Roombo", "Trudoo", "Yakitri", "Tagfeed", "Podcat", "Kwimbee", "Minyx",
                "Ntags", "Thoughtstorm", "Devpulse", "Kaymbo", "Jabbersphere", "Gigabox", "Meemm", "Gigazoom",
                "Dabvine", "Skilith", "Realcube", "Gabvine", "Pixoboo", "Skyble", "Babbleblab", "Shuffletag",
                "Thoughtsphere", "Centimia", "Snaptags", "Leenti", "Dynava", "Buzzster", "Twitterworks", "Shufflester",
                "DabZ", "Meezzy", "Eire", "Izio", "Photobean", "Yodoo"
        );

        Map<String, List<String>> charityMap = new HashMap<>();


        while (scanner.hasNext()) {
            line = scanner.nextLine();  // Read a line
            for(String charity : charities){
                if (line.contains(charity)){
                    List<String> charityList = charityMap.get(charity);
                    charityList.add(line + "*");
                }
            }


            if (line.contains("Tagtune")) {
                Tagtune.add(line + "*");
            }
            if (line.contains("Wikibox")) {
                Wikibox.add(line + "*");
            }
            if (line.contains("Roombo")) {
                Roombo.add(line + "*");
            }
            if (line.contains("Trudoo")) {
                Trudoo.add(line + "*");
            }
            if (line.contains("Yakitri")) {
                Yakitri.add(line + "*");
            }
            if (line.contains("Tagfeed")) {
                Tagfeed.add(line + "*");
            }
            if (line.contains("Podcat")) {
                Podcat.add(line + "*");
            }
            if (line.contains("Kwimbee")) {
                Kwimbee.add(line + "*");
            }
            if (line.contains("Minyx")) {
                Minyx.add(line + "*");
            }
            if (line.contains("Ntags")) {
                Ntags.add(line + "*");
            }
            if (line.contains("Thoughtstorm")) {
                Thoughtstorm.add(line + "*");
            }
            if (line.contains("Devpulse")) {
                Devpulse.add(line + "*");
            }
            if (line.contains("Kaymbo")) {
                Kaymbo.add(line + "*");
            }
            if (line.contains("Jabbersphere")) {
                Jabbersphere.add(line + "*");
            }
            if (line.contains("Gigabox")) {
                Gigabox.add(line + "*");
            }
            if (line.contains("Meemm")) {
                Meemm.add(line + "*");
            }
            if (line.contains("Gigazoom")) {
                Gigazoom.add(line + "*");
            }
            if (line.contains("Dabvine")) {
                Dabvine.add(line + "*");
            }
            if (line.contains("Skilith")) {
                Skilith.add(line + "*");
            }
            if (line.contains("Realcube")) {
                Realcube.add(line + "*");
            }
            if (line.contains("Gabvine")) {
                Gabvine.add(line + "*");
            }
            if (line.contains("Pixoboo")) {
                Pixoboo.add(line + "*");
            }
            if (line.contains("Skyble")) {
                Skyble.add(line + "*");
            }
            if (line.contains("Babbleblab")) {
                Babbleblab.add(line + "*");
            }
            if (line.contains("Shuffletag")) {
                Shuffletag.add(line + "*");
            }
            if (line.contains("Thoughtsphere")) {
                Thoughtsphere.add(line + "*");
            }
            if (line.contains("Centimia")) {
                Centimia.add(line + "*");
            }
            if (line.contains("Snaptags")) {
                Snaptags.add(line + "*");
            }
            if (line.contains("Leenti")) {
                Leenti.add(line + "*");
            }
            if (line.contains("Dynava")) {
                Dynava.add(line + "*");
            }
            if (line.contains("Buzzster")) {
                Buzzster.add(line + "*");
            }
            if (line.contains("Twitterworks")) {
                Twitterworks.add(line + " * ");
            }
            if (line.contains("Shufflester")) {
                Shufflester.add(line + "*");
            }
            if (line.contains("DabZ")) {
                DabZ.add(line + "*");
            }
            if (line.contains("Meezzy")) {
                Meezzy.add(line + "*");
            }
            if (line.contains("Eire")) {
                Eire.add(line + "*");
            }
            if (line.contains("Izio")) {
                Izio.add(line + "*");
            }
            if (line.contains("Photobean")) {
                Photobean.add(line + "*");
            }
            if (line.contains("Yodoo")) {
                Yodoo.add(line + "*"); //we are adding the . because it doesnt exist, and we are using it to split each line of the code
                // to be used in the next part to tell the computer this is where we're splitting the line
            }
        }
        // System.out.println(Yodoo);
        scanner.close();

    }
}