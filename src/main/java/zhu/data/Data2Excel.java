package zhu.data;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data2Excel {
	
	/**
	 * 
	 * @param names
	 * @param locationSet
	 * @param userInfo <username> -> <location,nums>
	 */
	public static void save2Excel(Set<String> names, Set<String> locationSet,
			Map<String, HashMap<String, Integer>> userInfo){
		Workbook wb = new XSSFWorkbook();
		int halfNum = names.size()/2;
		try {
			Sheet sheet1 = wb.createSheet("ccshop1");
			Sheet sheet2 = wb.createSheet("ccshop2");
			int i,j;
			Row sheet1Row0 = sheet1.createRow(0);
			Row Sheet2Row0 = sheet2.createRow(0);
			i=1;
			for(String loc:locationSet){
				sheet1Row0.createCell(i).setCellValue(loc);
				Sheet2Row0.createCell(i).setCellValue(loc);;
				i++;
			}
			i=1;
			int count=0;
			boolean flag = true;
			for(String name:names){
				count++;
				Sheet currSheet;
				if (count<halfNum) {
					currSheet = sheet1;
				}else {
					if (flag) {
						i=1;
						flag = false;
					}
					currSheet = sheet2;
				}
				Row row = currSheet.createRow(i++);
				Cell cell0 = row.createCell(0);
				cell0.setCellValue(name);
				HashMap<String, Integer> infos = userInfo.get(name);
				if (infos.isEmpty()) {
					continue;
				}
				j=0;
				for(String loc:locationSet){
					j++;
					Integer value = infos.get(loc);
					if (value != null) {
						Cell cell = row.createCell(j);
						cell.setCellValue(value);
					}
				}
				System.out.println("save "+name+":"+i);
			}
			
			FileOutputStream fileOut = new FileOutputStream("./ccshop1.xlsx");
			wb.write(fileOut);
			fileOut.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
