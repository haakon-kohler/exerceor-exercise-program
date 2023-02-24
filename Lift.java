import java.util.ArrayList;

public class Lift implements Comparable<Lift>
{

    private int date;
    private int sets;
    private int reps;
    private int weight;
    private int rest;
    private int difficulty;

    public void LiftCreate(int weightIn, int repsIn, int setsIn, int restIn, int dateIn, int diff)
    // ! KEEP IN THIS ORDER, because weight + reps isn't optional
    // Sets and date can be optionally added
    {
        weight = weightIn;
        reps = repsIn;
        date = dateIn;
        sets = setsIn;
        rest = 60;
        difficulty=diff;
    }

    public int getWeight()
    {
        return(weight);
    }
    
    public int getSets()
    {
        return(sets);
    }

    public int getReps()
    {
        return(reps);
    }
    public int getDifficulty() {
    	
    	return(difficulty);
    }

    public int getRest()
    {
        return(rest);
    }

    public int getDate()
    {
        return (date);
    }

    public String toString()
    {
        String out;
        out = "[Day in cycle:" + date + ",weight (lb): " + getWeight() + ", Reps" + getReps() + ", Sets, " + getSets() + ", Rest (seconds): " + getRest();
      
        return (out);
    }
    public int compareTo(Lift other) {
    	if (this.date>other.date) {
    		return 1;
    	}
    	if (this.date==other.date) {
    		return 0;
    		}
    	else {
    		return -1;
    	}
    	}
}
