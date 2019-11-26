package jxl;

import jxl.*;
import java.io.*;

import jxl.read.biff.BiffException;
import jxl.write.*;
import jxl.write.biff.RowsExceededException;

//添加一个工作表
public class UpdateExcel {

    public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException{
        //获得文件
        Workbook wb = Workbook.getWorkbook(new File ("Test.xls"));

        //打开一个文件的副本，并且指定数据写回到原文件
        WritableWorkbook book = Workbook.createWorkbook(new File ("Test.xls"), wb);

        //添加一个工作表
        WritableSheet sheet = book.createSheet("sheet_two", 1);

        sheet.addCell(new Label(0,0,"Test data for sheet_two"));

        //输出
        System.out.println(sheet.getCell(0, 0).getContents());

        book.write();
        book.close();

    }

}