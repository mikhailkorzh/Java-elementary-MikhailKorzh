package com.company.cource.homeworks.lecture7_1_inheritance;

public class InsuredOrder extends Order_ {
    private String company;
    private double amount;

    public InsuredOrder(String date, String time, int id, String company, double amount) {
        super(date, time, id);
        this.company = company;
        this.amount = amount;
    }

    public String getCompany() {
        return company;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String getType() {
        return "Insured";
    }

    @Override
    public String toString() {
        return "InsuredOrder{" +
                "company='" + company + '\'' +
                ", amount=" + amount +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", id=" + id +
                '}';
    }
}
