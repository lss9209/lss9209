public class GameOf369_StringVer {
	public static void main(String[] args) {
		for(Integer i = 1; i <= 100; i++) {
			if(find369(i.toString()) > 0) System.out.format("%d : ", i);
				for(int j = 0; j < find369(i.toString()); j++) {
					System.out.print("짝");
				}

			if(find369(i.toString()) > 0) System.out.println("");
		}

						}
	public static int find369(String str) {
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
				if(ch == '3' || ch == '6' || ch == '9') count++;
		}
		return count;
	}
}
