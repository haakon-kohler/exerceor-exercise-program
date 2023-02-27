import java.util.ArrayList;

public class Program {
    // The overall exercise program, data structure for individual list
    private String startString;
    private String name;
    private ArrayList cycleList;

    public void createProgram(String startIn, String nameIn) 
    {
        startString = startIn;
        name = nameIn;
    }

    public void createProgram(String startIn, String nameIn, Cycle<Lift> firstCycle) 
    {
        startString = startIn;
        name = nameIn;
        cycleList.add(firstCycle);
    }

    public String getStart()
    {
        return (startString);
    }

    public void setStart(String startIn)
    {
        startString = startIn;
    }

    public String getName()
    {
        return (name);
    }

    public void setName(String nameIn)
    {
        name = nameIn;
    }

    public void addCycle(Cycle<Lift> cycleIn)
    {
        cycleList.add(cycleIn);
    }
}
