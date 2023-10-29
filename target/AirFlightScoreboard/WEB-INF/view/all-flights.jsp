<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 08.03.2023
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style>
    <%@include file='style.css' %>
</style>
<!DOCTYPE html>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <header class="header">
            <div class="header__content">
                <p class="header__title">DrevAir</p>
            </div>
        </header>
        <div class="container">
            <section class="main">
                <h2 class="main__title">All air flights</h2>
                <table class="main__table">
                    <tr class="main__table-row main__table-row_header">
                        <th class="main__table-cell">Id</th>
                        <th class="main__table-cell">Where from</th>
                        <th class="main__table-cell">Departure time</th>
                        <th class="main__table-cell">Where to</th>
                        <th class="main__table-cell">Boarding time</th>
                        <th class="main__table-cell">Flight status</th>
                        <th class="main__table-cell">Update information</th>
                        <th class="main__table-cell">Delete Flight</th>
                    </tr>
                    <c:forEach var="airFlight" items = "${allAirFlights}">
                        <c:url var="updateButton" value="/updateInfo">
                            <c:param name="airFlightId" value="${airFlight.id}"/>
                        </c:url>

                        <c:url var="deleteButton" value="/deleteAirFlight">
                            <c:param name="airFlightId" value="${airFlight.id}"/>
                        </c:url>
                        <tr class="main__table-row">
                            <td class="main__table-cell">${airFlight.id}</td>
                            <td class="main__table-cell">${airFlight.whereFrom}</td>
                            <td class="main__table-cell">${airFlight.departureTime}</td>
                            <td class="main__table-cell">${airFlight.whereTo}</td>
                            <td class="main__table-cell">${airFlight.boardingTime}</td>
                            <td class="main__table-cell">${airFlight.flightStatus}</td>
                            <td class="main__table-cell">
                                <div class="main__table-btn">
                                    <input type="button" value="Update"
                                           onclick="window.location.href = '${updateButton}'"/>
                                </div>
                            </td>
                            <td>
                                <div class="main__table-btn">
                                    <input type="button" value="Delete"
                                           onclick="window.location.href = '${deleteButton}'"/>
                                </div>
                            </td>
                        </tr>
                    </c:forEach>
                </table>
                <input type="button" value="Add"
                       onclick="window.location.href = 'addNewAirFlight'"/>
            </section>
        </div>
    </body>
</html>
