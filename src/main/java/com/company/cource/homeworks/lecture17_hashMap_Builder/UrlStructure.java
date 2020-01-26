package homeworks.lecture17_hashMap_Builder;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class UrlStructure {

    public String protocol = "";
    public String path = "";
    private String domain = "";
    private String port = "";
    private HashMap<String, String> params = new HashMap<>();


    public static class Builder {
        private UrlStructure urlStructure;

        public Builder() {
            urlStructure = new UrlStructure();
        }

        public Builder withProtocol(String protocol) {
            urlStructure.protocol = protocol.isEmpty() ? "" : protocol + "://";
            return this;
        }

        public Builder withDomain(String domain) {
            urlStructure.domain = domain;
            return this;
        }

        public Builder withPort(Integer port) {
            urlStructure.port = port.toString();
            return this;
        }

        public Builder withPath(String path) {
            urlStructure.path = path.startsWith("/") ? path : "/" + path;
            return this;
        }

        public Builder withParams(String value) {
            value = value.startsWith("?") ? value : "?" + value;
            urlStructure.params.put("", value);
            return this;
        }

        public Builder withParams(String key, String value) {
            urlStructure.params.put(key, value);
            return this;
        }

        public static String urlFormatter(Map<String, String> urlFormatter) {
            return urlFormatter.entrySet().stream().map(entry -> entry.getKey().isEmpty() ? entry.getValue() : entry.getKey() + "=" + entry.getValue()).collect(Collectors.joining("&"));
        }

        public String build() {
            urlStructure.port = urlStructure.port.isEmpty() ? "" : ":" + urlStructure.port;
            return urlStructure.protocol + urlStructure.domain + urlStructure.port + urlStructure.path + urlFormatter(urlStructure.params);
        }


    }
}