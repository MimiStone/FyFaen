import java.util.Scanner;

public class ali {

	public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        int maxQps= Integer.valueOf(in.nextLine());
		final String[] rtList = in.nextLine().split(",");
		final int requestNum = Integer.valueOf(in.nextLine());
		final int threadNum = Integer.valueOf(in.nextLine());
		System.out.println(doneTime(maxQps, rtList, requestNum, threadNum));
	}
	/**
	 * ���ʹ�����ŵ�������������ؾ����㷨����������ģ�Ͷ���ܹ��������������󣬵�λ���롣
	 * @return
	 */
	static long doneTime(int maxQps,String[] rtList,int requestNum,int threadNum) {
		//TODO
		int total = 0;
        for(String str : rtList) {
           int rt = Integer.parseInt(str);
           int oneMax = threadNum / rt * 1000;
           if(oneMax > maxQps) {
              total += maxQps;
           } else {
              total += oneMax;
           }
        }

		return requestNum / total * 1000;
	}
}