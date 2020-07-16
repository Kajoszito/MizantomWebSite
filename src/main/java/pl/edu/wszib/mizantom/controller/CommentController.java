package pl.edu.wszib.mizantom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.edu.wszib.mizantom.dao.CommentDao;
import pl.edu.wszib.mizantom.domain.Comment;

@Controller
public class CommentController {

    @Autowired
    private CommentDao commentDao;

    @GetMapping("comments")
    public String comments( Model model) {
        model.addAttribute("comments", commentDao.findAll());
        return "comments";
    }

    @GetMapping("/comments/delete/{id}")
    public String delete(@PathVariable Integer id) {
        commentDao.deleteById(id);
        return "redirect:/comments";
    }

    @GetMapping("/comments/new")
    public String newComment(Model model) {
        model.addAttribute("comment", new Comment());
        return "comment";
    }

    @PostMapping("/comments/save")
    public String saveComment(Comment comment) {
        commentDao.save(comment);
        return "redirect:/comments";
    }

   @GetMapping("comments/edit/{id}")
    public String editComment(@PathVariable Integer id, Model model) {
        model.addAttribute("comment", commentDao.findById(id));
        return "comment";
    }
}