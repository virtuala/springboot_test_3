package com.example.springboot_test_3.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot_test_3.dao.NetsuserinfoDao;
import com.example.springboot_test_3.entity.Netsuserinfo;
import com.example.springboot_test_3.service.NetsuserinfoService;

@Service
public class NetsuserinfoServiceImpl implements NetsuserinfoService{
	@Autowired
	private NetsuserinfoDao netsuserinfoDao;

	public List<Netsuserinfo> getNetsuserinfoList(){
		List<Netsuserinfo> tmpLIST = netsuserinfoDao.findAll();
		return tmpLIST;
	}

}
