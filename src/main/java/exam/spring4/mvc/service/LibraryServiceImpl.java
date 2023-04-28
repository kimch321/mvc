package exam.spring4.mvc.service;

import exam.spring4.mvc.dao.LibraryDAO;
import exam.spring4.mvc.dao.LibraryDAOImpl;
import exam.spring4.mvc.model.LibraryVO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("libsrv")
public class LibraryServiceImpl implements LibraryService{

    private static final Logger logger = LogManager.getLogger(LibraryServiceImpl.class);
    private LibraryDAOImpl libdao;

    @Autowired
    public LibraryServiceImpl(LibraryDAOImpl libdao) {this.libdao = libdao;}

    @Override
    public boolean addLib(LibraryVO lib) {
        return libdao.insertLib(lib) > 0;
    }

    @Override
    public List<LibraryVO> readLib() {
        return libdao.selectLib();
    }

    @Override
    public LibraryVO readOneLib(int lbno) {
        return libdao.selectOneLib(lbno);
    }

    @Override
    public boolean modifyLib(LibraryVO lib) {
        return libdao.updateLib(lib) > 0;
    }

    @Override
    public boolean removeLib(int lbno) {
        return libdao.deleteLib(lbno) > 0;
    }
}
