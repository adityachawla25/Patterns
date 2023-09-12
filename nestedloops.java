//Star pattern
// public class nestedloops {
//     public static void main(String args[]){
//     for(int line =1 ; line <= 4; line++){
//         for(int star = 1; star <= line; star++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
// }
// }


// Inverted star pattern   stars = n - i + 1 (lines - line number + 1)
// public class nestedloops {
//     public static void main(String args[]){
//         int n = 4;
//     for(int line =1 ; line <= n; line++){
//         for(int star = 1; star <=n - line + 1 ; star++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
// }
// }



//Half Pyramid pattern
// public class nestedloops{
//     public static void main(String args[]){
//         int n = 9;
//         for(int line = 1;line <= n; line++){
//             for(int number = 1;number<=line;number++){
//                 System.out.print(number);
//             }
//             System.out.println();
//         }
//     }
// }



// Character pattern
public class nestedloops{
    public static void main(String args[]){
        int n =5;
        char ch = 'A';

        for(int i = 1; i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
