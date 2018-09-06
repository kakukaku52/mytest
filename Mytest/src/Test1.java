import java.util.ArrayList;
import java.util.Collection;

public class Test1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// String rezult = get_In_Data();


		String str = "平成20170525";
		System.out.println(str.substring(0, 1));
		System.out.println(str.substring(2, str.length()));


		String str2 = TEST(str, str);
		//System.out.println(str2);
		//get_In_Data();
	}

	private static String TEST(String str1,String str2){
		return str1 + str2;
	}
	public static Collection get_In_Data() {

		Collection in_data = new ArrayList<Object>();

		return in_data;

	}

	public static void getShinse(String logic, String nisa) {

		Collection result = get_In_Data();
	}

}
