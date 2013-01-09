United States Reports PDF Miner
===============================

Dump the contents of PDF documents published by the Supreme Court of the United States into JSON lists of tokens indicating document structure.

Building & Installation
-----------------------

You will need:

- [JDK 1.6](http://www.java.com/jdk)
- [Apache Maven](http://maven.apache.org/)

At the command prompt:

    $ mvn clean install

To build a self-contained `.jar` file:

    $ mvn package
	$ java -jar usreportsminer-[VERSION]-jar-with-dependencies.jar [PDF FILE]

Where `[VERSION]` is the current build version and `[PDF FILE]` is the path to a Supreme Court opinion PDF file.

Development
-----------

The program is just enough lines of Java to jerry-rig an [Apache `PDFBox`](http://pdfbox.apache.org) document renderer to a stub `Graphics2D` and feed `Token` objects to [`Gson`](http://code.google.com/p/google-gson/) for JSON output and get me out of Java-land.
