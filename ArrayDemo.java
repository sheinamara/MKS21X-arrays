public class ArrayDemo{

  // functions to print arrays (1D and 2D; using method overloading)
  public static void printArray(int[]ary){
    System.out.print("["); // to get that bracket
    for (int i = 0; i < ary.length; i++){
      System.out.print(String.valueOf(ary[i]) + ", ");
    }
    System.out.print("\b\b]"); // to get that closing bracket and remove extra space and comma
  }
  public static void printArray(int[][]ary){
    System.out.print("[");
    for (int n = 0; n < ary.length; n++){
      printArray(ary[n]);
      System.out.print(", ");
    }
    System.out.print("\b\b]");
  }

  // function to count zeros (2D array)
  public static int countZeros2D(int[][] nums){
    int count = 0;
    for (int x = 0; x < nums.length; x++){
      for (int y = 0; y < nums[x].length; y++){
        if (nums[x][y] == 0){
          count ++;
        }
      }
    }
    return count;
  }

  // function to fill 2D string with different integers
  public static void fill2D(int[][] vals){
    for (int a = 0; a < vals.length; a++){
      for (int b = 0; b < vals[a].length; b++){
        if (b == a){
          vals[a][b] = 3;
        }
        else {
          vals[a][b] = 1;
        }
      }
    }
  }

  // function to make a new 2D array
  public static int[][] fill2DCopy(int[][] vals){
    int[][] finale = new int[vals.length][vals[0].length];
    for (int i = 0; i < vals.length; i ++){
      int[] sub = new int[vals[0].length];
      for (int x = 0; x < vals[i].length; x++) {
        if (vals[i][x] < 0){
          sub[x] = 3;
        }
        else{
          sub[x] = 1;
        }
      }
      finale[i] = sub;
    }
    return finale;
  }


  // TEST CASES
  public static void main (String [] args){
    int[] first = {1,2,3,4,5};
    int[] second = {100,200,300,400,500};
    int[] third = {666,777,888,999,1111,0};

    // 0a
    System.out.println("Time to test print functions! Let's start with 1D arrays.");
    printArray(first); System.out.print("\n");
    printArray(second); System.out.print("\n");
    printArray(third); System.out.print("\n\n");

    int[][] fourth = {{1,2,3}, {-1,-2,-3}, {100,200,300}};
    int[][] fifth = {{6,6,6}, {234,567,890}, {-567,-678,-789}};
    int[][] sixth = {{69,96,666}, {-987,765,543}, {1,1,-1,1}};

    // 0b
    System.out.println("Next up: 2D arrays!");
    printArray(fourth); System.out.print("\n");
    printArray(fifth); System.out.print("\n");
    printArray(sixth); System.out.print("\n\n");

    int[][] seventh = {{0,0,0}, {0,0,0}, {0,0,0}};
    int[][] eighth = {{0,96,666}, {987,765,543}, {1,1,1,0}};

    // 1
    System.out.println("Zeros are for heros! How many zeros are there?");
    printArray(sixth); System.out.print(" has " + String.valueOf(countZeros2D(sixth)) + " zeros. \n");
    printArray(seventh); System.out.print(" has " + String.valueOf(countZeros2D(seventh)) + " zeros. \n");
    printArray(eighth); System.out.print(" has " + String.valueOf(countZeros2D(eighth)) + " zeros. \n\n");

    int[][] ninth = {{0,1,3,5}, {0,1,1,5}};

    // 2a
    System.out.println("Let's change things up here! If things are the same in the 2D, they shall be 3s. If not, they shall be basic 1s.");
    printArray(seventh); fill2D(seventh); System.out.print(" transforms into "); printArray(seventh); System.out.print(". \n");
    printArray(eighth); fill2D(eighth); System.out.print(" transforms into "); printArray(eighth); System.out.print(". \n");
    printArray(ninth); fill2D(ninth); System.out.print(" transforms into "); printArray(ninth); System.out.print(". \n\n");

    // 2b
    System.out.println("Now we can make a new array!");
    printArray(fourth); System.out.print(" transforms into "); printArray(fill2DCopy(fourth)); System.out.print("\n");
    printArray(fifth); System.out.print(" transforms into "); printArray(fill2DCopy(fifth)); System.out.print("\n");
    printArray(sixth); System.out.print(" transforms into "); printArray(fill2DCopy(sixth)); System.out.print("\n\n"); // why does this produce the message it does???

  }
}
