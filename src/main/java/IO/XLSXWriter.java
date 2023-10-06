package IO;

import module.Statistics;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class XLSXWriter {
    public XLSXWriter() {}

    public static void writeXlsStatistics(List<Statistics> statisticsList,
                                          String filePath) throws IOException{
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Статистика");

        Font font = workbook.createFont();
        font.setBold(true);
        font.setFontHeightInPoints((short) 14);
        CellStyle cellStyle = workbook.createCellStyle();
        cellStyle.setFont(font);

        int rowNumber = 0;
        Row headerRow = sheet.createRow(rowNumber++);
        Cell profileCellHeader = headerRow.createCell(0);
        profileCellHeader.setCellValue("Профиль обучения");
        profileCellHeader.setCellStyle(cellStyle);
        Cell avgScoreCellHeader = headerRow.createCell(1);
        avgScoreCellHeader.setCellValue("Средний балл за экзамены по профилю");
        avgScoreCellHeader.setCellStyle(cellStyle);
        Cell numberOfStudentsCellHeader = headerRow.createCell(2);
        numberOfStudentsCellHeader.setCellValue("Количество студентов по профилю");
        numberOfStudentsCellHeader.setCellStyle(cellStyle);
        Cell numberOfUniversitiesCellHeader = headerRow.createCell(3);
        numberOfUniversitiesCellHeader.setCellValue("Количество университетов по профилю");
        numberOfUniversitiesCellHeader.setCellStyle(cellStyle);
        Cell universitiesCellHeader = headerRow.createCell(4);
        universitiesCellHeader.setCellValue("Университеты");
        universitiesCellHeader.setCellStyle(cellStyle);

        for (Statistics statistics : statisticsList) {
            Row dataRow = sheet.createRow(rowNumber++);
            Cell profileCell = dataRow.createCell(0);
            profileCell.setCellValue(statistics.getStudentProfile().getProfileName());
            Cell avgScoreCell = dataRow.createCell(1);
            avgScoreCell.setCellValue(statistics.getAvgExam());
            Cell numberOfStudentsCell = dataRow.createCell(2);
            numberOfStudentsCell.setCellValue(statistics.getNumberOfStudent());
            Cell numberOfUniversitiesCell = dataRow.createCell(3);
            numberOfUniversitiesCell.setCellValue(statistics.getNumberOfUniversity());
            Cell universitiesCell = dataRow.createCell(4);
            universitiesCell.setCellValue(statistics.getUniversityNames());
        }

        try (FileOutputStream outputStream = new FileOutputStream(filePath)) {
            workbook.write(outputStream);
        }
    }
}
