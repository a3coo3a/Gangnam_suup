package api.util.arrays;

import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {

		int[] arr = {5,4,3,2,1};
		
		// 정렬
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		// 배열의 검색  - 선행 조건 정렬 ,  찾을 값이 없을때 음수가 나옴.
		int a = Arrays.binarySearch(arr, 3);
		System.out.println("3이 있는 위치  : " + a);
		
		int a2 = Arrays.binarySearch(arr, 100);
		System.out.println(a2);
		
		// 배열 복사
		int[] newArr = Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(newArr));
		
		// 배열 복사 : 배열명, 시작index, 끝 index
		int[] newArr2 = Arrays.copyOfRange(newArr, 2, arr.length);
		System.out.println(Arrays.toString(newArr2));
		
		// 배열의 내부 요소가 동일한지 확인
		if(Arrays.equals(arr, newArr)) {
			System.out.println("배열 요소가 같다");
		}
		
		
		
		
	}
}
