public class WebAddresses {
    
    public static String user(String email) {
        int at = email.indexOf("@");
        return email.substring(0, at);
    }

    public static String domain(String email) {
        int at = email.indexOf("@");
        return email.substring(at + 1);
    }

    public static String makeEmail(String first, String last, String domain) {
        return first + "." + last + "@" + domain;
    }

    public static boolean sameDomain(String email1, String email2) {
        String domain1 = domain(email1);
        String domain2 = domain(email2);
        return domain1.equals(domain2);
    }

    public static String protocol(String url) {
        int colon = url.indexOf("://");
        return url.substring(0, colon);
    }

    public static boolean isSecure(String url) {
        String proto = protocol(url);
        return proto.equals("https");
    }

    public static String host(String url) {
        int start = url.indexOf("://") + 3;
        String rest = url.substring(start);
        int slash = rest.indexOf("/");
        return rest.substring(0, slash);
    }

    public static String path(String url) {
        int start = url.indexOf("://") + 3;
        String rest = url.substring(start);
        int slash = rest.indexOf("/");
        return rest.substring(slash);
    }

    public static void main(String[] args) {
        String email = "nino.beridze@school.ge";
        System.out.println(user(email));
        System.out.println(domain(email));
        System.out.println(makeEmail("luka", "kapanadze", "gmail.com"));
        System.out.println(sameDomain(email, "giorgi.maisuradze@school.ge"));
        System.out.println(sameDomain(email, "nino.beridze@gmail.com"));

        String url = "https://www.school.ge/ap/csa/index.html";
        System.out.println(protocol(url));
        System.out.println(isSecure(url));
        System.out.println(isSecure("http://example.com/"));
        System.out.println(host(url));
        System.out.println(path(url));
        System.out.println(host("ftp://files.example.org/pub/"));
        System.out.println(path("http://example.com/"));
    }
}

