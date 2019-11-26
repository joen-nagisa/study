package jxl;

import java.io.File;
import java.io.IOException;

import jxl.*;
import jxl.read.biff.BiffException;

import java.io.*;

    public class ReadExcel {

        public static void main(String[] args) throws BiffException, IOException {
            Workbook book = Workbook.getWorkbook(new File("Test.xls"));

            //获得第一个工作表对象
            Sheet sheet = book.getSheet("sheet_one");
            //Sheet sheet = book.getSheet(0);

            int rows = sheet.getRows();
            int cols = sheet.getColumns();

            System.out.println("总列数：" + cols);
            System.out.println("总行数:" + rows);
            System.out.println("----------------------------");

            int i=0;
            int j=0;
            //循环读取数据
            for(i=0;i<cols;i++)
            {
                for(j=0;j<rows;j++)
                {
                    System.out.println("第"+j+"行，第"+i+"列为："+sheet.getCell(i, j).getContents());
                }

            }

        }

    }

