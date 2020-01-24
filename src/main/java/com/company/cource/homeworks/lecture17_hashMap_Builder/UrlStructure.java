package homeworks.lecture17_hashMap_Builder;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class UrlStructure {
    public String protocol = "";
    public String path = "";
    private String domain = "";
    private String port = "";
    private String params = "";


    public String getProtocol() {
        return protocol;
    }

    public String getDomain() {
        return domain;
    }

    public String getPort() {
        return port;
    }

    public String getPath() {
        return path;
    }

    public String getParams() {
        return params;
    }

    public static class Builder {
        private UrlStructure urlStructure;

        public Builder() {
            urlStructure = new UrlStructure();
        }

        public Builder withProtokol(String protokol) {
            urlStructure.protocol = protokol.isEmpty() ? "" : protokol + "://";
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

        public Builder withParams(Map<String, String> params) {
            String param = params.entrySet().stream().map(entry -> entry.getKey() + "=" + entry.getValue()).collect(Collectors.joining("&"));
            urlStructure.params += urlStructure.params.startsWith("?") ? param + "&" : "?" + param;
            return this;
        }

        public HashMap<String, String> build() {
            HashMap<String, String> urlBuilder = new HashMap<>();
            urlStructure.port = urlStructure.port.isEmpty() ? "" : ":" + urlStructure.port;

            urlBuilder.put("1", urlStructure.protocol);
            urlBuilder.put("2", urlStructure.domain);
            urlBuilder.put("3", urlStructure.port);
            urlBuilder.put("4", urlStructure.path);
            urlBuilder.put("5", urlStructure.params);

            return urlBuilder;
        }

        public static String urlFormatter(Map<String, String> urlBuilder) {
            return urlBuilder.entrySet().stream().map(entry -> entry.getValue()).collect(Collectors.joining());
        }


    }
}