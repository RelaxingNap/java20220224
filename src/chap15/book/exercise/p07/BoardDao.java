package chap15.book.exercise.p07;

import java.util.*;

public class BoardDao {

	public List<Board> getBoardList() {
		
		List<Board> list = new ArrayList<>();
		
		for(int i = 0; i < 3; i++) {
			list.add(new Board("제목" + (i + 1), "내용" + (i + 1)));
		}
		
		return list;
	}
	
	
}
