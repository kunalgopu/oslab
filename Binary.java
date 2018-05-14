import java.util.*;
class Binary{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    // int num = 124;
    // System.out.println(Integer.toBinaryString(num));
    System.out.println("Welcome to the Binary Number System Game");
    // generate a random no
    Random random = new Random();
    int low = 10;
    int high = 100;
    int result = random.nextInt(high-low) +low;
    //user input
    System.out.println("Tell the binary of this number : "+result);
    System.out.print("Input : ");
    int input = scan.nextInt();

    //logic to find the binary
    int binary[] = new int[40];
    int index = 0;
    while(result>0){
      binary[index++] = result%2;
      result = result/2;
    }
    for (int i=index-1;i>=0 ; i--) {
      System.out.print(binary[i]);
    }
    String str = Arrays.toString(binary);
    System.out.println(str);

    //calculate correct binary and match the user answer
    if (input == 0) {
      System.out.println("You won the game");
    }
    else{
      System.out.print("Better luck next time");
    }
  }
}
