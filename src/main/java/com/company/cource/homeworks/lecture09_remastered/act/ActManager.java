package homeworks.lecture09_remastered.act;


import java.util.ArrayList;
import java.util.List;

public class ActManager {
    String nothingFound = "No such elements were found according to your request. Please try again";
    private List<Act> acts = new ArrayList<>();
    private List<Act> openActs = new ArrayList<>();
    private List<Act> closedActs = new ArrayList<>();

    public void addAct(Act act) {
        acts.add(act);
        openActs.add(act);
    }

    public void closeAct(Act act) {
        acts.remove(act);
        closedActs.add(act);
    }

    public void searchById(int ID) {
        for (Act orderArray : acts) {
            if (orderArray.getCustomerID() == ID) {
                System.out.println(orderArray.toString());
            }
        }
    }
    public void searchByCustomerName(String lastName) {
        for (Act orderArray : acts) {
            if (orderArray.getCustomerLastName() == lastName) {
                System.out.println(orderArray.toString());
            }
        }
    }
}