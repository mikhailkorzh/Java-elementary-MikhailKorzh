package homeworks.lecture09_remastered.controllers;


public class TyresChange implements Service{

    private static final double SERVICE_PRICE = 100.0;

    @Override
    public double perform() {
        return SERVICE_PRICE;
    }
}