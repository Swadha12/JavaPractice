package linkList_Stack;

public class ClassWith3Object {

	  private static ClassWith3Object ref_sington;
	    private static ClassWith3Object ret_sington;
	    private static int i;
		
		private ClassWith3Object(){
			i++;
		}
		
		public static ClassWith3Object getInstance(){
			
			if(i<3){
				ref_sington = new ClassWith3Object();
				ret_sington = ref_sington;
				
			}else{
				ret_sington=ref_sington;
			}
			return ret_sington;
			
		}
		
		public static void main(String[] args) {
		    for(int j=0; j<5 ;j++){
			ClassWith3Object obj = ClassWith3Object.getInstance();
			System.out.println(obj.toString());
			
		    }
		}

}
