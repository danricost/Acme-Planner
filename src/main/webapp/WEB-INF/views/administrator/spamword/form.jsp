<%--
- form.jsp
-
- Copyright (C) 2012-2021 Rafael Corchuelo.
-
- In keeping with the traditional purpose of furthering education and research, it is
- the policy of the copyright owner to permit non-commercial use and redistribution of
- this software. It has been tested carefully, but it is not guaranteed for any particular
- purposes.  The copyright owner does not offer any warranties or representations, nor do
- they accept any liabilities with respect to them.
--%>

<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-textbox code="administrator.spamwords.list.label.name" path="palabraSpam"/>	
	
	<acme:form-submit test="${command == 'show'}" code="administrator.spamwords.button.update" action="/administrator/spamword/update"/>
<%-- 	<acme:form-submit test="${command == 'show' }" code="manager.task.form.button.delete" action="/manager/task/delete"/> --%>
<%-- 	<acme:form-submit test="${command == 'create'}" code="manager.task.form.button.create" action="/manager/task/create"/> --%>
	<acme:form-submit test="${command == 'update'}" code="administrator.spamwords.button.update" action="/administrator/spamword/update"/>
<%-- 	<acme:form-submit test="${command == 'publish'}" code="employer.job.form.button.publish" action="/employer/job/publish"/>
	<acme:form-submit test="${command == 'delete'}" code="employer.job.form.button.delete" action="/employer/job/delete"/>	 --%>	
  	<acme:form-return code="administrator.spamwords.form.button.return"/>
</acme:form>
