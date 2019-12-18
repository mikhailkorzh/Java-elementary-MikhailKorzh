package homeworks.lecture10_builder;

public class UrlStructure {
    private String protocol = "";
    private String domain = "";
    private String port = "";
    private String path = "";
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

        public Builder withParam(String param) {
            urlStructure.params += urlStructure.params.startsWith("?") ? param + "&" : "?" + param + "&";
            return this;
        }

        public Builder withParam(String key, String value) {
            String param = key + "=" + value + "&";
            urlStructure.params += urlStructure.params.startsWith("?") ? param : "?" + param;
            return this;
        }

        public String build() {
            urlStructure.port = urlStructure.port.isEmpty() ? "" : ":" + urlStructure.port;
            return urlStructure.protocol + urlStructure.domain + urlStructure.port + urlStructure.path + "?" + urlStructure.params;
        }

    }
}
