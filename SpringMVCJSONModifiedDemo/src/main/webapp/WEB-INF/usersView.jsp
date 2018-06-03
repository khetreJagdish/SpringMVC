<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<div class="col-sm-offset-1 col-sm-10">
 
    <legend>
        <spring:message code="table.user.title" />
    </legend>
 
    <div>
        <table id="dataTable" class="table table-striped table-bordered">
            <thead>
                <tr>
                    <th><spring:message code="table.user.id" /></th>
                    <th><spring:message code="table.user.firstName" /></th>
                    <th><spring:message code="table.user.address" /></th>
                    <th><spring:message code="table.user.city" /></th>
                    <th><spring:message code="table.user.country"/></th>
                    <th><spring:message code="table.user.postalCode"/></th>
                </tr>
            <thead>
            <tbody>
                <c:forEach var="u" items="${customerModel}">
                    <tr>
                        <td>${u.id}</td>
                        <td>${u.firstName}</td>
                        <td>${u.address}</td>
                        <td>${u.city}</td>
                         <td>${u.country}</td>
                          <td>${u.postalCode}</td>
                    <tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</div>