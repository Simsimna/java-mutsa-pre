import java.sql.SQLOutput;
import java.util.Scanner;

public class day2 {

    public static void main(String[] args) {

        // 여기부터는 수업 복습, 수업때 진행 한 내용은 마지막 } 이후에.
        // 자료형

//        long a = 100L; // long의 경우L을 붙여야함, int에 비해 메모리의 효율성이 떨어져서 잘 안씀
//        System.out.println(a); // 출력값 100

//        float a = 1234567f; // 1234567.0 실수표현을 위해 .0 (7자리)
//        float b = 100.1234567f; // 100.123456 -> 100.1234 6? (7자리+9번째 자리반올림?)
//        float c = 12345678f; // 뭉개짐
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
// 7자리 '유효숫자'란, 확실하게 보여주는 값은 7자리, 그 이후를 넘어가면 뭉개지거나 반올림

//          float x = 16777216f; // 8자리 숫자
//          float y = 16777217f; // 8자리 숫자 (x보다 1 큼)
//
//          System.out.println(x); // 출력: 16777216.0
//          System.out.println(y); // 출력: 16777216.0
// 출력값을 보면 알 수 있듯이, 8자리까지 나오니 8자리까지 출력 할 수있는거아닌가? 싶겟지만, 8번째 자리는 믿을 수 없음
// 운이 좋으면 보여주지만, 데이터가 훼손 될 수 있기 시작함.

//------------------------------
//      형변환
//        자동형변환은 기본적으로 작은쪽에서 큰 쪽으로 가능,

//        double a = 100;
//        System.out.println(a); // 출력 100.0 ,정수 100이 자동으로 실수형이 되면서 100.0이 됨 - 자동형변환
//
//        int b = 11.1;   오류발생
//        int b = (int)11.1; // (int)로 강제형변환이 필요
//        System.out.println(b); // 출력 11, 실수를 정수형으로. - 강제형변환
//
//        int c = 'a'; //char -> int
//        System.out.println(c); // 출력 97, a에 해당하는 97이 출력, 인텔리제이의 기능으로 형변환없이도 표현 가능
//
//        char d = 97; // 자동형변환 char는 글자를 번호로 담기 때문에
//        System.out.println(d);
//
//        char f= (97+2);
//        System.out.println(f);
//
//        int e = 97;
//        char g = (e+2); // 오류발생, e는 인트형이기 때문에
//        char g = (char)(e+2); // 이거는 가능
//        System.out.println(g);

        // 안되는 애들
//        int a1 = 15.5; // 강제형변환 필요
//        int a2 = (int)"100"; // 글자 -> 숫자로 계열이 다름
//        char a3 = (char)"조"; // ''가 아닌 ""로 감싼순간부터 문자열, String -> char 불가능
//        int d = (int)true; // 참거짓은 어디로든 불가능


// ----------------
// 산술연산자

//  + - * / % 존재, %는 나머지
//  7%2 = 1

//        // 실습 진행 BMI 계산기 만들기
//
//        int KeyCm = 175;
//        int MomKg = 75;
//
//        ★★★★★ 이 부분때문에 틀림
//        double KeyM = (double)175/100; // 정수형/정수형 이후 double을 만나고 실수형이 되기에, 강제형변환이 없으면 소수점 밑을버림
//        ★★★★★

//        double BMI = MomKg/(KeyM*KeyM);
//        int bmi = (int)BMI;
//
//        System.out.println("키 : "+KeyM +"m" );
//        System.out.println("몸무게 : " +MomKg+ "Kg" );
//        System.out.println("BMI : " + BMI);
//        System.out.println("표시용 : "+bmi);

//--------------------------------
//        스캐너

//        import java.util.Scanner;  스캐너를 사용하기전에 가장 상단에 임포트함, 임포트문, 클래스 임포트(가져오기)
//  역할 : 자바에게 해당 클래스의 위치 (주소) 를 미리 알려주는 작업
//        자바야 내가 뒤에서 Scanner라고 적으면 java.utill 도구상자 말하는거니까 찾아서 준비해둬! 라는 느낌

//        Scanner sc = new Scanner(System.in); // 얘는 객채 생성(변수 선언)


//         Scanner => 데이터 타입(클래스 타입) => "어떤 모양의 상자인가?"
//         sc => 변수 이름 => "상자에 붙인 이름"
//         = => 대입 연산자 => "오른쪽에서 만든 걸 상자에 담아라"
//         new => 객체 생성 키워드 =>"새로운 물건을 하나 만들어라"
//         Scanner(System.in) => 실제 객체(키보드 입력기) => "키보드 데이터를 읽는 스캐너 본체
//
//        Scanner : 클래스 : 기계를 어떻게 만들지 정의해 둔 틀
//        new : 객체 생성 연산자 : 메모리에 진짜 실물 공간을 파는 명령
//        System.in : 생성자 인자(파라미터) : 기계 만들 때'키보드 선"을 꽂아주는 작업
//        실물 기계 : 객체 / 인스턴스(Object) : 메모리에 새로 조립된 진짜 스캐너 부품
//        sc : 참조변수 : 기계 위치(주소)를 쥐고 조종하는 변수, 리모콘

//        sc.nextInt() 버튼 누름 ->기계가 키보드 입력을 정수로 읽어옴
//        sc.nextLine() 버튼 누름 -> 기계가 키보드 입력을 문자열 한 줄로 읽어옴
//        sc.nextDouble() 버튼 누름 -> 기계가 키보드 입력을 실수로 읽어옴

//        Scanner sc = new Scanner(System.in);
//
//        int gold = 1000;
//        int member = 9;
//
//        System.out.println("획득한 골드 "+gold+ " 골드");
//        System.out.println("파티 인원 수 "+member+ " 명");
//
//        double goldN = (double)gold/member; // 여기서 또 실수, gold/member를 계산한건 이미 정수형이 됨.
//        int goldNN = (int)goldN;
//
//        System.out.println("1인당 골드 : "+ goldN);
//        System.out.println("받을 수 있는 골드 량 : " +goldNN);
//        System.out.println("남는 잔금 : " +(gold%member));

//------------------------------------------
//        비교연산자
// >, <, >=, <=, ==, !=

//-------------------------------------------
//        if/else
//
//        int a = 9;
//
//        if (a>10) {
//            System.out.println("a는 10보다는 큽니다");
//        }
//        else if(a==10){
//            System.out.println("a는 10이네요");
//        }
//        else{
//            System.out.println("a는 10이하입니다.");
//        }

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("당신의 레벨은?");
//        int a = sc.nextInt();
//
//                if (a>=15){
//                    if (a>100) {
//                        System.out.println("너무 높은데요 여기서 뭐하시나요");
//                    }
//                    else{
//                        System.out.println("보스방으로 가시죠");
//                    }
//                    }
//                else{
//                    System.out.println("레벨업 조금만 더 하고오세요 한 15까지?");
//                }
//

    } // main문
} // 클래스


