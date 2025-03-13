package io.loop.utilities;

public class TestExcel {
    public static void main(String[] args) {

        ExcelUtils excelUtils =new ExcelUtils("C:/Users/akbar/IdeaProjects/untitled/cucumber-project-b4/src/test/resources/Book1.xlsx", "Sheet1");

        System.out.println("excelUtils.gerCellData(1, 1) = " + excelUtils.getCellData(0, 0));

        excelUtils.setCellData("Nadir is hungry", 3,4);
    }
}
