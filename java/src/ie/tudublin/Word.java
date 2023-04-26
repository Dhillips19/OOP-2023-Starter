package ie.tudublin;

import java.util.ArrayList;

public class Word {
    
    public String word;
    public ArrayList<String> wordArrayList = new ArrayList<String>(); 
    public ArrayList<Follow> followArrayList = new ArrayList<Follow>(); 
    
    @Override
    public String toString() {
        
        String output = "";

        for(int i = 0; i < followArrayList.size(); i++)
        {
            output = word + ": " + followArrayList.get(i);
        }
        return output;
    
    }

    public void setWordArrayList(ArrayList<String> wordArrayList) {
        this.wordArrayList = wordArrayList;
    }

    public ArrayList<Follow> getFollowArrayList() {
        return followArrayList;
    }

    public void setFollowArrayList(ArrayList<Follow> followArrayList) {
        this.followArrayList = followArrayList;
    }
    
    
    public Word(String word, ArrayList<String> wordArrayList, ArrayList<Follow> followArrayList) {
        this.word = word;
        this.wordArrayList = wordArrayList;
        this.followArrayList = followArrayList;
    }
    
    

    public Word()
    {

        }    
}