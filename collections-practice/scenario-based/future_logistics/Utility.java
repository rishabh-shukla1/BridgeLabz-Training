package future_logistics;

class Utility {

    public boolean validateTransportId(String transportId) {
        if (!transportId.matches("RTS[0-9]{3}[A-Z]")) {
            System.out.println("Transport id " + transportId + " is invalid");
            return false;
        }
        return true;
    }

    public GoodsTransport parseDetails(String input) {
        String[] arr = input.split(":");

        String transportId = arr[0];
        String transportDate = arr[1];
        int rating = Integer.parseInt(arr[2]);
        String type = arr[3];

        if (!validateTransportId(transportId)) {
            System.out.println("Please provide a valid record");
            return null;
        }

        if (type.equalsIgnoreCase("BrickTransport")) {
            float size = Float.parseFloat(arr[4]);
            int qty = Integer.parseInt(arr[5]);
            float price = Float.parseFloat(arr[6]);

            return new BrickTransport(transportId, transportDate, rating,
                    size, qty, price);
        } else {
            float length = Float.parseFloat(arr[4]);
            float radius = Float.parseFloat(arr[5]);
            String timberType = arr[6];
            float timberPrice = Float.parseFloat(arr[7]);

            return new TimberTransport(transportId, transportDate, rating,
                    length, radius, timberType, timberPrice);
        }
    }

    public String findObjectType(GoodsTransport goodsTransport) {
        if (goodsTransport instanceof TimberTransport)
            return "TimberTransport";
        else
            return "BrickTransport";
    }
}