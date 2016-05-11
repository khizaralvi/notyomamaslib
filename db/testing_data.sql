USE library_system;

ALTER TABLE media AUTO_INCREMENT = 1;
ALTER TABLE patron AUTO_INCREMENT = 1;
ALTER TABLE reservation AUTO_INCREMENT = 1;
ALTER TABLE checkedoutmedia AUTO_INCREMENT = 1;
ALTER TABLE cancellation AUTO_INCREMENT = 1;
ALTER TABLE income AUTO_INCREMENT = 1;

/* Patron account */

insert into patron (pFname, pLname, pPhone, pEmail, pAddress) values ("Jessica", "Carneiro", "12143353", "jcarneir@oldwestbury.edu", "223 Store Hill Rd");
insert into patron (pFname, pLname, pPhone, pEmail, pAddress) values ("Jeff", "Godoy", "12345678", "jgodoy@oldwestbury.edu", "223 Store Hill Rd");
insert into patron (pFname, pLname, pPhone, pEmail, pAddress) values ("Benny", "Penna", "12839042", "bpena5@oldwestbury.edu", "223 Store Hill Rd");
insert into patron (pFname, pLname, pPhone, pEmail, pAddress) values ("Junaid", "Farooq", "12345356", "jfarooq@oldwestbury.edu", "223 Store Hill Rd");
insert into patron (pFname, pLname, pPhone, pEmail, pAddress) values ("Basit", "Khan", "92018321", "abasit1@oldwestbury.edu", "223 Store Hill Rd");
insert into patron (pFname, pLname, pPhone, pEmail, pAddress) values ("Adil", "Imam", "121342432", "aimam1@oldwestbury.edu", "223 Store Hill Rd");
insert into patron (pFname, pLname, pPhone, pEmail, pAddress) values ("Elbin", "Martinez", "12901282", "emarti45@oldwestbury.edu", "223 Store Hill Rd");
insert into patron (pFname, pLname, pPhone, pEmail, pAddress) values ("Adnan", "Alam", "1223432", "aalam29@oldwestbury.edu", "223 Store Hill Rd");
insert into patron (pFname, pLname, pPhone, pEmail, pAddress) values ("Khizar", "Alvi", "9872161", "kalvi@oldwestbury.edu", "223 Store Hill Rd");


/* Media books */

insert into media (mediaTitle, mediaYear, mediaCategory, mediaCost, mediaType, mediaQuantity, mediaPublisher, bookISBN, bookEdition, bookVolume, runningTime, movieDirector) 
values ("How to be a woman", "2011", "nonfiction", 15.00, "B", 3, "Ebury Press", "0091940737", "1", "1", null, null);
insert into author (authorName) values ("Caitlin Moran"); 
insert into authorbooks (mediaId, authorId) values (1, 1);

insert into media (mediaTitle, mediaYear, mediaCategory, mediaCost, mediaType, mediaQuantity, mediaPublisher, bookISBN, bookEdition, bookVolume, runningTime, movieDirector) 
values ("Second Foundation", "1953", "fiction", 10.00, "B", 5, "Aleph Press", "B015EE5N7G", "16", "3", null, null);
insert into author (authorName) values ("Isaac Asimov");
insert into authorbooks (mediaId, authorId) values (2, 2);

insert into media (mediaTitle, mediaYear, mediaCategory, mediaCost, mediaType, mediaQuantity, mediaPublisher, bookISBN, bookEdition, bookVolume, runningTime, movieDirector) 
values ("A Thousand Splendid Suns", "2007", "fiction", 25.00, "B", 7, "New Frontier", "9788520920107", "7", "1", null, null);
insert into author (authorName) values ("Khaled Hosseini");
insert into authorbooks (mediaId, authorId) values (3, 3);

insert into media (mediaTitle, mediaYear, mediaCategory, mediaCost, mediaType, mediaQuantity, mediaPublisher, bookISBN, bookEdition, bookVolume, runningTime, movieDirector) 
values ("Just Kids", "2010", "nonfiction", 17.50, "B", 2, "Ecco", "9780066211312", "1", "1", null, null);
insert into author (authorName) values ("Patti Smith");
insert into authorbooks (mediaId, authorId) values (4, 4);

insert into media (mediaTitle, mediaYear, mediaCategory, mediaCost, mediaType, mediaQuantity, mediaPublisher, bookISBN, bookEdition, bookVolume, runningTime, movieDirector) 
values ("1984", "1950", "classics", 19.55, "B", 15, "New American Library", "9780451524935", "10", "1", null, null);
insert into author (authorName) values ("George Orwell");
insert into authorbooks (mediaId, authorId) values (5, 5);

/* Media academic */

insert into media (mediaTitle, mediaYear, mediaCategory, mediaCost, mediaType, mediaQuantity, mediaPublisher, bookISBN, bookEdition, bookVolume, runningTime, movieDirector) 
values ("LEGO robots and AI", "2005", "tutorial", 15.00, "A", 1, "ACM", null, null, null, null, null);
insert into author (authorName) values ("Amruth N. Kumar");
insert into authorbooks (mediaId, authorId) values (6, 6);

insert into media (mediaTitle, mediaYear, mediaCategory, mediaCost, mediaType, mediaQuantity, mediaPublisher, bookISBN, bookEdition, bookVolume, runningTime, movieDirector) 
values ("Planning and learning in security games", "2013", "paper", 33.00, "A", 1, "ACM", null, null, null, null, null);
insert into author (authorName) values("Francesco M. Delle Fave");
insert into authorbooks (mediaId, authorId) values (7, 7);
insert into author (authorName) values("Yundi Qian");
insert into authorbooks (mediaId, authorId) values (7, 8);
insert into author (authorName) values("Albert X. Jiang");
insert into authorbooks (mediaId, authorId) values (7, 9);
insert into author (authorName) values("Matthew Brown");
insert into authorbooks (mediaId, authorId) values (7, 10);
insert into author (authorName) values("Milind Tambe");
insert into authorbooks (mediaId, authorId) values (7, 11);


/* Media movies */

insert into media (mediaTitle, mediaYear, mediaCategory, mediaCost, mediaType, mediaQuantity, mediaPublisher, bookISBN, bookEdition, bookVolume, runningTime, movieDirector) 
values ("Deadpool", "2016", "action", 39.50, "M", 1, null, null, null, null, "108", "");

insert into media (mediaTitle, mediaYear, mediaCategory, mediaCost, mediaType, mediaQuantity, mediaPublisher, bookISBN, bookEdition, bookVolume, runningTime, movieDirector) 
values ("Eternal Sunshine of the Spotless Mind", "2004", "drama", 19.50, "M", 1, null, null, null, null, "108", "");

insert into media (mediaTitle, mediaYear, mediaCategory, mediaCost, mediaType, mediaQuantity, mediaPublisher, bookISBN, bookEdition, bookVolume, runningTime, movieDirector) 
values ("Frozen", "2013", "animation", 25.00, "M", 2, null, null, null, null, "102", "");

insert into media (mediaTitle, mediaYear, mediaCategory, mediaCost, mediaType, mediaQuantity, mediaPublisher, bookISBN, bookEdition, bookVolume, runningTime, movieDirector) 
values ("Frances Ha", "2013", "drama", 49.50, "M", 1, null, null, null, null, "86", "");


