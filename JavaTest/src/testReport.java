import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRMapCollectionDataSource;
import net.sf.jasperreports.engine.export.JRPdfExporter;

public class testReport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jsFile = "D:/_Download/report5.jasper";
		String outFile = "D:/_Download/report5.pdf";
		try {
		  Map<String, Object> parameters = new HashMap<String, Object>();

		  // Map 表示一筆資料，再用 List 裝起來，表示所有資料
		  Collection<Map<String, ?>> list = new ArrayList<Map<String, ?>>();

		  // 塞入測試資料
		  for (int i = 0; i < 10; i++) {
		    Map<String, Object> data = new HashMap<String, Object>();
		    data.put("id", new BigDecimal(i + 1));
		    data.put("title", "中文 字串 String " + i);
		    data.put("date", new Date(112, 9, i + 1));
		    list.add(data);
		  }

		  // 使用 JRMapCollectionDataSource 打包資料成 JRDataSource 介面
		  JRMapCollectionDataSource dataSource = new JRMapCollectionDataSource(list);

		  // 產出報表
		  JasperPrint print = JasperFillManager.fillReport(jsFile, parameters, dataSource);
		  JRExporter exporter = new JRPdfExporter();
		  exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, outFile);
		  exporter.setParameter(JRExporterParameter.JASPER_PRINT, print);
		  exporter.exportReport();
		}
		catch (JRException e) {
		  e.printStackTrace();
		}
	}

}
