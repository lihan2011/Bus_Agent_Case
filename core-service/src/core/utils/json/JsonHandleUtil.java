package core.utils.json;

import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class JsonHandleUtil {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public static JsonNode convertStringToJsonNode(String jsonString) {
		ObjectMapper mapper = new ObjectMapper();	 
		try {
			return mapper.readTree(jsonString);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static String convertStringToJsonNode(Map map) {
		ObjectMapper mapper = new ObjectMapper();	 
		try {
			return mapper.writeValueAsString(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static Map convertStringToMap(String jsonString) {
		Map<String,Object> map = new HashMap<String,Object>();
		
		ObjectMapper mapper = new ObjectMapper();	 
		try {
			JsonNode jsonNode = convertStringToJsonNode(jsonString);
			map = mapper.readValue(jsonNode,new TypeReference<HashMap<String,Object>>(){});	 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}

}
