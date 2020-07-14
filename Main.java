class Main {
  public static void main(String[] args) {
  int[][] x = new int[5][7];
  for(int i = 0; i< x.length;i++){
    for(int j = 0; j < x[0].length; j++){
      x[i][j] = (int)(Math.random() * 100);
    }
  }
for( int i = 0; i<x.length; i++){
  for( int j = 0; j < x[0].length; j++){
    System.out.print(x[i][j] + " ");
  }
  System.out.println();
}

public static void main(String[] args) {
        int[][] x = new int[5][7];
        for(int i = 0; i < x.length;i++){
            for(int j = 0; j < x[0].length; j++){
                x[i][j] = (int)(Math.random() * 100);
            }
        }

        int sum = 0;
        for(int i = 0; i < x.length; i++){
            for(int j = 0; j < x[0].length; j++){
                sum += x[i][j]; // #
            }
        }

        System.out.println(sum);
    }
  }
}

/*Write a method that takes in a 2D array of integers and returns the sum of all of the integers in the array. 2. Write a method that takes in a 2D array of integers and returns the minimum of all of the integers in the array.
*/ 