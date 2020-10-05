package 자료구조인강시간계산;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Time {
	public static void main(String[] args) {
		String[] pattern = { "\\d+분", "\\d+초" };
		BufferedReader br = null;
		String line = null;
		List<String> listMin = new ArrayList<String>();
		List<String> listSec = new ArrayList<String>();
		
		try {
			br = new BufferedReader(new InputStreamReader(
					new FileInputStream("D:\\Course\\Java\\workspace2\\note\\src\\자료구조인강시간계산\\자료구조.txt"), "UTF-8"));
			Pattern p1 = Pattern.compile(pattern[0]);
			Pattern p2 = Pattern.compile(pattern[1]);
			while ((line = br.readLine()) != null) {
				Matcher m1 = p1.matcher(line);
				Matcher m2 = p2.matcher(line);
				
				if(m1.find()&&m2.find()) {
					listMin.add(m1.group().replace("분", ""));
					listSec.add(m2.group().replace("초", ""));
					System.out.println(m1.group().replace("분", "")+"/"+m2.group().replace("초", ""));
				}
			}
			int sumMin = 0;
			int sumSec = 0;
			for (int i = 0; i < listMin.size(); i++) {
				sumMin += Integer.parseInt(listMin.get(i));
				sumSec += Integer.parseInt(listSec.get(i));
			}
			System.out.println("총 분 : "+ sumMin+"/총 초 : "+sumSec);
			
			
			
			
			
			
			
			
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
