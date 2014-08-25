package _Java;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;



public class testJson {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String strJson = "{\"sqls\":[{\"sql\":\"INSERT INTO T_BASE_PERSON (PERSON_ID,PERSON_NAME) VALUES (?,?)\",\"values\":\"0dc11abb-967d-11e3-afc0-000c29c3253b,张三\"},{\"sql\":\"UPDATE T_BASE_CLASS SET CLASS_NAME=? WHERE CLASS_ID=?\",\"values\":\"一年一班,538b7ee7-967d-11e3-afc0-000c29c3253b\"}]}";
                
        JSONObject myObj = JSONObject.parseObject(strJson);
        JSONArray myArray = myObj.getJSONArray("sqls");
        for(int i=0;i<myArray.size();i++)
        {
            JSONObject o = myArray.getJSONObject(i);
            System.out.println(o.get("sql"));
            System.out.println(o.get("values"));
        }
        
        String strJson1 = "[{\"sql\":\"INSERT INTO T_BASE_PERSON (PERSON_ID,PERSON_NAME) VALUES (?,?)\",\"values\":\"0dc11abb-967d-11e3-afc0-000c29c3253b,张三\"},{\"sql\":\"UPDATE T_BASE_CLASS SET CLASS_NAME=? WHERE CLASS_ID=?\",\"values\":\"一年一班,538b7ee7-967d-11e3-afc0-000c29c3253b\"}]";
         
         JSONArray myArray1 =JSONArray.parseArray(strJson1);
         for(int j=0;j<myArray1.size();j++)
         {
             JSONObject o1 = myArray1.getJSONObject(j);
             System.out.println(o1.get("sql"));
             System.out.println(o1.get("values"));
         }
        
    }
/* (non-Javadoc)
 * @see java.lang.Object#hashCode()
 */
@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return super.hashCode();
}
}