package zaur.lesson16;

public class EmailDomain {

    public static String identifyEmailDomain(String email) {
        int startOfTheDomain = email.indexOf('@') + 1;
        int endOfTheDomain = email.indexOf('.', startOfTheDomain);

        return email.substring(startOfTheDomain, endOfTheDomain);
    }

    public static void pullEmailDomain(String listOfEmails, String separator) {
        while (listOfEmails.contains(separator)) {
            String email = identifyEmailDomain(listOfEmails);
            System.out.println(email);
            listOfEmails = listOfEmails.substring((listOfEmails.indexOf(';') + 1));
        }
    }

    public static void main(String[] args) {
        String email1 = "ya@yahoo.com";
        String email2 = "on@gmail.com";
        String email3 = "better.me@mail.com";

        System.out.println(identifyEmailDomain(email1));
        System.out.println(identifyEmailDomain(email2));
        System.out.println(identifyEmailDomain(email3));

        String listOfEmails = "ya@yahoo.com; on@gmail.com; better.me@mail.com;";
        pullEmailDomain(listOfEmails, ";");
    }
}