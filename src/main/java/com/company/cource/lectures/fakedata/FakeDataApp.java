package lectures.fakedata;

import lectures.fakedata.enums.CreditCardType;

public class FakeDataApp {
    public static void main(String[] args) {
        FakeData fakeData = new FakeData();
        System.out.println(fakeData.generateColors().generate());
        System.out.println(fakeData.generateCards().generate());
        System.out.println(fakeData.generateCurrency().generate());
        System.out.println(fakeData.generateEmail().generate());



    }
}
