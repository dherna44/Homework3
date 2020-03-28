<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- Creates the overall html layout and style of the inventory table: -->
<!DOCTYPE html>
<html>
<head>
    <title>HomeWork3 SpringBoot App</title>
    <style>
        table{
            font-family:Algerian, "Droid Sans";
            border-collapse: collapse;
            width: 100%;
        }

        td, th{
            border: 1px solid #aaaaaa;
            text-align: left;
            padding: 10px;
        }
        tr:nth-child(even){
            background-color: #aaaaaa;
        }
    </style>

</head>

<!-- Creates the html table and connects them to each field/property: -->
<body>
<h1>Sporting Goods Inventory</h1>
<table>
    <tr>
        <th>description</th>
        <th>price</th>
        <th>color</th>
    </tr>

    <!-- To view the selected inventory items when "view" is clicked: -->
    <c:forEach var = "listitem" items = "${inventorylist}">
        <tr>
            <td>${listitem.description}</td>
            <td>${listitem.price}</td>
            <td>${listitem.color}</td>
            <td>
                <a href="/view/${listitem.getId()}">View</a>
            </td>

        </tr>
    </c:forEach>
</table>

</body>
</html>