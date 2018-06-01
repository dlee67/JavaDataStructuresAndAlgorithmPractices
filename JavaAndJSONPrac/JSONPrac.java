import org.json.simple.*;
import com.google.gson.*;
/*
   https://stackoverflow.com/questions/20117148/how-to-create-json-object-using-string
   Got it directly from above.
*/
class JSONPrac{
   public static void main(String args[]){
	   Gson gson = new GsonBuilder().setPrettyPrinting().create();
	   JSONObject obj = new JSONObject();
       JsonParser jp = new JsonParser();
       
	   obj.put("name", "mkyong.com");
       obj.put("age", new Integer(100));
   
       JsonElement je = jp.parse(obj.toJSONString());
       String prettyJsonString = gson.toJson(je);
       System.out.println(prettyJsonString);
   }
}