CREATE TABLE IF NOT EXISTS TDetails(ID INT AUTO_INCREMENT PRIMARY KEY, theaterName VARCHAR(255),
showTime VARCHAR(255),
movieName VARCHAR(255),
showDate VARCHAR(255));
CREATE TABLE IF NOT EXISTS TBooking(ID INT AUTO_INCREMENT PRIMARY KEY, theaterName VARCHAR(255),
showTime VARCHAR(255),
movieName VARCHAR(255),
showDate VARCHAR(255),
seats VARCHAR(255));
INSERT INTO TDetails (id,movie_Name,show_Time,show_Date,theater_Name) VALUES (1,'KandhanKarunai','11:30 AM,2:00 PM,10:00PM','17-06-2023','Janatha');
INSERT INTO TDetails (id,movie_Name,show_Time,show_Date,theater_Name) VALUES (2,'Thiruvilayadal','11:30 AM,2:00 PM,10:00PM','18-06-2023','vetri');
INSERT INTO TDetails (id,movie_Name,show_Time,show_Date,theater_Name) VALUES (3,'Ramayanam','11:30 AM,2:00 PM,10:00PM','18-06-2023','Rakesh');
INSERT INTO TDetails (id,movie_Name,show_Time,show_Date,theater_Name) VALUES (4,'Bagavadham','11:30 AM,2:00 PM,10:00PM','17-06-2023','Mount');


