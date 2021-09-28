package com.Guru.Bank.pruebas.Utils;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JOptionPane;



public class EscribirExcel {

    public void encabezadoExcel() {

        String nombreArchivo = "DataProvider.xlsx";
        String hoja = "DATOS";
        Workbook libro = new XSSFWorkbook();
        Sheet hoja1 = libro.createSheet(hoja);
        // Poner en negrilla el título
        CellStyle style = libro.createCellStyle();
        Font font = libro.createFont();
        font.setBold(true);
        style.setFont(font);

        Row fila = hoja1.createRow(0);// lo que se encuentra en la hoja1 posicion 0

        String[] encabezado = new String[] {"Id Client"};

        for (int i = 0; i < encabezado.length; i++) {

            Cell celda = fila.createCell(i);
            celda.setCellStyle(style);
            celda.setCellValue(encabezado[i]);// recorrer las posiciones del encabezado

        }

        File file;
        file = new File(nombreArchivo);
        try {
            FileOutputStream fileOut = new FileOutputStream(file);
            libro.write(fileOut);
            fileOut.close();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "El archivo se encuentra abierto");
        } catch (IOException e) {// Verufucar luego
            JOptionPane.showMessageDialog(null, "Ha ocurrido una excepción verificada");
        } finally {
        }
    }

    public void ingresarInformacio(String articulo) {//llenar el archivo

        String[] informacion = new String[] {
                articulo
        };

        String nombreArchivo = "DataProvider.xlsx";
        String hoja = "DATOS";

        try {
            FileInputStream archivo = new FileInputStream(new File(nombreArchivo));
            XSSFWorkbook wb = new XSSFWorkbook(archivo);
            XSSFSheet hoja1 = wb.getSheet(hoja);
            XSSFRow row = hoja1.getRow(1);
            if (row == null) {
                row = hoja1.createRow(1);
            }
            for (int i = 0; i < informacion.length; i++)
            {
                XSSFCell cell = row.createCell(i);
                cell.setCellValue(informacion[i]);
            }
            archivo.close();
            FileOutputStream output = new FileOutputStream(nombreArchivo);
            wb.write(output);
            output.close();
        }
        catch (Exception e) {

        }
    }
}

