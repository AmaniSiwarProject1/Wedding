package Wedding.Planner;
import java.util.logging.Logger;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Event1 {
	
	  private String name;
	    private LocalDate date;
	    private List<Task> tasks;
    private static final Logger logger = Logger.getLogger(Event1.class.getName()); 

	    public Event1(String name, LocalDate date) {
	        this.name = name;
	        this.date = date;
	        this.tasks = new ArrayList<>();
	    }

	    public void addTask(Task task) {
	        tasks.add(task);
	    }

	    public List<Task> getTasks() {
	        return tasks;
	    }

	    public void displayEventDetails() {
	        logger.info("Event: " + name + " on " + date);
	        for (Task task : tasks) {
	            logger.info("   " + task);
	        }
	    }
	    
}
