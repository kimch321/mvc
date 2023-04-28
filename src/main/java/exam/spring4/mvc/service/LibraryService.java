package exam.spring4.mvc.service;

import exam.spring4.mvc.model.LibraryVO;

import java.util.List;

public interface LibraryService {
    boolean addLib(LibraryVO lib);
    List<LibraryVO> readLib();
    LibraryVO readOneLib(int lbno);
    boolean modifyLib(LibraryVO lib);
    boolean removeLib(int lbno);
}
