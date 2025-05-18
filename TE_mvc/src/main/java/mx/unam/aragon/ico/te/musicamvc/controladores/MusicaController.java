package mx.unam.aragon.ico.te.musicamvc.controladores;

import mx.unam.aragon.ico.te.musicamvc.modelos.Artista;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tienda")
public class MusicaController {

    @GetMapping("/home/")
    public String home() {
        return "home";
    }

    @GetMapping("/artista/")
    public String artista(Model model) {
        Artista artista = new Artista("Algo",25,"Rock",1,"https://queen.fandom.com/es/wiki/Freddie_Mercury?file=IMG-20151114-WA0005.jpg", "Freddie Mercury");
        model.addAttribute("artista", artista);
        return "artista";
    }


}
