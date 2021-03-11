import $ from 'jquery'

$(document).ready( function() {


	$('#save').on('click', function(){

		let formdata = $("#memberJoin").serialize();
		$.ajax({
			method: 'POST',
			url: '/member/join',
			data: formdata,
			dataType: 'json',
			success: function(formdata){
				console.log("성공");
			},
			error:function(status, error){
				alert(error);
			}
		});
	});
});