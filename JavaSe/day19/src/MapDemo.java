import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.omg.CORBA.PUBLIC_MEMBER;
/*
 * Map�Ļ���ʹ��:
 */

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		
		//1.���Ԫ��
		
		System.out.println(map.put(123,"Google"));//key������,����null
		System.out.println(map.put(123,"Apple"));//put    ����key�ϴζ�Ӧ��value  ,����ԭֵ
		map.put(321,"Baidu");
		map.put(11,"Alibaba");
		
		System.out.println(map);
		//2.ɾ��Ԫ��
		System.out.println(map.remove(1));//key����ʱ,����null
		System.out.println(map.remove(11));//����, ����value
		
		
		System.out.println(map);
		//map.clear();
		//System.out.println(map);
		
		//3.�ж�
	     if(map.containsKey(123)){
	    	 System.out.println("key����");
	    	 
	     }else{
	    	 System.out.println("key������");	 
	     }
	     
	     if(map.containsValue("Baidu")){
	    	 System.out.println("b����");
	    	 
	     }else{
	    	 System.out.println("b������");	 
	     }
	     if (map.isEmpty()) {
			System.out.println("mapΪ��");
		}else{
			System.out.println("map�ǿ�"+map.size());
			
		}
	    //4.��ȡ
	     System.out.println(map.get(231)); 
	    System.out.println(map.get(123)); 
	    
	    /*
	     * 5.��������:mapû�е�����
	     * a.�õ�key��set����
	     * b.ʹ�øü��ϵĵ�����,ȥ����key
	     * c.ʹ��get+������=���� value
	     * 
	     */
	    Set<Integer> ke= map.keySet();//----------------1
	    Iterator<Integer> it= ke.iterator();
	    while (it.hasNext()) {
			Integer in = (Integer) it.next();
			System.out.println(in);
			System.out.println(map.get(in));//ͨ�����õ�.get()�õ�values
		}
	    System.out.println("===========");
	    Collection<String> values = map.values();//-----------2
	    
	    Iterator<String> it2 = values.iterator();
	    
	    while (it2.hasNext()) {
			String string = (String) it2.next();
			System.out.println(string);
			//System.out.println(map.get(string));"error"
		}
	    System.out.println("===========");
	    /*
	     * ʹ��entrySet()������map����ת����:set����,ʹ�õ�����
	     * Map.Entry����:ӳ����=��ֵ��
	     */
	    Set<Map.Entry<Integer,String>> e= map.entrySet();//-------3
	   
	    Iterator<Map.Entry<Integer,String>> it3= e.iterator();
	  
	    while (it3.hasNext()) {
			Map.Entry<Integer,String> entry =it3.next();
			Integer key =entry.getKey();
			String value =entry.getValue();
			System.out.println(entry);
			System.out.println("key:"+key+"\tvalue:"+value);
		}
	    
	    
	    
	    
	    
	    
	    
	    
	     
	     
	     
	     
	     
	     
	     
	     
	     
	}

}
