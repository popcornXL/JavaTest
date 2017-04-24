import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;
import net.sf.json.JSONObject;
public class TestJson2 {  
public static void main(String[] args) throws Exception{  
		String url="http://211.76.134.28/LifeSizeAPI/getPorts_Pixels.aspx";
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		params.put("API_Id", "cathaybk");
		params.put("API_Pw", "0323CaTh");
		params.put("StartDate", "2017/03/22");
		params.put("StartTime", "17:30");
		params.put("EndTime", "18:00");
		params.put("Resolution", "720P");
		params.put("CM", "cathaybk");
		System.out.println(params);
//		StringBuilder postData = new StringBuilder();
//		for (Map.Entry<String, Object> param : params.entrySet()) {
//			if (postData.length() != 0) postData.append('&');
//			postData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
//			postData.append('=');
//			postData.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));
//		}
//		System.out.println(postData);
//		byte[] postDataBytes = postData.toString().getBytes("UTF-8");
		
		JSONObject obj = JSONObject.fromObject(params);
		byte[] postDataBytes = obj.toString().getBytes("UTF-8");
		System.out.println(obj);
		URL u = new URL(url);
		HttpURLConnection conn = (HttpURLConnection) u.openConnection(); //模擬網頁
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Accept", "application/json;charset=utf-8");
		conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
		conn.setRequestProperty("Content-Length", String.valueOf(postDataBytes.length));
		conn.setDoOutput(true);
		conn.getOutputStream().write(postDataBytes);
		
		int responseCode = conn.getResponseCode();
		System.out.println("\nSending 'POST' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);
		
		BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();
		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
 
		//print result
		//System.out.println(response.toString());
		
		String jsonContent=response.toString();
		System.out.println(jsonContent);
		//System.out.println(jsonContent.get);
	
	}
}