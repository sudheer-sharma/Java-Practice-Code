// // // // Method OverLoading
// public class Method_OverLoading {

//     public static void main(String[] args) {
//         Calculator cal = new Calculator();
//         System.out.println(cal.sum(5, 8));
//         System.out.println(cal.sum((float) 8.9, (float) 9.8));
//         System.out.println(cal.sum(5, 8, 9));
//     }
// }
// class Calculator {
//     int sum(int a, int b) {
//         return a + b;
//     }
//     float sum(float a, float b) {
//         return a + b;
//     }
//     int sum(int a, int b, int c) {
//         return a + b + c;
//     }
// }
//
//
//
// // // // Method Overriding
// public class Method_OverLoading {

//     public static void main(String[] args) {
//         Animals a1 = new Animals();
//         Deer d1 = new Deer();

//         a1.eat();
//         d1.eat();
//     }
// }

// class Animals {

//     void eat() {
//         System.out.println("eat anithing");
//     }
// }

// class Deer extends Animals {

//     void eat() {
//         System.out.println("eat grass");
//     }
// }
