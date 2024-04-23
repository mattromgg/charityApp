package greengates.ib.charity.project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import greengates.ib.charity.project.utils.ReadCSV;
import greengates.ib.charity.project.donations.Donation;
import greengates.ib.charity.project.donations.Charity;

import java.net.URL;


/**
 * JavaFX App
 */
//branch test

public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {

        ReadCSV readCSV = new ReadCSV("Donations.csv");
        readCSV.read();
        List<List<String>> donations = readCSV.getDonations();
        
        ArrayList<Donation> userDonations = new ArrayList<Donation>();
        ArrayList<Charity> charities = new ArrayList<Charity>();

        for (List<String> donation : donations) {
            //System.out.println(donation.get(7));
            if (donations.indexOf(donation) != 0) {
                String[] recordArray = donation.toArray(new String[0]);
                Integer mappedId = Integer.parseInt(recordArray[0]);
                String mappedAmountString = recordArray[7].substring(1);
                mappedAmountString = mappedAmountString.replaceAll(",", "");
                Double mappedAmount = Double.parseDouble(mappedAmountString);
                System.out.println(mappedAmount);
                Donation userDonation = new Donation(mappedId, recordArray[1], recordArray[2], recordArray[3], recordArray[4], recordArray[5], recordArray[6], mappedAmount, recordArray[8]);
                userDonations.add(userDonation);
                Charity userCharity = new Charity(userDonation.getRecipient());
                charities.add(userCharity);   
                //System.out.println(userCharity.getCharityName());           
            }
        }
        launch();
    }
}