//        float f = 3.512541234123f; // 소수점 7자리 제외 전부 잘려서 나옴
//        double d = 3.111231212312;
//
//        System.out.println(f);
//        System.out.println(d);

//        char c = 'A'; // 문자 하나지만, 숫자로도 표현이 가능 숫자의 범위

//        char a = 97; // 문자 하나지만, 숫자로도 표현이 가능 숫자의 범위
//        char b = 97+1;

//        char c = c;
//        c = a+2;
//        char f = g;
//        g = a+2; 이거 안되는것들 있음 확인 필요

//        System.out.println(c);
// 문자 'A'는 숫자와 매칭이 돼 있음 '유니코드'

// 형변환

//        double d = 10;
//        System.out.println(d); // 10.0 이 출력, 컴퓨터는 더 큰쪽으로 움직임
// 실수 범위에서 움직여야 되는 상황이라면, 10.0으로 돼어 있는게 맞음

// 자동으로 더 큰 범위로 움직임 => 자동 큰 변환

//        int i = 10.234; // 더 큰범위를 작은범위로 바꾸는 것, 명령이 필요함
//        int i = (int)10.234; // (int)로 더 큰범위 임에도 작게 형변환 => 강제형변환
// .234를 '버림' 반올림 반내림과는 다른걸 기억할 것

