package greengates.ib.charity.project;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SeperatingInsideCharities {
    SeperatingCharities charity = new SeperatingCharities();
    ArrayList<String> donor = new ArrayList<>();
    ArrayList<String> totalArray = new ArrayList<>();
    ArrayList<String> name = new ArrayList<>();
    ArrayList<String> email = new ArrayList<>();
    ArrayList<String> adress = new ArrayList<>();
    ArrayList<String> taxNumber = new ArrayList<>();
    //already have month
    ArrayList<String> money = new ArrayList<>();
    ArrayList<String> month = new ArrayList<>();



    //this is suppsed to go through the csv list of the charity, and split it when it sees a @, logic is failing
    public ArrayList<String> splitInListEmail(ArrayList<String> individual) {
        email.add("Email List: ");
        for (String element : individual) {
            if (element.contains(" ")) {
                String[] splitElements = element.split("\\s+");
                for (String splitElement : splitElements) {
                    System.out.println(splitElement);
                    if (splitElement.contains("@")) {
                        email.add(splitElement + ", ");
                    }
                }
            }
        }
        //System.out.println(email);
        return email;
    }

    public ArrayList<String> splitInListDonor(ArrayList<String> individual, ArrayList<String> Return) {
        for (String element : individual) {
            if (element.contains(" ")) {
                String[] splitElements = element.split("\\s+");
                for(int x = 0; x < splitElements.length; x++){
                    String increasingElement = splitElements[x];
                    if (x == 1 || x == 2){
                        name.add(increasingElement);
                    }
                    if (x == 4 || x == 5 || x == 6){
                        adress.add(increasingElement);
                    }
                    if (x == 7){
                        taxNumber.add(increasingElement);
                    }
                    if (x == 9){
                        money.add(increasingElement);
                    }
                }
            }

        }
        return Return;//when using this, choose to return any of the arraylists, like money or taxNumber
    }

    public String[] splitAsterric(String line) {//used in the splitMonth class
        if (line.contains("*")) {
            return line.split("\\*");
        }
        return new String[0];
    }
    public ArrayList<ArrayList> splitMonth(List<String> inputList) {//as the months are different, i created a seperte class to seperate
        //the months

        ArrayList<String> January = new ArrayList<>();
        January.add("Jan: ");
        ArrayList<String> February = new ArrayList<>();
        February.add("Feb: ");
        ArrayList<String> March = new ArrayList<>();
        March.add("Mar: ");
        ArrayList<String> April = new ArrayList<>();
        April.add("Apr: ");
        ArrayList<String> May = new ArrayList<>();
        May.add("May: ");
        ArrayList<String> June = new ArrayList<>();
        June.add("Jun: ");
        ArrayList<String> July = new ArrayList<>();
        July.add("Jul: ");
        ArrayList<String> August = new ArrayList<>();
        August.add("Aug: ");
        ArrayList<String> September = new ArrayList<>();
        September.add("Sep: ");
        ArrayList<String> October = new ArrayList<>();
        October.add("Oct: ");
        ArrayList<String> November = new ArrayList<>();
        November.add("Nov: ");
        ArrayList<String> December = new ArrayList<>();
        November.add("Dec: ");

        ArrayList<ArrayList> allMonths = null;
        for (String line : inputList) {
            // Split each line using splitAsterric method
            String[] elements = splitAsterric(line);

            // Iterate over each element
            for (String element : elements) {
                //String[] elements = splitAsterric(inputList); // Assuming splitAsterric method is defined and returns an array of strings

                if (element.contains("01/") || element.contains("1/")) {
                    January.add(element);
                    //return January;
                } else if (element.contains("02/") || element.contains("2/")) {
                    February.add(element);
                    February.add("\n");
                    //return February;
                } else if (element.contains("03/") || element.contains("3/")) {
                    March.add(element);
                    // return March;
                } else if (element.contains("04/") || element.contains("4/")) {
                    April.add(element);
                    //  return April;
                } else if (element.contains("05/") || element.contains("5/")) {
                    May.add(element);
                    //   return May;
                } else if (element.contains("06/") || element.contains("6/")) {
                    June.add(element);
                    //    return June;
                } else if (element.contains("07/") || element.contains("7/")) {
                    July.add(element);
                    //     return July;
                } else if (element.contains("08/") || element.contains("8/")) {
                    August.add(element);
                    //     return August;
                } else if (element.contains("09/") || element.contains("9/")) {
                    September.add(element);
                    //   return September;
                } else if (element.contains("10/")) {
                    October.add(element);
                    //   return October;
                } else if (element.contains("11/")) {
                    November.add(element);
                    //   return November;
                } else if (element.contains("12/")) {
                    December.add(element);
                    //  return December;
                }


            }
            allMonths = new ArrayList<>();
            allMonths.add(January);
            allMonths.add(February);
            allMonths.add(March);
            allMonths.add(April);
            allMonths.add(May);
            allMonths.add(June);
            allMonths.add(July);
            allMonths.add(August);
            allMonths.add(September);
            allMonths.add(October);
            allMonths.add(November);
            allMonths.add(December);
        }
        return allMonths;
    }

}

//the issue is its reading each array as a whole






