package mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import pojo.OldMan;

import java.util.List;

public interface OldManMapper {
    @Select("select *from older.oldman")
    List<OldMan> selectAll();

    @Select("select * from older.oldman where healthy = #{status}")
    List<OldMan> selectByStatus(String status);

    List<OldMan> selectByCondition(@Param("oldMan") OldMan oldMan);

    @Select("select * from older.oldman where id = #{id}")
    List<OldMan> selectById(String id);

    @Select("select count(*) from older.oldman where healthy = #{status}")
    int getCountByStatus(String status);
}
