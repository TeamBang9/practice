public class Gohome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*
	#1. Branch Reset Groups -> 해당 언어가 없어서 스킵
		
	#2. Matching Same Text Again & Again
	->tester.checker("^([a-z]\\w\\s\\W\\d\\D[A-Z][a-zA-Z][aeiouAEIOU]\\S)\\1$"); // Use \\ instead of using \

	3. **Backreferences To Failed Groups**
	→tester.checker("^((\\d{8})|(\\d{2}-\\d{2}-\\d{2}-\\d{2}))$");
	
	4. **Forward References**
	→ tester.checker("^(\\2tic|(tac))*$"); // Use \\ instead of using \


	#5. Positive Lookahead
	->tester.checker("o(?=oo)"); //Use '\\' instead of '\'.
	oo 앞으로 o가 몇개인가.

	#6. Negative Lookahead
	->tester.checker("(.)(?!\\1)"); //Use '\\' instead of '\'.
	
	#7. Positive Lookbehind
	->tester.checker("(?<=[13579])\\d"); //Use '\\' instead of '\'.

	#8. Negative Lookbehind
	->tester.checker("(?<![aeiouAEIOU])(.)"); //Use '\\' instead of '\'.

	[https://blog.hexabrain.net/205](https://blog.hexabrain.net/205) << look 관련 표현식 잘 나와있음
	*/
}
}