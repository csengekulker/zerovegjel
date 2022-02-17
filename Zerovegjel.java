import java.util.Scanner;

class Zerovegjel {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  int sum = 0;

  int i = -1;

  while (i !=0) {
   System.out.print("Szám > ");
   int num = sc.nextInt();

   sum += num;

   if (num == 0) {
    i++;
   }
  }

  System.out.println("Az összeg " + sum);

 }
}
