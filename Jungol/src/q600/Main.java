package q600;

public class Main {

     public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      String st = sc.nextLine();
      sc.close();

      String[] arr = st.split(" ");

      for (int i = 0; i < arr.length; i++) {
         
         if (i+1 == arr.length) {
            System.out.println(i+1);
         }
      }

   }

}