package exam.spring4.mvc.dao;

import exam.spring4.mvc.model.LibraryVO;

import java.util.List;

public interface LibraryDAO {
    int insertLib(LibraryVO lib);
    List<LibraryVO>selectLib();
    LibraryVO selectOneLib(int lbno);
    int updateLib(LibraryVO lib);
    int deleteLib(int lbno);
}
