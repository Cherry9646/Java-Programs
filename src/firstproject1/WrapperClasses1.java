package firstproject1;
// string objects to all primitive data types
public class WrapperClasses1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String aa = "true";
        boolean bb = Boolean.parseBoolean(aa);
        System.out.println(bb);  
		
		String cc = "12376";
	        int dd = Integer.parseInt(cc);
	        System.out.println(dd); 
	        
	        String ee = "12";
	        byte ff = Byte.parseByte(ee);
	        System.out.println(ff); 

	        String gg = "1245";
	        short hh = Short.parseShort(gg);
	        System.out.println(hh);
	        
	        String ii = "1234567";
	        long jj = Long.parseLong(ii);
	        System.out.println(jj);
	        
	        String kk = "75.55";
	        float ll = Float.parseFloat(kk);
	        System.out.println(ll);
	        
	        String mm = "75.8755";
	        double nn = Double.parseDouble(mm);
	        System.out.println(nn);
	        		
		        
	}

}
