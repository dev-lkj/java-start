package scope;

public class Scope1 { // scope는 변수의 접근 가능한 범위
    public static void main(String[] args) {
        int m = 10; // m이 생존 시작
        if (true) {
            int x = 20; //x 생존 시작
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        } // x 생존 종료
//        System.out.println("main x = " + x);
        System.out.println("main x = " + m);

    } // m 생존 종료
}
