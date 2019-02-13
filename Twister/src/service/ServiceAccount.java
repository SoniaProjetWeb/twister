package service;

import org.json.JSONException;
import org.json.JSONObject;

public class ServiceAccount {
	//service pour la creation d'un user
	public static JSONObject creatUser(String nom,String prenom,String login,String password) {
		JSONObject jo = new JSONObject();
		
		try {
			jo.append("prenom", prenom);
			jo.append("nom", nom);
			jo.append("login", login);
			jo.append("password", password);
			jo.append("createUSer", "ok");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		//verifier s'il le login existe etc ...
		//userExist(login);	
		return jo;
	}
	private static boolean userExist(String login) {
		//a completer
		return false;
	}
	
	public static JSONObject login(String login,String password) {
		JSONObject jo = new JSONObject();
		try {
			jo.append("login", login);
			jo.append("password", password);
			jo.append("login", "ok");

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jo;
	}
	
	public static JSONObject logout(String key) {
		JSONObject jo = new JSONObject();
		try {
			jo.append("key", key);
			jo.append("logout", "ok");

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jo;
	}
}

