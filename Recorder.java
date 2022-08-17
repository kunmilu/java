import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Recorder {
	Map<String, String> hm = new HashMap<String, String>();

	public void put(String key, String value) {
		hm.put(key, value);

		for (Map.Entry<String, String> entry : hm.entrySet()) {
			if (entry.getKey().equals(key)) {
				System.out.println(entry.getKey() + "=" + entry.getValue());
			}
		}
	}

	public void get(String key) {
		if (hm.containsKey(key)) {
			System.out.println(hm.get(key));
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void delete(String key) {
		if (hm.containsKey(key)) {
			for (String keys : hm.keySet()) {
				if (keys.equals(key)) {
					System.out.println("deleted:" + keys);
				}
			}
			hm.remove(key);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void delete() {
		hm.clear();
		System.out.println("deleted all");
	}
}
