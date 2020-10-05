package quiz27;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RamdaQuiz02 {
	public static void main(String[] args) {

		/*
		 * 1. BufferedReader로 파일을 읽습니다. 
		 * 2. 수출입구분 : "수출"항목의 "오징어"가 포함되어 있는 데이터만 구분해서 해당
		 * 데이터의 총 합계를 구하세요.
		 */

		// 입력
		BufferedReader br = null;
		String line = null;
		List<Data> list = new ArrayList<>();
		try {
			// 1. 경로 설정
			br = new BufferedReader(
					new InputStreamReader(new FileInputStream("D:\\Course\\Java\\workspace2\\quiz\\src\\quiz27\\해양수산부_수산물 품목별 수출입 현황 - 2020년 02월(월간).csv"), "EUC-KR"));
			// 2. 읽어 오기
			while((line = br.readLine()) != null) {
				// 한 라인당 10개씩 읽어오기
				String[] arr = line.split(",", 10);
				// 처리
				// 3. 데이터 정제
				// - (') 제거
				for (int i = 0; i < arr.length; i++) {
					arr[i] = arr[i].replace("'", "");
				}
				// - data 타입 변환
				Data data = new Data(arr);
				
				//System.out.println(data.toString());
				// - list 타입 변환
				list.add(data);
			}// while end
			
		// System.out.println(list.size()); //682
			// 출력
			// 7. 수출, 오징어 포함 데이터 정제
			List<Data> newList = list.stream().filter((data)->data.getDate()[4].equals("수출")).filter((data)->data.getDate()[3].contains("오징어")).collect(Collectors.toList());
			for (Data data2 : newList) {
				
				System.out.println(data2.toString());
			
			}
			
			// 8. 합계
			// [5] : 당월 수출입중량			-> sum1
			// [6] : 당월 수출입미화금액		-> sum2
			// [7] : 당해 누계 수출 입중량		-> sum3
			// [8] : 당해 누계 수출입미화금액	-> sum4
			int sum1 = newList.stream().mapToInt((data)-> Integer.parseInt(data.getDate()[5])).sum();
			int sum2 = newList.stream().mapToInt((data)-> Integer.parseInt(data.getDate()[6])).sum();
			int sum3 = newList.stream().mapToInt((data)-> Integer.parseInt(data.getDate()[7])).sum();
			int sum4 = newList.stream().mapToInt((data)-> Integer.parseInt(data.getDate()[8])).sum();
			
			System.out.printf("%15s\t\t%d\n","당월 수출입중량 합계 :",sum1);
			System.out.printf("%17s\t%d\n","당월 수출입미화금액 합계 :",sum2);
			System.out.printf("%19s\t%d\n","당해 누계 수출 입중량 합계 :",sum3);
			System.out.printf("%20s\t%d\n","당해 누계 수출입미화금액 합계 :",sum4);
			
			

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
