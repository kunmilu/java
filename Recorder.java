import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//キーとバリューの組み合わせを登録することができるクラス
public class Recorder {
	Map<String,String> hm = new HashMap<String,String>();
	
	public void put(String key,String value) {
		//keyとvalueの組み合わせを受け取り登録する
		hm.put(key,value);
		
		for (Map.Entry<String, String> entry:hm.entrySet()) {
			if (entry.getKey().equals(key)){
				System.out.println(entry.getKey() + "=" + entry.getValue());
			}
		}
	}
	
	public void get(String key) {
		if (hm.containsKey(key))  {
			System.out.println(hm.get(key));
		} else {
			//keyが未登録の場合はスローする
			throw new IllegalArgumentException();
		}
	}
	
	public void delete(String key) {
		if (hm.containsKey(key)) {
			//keyが登録済の場合は対応するキーとバリューの組み合わせを削除する
			for (String keys : hm.keySet()) {
				if (keys.equals(key)) {
					System.out.println("deleted:" + keys);
				}
			}
			hm.remove(key);
		} else {
			//keyが未登録の場合はスローする
			throw new IllegalArgumentException();
		} 
	}
	
	public void delete() {
		//すべてのキーとバリューの値を削除する
		hm.clear();	
		System.out.println("deleted all");
	}
	
}
