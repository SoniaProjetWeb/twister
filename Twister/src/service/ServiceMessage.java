package service;

import org.json.JSONException;
import org.json.JSONObject;

public class ServiceMessage {

	public static JSONObject addMessage(String key,String text) {
		JSONObject jo = new JSONObject();
		try {
			jo.append("key", key);
			jo.append("text", text);
			jo.append("addMessage","ok");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jo;
	}
	
}
