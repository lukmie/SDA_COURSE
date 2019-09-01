package com.lukmie.cats.controller;

import com.lukmie.cats.model.Cat;
import com.lukmie.cats.service.CatManager;
import com.lukmie.cats.service.CatPdfGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_PDF;
import static org.springframework.http.MediaType.APPLICATION_PDF_VALUE;

@RestController
@RequestMapping("/pdf")
public class PdfController {

    @Autowired
    private CatPdfGenerator catPdfGenerator;

    @Autowired
    private CatManager catManager;

    @GetMapping(produces = APPLICATION_PDF_VALUE)
    public ResponseEntity<InputStreamResource> getCatPdf() {
        List<Cat> cats = catManager.getCats();
        ByteArrayOutputStream out = catPdfGenerator.generateCatTable(cats);
        ByteArrayInputStream in = new ByteArrayInputStream(out.toByteArray());

        HttpHeaders headers = new HttpHeaders();
//        headers.add("Content-Disposition", "inline; filename=cats.pdf");
        headers.add("Content-Disposition", "attachment; filename=cats.pdf");

        return ResponseEntity.ok()
                .contentType(APPLICATION_PDF)
                .headers(headers)
                .body(new InputStreamResource(in));
    }
}
