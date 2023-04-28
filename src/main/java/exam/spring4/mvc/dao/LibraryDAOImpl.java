package exam.spring4.mvc.dao;

import exam.spring4.mvc.model.LibraryVO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository("libdao")
public class LibraryDAOImpl implements LibraryDAO{
    private static final Logger logger = LogManager.getLogger(LibraryDAO.class);
    private JdbcTemplate jdbcTemplate;

    @Value("#{sql['insertSQL']}") private String insertSql;
    @Value("#{sql['selectSQL']}") private String selectSQL;
    @Value("#{sql['selectOneSQL']}") private String selectOneSQL;
    @Value("#{sql['updateSQL']}") private String updateSQL;
    @Value("#{sql['deleteSQL']}") private String deleteSQL;

    @Autowired
    public LibraryDAOImpl(JdbcTemplate jdbcTemplate){ this.jdbcTemplate = jdbcTemplate;}

    @Override
    public int insertLib(LibraryVO lib) {
        Object[] param = new Object[] {
                lib.getLbname(),lib.getSido(), lib.getGugun(), lib.getLbname(), lib.getClsday(),
                lib.getAddr(), lib.getPhone(), lib.getHomepage(), lib.getLat(), lib.getLon()
        };

        return jdbcTemplate.update(insertSql,param);
    }

    @Override
    public List<LibraryVO> selectLib() {
        RowMapper<LibraryVO> mapper = new LibraryMapper();

        return jdbcTemplate.query(selectSQL, mapper);
    }
    private class LibraryMapper implements RowMapper<LibraryVO> {
        @Override
        public LibraryVO mapRow(ResultSet rs, int num) throws SQLException {
            LibraryVO lib = new LibraryVO(rs.getInt(1),rs.getString(2),rs.getString(3),
                    rs.getString(4),rs.getString(5),rs.getString(6));

            return lib;
        }
    }

    @Override
    public LibraryVO selectOneLib(int lbno) {
        Object[] param = new Object[] {lbno};
        RowMapper<LibraryVO> mapper = new LibraryOneMapper();
        LibraryVO lib = null;

        try{
            lib = jdbcTemplate.queryForObject(selectOneSQL,mapper,param);
        } catch (Exception ex) {
            logger.error("selectOneLib 에러!");
            ex.printStackTrace();
        }

        return lib;
    }
    private class LibraryOneMapper implements RowMapper<LibraryVO> {
        @Override
        public LibraryVO mapRow(ResultSet rs, int num) throws SQLException {
            LibraryVO lib = null;

            try {
                lib = new LibraryVO(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)
                        , rs.getString(8), rs.getString(9), rs.getDouble(10), rs.getDouble(11), rs.getString(12));
            } catch(Exception ex) {
                logger.error("LibraryOneMapper 에러!");
                ex.printStackTrace();
            }

            return lib;
        }
    }

    @Override
    public int updateLib(LibraryVO lib) {
        Object[] param = new Object[] {
                lib.getLbtype(),lib.getClsday(),lib.getAddr(),lib.getPhone(),
                lib.getHomepage(),lib.getLat(),lib.getLon(),lib.getLbno()
        };

        return jdbcTemplate.update(updateSQL,param);
    }

    @Override
    public int deleteLib(int lbno) {
        Object[] param = new Object[] {lbno};
        return jdbcTemplate.update(deleteSQL,param);
    }
}
