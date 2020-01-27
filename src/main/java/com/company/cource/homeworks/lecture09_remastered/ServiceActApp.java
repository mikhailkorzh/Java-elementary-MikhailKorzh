package homeworks.lecture09_remastered;

import homeworks.lecture09_remastered.act.Act;
import homeworks.lecture09_remastered.act.ActManager;
import homeworks.lecture09_remastered.act.ServiceAct;
import homeworks.lecture09_remastered.models.person.Customer;
import homeworks.lecture09_remastered.models.person.Worker;
import homeworks.lecture09_remastered.models.product.Oil;
import homeworks.lecture09_remastered.models.product.Rims;
import homeworks.lecture09_remastered.models.product.Tyres;

public class ServiceActApp {
    public static void main(String[] args) {
        boolean additionalServiceNeeded = true;
        Worker worker = new Worker(1, "Worker1", "Worker1", "Worker1");
        Customer customer = new Customer(2, "Customer1", "Customer2");
        Customer customer1 = new Customer(8, "Customer3", "Customer4");

        Oil oil = new Oil(3, 150, "Shell", 5, "10W30", 3);
        Tyres tyre = new Tyres(4, 1600, "Pirelli", 4, 35, 45, "Winter");
        Rims rim = new Rims(1233, 1300, "jZ", 4, 18, 20, "Light-alloy");

        ServiceAct serviceAct1 = new ServiceAct(1,customer,worker,"Oil-check procedure");
        ServiceAct serviceAct2 = new ServiceAct(2,customer1,worker,oil,"Oil-change procedure");
        ServiceAct serviceAct3 = new ServiceAct(3,customer,worker,tyre,rim,"Tyres-change procedure");

        Act act1 = serviceAct1.getOilCheck();
        Act act2 = serviceAct2.getOilChange(true);
        Act act3 = serviceAct3.getTyresChange(true);
        //System.out.println(act1.toString());
        ActManager manager = new ActManager();
        manager.addAct(act1);
        manager.addAct(act2);
        manager.addAct(act3);
        //manager.searchById(2);
        manager.searchByCustomerName("Customer1");
    }
}