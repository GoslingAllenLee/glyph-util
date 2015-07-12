In Android it is not possible to display Persian/Arabic letters, well it is possible but they are not shaped correctly.
We have designed some helper classes that you can use to reshape persian and arabic letter and connect them correctly.

Ofcourse it is very amateurish and not good designed by google.com because persian and arabic languages are supported by many OS's, including iOS and WMP.

The DariGlyphUtils class has one public static method, which is responsible for reshaping Dari, Persian and Arabic letters.
Just simply, add the class to your project and

String somePersianWords = "...";
String reshapedWords = DariGlyphUtils.reshapeText(somePersianWords);