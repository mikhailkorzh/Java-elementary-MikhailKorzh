package com.company.cource.homeworks.lecture6;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private String host = "host";
    private String port = "port";
    private String mumberOfThreads = "nuberOfThreads";

    private ConfigurationManager(){

    }

    public static ConfigurationManager getInstance(){
        if(instance == null){
            return new ConfigurationManager();
        }
        return instance;
    }

    public String getHost() {
        return getValueOrDefault(host,"localhost");
    }

    public String getPort() {
        return getValueOrDefault(port,"8080");

    }

    public String getMumberOfThreads() {
        return getValueOrDefault(mumberOfThreads,"10");
    }

    private String getValueOrDefault(String envVar, String defaultValue){
        return System.getenv(envVar) == null || System.getenv(envVar).isEmpty() ? defaultValue : System.getenv(envVar);
    }
}
