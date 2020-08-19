# Transactionmanagement

Classes are located in the transactions package; 
the main class is TransactionManager. The Example class in the >main< package shows usage examples for the main methods
and examples of the requested checks. Only implement the requested checks.




 Regions and carriers<


The  List&lt;String&gt; addRegion (String regionName, String... placeNames) method adds a region and places located in the region given their names.
Places with already existing names are not added. The method returns the ordered lists of names of the added places.

TheList&lt;String&gt; addCarrier (String carrierName, String... regionNames) method adds a carrier and the regions he supplies. Duplicate or non existent region names are ignored. 
The method returns the ordered list of region names served by the carrier.

The  List&lt;String&gt; getCarriersForRegion (String regionName) method returns the ordered list of the names of carriers supplying the region with the given name.<br>



>R2: Requests and offers<

The  addRequest(String requestId, String placeName, String productId) method defines a request given its code, the place of delivery and the requested product's id.
The method throws an exception if the place is undefined or if the code is duplicated.

The addOffer (String offerId, String placeName, String productId) method defines an offer given its code, the pickup place and and the offered product's id. 
The method throws an exception if the place is undefined or if the code is duplicated.


Transactions


The  addTransaction(String transactionId, String carrierName, String requestId, String offerId)  method defines a transaction given its code, the carrier's name, and the request's and offer's ids.
You can safely assume that the carrier, the request and the offer are defined.
Therefore, you must enforce the following checks: request and offer should not have been bound to previous transactions, they should relate to the same product id and
the carrier should serve both the delivery and pickup places (i.e. the corresponding regions).
If any of the previous checks should fail, an exception must be raised, otherwise the transaction must be associated to both the request and the offer.

The <b> boolean evaluateTransaction(String transactionId, int score)  method assigns a score to the transaction. When generated, a transaction has a score equal to 0.
The returned value is false if the score is not comprised between 1 and 10 (extremes included) ; otherwise the method returns true.

Statistics

The SortedMap&lt;Long, List&lt;String&gt;&gt; deliveryRegionsPerNT method returns the list of names of regions (ordered alphabetically)
that are delivery locations for the same number of transactions.
A region is a location of delivery for a transaction if the region includes the place of delivery of the request associated to the transaction.
The returned map shows the number of transactions in decreasing order.

The SortedMap&lt;String, Integer&gt; scorePerCarrier (int minimumScore) method returns the total score of the transactions related to the same carrier. 
Transaction with a total score below the given minimumScore are ignored.
Carriers appear in alphabetical order.

The SortedMap&lt;String, Long&gt; nTPerProduct returns the number of transactions (only if greater than 0) 
for product's id, with the latter alphabetically ordered.



