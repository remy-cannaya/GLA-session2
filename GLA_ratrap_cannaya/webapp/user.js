
function getServerData(type,url,success){
	$.ajax({
		type:type,
		dataType:'json',
		url:url
	}).done(success);

}
function getServerDataText(type,url,success){
	$.ajax({
		type:type,
		dataType:'text',
		url:url
	}).done(success);
}

function callUsername(username){
	var templateExample = _.template($('#templateName').html());
	var html = templateExample({
		"attribute":JSON.stringify(username)
	});

	$("#name").append(html);
}



function callMail(Mail){
	var templateExample = _.template($('#templateMail').html());
	var html = templateExample({
		"mail":JSON.stringify(Mail)
	});

	$("#Mail").html(html);
}

function callIsAdmin(Admin){
	var templateExample = _.template($('#templateAdmin').html());
	var html = templateExample({
		"admin":JSON.stringify(Admin)
	});

	$("#Admin").html(html);
}

function callIsDistrib(Distrib){
	var templateExample = _.template($('#templateDistrib').html());
	var html = templateExample({
		"distrib":JSON.stringify(Distrib)
	});

	$("#Distrib").html(html);
}

function callIsPlanner(Planner){
	var templateExample = _.template($('#templatePlanner').html());
	var html = templateExample({
		"planner":JSON.stringify(Planner)
	});

	$("#Planner").html(html);
}



function callSetUsername(username){
	var name = $('input[name="setName"]').val();
	var templateExample = _.template($('#templateName').html());
	var html = templateExample({
		"attribute":JSON.stringify(name)
	});
	$('#name').html(html);
}	

function callSetMail(mail){
	var mail = $('input[mail="setMail"]').val();
	var templateExample = _.template($('#templateMail').html());
	var html = templateExample({
		"attribute":JSON.stringify(mail)
	});
	$('#mail').html(html);
}	

function callSetPassword(password){
	var templateExample = _.template($('#templateName').html());
	var html = templateExample({
		"attribute": 'password set'
	});
	$('#name').html(html);
}



$(function (){
		
		var userid ='1';

		getServerDataText('GET','/ws/User/'+userid+'/getUsername',callUsername);
		getServerDataText('GET','/ws/User/'+userid+'/getMail',callMail);
		getServerData('GET','/ws/User/'+userid+'/getBoolAdmin',callIsAdmin);
		getServerData('GET','/ws/User/'+userid+'/getBoolDistrib',callIsDistrib);
		getServerData('GET','/ws/User/'+userid+'/getBoolPlanner',callIsPlanner);
				
		$('#SetUsername').click(function(){
			var input = $('input[name="setName"]').val();
			getServerData('POST','/ws/User/'+userid+'/setUsername/'+input,callSetUsername);
		});
		
		$('#SetMail').click(function(){
			var input = $('input[mail="setMail"]').val();
			getServerData('POST','/ws/User/'+userid+'/setMailAdress/'+input,callSetMail);
		});

		$('#SetPassword').click(function(){
			var input = $('input[name="Password"]').val();
			getServerData('POST','/ws/User/'+userid+'/setPassword/'+input,callSetPassword);
		});

});

	

