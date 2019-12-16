package homeworks.lecture09_remastered.act;

import homeworks.lecture09_remastered.controllers.OilChange;
import homeworks.lecture09_remastered.controllers.OilCheck;
import homeworks.lecture09_remastered.controllers.TyresChange;
import homeworks.lecture09_remastered.models.person.Customer;
import homeworks.lecture09_remastered.models.person.Worker;
import homeworks.lecture09_remastered.models.product.Oil;
import homeworks.lecture09_remastered.models.product.Rims;
import homeworks.lecture09_remastered.models.product.Tyres;

public class ServiceAct {
    private boolean additionalService;
    private Customer customer;
    private Worker worker;
    private String serviseIdentifier;
    private Oil oil;
    private Tyres tyre;
    private Rims rim;
    private int actNumber;
    private TyresChange tyresChange = new TyresChange();
    private OilChange oilChange = new OilChange();
    private OilCheck oilCheck = new OilCheck();
    //private Act act = new Act();

    public ServiceAct(int actNumber, Customer customer, Worker worker, Oil oil, String serviseIdentifier) {
        this.actNumber = actNumber;
        this.serviseIdentifier = serviseIdentifier;
        this.customer = customer;
        this.worker = worker;
        this.oil = oil;

    }

    public ServiceAct(int actNumber, Customer customer, Worker worker, String serviseIdentifier) {
        this.actNumber = actNumber;
        this.serviseIdentifier = serviseIdentifier;
        this.customer = customer;
        this.worker = worker;
    }

    public ServiceAct(int actNumber, Customer customer, Worker worker, Tyres tyre, Rims rim, String serviseIdentifier) {
        this.actNumber = actNumber;
        this.serviseIdentifier = serviseIdentifier;
        this.customer = customer;
        this.worker = worker;
        this.tyre = tyre;
        this.rim = rim;
    }

    //NOTE!
//this block could be customized upon request of the customer within existing classes (e.g. person or product)
    public Act getOilCheck() {
        double price = oilCheck.perform();
        return new Act(actNumber, customer.getID(), customer.getLastName(), worker.getID(), worker.getLastName(), serviseIdentifier, price);
    }

    public Act getOilChange(boolean additionalService) {
        double price = oilChange.perform();
        if (additionalService) {
            return new Act(actNumber, customer.getID(), customer.getLastName(), worker.getID(), worker.getLastName(), serviseIdentifier, price + oil.getAmount() * oil.getPrice());
        }
        return new Act(actNumber, customer.getID(), customer.getLastName(), worker.getID(), worker.getLastName(), serviseIdentifier, price);
    }

    public Act getTyresChange(boolean additionalService) {
        double price = tyresChange.perform();
        if (additionalService) {
            return new Act(actNumber, customer.getID(), customer.getLastName(), worker.getID(), worker.getLastName(), serviseIdentifier, price + tyre.getTotalAmount() * tyre.getPrice() + rim.getTotalAmount() * rim.getPrice());
        }
        return new Act(actNumber, customer.getID(), customer.getLastName(), worker.getID(), worker.getLastName(), serviseIdentifier, price);
    }

}