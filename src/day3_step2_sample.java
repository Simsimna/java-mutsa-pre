import java.util.Random;
import java.util.Scanner;

public class day3_step2_sample {
    public static void main(String[] args) {
        int myHp = 100; // 사용자의 Hp
        int goblinHp = 40; // 고블린의 Hp
        int turn = 1; // 게임 턴 수
        Scanner sc = new Scanner(System.in);
        Random random = new Random();


        // 출력 : 고블린이 길을 막았다! (HP 40)
        System.out.println("고블린이 길을 막았다! (HP " + goblinHp + ")");


        while (goblinHp>0) { // 고블린이 살아있는 동안 반복!

            // 출력 : [턴 1] 행동 선택 (1.공격 2.도망) > 1
            System.out.print("[턴 : " +turn+"] 행동 선택 (1. 공격 2. 도망) > ");

            //액션(action) 값을 변수로 담음
            int action = sc.nextInt();

            // 채우기 4 : if 문 전체 채우기
            if (action == 1) { // 1. 공격인 경우 (action 값이 1)
                // 나의 기본 공격력(damage) 8 랜덤으로 0~7 추가 공격력

                int damage = 8 + random.nextInt(8);

                goblinHp -= damage; // 고블린 HP 감소 (goblinHp - damage)


                // 출력 : 내 공격! 데미지 (숫자) → 고블린 HP (숫자)
                System.out.println("내 공격! 데미지 " + damage + " → 고블린 HP " + goblinHp);

            } else if (action == 2) { // 2.도망인 경우 (action 값이 2)
                // 출력 : 도망쳤다... 다음에 다시 도전!
                System.out.println("도망쳤다... 다음에 다시 도전!");
                break; // 게임 종료 (반복문 종료)

            } else { // 예외 처리 : 1,2 가 아닌 다른 값을 입력한 경우
                System.out.println("1 또는 2를 입력해 주세요");// 출력 : 1 또는 2를 입력하세요!

                continue; // 입력을 잘못해도 고블린한테 맞을 수 있으니까 다시 위로 올라가야함
            }

            if (goblinHp>0) { // 고블린이 아직 살아있으면 고블린이 공격
                // 고블린의 기본 공격력(counter) 3 이며 랜덤으로 0~4 까지 추가됨
                int counter = 3 + random.nextInt(5);

                // 고블린의 공격으로 myHp 감소 (myHp - counter)
                myHp -= counter;

                // 출력 : 고블린의 반격! 피해 (숫자) → 내 HP (숫자)
                System.out.println("고블린의 반격! 피해 " + counter + " → 내 HP " + myHp);
            }

            // 한턴 추가 (전투 아직 안끝남)
            turn++;

        }

        // 전투 종료! 남은 HP: (숫자)
        System.out.println("전투 종료! 남은 HP: " + myHp);
    }
}
