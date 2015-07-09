<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/Estilos.css">
<title>Especialidades</title>
</head>
<center>
<body bgcolor="black">
<div align="center" style="color: white ; font-family: Calibri Light; font-size: 40px">E S P E C I A L I D A D E S</div>
	<fieldset>
		<form action="/especialidades" method="post">
			<div id="formulario">
			<div class="fila">
					<div class="etiqueta">
						<label for="cui">Nombre: </label>
					</div>
					<div class="control">
						<input type="text" name="nombre" maxlength="8" required/>
					</div>
				</div>
				
				<div class="fila">
					<div class="etiqueta">
						<label for="nombre">Apellidos:</label>
					</div>
					<div class="control">
						<input type="text" name="apellidos"  maxlength="10" required/>
					</div>
				</div>
				<div class="fila">
					<div class="etiqueta">
						<label for="especialidades">Especialidades:</label>
					</div>
					<div class="control">
						<select name="especialidades">

							<div class="etiqueta">
								<option value="Bachiller">Bachiller</option>
							</div>
							<div class="etiqueta">
								<option value="Titulo">Titulo</option>
							</div>
							<div class="etiqueta">
								<option value="Maestria">Maestria</option>
							</div>
							<div class="etiqueta">
								<option value="Doctorado">Doctorado</option>
							</div>
		
					</select> 
					</div>
					</div>
					<div class="fila">
					<div class="etiqueta">
					<label for="nota1">Mension: </label>
					</div>
					<div class="control">
					 <input type="text" id="mension" name="mension" required><br> <br>
					 </div>
					 </div> 
					 <div class="fila">
					 <div class="action">
					 <input	type="reset" value="Limpiar"> <input type="submit"
						value="Guardar">
						</div>
						</div>
			
		</form>
		<form action="/lista" method="get">
		<div class="fila">
					 <div class="action">
			<input type="submit" value="Ver">
			</div>
			</div>
		</form>
	</fieldset>
</body>
</center>
</html>
