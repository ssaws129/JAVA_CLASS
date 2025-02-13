package day8;

import java.util.Arrays;

public class _01_ArrayCopy {

	public static void main(String[] args) {
		/*
		 * 1. 얕은 복사(shallow copy) : 복사된 배열이나 원본 배열이 변경될 때 서로간의 값이 함께 변경됨
		 * 2. 깊은 복사(deep copy) : 복사된 배열이나 원본 배열이 변경될 때 서로간의 값이 바뀌지 않음
		 * 
		 */
		
		//얕은 복사
		int [] arr01 = {1,2,3};
		int[] arr02 = arr01; //배열의 얕은 복사
		System.out.println("arr01 배열 : " + Arrays.toString(arr01));
		System.out.println("arr02 배열 : " + Arrays.toString(arr02));
		arr02[1] = 100;
		System.out.println("arr01 배열 : " + Arrays.toString(arr01));
		System.out.println("arr02 배열 : " + Arrays.toString(arr02));
		
		//깊은 복사
		int[] numArr = {1,6,4,5,2};
		int[] numArrCopy = new int[numArr.length];
		for(int i = 0; i<numArr.length; i++) {
			numArrCopy[i] = numArr[i];
			
		}
		System.out.println();
		System.out.println("numArr 배열 : " + Arrays.toString(numArr));
		System.out.println("numArrCopy 배열 : " + Arrays.toString(numArrCopy));
		System.out.println();
		numArrCopy[2] = 100;
		System.out.println("numArr 배열 : " + Arrays.toString(numArr));
		System.out.println("numArrCopy 배열 : " + Arrays.toString(numArrCopy));
		//{ 깊은 복사 방법}
		//1. copyOf (가져올 배열, 복사 범위)
		//2. arraycopy (복사대상배열, 복사 시작 위치, 카피할 배열, 시작위치, 복사길이)
		
		System.out.println();
		
		int[] card = {3,1,4,5,10};
		int[] copyCard = Arrays.copyOf(card, card.length);
		
		System.out.println("card배열 : " + Arrays.toString(card));
		System.out.println("copyCard배열 : " + Arrays.toString(copyCard));
		
		System.out.println();
		
		copyCard[0] = 55;
		

		System.out.println("card배열 : " + Arrays.toString(card));
		System.out.println("copyCard배열 : " + Arrays.toString(copyCard));
		
		System.out.println();
		
		int[] card2 = {3,1,4,5,10};
		int[] copyCard2  = new int[card2.length];
		System.arraycopy(card2, 0, copyCard2, 0, card2.length);
		
		System.out.println("card2배열 : " + Arrays.toString(card2));
		System.out.println("copyCard2배열 : " + Arrays.toString(copyCard2));
		System.out.println();
		
		copyCard2[0] = 500;
		System.out.println("card2배열 : " + Arrays.toString(card2));
		System.out.println("copyCard2배열 : " + Arrays.toString(copyCard2));
		System.out.println();
		
		
	}

}
