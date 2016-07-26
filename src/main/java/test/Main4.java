package test;

public class Main4 {

	public static void main(String[] args) {
		System.out.println(addBinary("100", "110010"));
	}
	
	 public static String addBinary(String a, String b) {
	        int alen = a.length();
	        int blen = b.length();
	        StringBuffer result = new StringBuffer();
	        boolean flag = false;
	        while(alen>0 && blen>0){
	        	alen--;blen--;
	            int ca = a.charAt(alen)-'0';
	            int cb = b.charAt(blen)-'0';
	            if(flag && ca==1 && cb==1){
	                result.insert(0, "1");
	            }else if(flag && (ca+cb)==1){
	                result.insert(0, "0");
	            }else if(!flag && (ca+cb)==2){
	                flag = true;
	                result.insert(0, "0");
	            }else{
	                int tmp = flag?1:0;
	                flag = false;
	                result.insert(0,ca+cb+tmp);
	            }
	        }
	        int lastLen = alen>0?alen:blen;
	        String lastStr = alen>0?a:b;
	        while(flag && lastLen > 0){
	        	lastLen--;
	            char lastc = lastStr.charAt(lastLen);
	            if(lastc == '0'){
	                result.insert(0, "1");
	                flag = false;
	            }else{
	                result.insert(0, "0");
	            }
	        }
	        if(lastLen > 0){
	            result.insert(0, lastStr.substring(0, lastLen));
	        }
	        if (flag) {
				result.insert(0, "1");
			}
	        return result.toString();
	    }

}
