package anna.howtocelebratechristmas;

import android.graphics.Color;

import java.util.ArrayList;
import java.util.List;


public class Wreaths_Data {

    private Wreaths_Data() {
    }

    public static List<Information> load_wreath_items() {
        List<Information> items = new ArrayList<>();

        Information wreathInformation_1 = new Information();
        wreathInformation_1.name = "Informatie Generala";
        wreathInformation_1.description = "\t1)  PHP este un limbaj de programare.  " +
                " Numele PHP provine din limba engleză și este un acronim recursiv : Php: Hypertext Preprocessor. Folosit inițial pentru a produce pagini web dinamice, este folosit pe scară largă în dezvoltarea paginilor și aplicațiilor web. Se folosește în principal înglobat în codul HTML, dar începând de la versiunea 4.3.0 se poate folosi și în mod „linie de comandă” (CLI), permițând crearea de aplicații independente. Este unul din cele mai importante limbaje de programare web[2] open-source și server-side, existând versiuni disponibile pentru majoritatea web serverelor și pentru toate sistemele de operare. Conform statisticilor este instalat pe 20 de milioane de site-uri web și pe 1 milion de servere web[3]. Este disponibil sub Licenṭa PHP ṣi Free Software Foundation îl consideră a fi un software liber.\n" +
                "\n" +
                "Inițial, limbajul a fost dezvoltat de inventatorul său, Rasmus Lerdorf. Odată cu creșterea numărului de utilizatori, dezvoltarea a fost preluată de o nouă entitate, numită The PHP Group (Grupul PHP).\n";
        wreathInformation_1.color = Color.rgb(240, 280, 255);
        wreathInformation_1.image = "wreath_1";
        //wreathInformation_1.URL = "http://www.daringgourmet.com/2014/11/29/how-to-make-a-homemade-christmas-wreath-and-advent-wreath/";

        items.add(wreathInformation_1);

        Information wreathInformation_2 = new Information();
        wreathInformation_2.name = "Istoric";
        wreathInformation_2.description = "PHP însemna inițial Personal Home Page.[4] PHP a fost început în 1994 ca o extensie a limbajului server-side Perl, și apoi ca o serie de CGI-uri compilate de către Rasmus Lerdorf, pentru a genera un curriculum vitae și pentru a urmări numărul de vizitatori ai unui site. Apoi a evoluat în PHP/FI 2.0, dar proiectul open-source a început să ia amploare după ce Zeev Suraski și Andi Gutmans, de la Technion au lansat o nouă versiune a interpretorului PHP în vara anului 1998, această versiune primind numele de PHP 3.0. Tot ei au schimbat și numele în acronimul recursiv de acum, până atunci PHP fiind cunoscut ca Personal Home Page Tools. Apoi Suraski și Gutmans au rescris baza limbajului, producând astfel și Zend Engine în 1999. În mai 2000 a fost lansat PHP 4.0, având la bază Zend Engine 1.0.\n";
        wreathInformation_2.color = Color.rgb(111, 11, 111);
        wreathInformation_2.image = "Wreath_2";
        //wreathInformation_2.URL = "http://kristenscreationsonline.blogspot.com/2011/11/christmas-mesh-wreath-tutorial.html";
        items.add(wreathInformation_2);

        Information wreathInformation_0 = new Information();
        wreathInformation_0.name = "PHP 5";
        wreathInformation_0.description = "Pe 13 iulie 2004 a fost lansat PHP 5, cu Zend Engine II, ce a adus și o orientare obiect mai pronunțată și suportând mai multe caracteristici ale acestui tip de programare.\n" +
                "\n" +
                "PHP 5 aduce mai multe noutăți față de versiunea 4:\n" +
                "\n" +
                "Suport îmbunătățit pentru OOP\n" +
                "Introduce extensia PDO - PHP Data Objects, care definește o modalitate facilă și consistentă de accesare a diferitelor baze de date\n" +
                "Imbunătățiri de performanță\n" +
                "Suport îmbunătățit pentru MySQL și MSSQL\n" +
                "Suport nativ pentru SQLite\n" +
                "Suport SOAP integrat\n" +
                "Iteratori pentru date\n" +
                "Controlul erorilor prin tratarea de excepții\n" +
                "La sfârșitul lui 2007 doar versiunea 5.x mai era întreținută, deoarece în data de 13 iulie 2007 (exact la 3 ani după lansarea PHP5), PHP Group a anunțat că PHP4 va fi scos din uz pe 31 decembrie 2007, deși prognozează că anumite upgrade-uri de securitate se vor oferi până pe 8 august 2008.[5]. Dezvoltarea la PHP 6 începuse deja în decembrie 2007 și urmează să fie oferit odată cu scoaterea din uz a PHP4.\n" +
                "\n";
        wreathInformation_0.color = Color.rgb(13, 55, 125);
        wreathInformation_0.image = "wreath_0";
        //wreathInformation_0.URL = "http://lizoncall.com/2013/12/05/gift-wrapped-front-door-with-tag/";

        items.add(wreathInformation_0);


        Information wreathInformation_3 = new Information();
        wreathInformation_3.name = "PHP 6";
        wreathInformation_3.description = "PHP 6[6] are următoarea agendă de îmbunătățiri și modificări:\n" +
                "\n" +
                "îmbunătățirea suportului pentru Unicode\n" +
                "retragerea definitivă a unor funcții ca register_globals și magic_quotes, și a variabilelor tip $HTTP_*_VARS\n" +
                "var va fi un alias pentru public, și folosirea lui va ridica o atenționare E_STRICT.\n" +
                "suport pentru int pe 64 biți.\n" +
                "taguri tip ASP sunt retrase definitiv.\n" +
                "XMLReader, XMLWriter, Fileinfo vor face parte din distribuția principală\n" +
                "următoarele pachete au fost scoase din distribuția principală: Freetype1, GD1, mime_magic\n" +
                "funcția ereg() nu mai este disponibilă\n" +
                "instanțierea obiectelor prin referină (& new Obiect()) generează o eroare E_STRICT.\n" +
                "erorile tip E_STRICT sunt incluse în E_ALL.\n" +
                "adăugarea instrucțiunii goto permite salturi la un alt bloc de comenzi.\n" +
                "namespace, import, și goto devin cuvinte rezervate.\n" +
                "accesarea caracterelor într-un șir (string) se face prin operatorul []. {} se scoate din uz ( ex: $str[42] funcționează, $str{42} nu funcționează)\n" +
                "constantele FILE_BINARY și FILE_TEXT devin disponibile pentru folosirea în funcții de citire/scriere fișiere\n" +
                "foreach va suporta array multi dimensional: foreach($a as $b => list($c, $d))\n" +
                "pentru operatorul ternar expresia pentru valoarea true nu mai este obligatorie ($a = $s ?: ‘b’; // returns $a = $s;)\n" +
                "opțiunea safe_mode a fost înlăturată.\n" +
                "operatorul and a fost înlăturat.\n" +
                "funcția microtime() returnează un float.\n" +
                "zend.ze1_compatibility_mode a fost înlăturat.";
        wreathInformation_3.color = Color.rgb(13, 55, 125);
        wreathInformation_3.image = "wreath_3";
        //wreathInformation_3.URL = "http://www.hometalk.com/721508/christmas-wreaths-part-2";

        items.add(wreathInformation_3);


        Information wreathInformation_4 = new Information();
        wreathInformation_4.name = "Popularitate ";
        wreathInformation_4.description = "PHP-ul este unul din cele mai folosite limbaje de programare server-side, conform unui studiu efectuat de Netcraft în aprilie 2002, apărând pe 9 din cele 37 milioane de domenii cercetate în studiu. De asemenea, există un grafic al creșterii folosirii PHP-ului pe site-ul oficial. Popularitatea de care se bucură acest limbaj de programare se datorează următoarelor caracteristici :\n" +
                "\n" +
                "Familiaritatea : sintaxa limbajului este foarte ușoară combinând sintaxele unora din cele mai populare limbaje Perl sau C;\n" +
                "Simplitatea : sintaxa limbajului este destul de liberă. Nu este nevoie de includere de biblioteci sau de directive de compilare, codul PHP inclus într-un document executându-se între marcajele speciale;\n" +
                "Eficiența : PHP-ul se folosește de mecanisme de alocare a resurselor, foarte necesare unui mediu multiutilizator, așa cum este web-ul;\n" +
                "Securitate : PHP-ul pune la dispoziția programatorului un set flexibil și eficient de măsuri de siguranță;\n" +
                "Flexibilitate : fiind apărut din necesitatea dezvoltării web-ului, PHP a fost modularizat pentru a ține pasul cu dezvoltarea diferitelor tehnologii. Nefiind legat de un anumit server web, PHP-ul a fost integrat pentru numeroasele servere web existente: Apache, IIS, Zeus, server, etc.;\n" +
                "Gratuitate : este probabil cea mai importantă caracteristică a PHP-ului. Dezvoltarea PHP-ului sub licența open-source a determinat adaptarea rapidă a PHP-ului la nevoile web-ului, eficientizarea și securizarea codului.\n";
        wreathInformation_4.color = Color.rgb(222, 22, 222);
        wreathInformation_4.image = "Wreath_4";
        //wreathInformation_4.URL = "http://www.marthastewart.com/974724/home-how-series#1134465";
        items.add(wreathInformation_4);


        Information wreathInformation_5 = new Information();
        wreathInformation_5.name = "Utilizare";
        wreathInformation_5.description = "PHP este simplu de utilizat, fiind un limbaj de programare structurat, ca și C-ul, Perl-ul sau începând de la versiunea 5 chiar Java, sintaxa limbajului fiind o combinație a celor trei. Datorită modularității sale poate fi folosit și pentru a dezvolta aplicații de sine stătătorare, de exemplu în combinație cu PHP-GTK sau poate fi folosit ca Perl sau Python în linia de comandă. Probabil una din cele mai importante facilități ale limbajului este conlucrarea cu majoritatea bazelor de date relaționale, de la MySQL și până la Oracle, trecând prin MS Sql Server, PostgreSQL, sau DB2.\n" +
                "\n" +
                "PHP poate rula pe majoritatea sistemelor de operare, de la UNIX, Windows, sau Mac OS X și poate interacționa cu majoritatea serverelor web. Codul dumneavoastră PHP este interpretat de serverul WEB și generează un cod HTML care va fi văzut de utilizator (clientului -browserului- fiindu-i transmis numai cod HTML).\n" +
                "\n" +
                "Arhitectura tip LAMP a devenit populară în industria web ca modalitate rapidă, gratuită și integrată de dezvoltare a aplicațiilor. Alături de Linux, Apache și Mysql, PHP reprezintă litera P, deși uneori aceasta se referă la Python sau Perl. Linux ocupă rolul de sistem de operare pentru toate celelalte aplicații, MySQL gestionează bazele de date, Apache are rol de server web, iar PHP are rol de interpretator și comunicator între acestea.\n" +
                "\n" +
                "PHP foloseste extensii specifice pentru fișierele sale: .php, .php3, .ph3, .php4, .inc, .phtml. Aceste fișiere sunt interpretate de catre serverul web iar rezultatul este trimis în formă de text sau cod HTML către browser-ul clientului.\n";
        wreathInformation_5.color = Color.rgb(13, 55, 125);
        wreathInformation_5.image = "Wreath_5";
        //wreathInformation_5.URL = "http://designdininganddiapers.com/2013/11/cream-sweater-wreath/";

        items.add(wreathInformation_5);


        Information wreathInformation_6 = new Information();
        wreathInformation_6.name = "Funcții";
        wreathInformation_6.description = "PHP are sute de funcții incorporate și alte câteva mii disponibile prin intermediul extensiilor" +
                "Versiunile 5.2 și anterioare\n" +
                "În aceste versiuni funcțiile nu sunt obiecte de prima clasă. Aceasta înseamnă că funcțiile nu pot fi create dinamic în timpul executării programului și că pot fi chemate doar prin numele dat când au fost definite. Utilizatorul poate crea funcții în orice moment în program. În acest exemplu cuvântul cheie function definește funcția cu numele adauga care primește un număr de 2 parametri de intrare și returnează suma acestora.\n" +
                "\n" +
                "function adauga($x, $y)\n" +
                "{\n" +
                "    return $x + $y;\n" +
                "}\n" +
                "\n" +
                "echo adauga( 2, 4); // returnează 6\n" +
                "Versiunile 5.3 și mai noi\n" +
                "PHP are suport pentru funcții de rangul întâi și pentru funcții anonime, precum cele folosite în Javascript.\n" +
                "\n" +
                "function getAdder($x)\n" +
                "{\n" +
                "    return function ($y) use ($x) {\n" +
                "        // or: lexical $x;\n" +
                "        return $x + $y;\n" +
                "    };\n" +
                "}\n";
        wreathInformation_6.color = Color.rgb(200, 20, 200);
        wreathInformation_6.image = "Wreath_6";
        //wreathInformation_6.URL = "http://community.qvc.com/t5/Blogs/More-DIY-Christmas-Decorations-Let-s-Make-a-Yarn-Ball-Wreath/";
        items.add(wreathInformation_6);


        return items;
    }

}
