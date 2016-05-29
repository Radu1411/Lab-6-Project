package anna.howtocelebratechristmas;


import android.graphics.Color;

import java.util.ArrayList;
import java.util.List;

public class Decorations_Data {

    private Decorations_Data() {
    }

    public static List<Information> load_decorations_items() {
        List<Information> items = new ArrayList<>();

        Information decoration_information_1 = new Information();
        decoration_information_1.name = "Istoric ";
        decoration_information_1.description = "Java este un limbaj de programare orientat-obiect, puternic tipizat, conceput de către James Gosling la Sun Microsystems (acum filială Oracle) la începutul anilor ʼ90, fiind lansat în 1995. Cele mai multe aplicații distribuite sunt scrise în Java, iar noile evoluții tehnologice permit utilizarea sa și pe dispozitive mobile gen telefon, agenda electronică, palmtop etc. În felul acesta se creează o platformă unică, la nivelul programatorului, deasupra unui mediu eterogen extrem de diversificat. Acesta este utilizat în prezent cu succes și pentru programarea aplicațiilor destinate intranet-urilor[10].\n" +
                "\n" +
                "Limbajul împrumută o mare parte din sintaxă de la C și C++, dar are un model al obiectelor mai simplu și prezintă mai puține facilități de nivel jos. Un program Java compilat, corect scris, poate fi rulat fără modificări pe orice platformă care e instalată o mașină virtuală Java (engleză Java Virtual Machine, prescurtat JVM). Acest nivel de portabilitate (inexistent pentru limbaje mai vechi cum ar fi C) este posibil deoarece sursele Java sunt compilate într-un format standard numit cod de octeți (engleză byte-code) care este intermediar între codul mașină (dependent de tipul calculatorului) și codul sursă.\n" +
                "\n" +
                "Mașina virtuală Java este mediul în care se execută programele Java. În prezent, există mai mulți furnizori de JVM, printre care Oracle, IBM, Bea, FSF. În 2006, Sun a anunțat că face disponibilă varianta sa de JVM ca open-source.\n" +
                "\n" +
                "Există 4 platforme Java furnizate de Oracle:\n" +
                "\n" +
                "Java Card - pentru smartcard-uri (carduri cu cip)\n" +
                "Java Platform, Micro Edition (Java ME) — pentru hardware cu resurse limitate, gen PDA sau telefoane mobile,\n" +
                "Java Platform, Standard Edition (Java SE) — pentru sisteme gen workstation, este ceea ce se găsește pe PC-uri,\n" +
                "Java Platform, Enterprise Edition (Java EE) — pentru sisteme de calcul mari, eventual distribuite.\n\n";
        decoration_information_1.color = Color.rgb(240, 280, 255);
        decoration_information_1.image = "decoration_1";
        //decoration_information_1.URL = "http://www.onsuttonplace.com/2013/12/deck-the-halls-christmas-entry/";

        items.add(decoration_information_1);


        Information decoration_information_2 = new Information();
        decoration_information_2.name = "Istoric al versiunilor";
        decoration_information_2.description = "23 ianuarie 1996, JDK 1.0 - versiunea inițială\n" +
                "19 februarie 1997, JDK 1.1\n" +
                "8 decembrie 1998, J2SE 1.2\n" +
                "8 mai 2000, J2SE 1.3\n" +
                "6 februarie 2002, J2SE 1.4\n" +
                "30 septembrie 2004, J2SE 5.0, numărul de versiune 1.5 este păstrat ca număr intern de versiune\n" +
                "11 decembrie 2006, Java SE 6\n" +
                "14 februarie 2012, Java SE 7\n" +
                "18 martie 2014, Java SE 8\n\n";
        decoration_information_2.color = Color.rgb(240, 280, 255);
        decoration_information_2.image = "Decoration_2";
        decoration_information_2.URL = "http://apumpkinandaprincess.com/2015/11/diy-peppermint-mason-jar-candles.html";

        items.add(decoration_information_2);


        Information decoration_information_3 = new Information();
        decoration_information_3.name = "Medii de dezvoltare integrate";
        decoration_information_3.description = "Un IDE (engleză integrated development environment) este un mediu de lucru care permite dezvoltarea de aplicații folosind anumite limbaje de programare (cele suportate de IDE, adică cele pentru care a fost creat acel IDE). Pentru Java sunt folosite următoarele:\n" +
                "\n" +
                "JCreator - gratuit JCreator LE\n" +
                "Eclipse - gratuit\n" +
                "NetBeans - gratuit\n" +
                "BEA Workshop\n" +
                "BlueJ - gratuit\n" +
                "CodeGuide - comercial\n" +
                "DrJava - gratuit\n" +
                "IntelliJ IDEA - gratuit Idea Community Edition\n" +
                "JBuilder - comercial\n" +
                "JDeveloper - comercial, platformă multiplă\n" +
                "KDevelop - gratuit (platformă GNU/Linux, Cygwin)\n";
        decoration_information_3.color = Color.rgb(240, 280, 255);
        decoration_information_3.image = "Decoration_3";
        //decoration_information_3.URL = "http://listfullyblissful.blogspot.com/2012/12/no-mantle-stocking-solution.html";

        items.add(decoration_information_3);


        Information decoration_information_4 = new Information();
        decoration_information_4.name = "Eclipse (software)";
        decoration_information_4.description = "Eclipse este un mediu de dezvoltare open-source scris preponderent în Java. Acesta poate fi folosit pentru a dezvolta aplicații Java și, prin intermediul unor plug-in-uri, în alte limbaje, cum ar fi C, C++, COBOL, Python, Perl și PHP. De dezvoltarea sa se ocupă Fundația Eclipse.\n" +
                "\n\n";
        decoration_information_4.color = Color.rgb(240, 280, 255);
        decoration_information_4.image = "decoration_4";
        //decoration_information_4.URL = "http://www.nestofposies-blog.com/2011/11/salt-dough-handprint-ornaments/";

        items.add(decoration_information_4);

        return items;
    }



}
