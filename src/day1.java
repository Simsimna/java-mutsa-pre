public class day1
{
    public static void main(String[] args)
    {
        int age ;
        age = 32;


        String name = "이대연";
        char name1 = '이';
        char name2 = '대';
        char name3 = '연';

        System.out.println("안녕하세요 저는 "+name+ " 입니다");
        System.out.println("안녕하세요 저는 "+name1+ name2 +name3+" 입니다");

        System.out.println("나이는 " +age+  "살 이에요");
        System.out.println("늙은이이지만 잘부탁드립니다.");

// char는 1, String은4지만, 코드 작성에 있어 효율과 가독의 중도를 지켜야함
// 그리고 사람이름이 세글자라는 보장이 없으니 범용성도 생각할 것




    }
}
//        지금은 16:12 입니다.
//        System.out.println("지금은 "+16+":"+12+" 입니다"); //
//
//
//        System.out.println("지금은 16:12 입니다");
        /*
        System.out.println("Likelion"+"최고!");
        System.out.println("내 현제 체력은 " + 100 + " 입니다");
        */

//        System.out.println("오늘은 멋사 첫 프리코스 수업입니다");
//        System.out.println("비전공자 입장에서 죽을맛이에요");
//        System.out.println("이 길이 내 길이 맞을까요");
//        System.out.println("3:30");

//        System.out.println(27+100);
//        System.out.println("27"+"100");
//        System.out.println("27\n"+100);

// system 시스템, out 출력 println 이거 출력해줘!(출력물)
// 출력 -> 콘솔/ 프로그래밍 / 웹/ 앱
// "" 안에 있으면 문장,
// "Likelion"+"최고!" 처럼 +하기로 이어붙임
// 내 체력은 'xxx' 입니다, 라고 할때처럼 변동값일때 필요
// + 3:30분 같은거 입력하면 왜 안되는가,
// "멋쟁이 사자처럼" 안에 있으면 -> 문자
// 27 -> 이건 숫자구나
// sout + taP
// println << 중 ln 은 line, 한 문장을 줄바꿈한다.
// print만 치면 줄바꿈 없이 나옴
// 주석처리를 여러개 하고싶을땐, 여러 줄 드래그 -> ctrl+/

// name = 이대연; "" 가 없음 String name = "이대연"; 문자열 안내해주는 String

// age = 32; int 를 통해 정수, 숫자임을 선언
// 자바는 이대연, 32가 문자열인지 숫자인지 구분하지 못함
