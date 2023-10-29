<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 08.03.2023
  Time: 17:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style>
    <%@include file='style2.css' %>
</style>
<!DOCTYPE html>
<html>
    <head>
        <title>Title</title>
    </head>
<%--    <body>--%>
<%--        <h2>Air flight Info</h2>--%>
<%--        <br>--%>
<%--        <form:form action="saveAirFlight" modelAttribute="airFlight">--%>
<%--            <form:hidden path="id"/>--%>
<%--            <br>--%>
<%--            <br>--%>
<%--            Where from <form:input path="whereFrom"/>--%>
<%--            <br>--%>
<%--            <br>--%>
<%--            Departure time <form:input path="departureTime"/>--%>
<%--            <br>--%>
<%--            <br>--%>
<%--            Where to <form:input path="whereTo"/>--%>
<%--            <br>--%>
<%--            <br>--%>
<%--            Boarding time <form:input path="boardingTime"/>--%>
<%--            <br>--%>
<%--            <br>--%>
<%--            Flight status <form:input path="flightStatus"/>--%>
<%--            <br>--%>
<%--            <br>--%>
<%--            <input type="submit" value="OK">--%>
<%--        </form:form>--%>
<%--    </body>--%>
    <body class="air-flight">
    <h2 class="air-flight__title">Air flight Info</h2>
    <form:form action="saveAirFlight" modelAttribute="airFlight" class="air-flight__form">
        <form:hidden path="id" class="air-flight__input air-flight__input_hidden"/>
        <div class="air-flight__field">
            <label class="air-flight__label" for="whereFrom">Where from</label>
            <form:input id="whereFrom" path="whereFrom" class="air-flight__input air-flight__input_text"/>
        </div>
        <div class="air-flight__field">
            <label class="air-flight__label" for="departureTime">Departure time</label>
            <form:input id="departureTime" path="departureTime" class="air-flight__input air-flight__input_text"/>
        </div>
        <div class="air-flight__field">
            <label class="air-flight__label" for="whereTo">Where to</label>
            <form:input id="whereTo" path="whereTo" class="air-flight__input air-flight__input_text"/>
        </div>
        <div class="air-flight__field">
            <label class="air-flight__label" for="boardingTime">Boarding time</label>
            <form:input id="boardingTime" path="boardingTime" class="air-flight__input air-flight__input_text"/>
        </div>
        <div class="air-flight__field">
            <label class="air-flight__label" for="flightStatus">Flight status</label>
            <form:input id="flightStatus" path="flightStatus" class="air-flight__input air-flight__input_text"/>
        </div>
        <input type="submit" value="OK" class="air-flight__submit">
    </form:form>
    </body>
</html>
