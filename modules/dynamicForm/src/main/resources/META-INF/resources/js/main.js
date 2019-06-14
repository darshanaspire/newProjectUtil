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

			} else {

			}
		},
		error : function(response) {
			console.log("Error in populateGoalData");
		}
	});
}

function getObjectiveData() {
	AUI().use('aui-io-request', function(A) {
		getObjectiveDataAJAX = A.io.request(getObjectiveDataURL, {
			method : 'get',
			on : {
				success : function(data) {
					debugger;
				},
				failure : function() {

				}
			}
		});

		// getObjectiveDataAJAX.start();

	});

}