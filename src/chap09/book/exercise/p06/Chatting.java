package chap09.book.exercise.p06;

public class Chatting {
	void startChat(String chatId) {
//		String nickName = null;
//		nickName = chatId;	
// 원인 : local class안에서 사용되는 매개변수와 local변수는 모두 final과 같이 값이 한번 설정되면 변하면 안되는데 변해서 오류
		
		String nickName = chatId;	// 해결
		
		Chat chat = new Chat() {
			@Override
			public void start() {
				while (true) {
					String inputData = "안녕하세요";
					String message = "[" + nickName + "] " + inputData; // nickName을 local class에서 사용하려고 해서 에러

					sendMessage(message);
				}
			}
		};
	}
	
	class Chat {
		void start() { }
		void sendMessage(String message) { }
	}
}
