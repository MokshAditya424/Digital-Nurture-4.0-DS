package Factorypattern;

public class ExcelDocumentfactory extends DocumentFactory{
public Document createDocument() {
	return new ExcelDocument();
}
}
