package transactions;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a carrier
 */
class Carrier {
	private String name;
	private List<Region> regions = new ArrayList<>();

	Carrier(String name) {
	    this.name = name;
	}

	String getName() {
        return name;
    }

    void addRegion(Region region) {
        regions.add(region);
    }

    boolean containsRegion(Region region) {
        return regions.contains(region);
    }
}