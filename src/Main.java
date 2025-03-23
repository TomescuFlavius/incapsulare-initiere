import app.Masina;
import app.MasinaService;
import app.MasinaView;

import java.util.ArrayList;
import java.util.List;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Masina masina = new Masina();
        MasinaView view = new MasinaView();
    MasinaService service = new MasinaService();
        System.out.println(masina.descriere());
        view.play();
    }
}
