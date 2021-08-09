package ex03.exam05.syncro2;

public class BreadPlate {
	private int breadCount = 0;

	public BreadPlate() {
	}

	public synchronized void makeBread() {
		if (breadCount >= 10){
		    try {
		        System.out.println("빵 생산 초과");
		        wait(); // Not Runnable로 
		    } catch (Exception e) {
		    }
		}
		breadCount++;    // 빵 생산
		System.out.println("빵을 만듦. 총 " + breadCount + "개");
		  // 알아보기 쉽게하기 위해 10개가 넘어도 생산되기 함.
		notify(); // Runnable로
	}
	
	public synchronized void eatBread(){
        if (breadCount < 1){
            try {
                System.out.println("빵이 없어 기다림");
                wait(); // Not Runnable로 
            } catch (Exception e) {
            }
        }
        breadCount--;
        System.out.println("빵을 먹음. 총 " + breadCount + "개");
      // 알아보기 쉽게하기 위해 빵이 없어도 먹을수 있게 함.
        notify(); // Runnable로
    }
}
