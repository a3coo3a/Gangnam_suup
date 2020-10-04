package quiz26;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RamdaQuiz01 {
	public static void main(String[] args) {
		/*
		 * 1. BufferedReader클래스를 사용해서 파일을 읽어들이세요
		 * 2. , 기준으로 잘라서 Data클래스에 값을 한줄 단위로 저장합니다.
		 * 결측치 - 빠진값을 적절하게 처리해서 list<Data>에 저장.
		 * 3. 람다식을 이용해서, 지역 : 서울, 짝수월, 분양가격은 4000만원 이상의 객체만 뽑아서
		 * 새로운 리스트에 저장
		 * 
		 */

		BufferedReader br = null;
		String line = null;
		List<Data> list = new ArrayList<Data>();
		try {
			// 1. 경로 설정
			br = new BufferedReader(new InputStreamReader(
					new FileInputStream(
							"D:\\Course\\Java\\workspace2\\quiz\\src\\quiz26\\주택도시보증공사_전국 평균 분양가격(2020년 2월).csv"),
					"EUC-KR"));

			// 2. 읽어 오기
			while ((line = br.readLine()) != null) {
				String[] arr = line.split(",", 5);	// , 단위로 무조건 5개 씩 읽어오기

				// 3. 읽어온 값 대입 
				String city = arr[0];
				String area = arr[1];
				String year = arr[2];
				String month = arr[3];
				String price;
				// 오류 있는 데이터 정제
				arr[4] = arr[4].replace(" ", "").replace(",", "").replace("-", "");

				// 데이터 정제 후 값 조정 대입
				if (arr[4].equals("")) {
					price = "0";
				} else {
					price = arr[4];
				}

				// Data타입의 값 입력
				Data data = new Data(city, area, year, month, price);
				// 입력 확인
				System.out.println(data.toString());
				// 리스트 로 변환
				list.add(data);

			}

			System.out.println(list.size());
			
			List<Data> newList = list.stream().filter((data)->data.getCity().equals("서울"))
			.filter((data)->Integer.parseInt( data.getMonth() ) % 2 == 0)
			.filter((data)->Integer.parseInt(data.getPrice()) >= 4000).collect(Collectors.toList());
			
			for (Data data2 : newList) {
				System.out.println(data2.toString());
			}
			
			// 합계 
			// mapToInt() : price 값만 IntStream으로  변환 
			// sum() : 합계 구하는 메서드
			IntStream is = newList.stream().mapToInt((data) -> Integer.parseInt(data.getPrice()));		// 새로운 값을 뽑아서 intStream으로 반환
			int sum = is.sum();
			
			// 평균 
			// mapToInt() : price값을 IntStream 으로 변환
			// average() : 평균을 구하는 값
			// getAsDouble() : Double 타입 형변환.
			IntStream iss = newList.stream().mapToInt((data)->Integer.parseInt(data.getPrice()));
			double avg = iss.average().getAsDouble();
			
			System.out.println(sum);
			System.out.println(avg);
			
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
