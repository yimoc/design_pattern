package pattern.structural.module.exam1;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class MainModule {
	private static MainModule singleton = null;
	
	public InputStream input = null;
	public PrintStream output = null;
	public PrintStream error = null;
	
	private MainModule(){
		
	}
	
	public static MainModule getSingleton(){
		if (MainModule.singleton == null){
			MainModule.singleton = new MainModule();
		}
		return MainModule.singleton;
	}
	
	public void prepare(){
		this.input = new InputStream() {
			
			@Override
			public int read() throws IOException {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		this.output = new PrintStream(new ByteArrayOutputStream());
		this.error = new PrintStream(new ByteArrayOutputStream());
		
	}
	
	public void unprepare(){
		this.output = null;
		this.input = null;
		this.error = null;
	}
	
	public void printNewLine() {
	    System.out.println();
	  }

	  public void printString(String value) {
	    System.out.print(value);
	  }

	  public void printInteger(int value) {
	    System.out.print(value);
	  }

	  public void printBoolean(boolean value) {
	    System.out.print(value);
	  }
	  
	  public void scanNewLine() {
	    // to-do: ...
	  }
	  
	  public void scanString(String value) {
	    // to-do: ...
	  }

	  public void scanInteger(int value) {
	    // to-do: ...
	  }

	  public void scanBoolean(boolean value) {
	    // to-do: ...
	  }
	
}
