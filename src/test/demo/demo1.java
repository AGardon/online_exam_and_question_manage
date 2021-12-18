import org.junit.jupiter.api.Test;


public class demo1 {

	@Test
	public void test(){
		long l1 = System.nanoTime();
		int sum = sum(1);
		long l2 = System.nanoTime();
		System.out.println("运行时间："+(l2-l1)+" 纳秒，"+"结果:"+sum);
	}

	public int sum(int i){
		int sum = 0;
		while (i <= 80000000){
			sum = sum + i;
			i++;
		}
		return sum;
	}
}
