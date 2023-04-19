package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTest {
	
	public static void main(String[] args) {
		
		List<String> langs = Arrays.asList("JS", "PHP", "Java", "C++");
		List<Integer> nums = Arrays.asList(1,2,3,4);
		
		//Com Object
		String ultimaLinguagem_1 = (String) ListaUtil.getUltimo1(langs);
		System.out.println(ultimaLinguagem_1);
		
		Integer ultimaNumero_1 = (Integer) ListaUtil.getUltimo1(nums);
		System.out.println(ultimaNumero_1);
		
		//Com generics sem restrição
		String ultimaLinguagem_2 = ListaUtil.getUltimo2(langs);
		System.out.println(ultimaLinguagem_2);
		//Com generics com restrição
		Integer ultimaNumero_2 = ListaUtil.<Integer>getUltimo2(nums);
		System.out.println(ultimaNumero_2);
		
		
	}
}
