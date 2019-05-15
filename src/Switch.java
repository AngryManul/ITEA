public class Switch {
    public static void main(String[] args) {

        int price = 10;
        String taxCountry = "USA";

        switch (taxCountry) {
            case "Ukraine":
                price = price + 10;
                break;

            case "USA":
                price = price + 20;
                break;

            case "UK":
                price = price + 30;
                break;

            default:
                price = price + 100;
                break;
        }
        System.out.println("Your tax = " + price);

    }
}
