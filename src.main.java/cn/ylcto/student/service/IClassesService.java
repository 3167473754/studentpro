package cn.ylcto.student.service;

import cn.ylcto.student.vo.Classes;

public interface IClassesService {
    /**
     * 实现班级数据增加操作
     * @param vo 表示要执行增加操作的vo
     * @return 成功返回true，上班返回false
     * @throws Exception
     */
    public boolean insert(Classes vo)throws Exception;
}
