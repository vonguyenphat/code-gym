<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<a class="add" href="/customer?action=create">+ Add New Product</a>
<table class="table table-striped">
    <tr>
        <th>STT</th>
        <th>Mã khách hàng</th>
        <th>Loại khách hàng</th>
        <th>Tên khách hàng</th>
        <th>Ngày sinh </th>
        <th>Giới tính</th>
        <th>Thẻ khách hàng</th>
        <th>Số điện thoại</th>
        <th>Email</th>
        <th>Thường trú</th>
    </tr>
    <c:forEach var="customer" items="${customerList}" varStatus="status">
        <tr>
            <td>${status.count}</td>
            <td>PTX-00${customer.getCustomer_id()()}</td>
            <td>${customer.getCustomer_type_id()}</td>
            <td>${customer.getCustomer_name()}</td>
            <td>${customer.getCustomer_birthday()}</td>
            <td>${customer.isCustomer_gender()}</td>
            <td>${customer.getCustomer_id_card()}</td>
            <td>${customer.getCustomer_phone()}</td>
            <td>${customer.getCustomer_email()}</td>
            <td>${customer.getCustomer_address()}</td>
    </c:forEach>
</table>