import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class Program {
    // The overall exercise program, data structure for individual list
    private String name;
    
    private ArrayList<Cycle> cycleList;
    
    public Program(String nameIn) 
    {
        
        name = nameIn;
        cycleList= new ArrayList<Cycle>();
    }

    public Program(String startIn, String nameIn, Cycle firstCycle) 
    {
        
        name = nameIn;
        cycleList= new ArrayList<Cycle>();
        cycleList.add(firstCycle);
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
    
    public String toString() {
    	String prog="";
    	for (int i=0; i<cycleList.size(); i++) {
    		prog =prog + cycleList.get(i).inorder();
    	}
    	return prog;
    }
    
    public void ProgramPrint() {
    	
        	try {
        	File file = new File("/Users/nicholasrose/Desktop/workoutplan.txt");
    		file.createNewFile();
    		
    		FileWriter myWriter = new FileWriter("/Users/nicholasrose/Desktop/workoutplan.txt");
    		
    		String title ="              " + getName();
    		
    		myWriter.write(title);
    		
    		myWriter.write(this.toString());
    		
    		myWriter.close();
    		
        	}
        	catch (Exception IOException) {
        		try {
        		FileWriter myWriter = new FileWriter("/Users/nicholasrose/Desktop/workoutplan.txt");

        		myWriter.write(this.toString());
        		
        		myWriter.close();
        		}
        		catch(Exception IOExcpetion){
        			
        		}
        	}
        
    }
}
