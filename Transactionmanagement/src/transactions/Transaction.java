package transactions;

class Transaction {
    private String transactionId;
    private Carrier carrier;
    private Item request;
    private Item offer;
    private int score = 0;

    Transaction(String transactionId, Carrier carrier, Item request, Item offer) {
        this.transactionId = transactionId;
        this.carrier = carrier;
        this.request = request;
        this.offer = offer;
    }

    String getDeliveryPlace() {
        return request.getPlace().getName();
    }

    String getPickupPlace() {
        return offer.getPlace().getName();
    }

    String getDeliveryRegion() {
        return request.getPlace().getRegion().getName();
    }

    int getScore() {
        return score;
    }

    String getCarrierName() {
        return carrier.getName();
    }

    String getProductId() {
        return request.getProductId();
    }

    void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return transactionId + " " + carrier.getName() + " " + score;
    }
}
