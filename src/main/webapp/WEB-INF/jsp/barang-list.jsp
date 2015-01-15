<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/taglib.jsp" %>

<a href="/barang/form.html" class="btn btn-success">Tambah</a> 
<br/>
<br/>
<table class="table table-bordered table-hover table-striped"> 
  <tr>
    <th>Kode</th>
    <th>Nama</th>
    <th>Harga</th>
  </tr>
  <c:forEach items="${barangs}" var="b">
  <tr>
    <td>${b.kode }</td>
    <td>${b.nama }</td>
    <td>${b.harga }</td>
  </tr>
  </c:forEach>
</table>

