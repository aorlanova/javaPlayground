package testingCenter;

public class Decrypt {

	public static void main(String[] args) {
		String test1 = "12859";
		System.out.println(decryptMyCode(test1, 0)); 
		String test2 = "123";
		System.out.println(decryptMyCode(test2, 0)); 
		String test3 = "12923";
		System.out.println(decryptMyCode(test3, 0)); 

	}
	
	
	static int holder = 0;
	
	public static int decryptMyCode(String data, int pos) {
		holder = 0;
	if(pos > data.length()) {
		
		return 0;
		
	} else if (pos == data.length()) {
		
		return 1;
		
	}
	
		if(pos-1 != -1) {
			
			holder = Character.getNumericValue(data.charAt(pos-1))*10 + Character.getNumericValue(data.charAt(pos));
			
			if(holder != 0 && holder <27) {
				
				return decryptMyCode(data, pos+1) + decryptMyCode(data, pos+2);
				
			} else {
			
			holder = data.charAt(pos);
			
			if(holder != 0) {
				
				return decryptMyCode(data, pos+1) + decryptMyCode(data, pos+2);
				
			}
			
		}
			
		} else {
			
			holder = data.charAt(pos);
			
			if(holder != 0) {
				
				return decryptMyCode(data, pos+1) + decryptMyCode(data, pos+2);
				
			}
			
		}
		
		return 0;
	
	}
	
	


}

