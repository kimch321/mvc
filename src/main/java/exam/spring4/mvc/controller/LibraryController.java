package exam.spring4.mvc.controller;

import exam.spring4.mvc.model.LibraryVO;
import exam.spring4.mvc.service.LibraryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LibraryController {
    private LibraryServiceImpl libsrv;
    @Autowired
    public LibraryController(LibraryServiceImpl libsrv) {this.libsrv = libsrv;}

    @GetMapping("/new")
    public String add() {
        return "new";
    }

    @PostMapping("/new")
    public String addok(LibraryVO lib) {
        String view = "error";

        if(libsrv.addLib(lib)) {
            view ="redirect:/list";
        }

        return view;
    }

    @GetMapping("/list")
    public ModelAndView list() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("libs",libsrv.readLib());
        mv.setViewName("list");

        return mv;
    }


    @GetMapping("/view")
    public ModelAndView view(int lbno) {
        ModelAndView mv = new ModelAndView();
        String view = "error";

        LibraryVO lib = libsrv.readOneLib(lbno);
        if(lib != null) {
            mv.addObject("lib",lib);
            view = "view";
        }
        mv.setViewName(view);

        return mv;
    }

    @GetMapping("/modify")
    public ModelAndView modify(int lbno) {
        ModelAndView mv = new ModelAndView();
        LibraryVO lib = libsrv.readOneLib(lbno);
        String view = "error";

        if(lib != null) {
            mv.addObject("lib",lib);
            view = "modify";
        }
        mv.setViewName(view);

        return mv;
    }

    @PostMapping("/modify")
    public String updateok(LibraryVO lib){
        String view = "error";
        if(libsrv.modifyLib(lib)) view = "redirect:/view?lbno="+lib.getLbno();

        return view;
    }

    @GetMapping("/remove")
    public String remove(int lbno){
        String view = "error";
        if(libsrv.removeLib(lbno)) view = "redirect:/list";

        return view;
    }

}
