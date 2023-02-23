import java.util.ArrayList;

public class Lift<E extends Comparable<E>>
{

    private juDate date;
    private int sets;
    private int reps;
    private int weight;
    private int rest;
    // TODO ADD RPE

    // ! Each item in the BST needs to have a date, so methods avoiding date are invalid
    // public void LiftCreate(int weightIn, int restIn)
    // // ! KEEP IN THIS ORDER, because weight + reps isn't optional
    // // Sets and date can be optionally added    
    // {
    //     weight = weightIn;
    //     reps = repsIn;
    //     sets = 1;
    //     date = null;
    //     rest = 60;
    // }

    // public void LiftCreate(int weightIn, int repstIn, int setsIn)
    // // ! KEEP IN THIS ORDER, because weight + reps isn't optional
    // // Sets and date can be optionally added
    // {
    //     weight = weightIn;
    //     reps = repsIn;
    //     sets = setsIn;
    //     date = null;
    //     rest = 60;
    // }

    public void LiftCreate(int weightIn, int repsIn, int setsIn, int dateIn)
    // ! KEEP IN THIS ORDER, because weight + reps isn't optional
    // Sets and date can be optionally added
    {
        weight = weightIn;
        reps = repsIn;
        date = dateIn;
        sets = setsIn;
        rest = 60;
    }

    public void LiftCreate(int weightIn, int repsIn, int setsIn, int restIn, int dateIn)
    // ! KEEP IN THIS ORDER, because weight + reps isn't optional
    // Sets and date can be optionally added
    {
        weight = weightIn;
        reps = repsIn;
        date = dateIn;
        sets = setsIn;
        rest = restIn;
    }

    public getWeight()
    {
        return(weight);
    }
    
    public getSets()
    {
        return(sets);
    }

    public getReps()
    {
        return(reps);
    }

    public getRest()
    {
        return(rest);
    }

    public getDate()
    {
        return (date);
    }

    public String toString()
    {
        String out;
        out = "[Weight (lb): " + getWeight() + ", Reps" + getReps() + ", Sets, " + getSets() + ", Rest (seconds): " + getRest();
        if (getDate() == null) {
            out += ", No Date Added]";
        }
        else {
            out += ", " + getNiceDate() + "]";
        }

        return (out);
    }
}
