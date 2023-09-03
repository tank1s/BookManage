package service.Impl;

import mapper.OldManMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import pojo.OldMan;
import service.OldManService;
import util.SqlSessionFactoryUtils;

import java.util.List;

public class OldManServiceImpl implements OldManService {

    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    @Override
    public List<OldMan> selectAll() {
        SqlSession sqlSession = factory.openSession();
        OldManMapper mapper = sqlSession.getMapper(OldManMapper.class);
        List<OldMan> oldMEN = mapper.selectAll();
        //释放资源
        sqlSession.close();
        return oldMEN;
    }

    @Override
    public List<OldMan> selectByStatus(String status) {
        SqlSession sqlSession = factory.openSession();
        OldManMapper mapper = sqlSession.getMapper(OldManMapper.class);
        List<OldMan> oldMEN = mapper.selectByStatus(status);
        //释放资源
        sqlSession.close();
        return oldMEN;
    }

    @Override
    public List<OldMan> selectByCondition(OldMan oldMan) {
        SqlSession sqlSession = factory.openSession();
        OldManMapper mapper = sqlSession.getMapper(OldManMapper.class);
        String name = oldMan.getName();
        if (name != null && name.length() > 0){
            oldMan.setName("%" + name + "%");
        }
        System.out.println("name : " + name);
        String id = oldMan.getId();
        if (id != null && id.length() > 0){
            oldMan.setName("%" + id + "%");
        }
        System.out.println("id : " + id);
        List<OldMan> oldMEN = mapper.selectByCondition(oldMan);

        //释放资源
        sqlSession.close();
        return oldMEN;
    }

    @Override
    public List<OldMan> selectById(String id) {
        SqlSession sqlSession = factory.openSession();
        OldManMapper mapper = sqlSession.getMapper(OldManMapper.class);
        List<OldMan> oldMEN = mapper.selectById(id);
        //释放资源
        sqlSession.close();
        return oldMEN;
    }

    @Override
    public int getCountByStatus(String status) {
        SqlSession sqlSession = factory.openSession();
        OldManMapper mapper = sqlSession.getMapper(OldManMapper.class);
        int countByStatus = mapper.getCountByStatus(status);
        return countByStatus;
    }


}
