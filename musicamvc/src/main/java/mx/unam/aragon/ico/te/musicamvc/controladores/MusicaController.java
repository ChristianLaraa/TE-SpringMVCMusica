package mx.unam.aragon.ico.te.musicamvc.controladores;

import mx.unam.aragon.ico.te.musicamvc.modelos.Artista;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tienda/")
public class MusicaController {

    @GetMapping("/home/")
    public String home(){
        return "home";
    }

    @GetMapping("/artista/")
    public String artista(Model model){
        Artista artista = new Artista(
                1,
                "Freddie Mercury",
                "Rock",
                45,
                "Vocalista icónico de Queen y leyenda del rock.",
                "https://media.vogue.mx/photos/5ec7236ff863d188d6f31611/2:3/w_2240,c_limit/Freddie-Mercury-estadio-wembley-londres-1986.jpg"
        );
        model.addAttribute("artista", artista);
        return "artista";
    }
}
