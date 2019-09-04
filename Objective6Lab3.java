public class Objective6Lab3 {
  public static void main(String[] args) {
    int counter = 1;



    while(counter <=20) {
      System.out.print(counter);
      Oddeven();
      counter = counter + 1;
    }

  }
  public static void Oddeven() {
    int counter = 0;

    if(counter % 2 == 0) {
      System.out.println(" is even");
    }
    else if(counter % 2 != 0) {
      System.out.println(" is odd");

    }
  }

}
