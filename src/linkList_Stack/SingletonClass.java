package linkList_Stack;

public class SingletonClass {
    private static SingletonClass ref_sington;
    private static SingletonClass ret_sington;
    private static int i;
	
	private SingletonClass(int i){
		System.out.println("object created successfully: "+i);
	}
	
	public static SingletonClass getInstance(){
		i=1;
		if(ref_sington == null){
			ref_sington = new SingletonClass(i);
			i++;
			ret_sington=ref_sington;
		}else{
			ret_sington=ref_sington;
		}
		return ret_sington;
		
	}
	
	public static void main(String[] args) {
	    for(int j=0; j<5 ;j++){
		SingletonClass	sc=	SingletonClass.getInstance();
		
	    }
	}

}
