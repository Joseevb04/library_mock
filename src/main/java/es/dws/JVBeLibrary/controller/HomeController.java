package es.dws.JVBeLibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import es.dws.JVBeLibrary.service.BookService;
import lombok.RequiredArgsConstructor;

/**
 * HomeController
 */
@Controller
@RequiredArgsConstructor
public class HomeController {

    private final BookService bookService;

    @GetMapping({ "/", "/index", "/home" })
    public String showHome(final Model model) {
        model.addAttribute("books", bookService.getBooks());
        return "indexView";
    }

}
