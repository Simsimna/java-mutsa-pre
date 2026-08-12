import java.util.Scanner;
import java.util.Random;

public class day3 {
    public static void main(String[] args) {


        int i = 510;

        while(i>480) {

            i--;
            System.out.println("i = " +i);

            while(i==500){
                System.out.println("지금은 500입니다");
                break;

            }

        }






    } // main
} // class



//Scanner sc = new Scanner(System.in);
//
//        System.out.print("키(cm)를 입력하세요: ");
//int heightCm = sc.nextInt();
//
//        System.out.print("나이를 입력하세요: ");
//int age = sc.nextInt();
//
//        System.out.print("탑승권이 있나요? (있으면 1, 없으면 0): ");
//int ticket = sc.nextInt();
//
//boolean hasTicket = (ticket == 1);   // 1이면 true, 아니면 false
//
//        System.out.println();
//
//        if (ticket == 0) {                                   // 탑승권이 없으면 여기서 끝
//        System.out.println("탑승 불가 — 탑승권을 먼저 구매해주세요.");
////!ticket == 0으로 했지만 강사님 설명은 !hasTicket
//
//        } else if (heightCm >=130 && age >= 12) {          // 둘 다 맞아야 탑승
//        System.out.println("탑승 가능합니다!");
//
//// 둘중에 하나라도 안되는 상황
//        } else {
//                System.out.println("탑승 불가 — 아래 조건을 확인해주세요.");
//            if (heightCm < 130) {                           // ★ else if 가 아니라
//        System.out.println("- 키가 130cm 이상이어야 합니다.");
//            }
//                    if (age < 12) {                                 // ★ 독립된 if 두 개
//        System.out.println("- 만 12세 이상이어야 합니다.");
//            }
//                    }


// for


//        for(int i = 0; i<5; i++) {
//
//            System.out.println("Hello");
//
//        }
//        for(int i = 0; i<5; i++)
//        int 1 = 0;
//        i<5;
//        i++

// i = i+1 -> i+=1 -> i++
//        for (int i1 = 1; !(i1 >= 10); i1++){
//        i1은1, i1 >=10 이상이 ! 아니다, true, 증감.
//            if(i1%2 == 0){
//                System.out.println((i1+" = 짝수"));
//            }
//            else{
//                System.out.println(i1+" = 홀수");
//            }
//
//        }

//        for(int i =1; i<=10; i++) {
//
//            if(i%2 == 0){
//                System.out.println((i+" = 짝수"));
//            }
//            else{
//                System.out.println(i+" = 홀수");
//            }
//
//        }

// continue; -> i 가 조건을 성립해서 ture라면, continue;를 만났을 때 다음으로 건너감


// while문 , for문에서는 대략적인 도착점, 횟수를 알고 있음,
// while은 도착지점을 모르기에.

//int goblinHP = 1200;
//
//        System.out.println("고블린의 체력 : "+goblinHP);
//
//        while (goblinHP > 0){
//goblinHP = goblinHP-4;
//        System.out.println("고블린의 체력 : "+goblinHP);
//        }
//
//int i = 1;
//
//        while(i>0){ // 무한 루프 (런타임오류, 컴파일과정에서 발견되지 않음)
//        System.out.println("i의 값은 : " +i+ "입니다.");
//i++;
//        }

//        컴파일 오류// 런타임 오류(컴파일 과정에서 발견 되지 않음)
//        TDD -> 테스트

// Random
//Random random = new Random(); // random을 컨트롤 클릭하면 사용설명서를 볼 수 있음
//
//int dice = random.nextInt(6)+1;
//
//
//        System.out.println();

//
//Random random = new Random();
//
//int i = random.nextInt(10)+1;
//
//        if(i%2==0){
//        System.out.println(i+ " = 짝수");
//        }
//                else {
//                System.out.println(i+ " = 홀수");
//        }


//        Scanner sc = new Scanner(System.in);
//
//        int coffee = 2; // 준비된 커피
//
//        int money = 3000; // 손님의 돈
//
//        while( money > 0){ // 손님이 돈이 있으면 시킨다.
//
//            System.out.println("손님 : 커피한잔 주세요");
//
//            if(coffee == 0){
//                System.out.println("손님 죄송합니다, 커피가없어요");
//                break; // 여기서 브레이크를 써주면 커피가없는상태로 탈출
//            }
//            money-=1000;
//            coffee--;
//
//            System.out.println("가게 : 커피한잔 드리겠습니다.");
//
//        }


//        브레이크 하나만 쓰면 while이 다 벗겨지는지
//                스위치문 사라진거같은데, 누락인가요 생략인가요?


