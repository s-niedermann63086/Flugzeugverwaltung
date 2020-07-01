package ch.bbw.flughafenverwaltung;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @Autowired
    private FlughafenRepositoryMockUp flughafenRepositoryMockUp;

    @GetMapping("/")
    public String index(@RequestParam(value = "id", required = false) Integer id, Model model) {
        if (id == null) {
            id = 0;
        }
        model.addAttribute("flugzeuge", flughafenRepositoryMockUp.getFlugzeuge(id));
        model.addAttribute("flughafenSize", flughafenRepositoryMockUp.getFlugzeuge(id).size());
        model.addAttribute("totalGewicht", flughafenRepositoryMockUp.getTotalGewicht());
        model.addAttribute("totalTreibstoff", flughafenRepositoryMockUp.getTotalTreibtoff());
        return "index";
    }
}
