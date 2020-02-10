package homeworks.lecture10_builder;

public class UrlBuilderApp {
    public static void main(String[] args) {
        String urlStructure = new UrlStructure.Builder()
                .withProtokol("http")
                .withDomain("sitechecker.pro")
                .withPath("/knowladge-base")
                .withParam("?page","1")
                .build();
        System.out.println(urlStructure);

    }
}