import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.omg.CORBA.PUBLIC_MEMBER;
/*
 * Map的基本使用:
 */

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		
		//1.添加元素
		
		System.out.println(map.put(123,"Google"));//key不存在,返回null
		System.out.println(map.put(123,"Apple"));//put    返回key上次对应得value  ,覆盖原值
		map.put(321,"Baidu");
		map.put(11,"Alibaba");
		
		System.out.println(map);
		//2.删除元素
		System.out.println(map.remove(1));//key不存时,返回null
		System.out.println(map.remove(11));//存在, 返回value
		
		
		System.out.println(map);
		//map.clear();
		//System.out.println(map);
		
		//3.判断
	     if(map.containsKey(123)){
	    	 System.out.println("key存在");
	    	 
	     }else{
	    	 System.out.println("key不存在");	 
	     }
	     
	     if(map.containsValue("Baidu")){
	    	 System.out.println("b存在");
	    	 
	     }else{
	    	 System.out.println("b不存在");	 
	     }
	     if (map.isEmpty()) {
			System.out.println("map为空");
		}else{
			System.out.println("map非空"+map.size());
			
		}
	    //4.获取
	     System.out.println(map.get(231)); 
	    System.out.println(map.get(123)); 
	    
	    /*
	     * 5.遍历操作:map没有迭代器
	     * a.得到key的set集合
	     * b.使用该集合的迭代器,去遍历key
	     * c.使用get+迭代器=遍历 value
	     * 
	     */
	    Set<Integer> ke= map.keySet();//----------------1
	    Iterator<Integer> it= ke.iterator();
	    while (it.hasNext()) {
			Integer in = (Integer) it.next();
			System.out.println(in);
			System.out.println(map.get(in));//通过建得到.get()得到values
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
	     * 使用entrySet()方法吧map集合转换成:set集合,使用迭代器
	     * Map.Entry类型:映设项=间值对
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
