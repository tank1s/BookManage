package service;

import pojo.OldMan;

import java.util.List;

public interface OldManService {
    List<OldMan> selectAll();

    /**
     *
     * @param status 健康状态
     * @return
     */
    List<OldMan> selectByStatus(String status);

    /**
     * 条件查询
     * @param oldMan
     * @return
     */
    List<OldMan> selectByCondition(OldMan oldMan);

    /**
     * 通过id查询老年人信息
     * @param id
     * @return
     */
    List<OldMan> selectById(String id);

    /**
     * 查询健康状态占比
     * @param status
     * @return
     */
    int getCountByStatus(String status);
}
