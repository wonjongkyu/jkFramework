<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	
	<title><tiles:getAsString name="title" /></title>
</head>

<body>
	<div id="wrapper">
	    <header id="header">
	        <tiles:insertAttribute name="header" />
	    </header>
	
	    <section id="sidemenu">
	        <tiles:insertAttribute name="left" />
	    </section>
		             
	    <section id="siteContent">
	        <tiles:insertAttribute name="body" />
	    </section>
	
	    <footer id="footer">
	        <tiles:insertAttribute name="footer" />
	    </footer>
	    
	    <footer id="right">
	        <tiles:insertAttribute name="right" />
	    </footer>
    </div>
</body>
</html>
