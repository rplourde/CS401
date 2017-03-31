/**
 *
 * CSCI 401 Ian Jeff Rebecca Fall 2016
 */

public class Game {
    
    private String question;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String answer;
    private boolean used;
    
    /**
    * Constructor for Game object containing a question, options for answers,
    * the answer and the used state.
    */
    public Game(String question, String option1, String option2, String option3,
            String option4, String answer, boolean used){
    
        this.question = question;
        this.option1= option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.answer = answer;
        this.used = used;
    
    }
    
    /**
    * Returns the question to the calling object.
    */
    public String getQuestion(){
        
        return(this.question);
    
    } 
    
    /**
    * Returns option 1 to the calling object.
    */
    public String getOption1(){
    
        return(this.option1);
    
    }
    
    /**
    * Returns option 2 to the calling object.
    */
    public String getOption2(){
    
        return(this.option2);
    
    }
    
    /**
    * Returns option 3 to the calling object.
    */
    public String getOption3(){
    
        return(this.option3);
    
    }
    
    /**
    * Returns option 4 to the calling object.
    */
    public String getOption4(){
    
        return(this.option4);
    
    }
    
    /**
    * Returns the answer to the calling object.
    */
    public String getAnswer(){
        
        return(this.answer);
        
    }
    
    /**
    * Sets this instance of the value of the variable used
    */
    public void setUsed(boolean used){
    
        this.used = used;
        
    }
    
    /**
    * Returns used to the calling object.
    */
    public boolean getUsed(){
    
        return(this.used);
    
    }
 
}
