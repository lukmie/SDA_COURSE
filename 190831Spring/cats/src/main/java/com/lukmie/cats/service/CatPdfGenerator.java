package com.lukmie.cats.service;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPHeaderCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.lukmie.cats.model.Cat;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.stream.Stream;

@Service
public class CatPdfGenerator {

//    public ByteArrayOutputStream getTable(List<Cat> cats) {
//        ByteArrayOutputStream out = new ByteArrayOutputStream();
//        try {
//            PdfWriter.getInstance(generateCatTable(cats), out);
//        } catch (DocumentException e) {
//            e.printStackTrace();
//        }
//        return out;
//    }





    public ByteArrayOutputStream generateCatTable(List<Cat> cats) {
        Document document = new Document();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try {
            PdfWriter.getInstance(document, out);
            document.open();
            //tworzymy obiekt tabeli
            PdfPTable table = new PdfPTable(4);
            //dodajemy naglowki
            setColumnHeaders(table);
            //dodajemy dane
            cats.forEach(i -> addRow(table, i));

            document.add(table);
            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return out;
    }

    private void addRow(PdfPTable table, Cat i) {
        table.addCell(i.getId().toString());
        table.addCell(i.getName());
        table.addCell(i.getGender().toString());
        table.addCell(i.getTailLength().toString());
    }

    private void setColumnHeaders(PdfPTable table) {
        Stream.of("id", "name", "gender", "tailLength").forEach(header -> {
            PdfPHeaderCell cell = new PdfPHeaderCell();
            cell.setBackgroundColor(BaseColor.DARK_GRAY);
            cell.setBorderWidth(2.0f);
            cell.setPhrase(new Phrase(header));
            table.addCell(cell);
        });
    }
}
