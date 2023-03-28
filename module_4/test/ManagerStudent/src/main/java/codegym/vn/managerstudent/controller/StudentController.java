package codegym.vn.managerstudent.controller;

import codegym.vn.managerstudent.model.Student;
import codegym.vn.managerstudent.service.IClassNameService;
import codegym.vn.managerstudent.service.IStudentService;
import codegym.vn.managerstudent.validate.StudentValidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    IStudentService studentService;
    @Autowired
    IClassNameService classNameService;
    @Autowired
    StudentValidate studentValidate;

    @GetMapping("")
    public String index(Model model, Pageable pageable) {
        Page<Student> students = studentService.findAllWithPaging(pageable);
        model.addAttribute("students", students);
        model.addAttribute("classNames", classNameService.findAll());
        return "index";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {

        model.addAttribute("student", new Student());
        model.addAttribute("classNames", classNameService.findAll());
        return "create";
    }

    @PostMapping("/save")
    public String createBlog(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult, Model model) {
        studentValidate.validate(student, bindingResult);
        if (bindingResult.hasErrors()) {
            model.addAttribute("classNames", classNameService.findAll());
            return "create";
        }
        studentService.create(student);
        return "redirect:/student";
    }

    @GetMapping("/delete")
    public String deleteStudent(@RequestParam("idDelete") Integer id) {
        studentService.delete(id);
        return "redirect:/student";
    }
    @GetMapping("/edit/{id}")
    public String showEdit(@PathVariable("id") Integer id,Model model){
        model.addAttribute("student",studentService.findById(id));
        model.addAttribute("classNames", classNameService.findAll());
        return "edit";
    }
    @PostMapping("/update")
    public String update(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult, Model model){
        studentValidate.validate(student, bindingResult);
        if (bindingResult.hasErrors()) {
            model.addAttribute("classNames", classNameService.findAll());
            return "create";
        }
        studentService.update(student);
        return "redirect:/student";
    }
    @GetMapping("/search")
    public String search(@RequestParam(value = "nameSearch", defaultValue = "")String name,
                         @RequestParam(value = "classSearch")Integer idClass,
                         Model model) {

        model.addAttribute("students", studentService.searchByNameAndClass(name,idClass));
        return "index";
    }
}
