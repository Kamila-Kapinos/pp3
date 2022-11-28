import java.util.Arrays;
import java.util.Random;

public class Scoring {
    private int[] judgesNotes = new int[5];
    private int[] aviableJudgesNotes = {1, 2, 3, 4, 5};

    public Scoring(){      
        Random r = new Random();
        for(int i = 0; i < 5; i++){
            int index = r.nextInt(5);
            this.judgesNotes[i] = aviableJudgesNotes[index];
        }
    }

    public int[] getNotes(){
        return this.judgesNotes;
    }

    public double countFinalScore(){
        Arrays.sort(getNotes());
        double counter = 0;
        
        for(int i = 1; i < getNotes().length - 1; i++ ){
            counter += getNotes()[i];
        }
        
        double avg = counter/(double)3;
        return Math.round(avg*100)/100.0;
    }

    public String toString() {
        return "Your final score is: " + countFinalScore();
    }

}
