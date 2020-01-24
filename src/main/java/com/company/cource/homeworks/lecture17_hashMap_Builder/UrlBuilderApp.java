package homeworks.lecture17_hashMap_Builder;

import java.util.HashMap;

public class UrlBuilderApp {
    public static void main(String[] args) {
        HashMap<String, String> urlStructure = new homeworks.lecture10_builder.UrlStructure.Builder()
                .withProtokol("http")
                .withDomain("sitechecker.pro")
                .withPath("/knowladge-base")
                .withParams(MapBuilder.createMap())
                .build();

        System.out.println(UrlStructure.Builder.urlFormatter(urlStructure));
    }


}