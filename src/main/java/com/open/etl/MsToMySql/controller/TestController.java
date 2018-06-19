package com.open.etl.MsToMySql.controller;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.open.etl.MsToMySql.entity.DbConnInfo;
import com.open.etl.util.CommonResult;

@RestController
@RequestMapping("/mssql-to-mysql")
public class TestController {

	@RequestMapping("/saveMssqlInfo")
	public CommonResult saveMssqlInfo(DbConnInfo dbConnInfo,HttpSession session) {
		System.out.println(dbConnInfo.toString());
		session.setAttribute("mssqlConnInfo", dbConnInfo);
		return new CommonResult();
	}
	
	@RequestMapping("/saveMysqlInfo")
	public CommonResult saveMysqlInfo(DbConnInfo dbConnInfo,HttpSession session) {
		System.out.println(dbConnInfo.toString());
		session.setAttribute("mysqlConnInfo", dbConnInfo);
		return new CommonResult();
	}
	
	
}
	
	

