import java.util.Random;
public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int[] numbers = new int[10];
				
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(3000);
		}
		System.out.println("antes");
		printArray(numbers);
		
		mergeSort(numbers);
		
		System.out.println("\ndespues");
		printArray(numbers);
	}
	
	private static void mergeSort(int[] inputArray) {
		int inputLenght = inputArray.length;
		
		if(inputLenght < 2) {
			return;
		}
		
		int midIndex = inputLenght / 2;
		int[]leftHalf = new int[midIndex];
		int[]rightHalf = new int[inputLenght - midIndex];
		
		for (int i = 0; i <midIndex; i++) {
			leftHalf[i] = inputArray[i];
		}
		for (int i = midIndex; i <midIndex; i++) {
			rightHalf[i - midIndex] = inputArray[i];
		}
		mergeSort(leftHalf);
		mergeSort(rightHalf);
		
		merge(inputArray, leftHalf, rightHalf);
	}
	
	private static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {
		int leftSize = leftHalf.length;
		int rightSize = rightHalf.length;
		
		int i = 0, j = 0, K = 0;
		
		while (i < leftSize && j < rightSize) {
			if(leftHalf[i] <= rightHalf[j]) {
				inputArray[K] = leftHalf[i];
				i++;
			}
			 else {
			        inputArray[K] = rightHalf[j];
			        j++;
			      }
			      K++;
			    }
			    
			    while (i < leftSize) {
			      inputArray[K] = leftHalf[i];
			      i++;
			      K++;
			    }
			    
			    while (j < rightSize) {
			      inputArray[K] = rightHalf[j];
			      j++;
			      K++;
			    }
			    
			  }

			  private static void printArray(int[] numbers) {
			    for (int i = 0; i < numbers.length; i++) {
			      System.out.println(numbers[i]);
			    }
			  }
			}
