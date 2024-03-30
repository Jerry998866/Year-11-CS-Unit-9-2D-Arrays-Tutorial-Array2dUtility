
public class Array2dUtility {

    // Declare all methods as static.

    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.
    public static void print(int[][] integers2DArray){
        for (int i = 0; i<integers2DArray.length; i++){
            for (int j = 0; j<integers2DArray[i].length;j++){
                System.out.print(integers2DArray[i][j]+" ");
            }
            System.out.println();
        }
    }

    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers
    public static int sum(int[][] intArray){
        int sum = 0;
        for (int[] row : intArray){
            for (int i : row){
                sum+=i;
            }
        }
        return sum;
    }

    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.
    public static double average(int[][] intArray){
        return (double)sum(intArray)/(intArray.length*intArray.length);
    }

    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.
    public static int minimum(int[][] intArray){
        int min = intArray[0][0];
        for (int[] row : intArray){
            for (int i : row){
                if (i<min){
                    min=i;
                }
            }
        }
        return min;
    }

    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.
    public static int maximum(int[][] intArray){
        int max = 0;
        for (int[] row : intArray){
            for (int i : row){
                if (i>max){
                    max=i;
                }
            }
        }
        return max;
    }

    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.
    public static int evenCountStandard(int[][] intArray){
        int evenCount = 0;
        for(int i = 0; i<intArray.length; i++){
            for (int j = 0; j<intArray[i].length; j++){
                if (intArray[i][j]%2==0){
                    evenCount+=1;
                }
            }
        }
        return evenCount;
    }

    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.
    public static int evenCountEnhanced(int[][] intArray){
        int evenCount = 0;
        for(int[] row : intArray){
            for (int i : row){
                if (i%2 == 0){
                    evenCount+=1;
                }
            }
        }
        return evenCount;
    }

    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.
    public static boolean allPositive(int[][] intArray){
        for (int[] row : intArray){
            for (int i : row){
                if (i<0){
                    return false;
                }
            }
        }
        return true;
    }

    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.
    public static int[] rowSums(int[][] intArray){
        int[] finalSum = new int[intArray.length];
        for (int i = 0; i<intArray.length; i++){
            int sum = 0;
            for (int j = 0; j<intArray[i].length; j++){
                sum += intArray[i][j];
            }
            finalSum[i] = sum;
        }
        return finalSum;
    }

    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.
    public static int[] colSums(int[][] intArray){
        int maxLength = 0;
        for (int rows[] : intArray){
            if (rows.length>maxLength){
                maxLength = rows.length;
            }
        }
        int[] finalSum = new int[maxLength];
        for (int i = 0; i<maxLength; i++){
            int sum = 0;
            for (int j = 0; j<intArray.length; j++){
                if (i<intArray[j].length){
                    sum+=intArray[j][i];
                }
            }
            finalSum[i] = sum;
        }
        return finalSum;
    }

}