//        char c = 97; //97 앞에 (char)가 쓰이는 것이 맞지만, 이정도는 인텔리제이가 인식함
// 유니코드 표에 97과 a가 매칭
//        System.out.println(c);


//        int c = (char)97;
//        System.out.println(c);
//
//        char a = 98;
//        System.out.println(a);
//
//        char b = (int)98;
//        System.out.println(b);
//
//        double a1 = (int)12.5;
//        System.out.println(a1);
//
//        int a2 = (double)12.5;
//        Syetme.out.println(a2); 이건 안됨

//        int c = (char)'c'; 작은 따옴표가 있는건 됨,
//        System.out.println(c);


//        int a = (int) 12.9; // 강제 형변환
//        int b = (int) "100"; // "" 때문에 안됨,
//        int b1 = (int) 'd'; // 이거는 됨, d는 char고 숫자로치면 100이기에
//        int b_ = Integer.parseInt("100"); // 나중에 배울 내용 이건 됨
//        char c = (char) "조"; // 이거 안됨
//        char c = (char) '조'; // 이건 됨
//        int d = (int) true; // 맞다 틀리다는 형변환의 대상이 아님
//        int d = true; // 지금은 안되지만, 나중에 true = 1, false = 0이기에 표현이 가능


//        산술 연산자
//        + - * / %(나머지)

//        int a= 10;
//        int b= 5;
//
//        int c = a/b;
//        System.out.println(c);
//
//        5/%2 = 1


//        int heightCm = 175;
//        int kweightKg = 68;
//        double heightCm1 = 175/100.0;
//        double BMI = kweightKg/(heightCm1*heightCm1);
//
//        System.out.println("키 : "+(double)heightCm/100+" m");
//        System.out.println("몸무게 : " + kweightKg + "kg");
//        System.out.println("BMI : " + BMI);
//        System.out.println("표시용 : "(int)BMI);
//------------------ 다시해보기,
//
//
//         double heightM = (double)heightCm/100;
////         double heightM = heightCm/100; => 1.0이나옴, 뒤에 값을 다 버림
//         double bmi = kweightKg/(heightM*heightM);
//
//        System.out.println(bmi);

// ---- 스캐너-----

//        콘솔 출력 : System.out.println("");
//        import java.util.Scanner; 스캐너를 쓰려면 필요
//        콘솔 입력 : Scanner sc = new Scanner(System.in);

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt(); // 동작 ()
//        double d = sc.nextDouble();
//        String s = sc.nextLine();
//
//        System.out.println(n);
//
//        // 스캐너는 한가지 치명적인 단점이 있어서 잘 사용안함
//        // 엔터값이 들어감. \n이 들어감
//        int n = sc.nextInt();
//        String s = sc.nextLine();

//        Scanner sc = new Scanner(System.in);
//        System.out.println("문자열을 입력하세요");
//
//        String s = sc.nextLine();
//
//        System.out.println(s);
//
//        sc.nextLine();
//
//        System.out.println("체중을 잘못입력했다고?");
//
//        sc.nextLine();
//        String s1 = sc.nextLine();

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("용사의 레벨을 입력하세요 : ");
//        int Level = sc.nextInt();
////
//        if (Level >= 15){
//            System.out.println(" 베테랑 입구로 - 보스전 직행!");
//        }
//        else if(Level>=5){
//            System.out.println(" 일반 입구로 입장! ");
//        }
//        else {
//            System.out.println("아직이에요 훈련장에서 레벨 5부터 만들어 오세요");
//        }

//
//        if (Level >= 5) {
//            if (Level >= 15) {
//                System.out.println("베테랑 입구로 - 보스전 직행!");
//            } else {
//                System.out.println(" 일반 입구로 입장! ");
//            }
//        } else {
//            System.out.println("아직이에요 훈련장에서 레벨 5부터 만들어 오세요");
//        }



