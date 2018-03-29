package com.ration.service;

import com.ration.dto.RationDto;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

@Service
public class LoadService {

    private final static String excelFilePath = "Vitamins.xlsx";

    public String importFile() throws IOException {
        final List<RationDto> rationEntries = new ArrayList<>();
        FileInputStream fis = new FileInputStream(new File(excelFilePath));
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet secondSheet = workbook.getSheetAt(1);
        Iterator<Row> rowIterator = secondSheet.rowIterator();

        while (rowIterator.hasNext()) {
            Row nextRow = rowIterator.next();
            if (nextRow.getRowNum() == 0) continue;
            Iterator<Cell> cellIterator = nextRow.cellIterator();
            while (cellIterator.hasNext()) {
                RationDto dto = new RationDto();
                Cell cell = cellIterator.next();
                int columnIndex = cell.getColumnIndex();
                switch (columnIndex) {
                    case 0:
                    case 2:
                        break;
                    case 4: {
                        dto.setSex((String) getCellValue(cell));
                        break;
                    }
                    case 5: {
                        dto.getSpecialFeatures().add((String) getCellValue(cell));
                        break;
                    }
                    case 6: {
                        dto.setAge((String) getCellValue(cell));
                        break;
                    }
                    case 1: {
                        dto.setName((String) getCellValue(cell));
                        break;
                    }
                    case 3: {
                        dto.setRequiredAmount(Objects.requireNonNull(getCellValue(cell)).toString());
                        break;
                    }
                }
                rationEntries.add(dto);
            }
        }
        return String.valueOf(rationEntries.size());
    }

    private Object getCellValue(Cell cell) {
        switch (cell.getCellTypeEnum()) {
            case STRING:
                return cell.getStringCellValue();
            case FORMULA:
            case NUMERIC: {
                return cell.getNumericCellValue();
            }
            case BOOLEAN: {
                return cell.getBooleanCellValue();
            }
        }
        return null;
    }
}
