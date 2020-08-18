package transactions;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a Region, with the related
 * places and carriers.
 */
class Region {
	private String name;
	private List<Place> places = new ArrayList<>();
	private List<Carrier> carriers = new ArrayList<>();
	
	Region(String name) {this.name = name;}
    
	void addPlace(Place place) {
        places.add(place);
    }
    
	String getName() {
        return name;
    }

    void addCarrier(Carrier carrier) {
        carriers.add(carrier);
    }
    
    List<Carrier> getCarriers() {
        return carriers;
    }
}