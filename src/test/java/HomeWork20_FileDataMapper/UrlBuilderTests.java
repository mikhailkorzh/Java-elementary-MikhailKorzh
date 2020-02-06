package HomeWork20_FileDataMapper;

import homeworks.lecture10_builder.UrlStructure;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.Assert.assertEquals;

public class UrlBuilderTests {


    @Test
    public void testGetProtocolWithoutSlash() {
        String urlStructure = new UrlStructure.Builder().withProtokol("http").build();
        assertEquals("http://", urlStructure);
    }

    @Test
    public void testGetProtocolEmptyValue() {
        String urlStructure = new UrlStructure.Builder().withProtokol("").build();
        assertEquals("", urlStructure);
    }

    @Test
    public void testGetDomain() {
        String urlStructure = new UrlStructure.Builder().withDomain("sitechecker.pro").build();
        assertEquals("sitechecker.pro", urlStructure);
    }

    @Test
    public void testGetPortNotEmpty() {
        String urlStructure = new UrlStructure.Builder().withPort(8080).build();
        assertEquals(":8080", urlStructure);
    }

    @Test
    public void testGetPortWthouyColon() {
        String urlStructure = new UrlStructure.Builder().withPort(8080).build();
        assertEquals(":8080", urlStructure);
    }

    @Test
    public void testGetParams() {
        String urlStructure = new UrlStructure.Builder().withParam("?page", "1").withParam("page", "2").build();
        assertEquals("?page=1&?page=2&", urlStructure);
    }

    @Test
    public void testGetParam() {
        String urlStructure = new UrlStructure.Builder().withParam("lang").withParam("?lang").build();
        assertEquals("?lang&?lang&", urlStructure);
    }

    @Test
    public void testGetPath() {
        String urlStructure = new UrlStructure.Builder().withPath("/knowladge-base").build();
        assertEquals("/knowladge-base", urlStructure);
    }

    @Test
    public void testGetPathWithoutSlash() {
        String urlStructure = new UrlStructure.Builder().withPath("knowladge-base").build();
        assertEquals("/knowladge-base", urlStructure);
    }

    @Test
    public void GetUrlCompleteVersion() {
        String urlStructure = new UrlStructure.Builder()
                .withProtokol("http")
                .withDomain("sitechecker.pro")
                .withPort(8080)
                .withPath("/knowladge-base")
                .withParam("page", "1")
                .build();
        assertEquals("http://sitechecker.pro:8080/knowladge-base?page=1&", urlStructure);
    }


}
