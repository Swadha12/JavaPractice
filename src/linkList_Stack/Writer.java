package linkList_Stack;

public abstract class Writer {
public  void write(){
	System.out.println("writing.....");
}


}
 class author extends Writer{
	public  void write(){
		System.out.println("writing book");
	}
}

class Programmer extends Writer{
	public  void write(){
		System.out.println("writing code");
	}
	
	
}

