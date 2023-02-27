public class Lift implements Comparable<Lift> 
{

    private int date;
    private int sets;
    private int reps;
    private int weight;
    private int rest;
    private int difficulty;

    public Lift(int weightIn, int repsIn, int setsIn, int dateIn)
    // ! Keep two seperate functions so difficulty and rest can be optionally added
    {
        weight = weightIn;
        reps = repsIn;
        date = dateIn;
        sets = setsIn;
        rest = 60;
    }

    public Lift(int weightIn, int repsIn, int setsIn, int restIn, int dateIn, int diff)
    // ! Keep two seperate functions so difficulty and rest can be optionally added
    {
        weight = weightIn;
        reps = repsIn;
        date = dateIn;
        sets = setsIn;
        rest = restIn;
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

    // ! No "set date" function, because we'd rather they make a new lift

    public void setWeight(int weightIn)
    {
        weight = weightIn;
    }
    
    public void setSets(int setsIn)
    {
        sets = setsIn;
    }

    public void setReps(int repsIn)
    {
        reps = repsIn;
    }
    public void setDifficulty(int difficultyIn) {
    	
    	difficulty = difficultyIn;
    }

    public void setRest(int restIn)
    {
        rest = restIn;
    }
    
    public String toString()
    {
        String out;
        out = "\n\nCycle Date:" + date + "\n Weight: " + getWeight() + " lbs" + "\n Reps: " + getReps() + "\n Sets: " + getSets() + "\n Rest: " + getRest() + " sec";
      
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

    public int weightCompare(Lift other) {
        if (this.weight>other.weight) {
            return 1;
        }
        if (this.weight==other.weight) {
            return 0;
            }
        else {
            return -1;
        }
        }

    public int setsCompare(Lift other) {
        if (this.sets>other.sets) {
            return 1;
        }
        if (this.sets==other.sets) {
            return 0;
            }
        else {
            return -1;
        }
        }
}
