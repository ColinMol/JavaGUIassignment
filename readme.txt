Read me

General info
The goal of this program is to create a GUI that allows the user to:
- Add a movie review which is stored in a text file
- Look at all movie reviews from the text file
- Search for a line in the file by searching for a word, part of a word, or a phrase

menuGUI class:
This function of this class is to act as a hub, using buttons to open the other GUI windows
in this project

addGUI class:
This class is used to retrieve user input and append that input into a file.
A JTextField is used to write a movie review and a save button appends the data inputted.

lookGUI class:
This class uses a filereader to output lines from a file to the console

searchGUI class:
This class iterates through a file and returns file where the user input is found in the file (case insensitive)
 i.e
file: Hello World
      Test code
input: Hel
output Hello World

	
Technologies
Project is created with:
Eclipse

	