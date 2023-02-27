import java.util.ArrayList;
import java.util.Arrays;
public class Process {
    // File for running the 1RM program

    public int getSingle1RM(Lift liftIn)
    {
        if(liftIn.getReps()>1&&liftIn.getReps()>1)
        {
            if (liftIn.getReps()>15)
            {
                System.out.println("1RM Failed – Reps too high");
                return -1;
            }
            else
            {
                ArrayList repsPercent = new ArrayList<Integer>();
                int[] array = {100,97,94,92,89,86,83,81,78,75,73,71,70,68,67};
                repsPercent = Arrays.asList(array);
                return -1;
            }
        }
        else return liftIn.getWeight();
    }

//     public int outExpectedDifficulty(Cycle cycleIn, Lift liftIn)
//     {
//         if(cycleIn.find(liftIn)!=false)
//         {
//             System.out.println("Lift not in correct cycle");
//             return -1;
//         }
//         // TODO liftIn.getDate() Compare to the most recent lift before, then keep going back weighing each one less
//         return -1;
//     }
// }

