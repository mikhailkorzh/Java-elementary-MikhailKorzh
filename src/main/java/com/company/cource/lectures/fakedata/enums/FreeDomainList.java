package lectures.fakedata.enums;

public enum FreeDomainList {
    GMAIL("gmail.com"),
    HOTMAIL("hotmail.com");

    private String freeDomain;

    FreeDomainList(String freeDomain) {
        this.freeDomain = freeDomain;
    }

    public String getFreeDomain() {
        return freeDomain;
    }
}
