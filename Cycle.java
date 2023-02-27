import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Cycle<E> extends BST {
    private int startInt;
    private int endInt;
    private String name;

    public int getStart()
    {
        return (startInt);
    }

    public void setStart(Integer startIn)
    {
        startInt = startIn;
    }

    public int getEnd()
    {
        return (startInt);
    }

    public void setEnd(Integer endIn)
    {
        endInt = endIn;
    }

    public String getName()
    {
        return (name);
    }

    public void setName(String nameIn)
    {
        name = nameIn;
    }
    
    public void PrintCycle() {
    	try {
    	File file = new File("/Users/nicholasrose/Desktop/workoutplan.txt");
		file.createNewFile();
		
		FileWriter myWriter = new FileWriter("/Users/nicholasrose/Desktop/workoutplan.txt");
		
		myWriter.write(this.inorder());
		
		myWriter.close();
		
    	}
    	catch (Exception IOException) {
    		try {
    		FileWriter myWriter = new FileWriter("/Users/nicholasrose/Desktop/workoutplan.txt");

    		myWriter.write(this.inorder());
    		
    		myWriter.close();
    		}
    		catch(Exception IOExcpetion){
    			
    		}
    	}
    }
}
