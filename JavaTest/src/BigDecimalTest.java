import java.math.BigDecimal;

public class BigDecimalTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 宣告第一個需要運算的數值
		
		BigDecimal bigNumber=new BigDecimal("89.1234567890123456789");
		
		// 宣告第二個需要運算的數值
		
		BigDecimal bigRate=new BigDecimal(1000);
		
		// 宣告運算後的答案為 bigResult
		BigDecimal bigResult =new BigDecimal(0);
		
		//bigResult為 bigNumber*bigRate
		bigResult= bigNumber.multiply(bigRate);
		
		//印出bigResult
		System.out.println(bigResult);
		
		double dDate=bigNumber.doubleValue();
		
		System.out.println(dDate);
		
		//宣告 data2 為 bigNumber/bigRate 並四捨五入至小數第二位
		
		double data2 = bigNumber.divide(bigRate,2,BigDecimal.ROUND_HALF_UP).doubleValue();
		
		System.out.println(data2);
		BigDecimal a1=new BigDecimal("1.0");
		BigDecimal a2=new BigDecimal("0.2");
		BigDecimal a3=new BigDecimal("0.3");
		BigDecimal result=new BigDecimal("1.5");
		// 加為add  減為subtract   除為divide  乘為multiply
		BigDecimal answer =a1.subtract(a2);
		System.out.println(answer);
		BigDecimal answer2=a1.add(a2).divide(a3);
		System.out.println(answer2);
		
		
		BigDecimal answer3=a1.add(a2).multiply(a3);
		System.out.println(answer3);//1.0+0.2*0.3
		if(a1.add(a2).add(a3).equals(result)){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
		
		double aaa=0.34;
		double bbb=0.81;
		double ccc=0.65;
		double ggg=0;
		double zzz=0;
		double result6=0.0;
		double hhh=aaa+bbb+ccc;
		BigDecimal ddd=new BigDecimal(Double.toString(aaa));
		BigDecimal eee=new BigDecimal(Double.toString(bbb));
		BigDecimal fff=new BigDecimal(Double.toString(ccc));
		BigDecimal uuu=new BigDecimal(Double.toString(ggg));
		BigDecimal yyy=new BigDecimal(Double.toString(zzz));
		
		BigDecimal result3=ddd.add(eee).add(fff);
		double result4 = ddd.divide(eee,2,BigDecimal.ROUND_HALF_UP).doubleValue();//取到第二位並四捨五入
		
		double result5= ddd.divide(eee,4,BigDecimal.ROUND_HALF_UP).doubleValue();//取到第四位並四捨五入
		//double result6 = uuu.divide(yyy,4,BigDecimal.ROUND_HALF_UP).doubleValue()*100;//取到第二位並四捨五入
		//double result7= Math.round(ggg/zzz);
		//月毛利/月營收
		if(ggg==0&&zzz==0)
		{
			 result6= Math.round(ggg/zzz);
		}
		else
		{
			 result6 = uuu.divide(yyy,4,BigDecimal.ROUND_HALF_UP).doubleValue()*100;//取到第二位並四捨五入
		}	
		
		
		//double result5=result4;
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result3);
		System.out.println(result6);
		//System.out.println(result7);
		//System.out.println(hhh);
		
	}
}