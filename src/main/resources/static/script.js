function eliminar(id){
	swal({
  title: "Estas Seguro de Eliminar",
  text: "",
  icon: "warning",
  buttons: true,
  dangerMode: true,
})
.then((OK) => {
  if (OK) {
	$.ajax({
		url:"/eliminar/"+id,
		success :function(res){
			console.log(res)
		}
		
	});
    swal(" ¡ SE ELIMINO EL PRODUCTO !", {
      icon: "success",
    }).then((ok)=>{
	if(ok){
		location.href="/listar"
	}
});
  } else {
    swal("proceso terminado");
  }
});
	
}