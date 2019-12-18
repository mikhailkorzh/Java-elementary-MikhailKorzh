package homeworks.lecture10_builder;

public class UrlBuilderApp {
    public static void main(String[] args) {
        String urlStructure = new UrlStructure.Builder()
                .withDomain("sitechecker.pro")
                .withPath("/knowladge-base")
                .build();

        System.out.println(urlStructure);

    }
}
