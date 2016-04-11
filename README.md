# Not Yo Mama's Library

## Description ##

Repository for project in a Software Engineering class at [SUNY Old Westbury](http://oldwestbury.edu) for spring/2016 coordinated by [Prof. Lili Hai](mailto:hail@oldwestbury.edu). Our goal is to develop a complete Library Management System in which users will be able to browse, borrow. renew, reserve materials, etc. The group has 10 members and is further divided into 3 smaller teams as following.

#### Team #1 ####

* [Jeff Godoy](jgodoy@oldwestbury.edu) (_team leader_)
* [Benny Pena](mailto:bpena5@oldwestbury.edu)
* [Junaid Farooq](mailto:jfarooq@oldwestbuyr.edu)

#### Team #2 ####

* [Jéssica Carneiro](mailto:jessicaccarneiro91@gmail.com) (_team leader_)
* [Abdul Basit](mailto:abasit1@oldwestbury.edu)
* [Adil Imam](mailto:aimam1@oldwestbury.edu)

#### Team #3 ####

* [Elbin Martinez](mailto:emarti45@oldwestbury.edu) (_team leader_)
* [Adnan Alam](mailto:aalam29@gmail.com)
* [Brett Landau](mailto:blandau@oldwestbury.edu)
* [Khiyau Alvi](mailto:kalvi@oldwestbury.edu)

## Subsystems ##

### Account Management Subsystem: ###

__Team in charge:__ team #1

#### Entity classes ####

* __Account__ class:
	* ApplyPayment (_librarian only!_)
	* DeleteAccount (_admin only!_)
	* EditAccount
	* LoginToAccount
	* LogoutOfAccount
	* MakePayment (_patron only!_)
	* ViewAccount

### Media Management Subsystem: ###

__Team in charge:__ team #2

#### Entity classes ####

* __Cancellation List__ class:
	* ViewCancellationList

* __Checked Out Media__ class:
	* CheckInMedia
	* RenewMedia

* __Media__ class:
	* AddMedia
	* CheckOutMedia
	* EditMedia
	* ReserveMedia
	* SearchMedia

* __Reservation List__ class:
  * ViewReservationList

### Monetary Transactions Subsystem: ###

__Team in charge:__ team #3

#### Entity classes ####

* __Library Funds__ class:
	* ApplyLateFee
	* BillAccount
	* MakeDonation
	* ShowLibraryIncome

### Notification Subsystem: ###

__Team in charge:__ team #3

#### Entity classes ####

* Not sure (?)
	* SendLateNotification
