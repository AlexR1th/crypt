package alex.rith.crypt.controller;

import alex.rith.crypt.form.FormCrypt;
import alex.rith.crypt.srvice.CryptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/*controller*/
@Controller
public class CryptController {
    @Autowired
    CryptService service;

    @RequestMapping("/crypt")
    String showCryptForm(Model model) {

        FormCrypt form = new FormCrypt();
        model.addAttribute("form", form);

        return "crypt-form";
    }

    @PostMapping("/crypt")
    String showCryptForm(@ModelAttribute("form") FormCrypt formCrypt, Model model) {
        String textFromBrouser = formCrypt.getText();
        int key = formCrypt.getKey();
        System.out.println(formCrypt.getText());
        String cryptedText = service.cryptText(textFromBrouser,key);
        FormCrypt form = new FormCrypt();
        form.setText(textFromBrouser);
        form.setCryptedText(cryptedText);
        model.addAttribute("form", form);

        return "crypt-form";
    }
}
