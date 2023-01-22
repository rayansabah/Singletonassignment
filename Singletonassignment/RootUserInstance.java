package Singletonassignment;

public class RootUserInstance{
	  
	private int UID = 0;
	  private int GID = 0;
	  
	  private String userName = "root";
	  private String name = "Super user";
	  private String home = "/root";
	  private String shell = "/bin/sh";
	  private RootUserInstance() {
	    }
	  
	    private static RootUserInstance instance = new RootUserInstance();

	    public static RootUserInstance getInstance() {
	        return instance;
	    }

	    
	  @Override
	  
	  public String toString(){
	    return new StringBuilder(userName)
	      .append("(").append(name).append(")")
	      .append(" ").append(UID).append(":").append(GID)
	      .append(" home: ").append(home).append(" ")
	      .append("shell: ").append(shell)
	      .toString();
	  }
	}