package chap15.lecture.p03map;

import java.util.*;

public class App02 {
	public static void main(String[] args) {
		Map<Computer, Integer> map = new HashMap<>();
		map.put(new Computer("samsung", "galaxy"), 1);
		map.put(new Computer("lg", "gram"), 5);
		
		System.out.println(map.size());
		
		map.put(new Computer("samsung", "galaxy"), 10);	// 키값이 같아서 같은 객체로 인식해서 덮어쓰기가 되도록 해야함.
														// hashCode(), equals() 재정의 필요
		System.out.println(map.size()); 
		// 재정의 안했을시 다른객체로 인식해서 3을 출력하지만, 재정의 후 같은 객체로 인식하여 2출력
	}
}

class Computer {
	private String company;
	private String model;
	
	public Computer(String company, String model) {
		this.company = company;
		this.model = model;
	}

	public String getCompany() {
		return company;
	}

	public String getModel() {
		return model;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Computer other = (Computer) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}
	
	
	
}
