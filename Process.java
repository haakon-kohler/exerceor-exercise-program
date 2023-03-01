import java.util.ArrayList;
import java.math.BigDecimal;
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
                ArrayList repsPercent = new ArrayList<Double>();
                
                repsPercent.add(100);
                repsPercent.add(97);
                repsPercent.add(94);
                repsPercent.add(92);
                repsPercent.add(89);
                repsPercent.add(86);
                repsPercent.add(83);
                repsPercent.add(81);
                repsPercent.add(78);
                repsPercent.add(75);
                repsPercent.add(73);
                repsPercent.add(71);
                repsPercent.add(70);
                repsPercent.add(68);
                repsPercent.add(67);
                
                // Converts all of these variables to BigDecimal form for use in multiplication, etc.
                BigDecimal out = new BigDecimal((Integer)repsPercent.get((Integer)liftIn.getReps()));
                BigDecimal weight = new BigDecimal(liftIn.getWeight());
                BigDecimal roundingCurve = new BigDecimal(0.955);
                BigDecimal restTimeFactor = new BigDecimal(1.06);

                for (int i = 0; i<liftIn.getSets(); i++)
                {
                    out = out.multiply(roundingCurve.pow(liftIn.getSets()));
                    out = out.multiply(restTimeFactor.pow(liftIn.getSets()).sqrt(null));
                }

                return out.multiply(weight).round(null).toBigInteger().intValue();
            }
        }
        else return liftIn.getWeight();
    }
 
    public ArrayList<Lift> printTree(Cycle<Lift> cycleIn)
    {
        return printTree(cycleIn.getRoot());
    }

    private ArrayList<Lift> printTree(BSTNode<Lift> rt)
    {
        ArrayList<Lift> out = new ArrayList<Lift>();
        {
            if (rt != null) {
                printTree(rt.getLeft());
                out.add(rt.getValue());
                printTree(rt.getRight());
            }
        }
        return out;
    }

    public int getWhole1RM(Cycle cycleIn)
    {
        ArrayList<Lift> liftTable = printTree(cycleIn);
        BigDecimal out = new BigDecimal(null, 0);

        for(int i =0; i<20; i++)
        {
            BigDecimal RM = new BigDecimal(getSingle1RM(liftTable.get(liftTable.size()-i)));
            out = out.multiply(new BigDecimal(0.6).add(new BigDecimal((i)*0.02))).add((new BigDecimal(1)).subtract(new BigDecimal(0.6).add(new BigDecimal(i*0.02))).multiply(RM));
        }
        return -1;
    }
}


