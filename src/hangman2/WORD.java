package hangman2;
import java.util.*;

class WORD{
    private String WORD_STRING;
    
    private int FREQUENCY;
    
    
    
    public String getWORD_STRING() {
		return WORD_STRING;
	}

	public int getFREQUENCY() {
		return FREQUENCY;
	}

	public int GET_FREQUENCY() {
        return FREQUENCY;
    }
    
    public WORD(String WORD_STRING, int FREQUENCY){
        this.WORD_STRING=WORD_STRING;
        
        this.FREQUENCY=FREQUENCY;
    }
    
    public ArrayList<Integer> HAS(char C){
        ArrayList<Integer> INDICES=new ArrayList<Integer>();
        for(int i=0; i<WORD_STRING.length(); i++){
            if(WORD_STRING.charAt(i)==C){
                INDICES.add(i);
            }
        }
        return INDICES;
    }
    
    
    
    public int GET_LENGTH(){
    return WORD_STRING.length();
    }

	public void setWORD_STRING(String wORD_STRING) {
		WORD_STRING = wORD_STRING;
	}

	public void setFREQUENCY(int fREQUENCY) {
		FREQUENCY = fREQUENCY;
	}
    
}
