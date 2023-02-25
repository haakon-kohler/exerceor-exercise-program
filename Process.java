public class Process {
    // File for running the 1RM program

    public int outExpectedDifficulty(Cycle cycleIn, Lift liftIn)
    {
        if(cycleIn.find(liftIn)!=false)
        {
            System.out.println("Lift not in correct cycle");
            return -1;
        }
        // TODO liftIn.getDate() Compare to the most recent lift before, then keep going back weighing each one less
        return -1;
    }
}

