
public class ObjectReference {
      int age=30;
      ObjectReference or=null;
      String fName="Swadha";
      String lName="Tripathi";
      
    //  String this = null; // declarion and assignment not possible for this
      
      public  ObjectReference(int age, String fName,String lName){
    	  this.age = age;
    	  this.fName = fName;
    	  this.lName = lName;
    	   }
	
      public void printData(ObjectReference or){
    	  System.out.println(age +" "+fName +" "+lName +" " +or);
      }
	
      public ObjectReference printData1(ObjectReference or){
    	  System.out.println(age +" "+fName +" "+lName +" " +or);
    	  return or;
      }

      // this => can pass as argument and return as value 
      public ObjectReference printData2(ObjectReference this){
    	  System.out.println(age +" "+fName +" "+lName +" " +or);
    	  return this;
      }
	
	
	public static void main(String[] args) {
		ObjectReference or = new ObjectReference(30,"Swadha1","Tripathi1");
		//ObjectReference or = new ObjectReference();  // can't create object if default contructor not defined in class
		//or.printData();
		
		ObjectReference or1= null;
		//System.out.println(or1.age);   // cann't access attribute or method of null reference object => NullPointerException
		//or1.printData();
		
		or.printData(or1);                     // Can pass the null argument
		System.out.println(or.printData1(or1)); // can return null value
		System.out.println(or.printData2().toString()); 
	}

}
