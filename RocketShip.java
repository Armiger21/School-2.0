public class RocketShip {
   public static final int ROCKET_SIZE = 3;
   
   public static void main( String[] args ) {
      printNoseCone();
      printBody();
      printNozzle();
   }

   public static void printNozzle() {
      printNoseCone();
   }
   

    
   public static void printNoseCone() {
      for (int nc = 1; nc <= ROCKET_SIZE * 2 - 1; nc++) {
         for (int space = 1; space <= ROCKET_SIZE * 2 - nc; space++) { 
            System.out.print(" ");
         }
         for (int slash = 1; slash <= nc ; slash++) {
            System.out.print("/");
         }
         for (int ast = 1; ast <= 1; ast++) {
            System.out.print("**");
         }
         for (int bSlash = 1; bSlash <= nc; bSlash++) {
            System.out.print("\\");
         }
         System.out.println();
      }
   }       
   

   public static void printBody() {
      printEdge();
      printDiamondTop();
      printDiamondBottom();        
      printEdge();
      printDiamondBottom();        
      printDiamondTop();
              
      printEdge();        
   }
   

   public static void printDiamondTop() {
      for (int dTop = 1; dTop <= ROCKET_SIZE; dTop++) {
         System.out.print("|");
         for (int dot = 1; dot <= ROCKET_SIZE - dTop; dot++) {
            System.out.print(".");
         }
         for (int slash = 1; slash <= dTop; slash++) {
            System.out.print("/\\");
         }
         for (int dDot = 1; dDot <= ROCKET_SIZE - dTop; dDot++) {
            System.out.print("..");
         }
         for (int slash = 1; slash <= dTop; slash++) {
            System.out.print("/\\");
         }
         for (int dot = 1; dot <= ROCKET_SIZE - dTop; dot++) {
            System.out.print(".");
         }          
         System.out.println("|");
      }
   }   
 
   public static void printDiamondBottom() {
      for (int dLow = 1; dLow <= ROCKET_SIZE; dLow++) {
         System.out.print("|");
         for (int dot = 1; dot <= dLow - 1; dot++) {
            System.out.print(".");
         }
         for (int bSlash = 1; bSlash <= ROCKET_SIZE+ 1 - dLow; bSlash++) {
            System.out.print("\\/");
         }
         for (int ddot = 1; ddot <= dLow - 1; ddot++) {
            System.out.print("..");
         }
         for (int bSlash2 = 1; bSlash2 <= ROCKET_SIZE + 1 - dLow; bSlash2++) {
            System.out.print("\\/");
         }
         for (int dot = 1; dot <= dLow - 1; dot++) {
            System.out.print(".");
         }
         System.out.print("|");
         System.out.println();
      }
   }
   

   public static void printEdge() {
      for (int edgePlus = 1; edgePlus <= 1; edgePlus++) {
         System.out.print("+");
         for (int edgeLine = 1; edgeLine <= ROCKET_SIZE ; edgeLine++) {
            System.out.print("=*=*");
         }
      }
      System.out.println("+");
   }
}