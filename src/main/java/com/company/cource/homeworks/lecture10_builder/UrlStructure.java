package homeworks.lecture10_builder;

public class UrlStructure {
    String schemeNotSecure; //The scheme tells web servers which protocol to use when it accesses a page on your website.
    String schemeSecure;
    String subdomain; //A subdomain in a URL indicates which particular page of your website the web browser should serve up.
    // For instance, subdomains like “blog” or “offers” will provide your website’s blog page or offers page.
    String secondLevelDomain; //Your second-level domain (SLD) is the name of your website.
    String topLevelDomain; //The top-level domain (TLD) specifies what type of entity your organization registers as on the internet.
    String subdirectory; //A subdirectory helps people understand which particular section of a webpage they’re on.
    String queryString; //contains data that is being passed to the page
    String hash; //relates to a section within the page

    @Override
    public String toString() {
        return "UrlStructure{" + schemeSecure + "//" + subdomain + "." + secondLevelDomain + "." + topLevelDomain + "/" + queryString + hash;
    }

    public static class Builder {
        private UrlStructure urlStructure;

        public Builder() {
            urlStructure = new UrlStructure();
        }

        public Builder withschemeSecure(String schemeSecure) {
            urlStructure.schemeSecure = schemeSecure;
            return this;
        }

        public Builder withSubdomain(String subdomain) {
            urlStructure.subdomain = subdomain;
            return this;
        }

        public Builder withSecondLevelDomain(String secondLevelDomain) {
            urlStructure.secondLevelDomain = secondLevelDomain;
            return this;
        }

        public Builder withTopLevelDomain(String topLevelDomain) {
            urlStructure.topLevelDomain = topLevelDomain;
            return this;
        }

        public Builder withSubdirectory(String subdirectory) {
            urlStructure.subdirectory = subdirectory;
            return this;
        }

        public Builder withQueryString(String queryString) {
            urlStructure.queryString = queryString;
            return this;
        }

        public Builder withHash(String hash) {
            urlStructure.hash = hash;
            return this;
        }

        public UrlStructure build() {
            return urlStructure;
        }

    }
}
