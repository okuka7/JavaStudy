package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {
    public static void main(String[] args) {
        Map<String,String> dictionary = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("단어 입력 단계");
        while(true){
            System.out.println("영어 단어를 입력하세요 종료는 q");
            String engWord = scanner.nextLine();
            if(engWord.equals("q")){
                break;
            }
            System.out.println("한글 뜻을 입력하세요");
            String koreanMeaning = scanner.nextLine();
            dictionary.put(engWord,koreanMeaning);
        }
        System.out.println("단거 검색 단계");
        while(true){
            System.out.println("찾을 영어 단어를 입력하세요");
            String searchWord = scanner.nextLine();
            if(searchWord.equals("q")){
                break;
            }
            if(dictionary.containsKey(searchWord)){
                String koreanMeaning = dictionary.get(searchWord);
                System.out.println(koreanMeaning);
            }else {
                System.out.println(searchWord+"는 사전에 없는 단어입니다.");
            }
        }
    }
}
