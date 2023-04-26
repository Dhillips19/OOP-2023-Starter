package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet {

	

	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

    String[] sonnet;

    public String[] writeSonnet()
    {
        return null;
    }

	public void setup() {
		colorMode(HSB);

       
	}

	public void keyPressed() {

	}

	float off = 0;

	public void draw() 
    {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
        textAlign(CENTER, CENTER);
        
	}

	//loads text file
	public void loadFile()
	{
		String line = "";
		String wordArray[];

		loadStrings("filename.txt"); // Load a text file into a String array
		wordArray = split(line, ' '); // Split a string into an array of words

		for (int i = 0; i < wordArray.length; i++)
		{
			wordArray[i].replaceAll("[^\\w\\s]",""); // Remove punction characters
			wordArray[i].toLowerCase(); // Convert a string to lower case 
		}
	}
}
