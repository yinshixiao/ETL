package com.open.etl.MsToMySql.controller;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.open.etl.MsToMySql.entity.DbConnInfo;
import com.open.etl.util.CommonResult;

@RestController
@RequestMapping("/mssql-to-mysql")
public class TestController {

	@RequestMapping("/saveSqlInfo")
	public CommonResult getSqlServerInfo(DbConnInfo dbConnInfo,HttpSession session) {
		System.out.println(dbConnInfo.toString());
		session.setAttribute("mssqlConnInfo", dbConnInfo);
		return new CommonResult();
	}
	
	
}
