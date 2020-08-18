package transactions;

/**
 * Represents a request or offer.
 *
 */
class Item {
    /**
     * The 'id' is not strictly required (and used)
     * still keeping together the data that logically
     * "belong" to a given concept (i.e. the class)
     * represents a good practice in terms of:
     * - understandability
     * - maintainability
     */
	private String id;
	private Place place; 
	private String productId; 
	private Transaction transaction;
	
	Item(String id, Place place, String productId) {
		this.id = id; 
		this.place = place; 
		this.productId = productId; 
	}

    public Place getPlace() {
        return place;
    }

    public String getProductId() {
        return productId;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

}