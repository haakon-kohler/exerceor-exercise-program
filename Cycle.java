import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Cycle<E> extends BST {
    private int startString;
    private int endString;

    public int getStart()
    {
        return (startTime);
    }

    public void setStart(Integer startIn)
    {
        startTime = startIn;
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
