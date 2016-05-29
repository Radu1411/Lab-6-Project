package anna.howtocelebratechristmas;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

public class Trees_Data {

    private Trees_Data() {
    }

    public static List<Information> load_tree_items() {
        List<Information> items = new ArrayList<>();

        Information tree_information_0 = new Information();
        tree_information_0.name = "HTML 5 ";
        tree_information_0.description = "1. Este a doua versiune dupa simplul limbaj HTML.\n" +
                "\n" +
                "daca noi pina acum am folosit HTML pentru crearea paginilor,construirea tabelelor, " +
                "crearea unor forme, " +
                "in HTML 5 deja putem folosi o gama larga de instrumente cum ar fi:," +
                " video,audio,unele scripturi care fac o animatie oarecare sau multimedia." +
                " " +
                "\n\n" +
                "2.Ceea ce am folosit pina in prezent a fost HTML 4.01.\n" +
                "\n" +
                "Despre asta putem spune ca ne incojoara oriunde in lumea virtuala, " +
                "de parca fi o ata de paiagin doar ca acopera tot virtualul globului pamintesc" +
                "Putem folosi si animatie 3D prin tegul <canvas>. " +
                "" +
                "" +
                "\n\n" +
                "3. HTML 5 renunta de Adobe Flash.\n" +
                "\n" +
                "Inainte ca sa puteam vizualiza un video pe net era nevoie de un player, " +
                "Compania Adobe isi propune softul sau universal Adobe Flash Player. " +
                "Deja in HTML 5 deja o putem face si fara Flash caci un asemenea script este incriptata in limbaj.";
        tree_information_0.color = Color.rgb(16, 144, 122);
        tree_information_0.image = "";
        tree_information_0.URL = ""
        ;

        items.add(tree_information_0);

        Information tree_information_1 = new Information();
        tree_information_1.name = "<teg HTML 5> ";
        tree_information_1.description = "<span> <audio> <video> <footer> <object>...";
        tree_information_1.color = Color.rgb(240, 280, 255);
        tree_information_1.image = "";
        tree_information_1.URL = "";

        items.add(tree_information_1);

        Information tree_information_2 = new Information();
        tree_information_2.name = "Compatibilitatea";
        tree_information_2.description = "Deja este compatibil cu toate browser-rele ne-schimbind interfata acestora.";
        tree_information_2.color = Color.rgb(111, 11, 111);
        tree_information_2.image = "";
        tree_information_2.URL = "";

        items.add(tree_information_2);


        return items;
    }

}

