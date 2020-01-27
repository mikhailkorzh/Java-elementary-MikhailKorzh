package homeworks.lecture09_remastered.controllers;

public class OilChange implements Service{
    private static final double SERVICE_PRICE = 80.0;

    @Override
    public double perform() {
        return SERVICE_PRICE;
    }
}