package homeworks.lecture09_remastered.controllers;


public class OilCheck implements Service{
    private static final double SERVICE_PRICE = 50.0;

    @Override
    public double perform() {
        return SERVICE_PRICE;
    }
}