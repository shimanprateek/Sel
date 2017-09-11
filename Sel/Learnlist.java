import java.util.HashMap;
import java.util.Map;


public class Learnlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String p ="";
		String q ="";
		HashMap <Integer,String> h = new HashMap <Integer,String>();
		//h.put(0, "PRATEEK");
		h.put(1, "P");
		h.put(2, "R");
		h.put(3, "A");
		h.put(4, "T");
		h.put(5, "E");
		h.put(6, "E");
		h.put(7, "K");
		//System.out.println(h.size());
		//System.out.println(h.get(null));
		//System.out.println(h);
		System.out.println( "KEYSET: "+h.keySet());
		System.out.println("ENTRYSET: "+h.entrySet());
		System.out.print("-----------Using Key Set----------");
		for (Integer x: h.keySet())
		{
			//System.out.println(h.get(x).toString());
			p =p.concat(h.get(x).toString());
		}
		System.out.println();
		System.out.print(p);
		System.out.println();
		System.out.print("-----------Using Entry Set----------");
		for(Map.Entry<Integer, String> e :h.entrySet())
		{
			q =q.concat(e.getValue());
			
		}
		System.out.println();
		System.out.print(q);
	}

}
