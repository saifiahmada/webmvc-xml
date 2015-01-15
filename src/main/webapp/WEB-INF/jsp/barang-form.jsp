<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/taglib.jsp"%>

<c:if test="${param.success eq true }">
	<div class="alert alert-success">Data berhasil disimpan</div>
</c:if>
<form:form commandName="barang" cssClass="form-horizontal" action="/barang/simpan.html"> 
	<div class="form-group">
		<label for="kode" class="col-sm-2 control-label">Kode</label>
		<div class="col-sm-10">
			<form:input path="kode" cssClass="form-control" />
		</div>
	</div>
	
	<div class="form-group">
		<label for="nama" class="col-sm-2 control-label">Nama</label>
		<div class="col-sm-10">
			<form:input path="nama" cssClass="form-control" />
		</div>
	</div>
	
	<div class="form-group">
		<label for="harga" class="col-sm-2 control-label">Harga</label>
		<div class="col-sm-10">
			<form:input path="harga" cssClass="form-control" />
		</div>
	</div>
	
	<input type="submit" value="Simpan" class="btn btn-success" />
	<a href="/barang/list.html" class="btn btn-success">List</a> 
	
</form:form>