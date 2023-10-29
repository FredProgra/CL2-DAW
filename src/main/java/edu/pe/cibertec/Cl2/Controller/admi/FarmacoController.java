package edu.pe.cibertec.Cl2.Controller.admi;

import edu.pe.cibertec.Cl2.Service.FarmacoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@AllArgsConstructor
@RequestMapping("/admi/farmaco")
public class FarmacoController {
    private FarmacoService farmacoService;
    @GetMapping("/frmfarmaco")
    public String frmfarmaco(Model model){
        model.addAttribute("listafarmaco",farmacoService.listarFarmaco());
        return "admi/frmfarmaco";
    }
}
