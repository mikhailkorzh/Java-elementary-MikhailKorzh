package homeworks.lecture17_hashMap_Builder;

import java.util.HashMap;

public class UrlBuilderApp {
    public static void main(String[] args) {
        String urlStructure = new UrlStructure.Builder()
                .withProtocol("http")
                .withDomain("sitechecker.pro")
                .withPath("/knowladge-base")
                .withParams("page", "1")
                //.withParams("345")
                .withParams("language","UA")
                .build();

        System.out.println(urlStructure);
    }


}