public class Main {

    public static void main(String[] args) {

        Document document=DocumentFactory.createDocument("PDF");
        System.out.println(document.getDocumentType());


        document = DocumentFactory.createDocument("WORD");
        System.out.println(document.getDocumentType());


    }
}
