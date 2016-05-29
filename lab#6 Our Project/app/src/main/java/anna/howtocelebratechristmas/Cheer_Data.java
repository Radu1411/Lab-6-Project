package anna.howtocelebratechristmas;

import android.graphics.Color;

import java.util.ArrayList;
import java.util.List;

public class Cheer_Data {

    private Cheer_Data() {
    }

    public static List<Information> load_cheer_items() {
        List<Information> items = new ArrayList<>();

        Information cheer_information_1 = new Information();
        cheer_information_1.name = "C++ ";
        cheer_information_1.description = "C++ este un lmbaj de baza a tuturor software" +
                "pe care le folosim zi de zi accesind o simpla pagina web.";
        cheer_information_1.color = Color.rgb(240, 280, 255);
        cheer_information_1.image = "";
        cheer_information_1.URL = "https://ru.wikipedia.org/wiki/C%2B%2B";

        items.add(cheer_information_1);

        Information cheer_information_2 = new Information();
        cheer_information_2.name = "Avantaje";
        cheer_information_2.description = "Este un limbaj pe programarea orientata pe obiecte. " +
                "Se poste creea si un intreg sistem de operare.";
        cheer_information_2.color = Color.rgb(111, 11, 111);
        cheer_information_2.image = "";
        cheer_information_2.URL = "https://ru.wikipedia.org/wiki/C%2B%2B";

        items.add(cheer_information_2);


        Information cheer_information_3 = new Information();
        cheer_information_3.name = "Istorie ";
        cheer_information_3.description = "Acest soft C++ si-a luat nastere in anul 1980 de catre Бьёрн Страуструп de la compania Bell Labs,modificind insasi limbaju de baza C adaugind 80% de modificari .\n" +
                "\n" +
                "Бьёрн Страуструп in anul 1970 cin a inceput activitatea in Bell a spus ca e prea complicat de facut legatura cu limbajul C cu celelalte limbaje deja existente.\n" +
                "\n" +
                "Si din momentul cela sa pus labza crearea unui nou limbaj cu modificari radicale.  \n" +
                "\n" +
                "A fost un limbaj foarte rapid,de ori care nu ar fin incarcat el,de aceea si sa adaugat la denumire ++.\n" +
                "\n" +
                "De aici deja o aparut clase si structui in limbaj C++.\n" +
                "\n" +
                "In anul 1985 a iesit prima carte de programare in C++.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "";
        cheer_information_3.color = Color.rgb(13, 55, 125);
        cheer_information_3.image = "";
        cheer_information_3.URL = "https://ru.wikipedia.org/wiki/C%2B%2B";

        items.add(cheer_information_3);


        Information cheer_information_4 = new Information();
        cheer_information_4.name = "Dezvoltarea";
        cheer_information_4.description = "Dezvoltarea limbajului fost una cea mai productiva" +
                " in asamblu. \n\n" +
                "Acest limbaj era intratit de deschis incit orce om putea sasi " +
                " dezvolte capacitatea de programa nishte lucruri deosebite.\n\n";
        cheer_information_4.color = Color.rgb(222, 22, 222);
        cheer_information_4.image = "";
        cheer_information_4.URL = "https://ru.wikipedia.org/wiki/C%2B%2B";
        items.add(cheer_information_4);


        Information cheer_information_5 = new Information();
        cheer_information_5.name = "Istoria numirii C++";
        cheer_information_5.description = "Limbaju C++ la inceput era C,sa pus ++ caci sau petrecut modificari in anul 1980, " +
                "Iar insasi denumirea C provinea de la eroare in program ce putea fi eliminata doar cu tasta C(clean)" +
                ",de aici si a aparut numirea limbajului C++.";
        cheer_information_5.color = Color.rgb(122, 22, 222);
        cheer_information_5.image = "";
        cheer_information_5.URL = "https://ru.wikipedia.org/wiki/C%2B%2B";
        items.add(cheer_information_5);



        Information cheer_information_6 = new Information();
        cheer_information_6.name = "Din ce contine C++ ";
        cheer_information_6.description = "C++ este format din totalitatea bibliotecilor care le poate accesa orice utilizator " +
                "si are in sine un nucleu egal cu cel de la C.";
        cheer_information_6.color = Color.rgb(112, 22, 222);
        cheer_information_6.image = "";
        cheer_information_6.URL = "https://ru.wikipedia.org/wiki/C%2B%2B";
        items.add(cheer_information_6);


        return items;
    }

}
