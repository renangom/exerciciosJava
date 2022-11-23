package colecoes;

import java.util.HashSet;
import java.util.Set;

public class WorkingWithHashSet {
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		conjunto.add('a');
		conjunto.add("Olá mundo");
		conjunto.add(123);
		conjunto.add(34.5);
		
		System.out.println(conjunto);
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		//união
		conjunto.addAll(nums);
		System.out.println(conjunto);
		
		//intersecção
		conjunto.retainAll(nums);
		System.out.println(conjunto);
	}
}
