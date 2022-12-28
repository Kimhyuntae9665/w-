package helloworldd;


public class helloworldd {

	public static void main(String[] args) {
		System.out.println("hello world");
		
		//한줄 주석
		/*부분 
		 * 주석 */
		//변수 
		int num;
		num = 10;
		
		char character = 'a';
		
		//상수 
		//데이터를 저장하는 메모리 공간(변경 불가능)
		//final 키워드 사용 
		// 상수명 대문자로 적는다 일반적으로 
		final double PI = 3.14;
		
		final int NUMBER;
		NUMBER = 11;//첫번째 초기화 까지는 가능 
		
		System.out.println(num+" "+character+" "+PI+" "+NUMBER);
		
		

	}

}
