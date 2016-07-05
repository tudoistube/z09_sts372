package org.jone.excel;
//...과제24-2.L.6. /z09_sts372/src/main/java/org/jone/excel/ExcelBuilder.java 생성함.

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.jone.zdomain.EmpVO;
import org.springframework.web.servlet.view.document.AbstractExcelView;

public class ExcelBuilder_Close009 extends AbstractExcelView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model, HSSFWorkbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
        // get data model which is passed by the Spring container
        List<EmpVO> worksheetList = (List<EmpVO>) model.get("listAll");

        // create a new Excel sheet
        HSSFSheet sheet = workbook.createSheet("listAll_close009");
        sheet.setDefaultColumnWidth(30);
         
        // create style for header cells
        CellStyle style = workbook.createCellStyle();
        Font font = workbook.createFont();
        font.setFontName("Arial");
        style.setFillForegroundColor(HSSFColor.BLUE.index);
        style.setFillPattern(CellStyle.SOLID_FOREGROUND);
        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
        font.setColor(HSSFColor.WHITE.index);
        style.setFont(font);
         
        // create header row
        HSSFRow header = sheet.createRow(0);
         
        header.createCell(0).setCellValue("EMPNO");
        header.getCell(0).setCellStyle(style);
         
        header.createCell(1).setCellValue("ENAME");
        header.getCell(1).setCellStyle(style);
         
        header.createCell(2).setCellValue("JOB");
        header.getCell(2).setCellStyle(style);
        
        // create data rows
        int rowCount = 1;
         
        for (EmpVO rowData : worksheetList) {
            HSSFRow aRow = sheet.createRow(rowCount++);
            aRow.createCell(0).setCellValue(rowData.getEMPNO());
            aRow.createCell(1).setCellValue(rowData.getENAME());
            aRow.createCell(2).setCellValue(rowData.getJOB());
        }
    }

}
