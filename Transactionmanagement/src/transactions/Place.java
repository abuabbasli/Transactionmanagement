package transactions;

/**
 * Represents a place in a region (pickup and dropoff)
 */
class Place {
	private String name; 
	private Region region;

    Place(String name, Region region) {
        this.name = name;
        this.region = region;
        region.addPlace(this);
    }

    public String getName() {
        return name;
    }

    public Region getRegion() {
        return region;
    }
}