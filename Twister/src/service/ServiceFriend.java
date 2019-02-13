package service;

import org.json.JSONException;
import org.json.JSONObject;

public class ServiceFriend {
	public static JSONObject addFriend(String key,String id_friend) {
		JSONObject jo = new JSONObject();
		try {
			jo.append("key", key);
			jo.append("id_friend", id_friend);
			jo.append("addFriend", "ok");

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jo;
	}	
	
	public static JSONObject deleteFriend(String key,String id_friend) {
		JSONObject jo = new JSONObject();
		try {
			jo.append("key", key);
			jo.append("id_friend", id_friend);
			jo.append("deleteFriend", "ok");

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jo;
	}	
	
	public static JSONObject listFriend(String key) {
		JSONObject jo = new JSONObject();
		try {
			jo.append("key", key);
			jo.append("listFriend", "ok");

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jo;
	}
}
