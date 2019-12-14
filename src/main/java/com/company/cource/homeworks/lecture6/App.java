package com.company.cource.homeworks.lecture6;

public class App {
    public static void main(String[] args) {
        System.out.println(ConfigurationManager.getInstance().getHost());
        System.out.println(ConfigurationManager.getInstance().getPort());
        System.out.println(ConfigurationManager.getInstance().getMumberOfThreads());
    }
}
