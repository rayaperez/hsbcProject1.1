# hsbcProject1.1
hsbcProject1.1
Problem: Create a simple app which will read the two trade files attached in the email File1: Trades.txt - This file has the trade transaction details File2: Inst.txt - This file has master list of instruments which can be traded. This app needs to take following inputs a) From Date &

b) To Date and it needs to find below App

Instrument wise traded volume between the date range

List of instrument not traded between the dates

Approach :

Cucumber feature file has been created. This feature file should will accept as an input 2 input files ( an user will require only to add the name of the files.Files should be sat on C drive)
Data table has been created where an user can add different date ranges
For an implementation : Common class has been created that only reads the files proveded by the user and confirm they are valid
After that, data modeling has been used : Instructor and Trade classes created as a getter setted classes .
Main class will execute the loop that will run though the trades transactions and check if specific instruction is found, if it found, it will validate if it in/out the date range 6.An user should receive an output will all the trades that are in/out of the date range as well as volume of those trades
