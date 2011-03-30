/**
 * Comette's lib
 */
$(document).ready(function() {
// AJAX запрос к сервлету Dinner.
$('#ajax_button').click(function() {
	var url = "/comette/dinner";
	$('#ajax_result').html("Working...");
	$.ajax({
		type: "GET",
		url: url,
		dataType: "html",
		success: function(msg) {
			$('#ajax_result').html(msg);
		}	
	});
});
});