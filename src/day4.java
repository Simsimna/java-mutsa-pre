import java.util.Random;
import java.util.Scanner;

public class day4 {
    public static void main(String[] args) {





    } ////메인



} //// 클래스


// 배열
// 자료형[](변수의이름) = new (자료형)[배열의 길이]
//
//        int[]arr = new int[5]; // 길이는 5,안에 어떤값을 넣을지 정하지 않은상태
//        int[]arr1 = new int[]{5, 12, 18, 15, 30}; // 값을 정해서 넣어놓은 상태
//        int[]arr2 = {5, 12, 18, 15, 30}; // new int 생략 가능
//
//        int[]arr3;
////        arr3 = {5,1,2,3,4,5}; // 이런식 불가능
//        arr3 = new int[]{5,1,2,3,4,5}; // new int[]까지 포함한 식으로 해야함
//
//
//        System.out.println(arr);
//
//        int[] arr = {5,6,7,99}; //length : 4
//
//        int arrleng = arr.length;; // 이렇게하면 길이가 불러와짐 arr의 length(길이)
//
//        System.out.println(arrleng);
//
//        // 인덱스를 활용해서 값에 접근
//        int xero = arr[0]; //0번째값 가져오기
//        int xero2 = arr[3]; //0번째값 가져오기
//
//        System.out.println(xero);
//        System.out.println(xero2);
//
//
// 배열은 한바퀴를 못돌리나? (질문하기)
//        int[] arr= {0,1,2,3};  -> 질문에 대한 답변,
//
//        int n = 7;
//
//        int index = n%arr.length;
//
//        System.out.println(arr[index]);



// 배열 실습 (1)

//        int[] scores = {80, 95, 70}; // 상자 3칸짜리 한줄
//        for (int i = 0; i<scores.length; i++){ //scores.length -> 배열의 길이를 가늠하기 쉬움.
//            System.out.println((i+1)+"번 점수 : "+scores[i]);
//        }

// 배열 실습 (2)

//        Random random = new Random();
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("주사위 던질 횟수를 입력");
//
//        int n = sc.nextInt();
//        int[] dices = new int[n];
//
//        for (int i = 0; i < dices.length; i++){
//            dices[i] = random.nextInt(6)+1;
//        }

//배열 실습

//        Random random = new Random();
//        Scanner sc = new Scanner(System.in);
//
//
//
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//        for(int i = 0 ; i<n; i++){ // n이나 arr.length
//
//            arr[i] = random.nextInt(10);
//
//
//            System.out.println(i+"번째 숫자"+arr[i]);
//
//            if(arr[i]%2==0){
//                System.out.println(arr[i]);
//            }
//        }

//        Random random = new Random();
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt(); // 배열의 칸을 입력받음
//
//        int[] arr = new int[n]; // 입력받은 값을 배열 길이에 적용
//
//
//        for(int i = 0 ; i<n; i++){ // n이나 arr.length
//
//            System.out.print(i+1+"번째 숫자 입력 > "); //ln을 안씀, 줄바꾸면 가독성이 떨어져서
//
//            arr[i] = sc.nextInt(); // arr[i]번째 칸에 값을 입력
//            }
// 여기서 각 칸마다 값이 입력 됐고, 다시 for문에서 i가 0부터 첫칸부터 뭐가 들어있나 확인
//
//        for (int i=0; i<arr.length; i++){ //i=0부터니까 첫칸, arr.length로 지정한 길이까지
//
//            if (arr[i]%2==0){ //arr[i]의 값이 짝수면 if 실행
//                System.out.println("짝수 입니다 : " + arr[i]);
//                i=0일때부터 n까지 지정한 입력값이 들어가면서 짝수 출력
//            }
//        }

//        메서드(Method)-> 특정 기능을 수행하기 위한 코드 묶음
//   (public,private)static     int      add      (int a, int b)
//   구성 :  <접근 제어자>      <반환형>   <메소드명>   (전달값_매개변수){
//        }






//메서드 1
//        printHello(); -> 메서드 호출용
//        printMyname("이름",15); // 반환하기로 한 값에 맞춰서 입력해야함

//메서드2
//        int result = add(3,5);
//        System.out.println(result);

//        //배열을 선언하고 그 배열의 전체 값을 구한다.
//        int[] arr = {3, 6, 7, 10, 11};
//
//        int sum = sumArr(arr);
//
//        System.out.println("배열 전체의 합은 " + sum + "입니다.");

//        int c = 30;
//
//        if (c > 10) {
//            int d = 40; // 이 내부에서 선언된 변수는 해당 범위 안에서만 사용가능
//        }
//        System.out.println(d); // d를 찾을 수 없어서 실행 불가

//        String a = "안녕";

//    static (반환)(매서드명)(전달값){}  -> 위치는 메인 중괄호 밖
// print 함수 -> Hello 출력
// (1) 반환 : void (따로 반환하는 값이 없을때), int, boolean, String
//    (메서드 예시1)
//    static void printHello(){
//        System.out.println("Hello");
//    }
//   (메서드 예시2)
//    static void printMyname(String name, int age){
//        System.out.println("이름 : "+name+ "/ 나이 : "+age);
//    }
//    (메서드 예시3)
//    static int add(int a , int b){
//        int sum = a+b;
//        return sum; // 반환하는 값이 존재하니, return, 반환하는 값의 자료형인 int가 반환값에 필요
//    }
//    static int sumArr(int [] array){
//        int sum = 0;
//        for(int i = 0; i<array.length; i++)
//            sum += array[i];
//        return sum;
//    }
