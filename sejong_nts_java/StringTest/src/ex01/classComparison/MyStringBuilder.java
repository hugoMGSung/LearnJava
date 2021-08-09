package ex01.classComparison;

import java.util.Arrays;

public class MyStringBuilder {

	int count = 0;
    char[] value;

    public MyStringBuilder(String string) {
        value = new char[string.length() + 16];
        string.getChars(0, string.length(), value, 0);
        count = string.length();
    }
    
    public void append(String string) {
        int oldCount = count;
        count = oldCount + string.length();
        if(count > value.length)
            value = Arrays.copyOf(value, value.length * 2);
        string.getChars(0, string.length(), value, oldCount);
    }
    
    @Override
    public String toString() {
        return new String(value, 0, count);
    }
    
	public static void main(String[] args) {
		long startTime = 0;
        long endTime = 0;

        String string = new String("abc");
        StringBuffer strBuffer = new StringBuffer("abc");
        StringBuilder stringBuilder = new StringBuilder("abc");
        MyStringBuilder myStringBuilder = new MyStringBuilder("abc");

        startTime = System.nanoTime();
        for (int i=0; i<10000; i++) {
            string += "abc" + i;
        }
        endTime = System.nanoTime();

        System.out.println("String 실행 시간          : " + (endTime - startTime));
        
        startTime = System.nanoTime();
        for (int i=0; i<10000; i++) {
        	strBuffer.append("abc");
        }
        endTime = System.nanoTime();

        System.out.println("StringBuffer 실행 시간   : " + (endTime - startTime));

        startTime = System.nanoTime();
        for (int i=0; i<10000; i++) {
            stringBuilder.append("abc");
        }
        endTime = System.nanoTime();

        System.out.println("StringBuilder 실행 시간   : " + (endTime - startTime));

        startTime = System.nanoTime();
        for (int i=0; i<10000; i++) {
            myStringBuilder.append("abc");
        }
        endTime = System.nanoTime();

        System.out.println("MyStringBuilder 실행 시간 : " + (endTime - startTime));
	}
}
