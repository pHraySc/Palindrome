import java.util.ArrayList;
import java.util.List;

public class palindrome {
	public static boolean is_palindrome(int n){
		String str = String.valueOf(n);
		StringBuilder str2 = new StringBuilder(str);
		String str1 = new String(str2.reverse());
		if(str.equals(str1)){
		return true;
		}
		else {
			return false;
		}
	}
	@SuppressWarnings("null")
	public static void main(String[] args){
		List num = new ArrayList();
		for(int i = 0;i < 10000;i ++){
			if(is_palindrome(i)){
				num.add(i);
				}
			}
		for(int n = 0;n < num.size();n ++){
		System.out.println(num.get(n));
		}
	}
}
