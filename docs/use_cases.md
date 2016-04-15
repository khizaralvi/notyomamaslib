# Use cases #

## Account Management Subsystem: ##

__Team in charge:__ team #1

### Entity classes ###

* __Account__:
	* ApplyPayment (_librarian only!_)
	* DeleteAccount (_admin only!_)
	* EditAccount
	* LoginToAccount
	* LogoutOfAccount
	* MakePayment (_patron only!_)
	* ViewAccount

## Media Management Subsystem: ##

__Team in charge:__ team #2

### Entity classes ###

* __Checked Out Media Collection__:
	* CheckInMedia
	* RenewMedia


* __Media Collection__:
	* AddMedia
  * CancelReservation
	* CheckOutMedia
  * DeleteMedia
	* EditMedia
	* ReserveMedia
	* SearchMedia


* __Reservation List Collection__:
  * ClearCancelledReservation
  * ViewCancelledReservation
  * ViewReservationList

## Monetary Transactions Subsystem: ##

__Team in charge:__ team #3

### Entity classes ###

* __Library Funds__ class:
	* ApplyLateFee
	* BillAccount
	* MakeDonation
	* ShowLibraryIncome

## Notification Subsystem: ##

__Team in charge:__ team #3

* SendDueDateNotification
* SendLateNotification
