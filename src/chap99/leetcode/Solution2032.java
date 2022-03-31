package chap99.leetcode;

import java.util.*;

public class Solution2032 {
	public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {

		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		Set<Integer> set3 = new HashSet<>();
		Map<Integer, Integer> map = new HashMap<>();
		// 사용 이유 set1과 set2를 비교한 결과를 저장해줄 collection이 필요함
		// map이용시 각 set들과 비교시 중복횟수를 셀 수 있어서 map선택

		List<Integer> list = new ArrayList<>();

		for (int num : nums1) {
			set1.add(num);
		}

		for (int num : nums2) {
			set2.add(num);
		}

		for (int num : nums3) {
			set3.add(num);
		}
		// nums배열내부의 중복제거 위해 set이용
		
		for (Integer key : set1) {
			map.put(key, 1);
		}

		for (Integer key : set2) {
			if (map.containsKey(key)) { // set1과 set2의 중복 key처리
				map.put(key, 2); // set1과 set2에 중복으로 들어있는 key값 처리
				list.add(key);
			} else {
				map.put(key, 1);
			}
		}

		for (Integer key : set3) {
			if (map.containsKey(key)) { // set1과 set2에서 나온 결과를 set3과의 중복 key처리
				if (map.get(key) == 2) { // set1과 set2에 중복으로 들어있는 경우
					map.put(key, 3);
				} else {
					map.put(key, 2); // set1과 set3과의 중복 key처리
					list.add(key);
				}
			} else {
				map.put(key, 1);
			}
		}

		return list;
	}
}
