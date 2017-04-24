import java.security.MessageDigest;

public class HashTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String gg=encrypt("HashKey=klUVd0MZeuvWHcr6lTyJM7Cngh4M1Nrl&Amt=1000&MerchantID=32827891&MerchantOrderNo=201406010004&TimeStamp=1482901200&Version=1.2&HashIV=9mgnm3mBySxf5Zmq");
		System.out.println("sha256 加密"+gg);
		//841F57D750FB4B04B62DDC3ECDC26F1F4028410927DD28BD5B2E34791CC434D2
		String gg2=encrypt("HashIV=9mgnm3mBySxf5Zmq&Amt==100&MerchantID=32827891&MerchantOrderNo=840f022&TradeNo=14061313541640927&HashKey=klUVd0MZeuvWHcr6lTyJM7Cngh4M1Nrl");
		System.out.println("sha256 加密"+gg2);
		//62C687AF6409E46E79769FAF54F54FE7E75AAE50BAF0767752A5C337670B8EDB
	}
public static String encrypt(String s){   
	  MessageDigest sha = null;
	  try{
	   sha = MessageDigest.getInstance("SHA-256");   //SHA-256編碼 
	   sha.update(s.getBytes());   
	  }catch(Exception e){
	   e.printStackTrace();
	   return "";
	  }
	  return byte2hex(sha.digest());   
	 }
	private static String byte2hex(byte[] b){
    String hs="";
    String stmp="";
    for (int n=0;n<b.length;n++){
     stmp=(java.lang.Integer.toHexString(b[n] & 0XFF));
     if (stmp.length()==1) hs=hs+"0"+stmp;
     else hs=hs+stmp;
    }
    return hs.toUpperCase();
   }
}