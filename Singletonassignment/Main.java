package Singletonassignment;

public class Main{
	  public static void main(String[] args){
	    // To get getInstance from RootUserInstance class
	    System.out.println(RootUserInstance.getInstance());
	    // To get INSTANCE from RRootUserEnum class
	    System.out.println(RootUserEnum.INSTANCE);
	    // To get getInstance from RootUserLazy class
	    System.out.println(RootUserLazy.getInstance());
	  }
	}