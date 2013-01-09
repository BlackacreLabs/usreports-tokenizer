package org.blackacrelabs.usreports.tokenizer;

import org.apache.pdfbox.pdmodel.PDDocument;

import com.google.gson.GsonBuilder;

public class Main {

	public Main(String pdfPath) {
		try {
			// Tokenize the input PDF
			PDFTokenizer tokenizer = new PDFTokenizer();
			PDDocument document = PDDocument.load(pdfPath);
			tokenizer.tokenize(document);
			document.close();

			// Dump the tokens as JSON
			GsonBuilder gson = new GsonBuilder();
			gson.registerTypeAdapter(Token.class, new TokenSerializer());
			System.out.print(gson.create().toJson(tokenizer.tokens));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("Usage: [PDF FILE]");
			System.exit(1);
		} else {
			new Main(args[0]);
		}
	}
}
