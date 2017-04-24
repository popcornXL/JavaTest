import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;

public class TestEmptyDataSource {

	public static void main(String[] args) throws Exception {
		 TestEmptyDataSource teds = new TestEmptyDataSource();
	        teds.run();
	    }
	     
	    private void run() throws Exception {
	        JasperReport jReport;
	        FileOutputStream fos = null;
	        try {
	            // 定義一個Map，用來存放傳送給JasperReports的參數
	            Map<String, Object> parameters = new HashMap<String, Object>();
	            parameters.put("User", "Howard");
	 
	            // 載入報表檔
	            jReport = (JasperReport) JRLoader.loadObjectFromFile("test.jasper");
	         
	            // 本份報表純粹顯示程式帶入的User參數，因此不需要data source
	            JasperPrint jPrint = JasperFillManager.fillReport(jReport, parameters, new JREmptyDataSource());
	         
	            fos = new FileOutputStream("" + System.currentTimeMillis() + ".pdf");
	         
	            // 產生PDF報表
	            JasperExportManager.exportReportToPdfStream(jPrint, fos);
	        } finally {
	            if (fos != null) {
	                fos.close();
	            }
	        }
	    }

}
