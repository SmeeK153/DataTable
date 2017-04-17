package core;

import java.util.Arrays;
import java.util.HashMap;

import javafx.scene.Node;
import javafx.scene.layout.GridPane;

public class DataTable {
	
	private GridPane table = new GridPane();
	private HashMap<HashMap<Integer,Integer>,Object> tableContents = new HashMap<HashMap<Integer,Integer>,Object>();
	
	public DataTable(String...headers){
		
	}
	
	/*
	 * Sets the contents of the respective column for the new header or creates one if necessary
	 */
	public void setHeader(Integer column, String newHeader){
		this.setCell(0, column, newHeader);
	}
	
	/*
	 * Sets the contents of the respective column for each new header or creates one if necessary
	 */
	public void setHeader(Integer startingColumn, String...newHeaders){
		for (String s : newHeaders){
			this.setCell(0, startingColumn++, s);
		}
	}
	
	/*
	 * 
	 */
	public void setCell(Integer row, Integer column, String content){
		StackTraceElement[] stack = Thread.currentThread().getStackTrace();
		
		for (StackTraceElement e : stack){
			System.out.println(e.getClassName() + "." + e.getMethodName() + "()");
		}
	}

	
	public void insertHeader(Integer column, String newHeader){
		
	}
	
	public void insertHeader(Integer startingColumn, String...newHeaders){
		
	}
	
	public void deleteHeader(Integer column){
		
	}
	
	public void deleteHeader(String header){
		
	}
	
	public void deleteAllHeaders(){
		
	}
	
	public static void main(String[] args){
		new DataTable().deleteAllHeaders();
	}
}
