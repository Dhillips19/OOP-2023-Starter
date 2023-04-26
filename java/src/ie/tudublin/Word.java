package ie.tudublin;

import java.util.ArrayList;

public class Word {
    
    public String word;
    public ArrayList<Follow> wordArrayList;
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    public Word()
        {

        }
    
    public Word(ArrayList<Follow> wordArrayList, String word)
    {
        this.word = word;
        this.wordArrayList = wordArrayList;
    }

    public void setWord(String word)
    {
        this.word = word;
    }
    public String getWord()
    {
        return word;
    }
    public void setWordArrayList(ArrayList<Follow> wordArrayList)
    {
        this.wordArrayList = wordArrayList;
    }
    public ArrayList<Follow> getWordArrayList()
    {
        return wordArrayList;
    }
}