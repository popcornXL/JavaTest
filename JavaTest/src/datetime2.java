import java.util.*;
import java.text.*;
	public class datetime2 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
//			  Calendar calendar = Calendar.getInstance();
//		        
//		        SimpleDateFormat sdfmt = new SimpleDateFormat("yyyy/MM/dd");
//		        
//		        try {
//		            Date nowd = sdfmt.parse( "2015/01/01");
//		            calendar.setTime(nowd);
//		            long   now_date   =   calendar.getTimeInMillis();
//		            Date oldd = sdfmt.parse( "2016/01/01");
//		            calendar.setTime(oldd); 
//		            long   old_date   =   calendar.getTimeInMillis(); 
//		            //日期相減
//		            long   total = (now_date - old_date) ;
//
//		            long day = total / (24 * 60 * 60 * 1000);  
//		            long hour = (total / (60 * 60 * 1000) - day * 24);  
//		            long min = ((total / (60 * 1000)) - day * 24 * 60 - hour * 60);  
//		            long sec = (total/1000-day*24*60*60-hour*60*60-min*60);
//		            System.out.print(day+"天"+hour+"時"+min+"分"+sec+"秒"); 
//		            
//		        } catch (ParseException e) {
//		            // TODO Auto-generated catch block
//		            e.printStackTrace();
//		        }
//			String startTime = "2014-07-06";
//	        String endTime = "2014-08-31";
//
//	        String[] arg1 = startTime.split("-");
//	        String[] arg2 = endTime.split("-");
//	        int year1 = Integer.valueOf(arg1[0]);
//	        int year2 = Integer.valueOf(arg2[0]);
//	        int month1 = Integer.valueOf(arg1[1]);
//	        int month2 = Integer.valueOf(arg2[1]);
//	        int day1=Integer.valueOf(arg1[2]);
//	        int day2=Integer.valueOf(arg2[2]);
//	        System.out.println("year1 "+year1+" "+"year2 "+year2);
//	        System.out.println("month1 "+month1+" "+"month2 "+month2);
//	        System.out.println("day1 "+day1+" "+"day2 "+day2);
//	        int aa=(30-day1+1)*50*3;
//	        int bb=(90-day1+1)*50*3;
//	        int cc=(180-day1+1)*50*3;
//	        int dd=(360-day1+1)*50*3;
//	        System.out.println("月繳總共: "+aa);
//	        System.out.println("季繳總共: "+bb);
//	        System.out.println("半年繳總共: "+cc);
//	        System.out.println("年繳總共: "+dd);
//	        for (int i = year1; i <= year2; i++) 
//	        {
//	            int monthCount = 12;
//	            int monthStart = 1;
//	            if (i == year1) 
//	            {
//	                System.out.println("1");
//	            	monthStart = month1;
//	                monthCount = 12-monthStart+1;
//	                System.out.println(monthStart);
//	                System.out.println(monthCount);
//	            } 
//	            else if (i == year2) 
//	            {
//	            	System.out.println("2");
//	            	monthCount = month2;
//	            }
//	            for(int j = 0; j < monthCount; j++)
//	            {
//	                int temp = monthStart+j;
//	                if(temp >=10)
//	                {
//	                    System.out.println(i+"-"+(monthStart+j));
//	                }
//	                else
//	                {
//	                    System.out.println(i+"-0"+(monthStart+j));
//	                }
//	            }
//	             
//	        }
	       
	            String dateStr = "2016-02-29";
	            String dateStr2 = "2016-03-29";
	            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	            SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
	            try 
	            {
	                Date date2 = format.parse(dateStr2);
	                Date date = format.parse(dateStr);
	                
	                System.out.println("兩個日期的差距:" + differentDays(date,date2));
//	                System.out.println("兩個日期的差距:" + differentDaysByMillisecond(date,date2));
	            } catch (ParseException e) {
	                e.printStackTrace();
	            }
	        
		}
		 public static int differentDays(Date date1,Date date2)
		    {
		        Calendar cal1 = Calendar.getInstance();
		        cal1.setTime(date1);
		        
		        Calendar cal2 = Calendar.getInstance();
		        cal2.setTime(date2);
		        int day1= cal1.get(Calendar.DAY_OF_YEAR);
		        int day2 = cal2.get(Calendar.DAY_OF_YEAR);
		        
		        int year1 = cal1.get(Calendar.YEAR);
		        int year2 = cal2.get(Calendar.YEAR);
		        if(year1 != year2)   //同一年
		        {
		            int timeDistance = 0 ;
		            for(int i = year1 ; i < year2 ; i ++)
		            {
		                if(i%4==0 && i%100!=0 || i%400==0)    //閏年            
		                {
		                    timeDistance += 366;
		                }
		                else    //不是閏年
		                {
		                    timeDistance += 365;
		                }
		            }
		            
		            return timeDistance + (day2-day1) ;
		        }
		        else    //不同年
		        {
		            System.out.println("判斷day2 - day1 : " + (day2-day1));
		            return day2-day1;
		        }
		    }
//		 public static int differentDaysByMillisecond(Date date1,Date date2)
//		    {
//		        int days = (int) ((date2.getTime() - date1.getTime()) / (1000*3600*24));
//		        return days;
//		    }
	}
	
	