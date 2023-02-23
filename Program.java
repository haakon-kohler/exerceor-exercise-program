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

    public void createProgram(String startIn, String nameIn, Cycle<E> firstCycle) 
    {
        startString = startIn;
        name = nameIn;
        cycleList.add(firstCycle);
    }

    public getStart()
    {
        return (startString);
    }

    public setStart(String startIn)
    {
        startString = startIn;
    }

    public getName()
    {
        return (name);
    }

    public setName(String nameIn)
    {
        name = nameIn;
    }

    public addCycle(Cycle<E> cycleIn)
    {
        cycleList.add(cycleIn);
    }
}

    public addCycle(Cycle<E> cycleIn)
    {
        cycleList.add(cycleIn);
    }
}