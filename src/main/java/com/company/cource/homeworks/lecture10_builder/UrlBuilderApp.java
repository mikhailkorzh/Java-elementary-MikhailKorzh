package homeworks.lecture10_builder;

public class UrlBuilderApp {
    public static void main(String[] args) {
        UrlStructure.Builder urlStructure = new UrlStructure.Builder()
                .withschemeSecure("HTTPS")
                .withSubdomain("blog")
                .withSecondLevelDomain("hubspot")
                .withTopLevelDomain("com")
                .withSubdirectory("marketing")
                .withQueryString("?example=test&example2=test2")
                .withHash("#section3");
        System.out.println(urlStructure.build());

    }
}
