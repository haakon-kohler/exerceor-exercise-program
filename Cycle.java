import java.util.ArrayList;
import java.util.Date;

public class Cycle<Lift extends BST<E>> {
    private int startString;
    private int endString;

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
    
    public void PrintCycle(Cycle cycle1) {
    	try {
    	File file = new File("/Users/nicholasrose/Desktop/workoutplan.txt");
		file.createNewFile();
		
		FileWriter myWriter = new FileWriter("workoutplan.txt");
		
		myWriter.write(cycle1.toString());
		
		myWriter.close();
		
    	}
    	catch (Exception IOException) {
    		
    	}
    }
}
