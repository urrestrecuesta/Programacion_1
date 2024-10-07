package ejercicio4;

public class Repositorio {

   public static void main(String[] args) {
      boolean a, b, c;
      a = b = c = true;
      if (!a || (b && c)) {
         System.out.println("If Executed");
      } else {
         System.out.println("Else Executed");
      }
   }
}

//////////////////////////////////////////////////////////////////////////////////////////////
