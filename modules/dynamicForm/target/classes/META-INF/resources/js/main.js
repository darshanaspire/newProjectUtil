var resourceURL = $("#resourceURL").text();
var viewDynamicForm = $("#viewDynamicForm").text();
var getObjectiveDataURL = $("#getObjectiveDataURL").text();
var getObjectiveDataAJAX;

$(document).ready(function() {
	var isDynamicFormPage = $("#isDynamicFormPage").text();
	if (isDynamicFormPage) {
		populateGoalData();
	}
})

function populateGoalData() {
	$.ajax({
		url : getObjectiveDataURL,
		type : "post",
		success : function(response) {
			response = JSON.parse(response);
			if (response.success == true) {
				debugger;
			} else {

			}
		},
		error : function(response) {
			console.log("Error in populateGoalData");
		}
	});
}
