package cn.ylcto.student.service.impl;

import javax.annotation.Resource;

import cn.ylcto.student.dao.IClassesDAO;
import cn.ylcto.student.service.IClassesService;
import cn.ylcto.student.vo.Classes;

public class ClassesServiceImpl implements IClassesService{

	@Resource
	private IClassesDAO classesDAO;
	@Override
	public boolean insert(Classes vo) throws Exception {

		return this.classesDAO.doCreate(vo);
	}
}


