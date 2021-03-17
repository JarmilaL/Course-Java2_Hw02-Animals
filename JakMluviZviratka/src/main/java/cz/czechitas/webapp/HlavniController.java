package cz.czechitas.webapp;

import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;
import org.thymeleaf.standard.processor.*;

@Controller
public class HlavniController {

    private static final List<String> ANIMALS = Arrays.asList("husa", "kocka", "krava", "kun", "ovce", "pes");

    @RequestMapping("/")
    public ModelAndView zobrazIndex() {
        ModelAndView dataHolder = new ModelAndView("index");
        int randomAnimalIndex = (int) (Math.random() * ANIMALS.size());
        String randomAnimal = ANIMALS.get(randomAnimalIndex);
        dataHolder.addObject("image", "images/" + randomAnimal + ".jpg");
        dataHolder.addObject("sound", "sounds/" + randomAnimal + ".mp3");

        return dataHolder;
    }

}
