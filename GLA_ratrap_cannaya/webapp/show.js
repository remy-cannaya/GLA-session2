
function getServerData(type,url,success){
	$.ajax({
		type:type,
		dataType:'json',
		url:url
	}).done(success);

}

function ShowBegin(type,url,success){
	$.ajax({
		type: 'GET',
		dataType: 'text',
		url:'/ws/User/'+userid'+/Show/'+showid+'/getBegin/'
	}).done(function(datetime){
			$('#ShowBeginning').append('<p>'+"begin: "+datetime+'</p>');
			console.log(datetime)
	});
	$('#SetShowBeginning').click(function(){
		$.ajax({
			type: 'POST',
			dataType: 'json',
			url:'/ws/User/'+userid'+/Show/'+showid+'/setBegin/'
		}).done(function(ShowBeginning){
				var name = $('input[name="setShowBeginning"]').val();
				$('#ShowBeginning').html('<p>'+"begin: "+name+'</p>');
		});
	});
}

function ShowEnd(type,url,success){
	$.ajax({
		type: 'GET',
		dataType: 'text',
		url:'/ws/User/'+userid'+/Show/'+showid+'/getEnd/'
	}).done(function(datetime){
			$('#ShowEnding').append('<p>'+"begin: "+datetime+'</p>');
			console.log(datetime)
	});
	$('#SetShowEnding').click(function(){
		$.ajax({
			type: 'POST',
			dataType: 'json',
			url:'/ws/User/'+userid'+/Show/'+showid+'/setEnd/'
		}).done(function(ShowEnding){
				var name = $('input[name="setShowEnding"]').val();
				$('#ShowEnding').html('<p>'+"end: "+name+'</p>');
		});
	});
}
	
	
function callShowName(name){
	var templateExample = _.template($('#templateName').html());
	var html = templateExample({
		"attribute":JSON.stringify(name)
	});

	$("#name").append(html);
}



function callSetShowName(name){
	var name = $('input[name="setName"]').val();
	var templateExample = _.template($('#templateName').html());
	var html = templateExample({
		"attribute":JSON.stringify(name)
	});
	$('#name').html(html);
}	

function callLogShowName(name){
	var templateExample = _.template($('#templateName').html());
	var html = templateExample({
		"ShowName":JSON.stringify($('input[name="ShowName"]').val())
	});

	$("#logShowName").html(html);
	
}

function callDeleteShowName(name){
	var templateExample = _.template($('#templateDelete').html());
	var html = templateExample({
		"ShowID":JSON.stringify($('input[name="ShowName"]').val())
	});

	$("#logShowName").html(html);
	
}



$(function (){
		
		var userid ='1';
		var showid ='1';

		getServerDataText('GET','/ws/User/'+userid+'/Show/'+showid+'/getName',callShowName);
	
		$('#SetShowname').click(function(){
			var input = $('input[name="setName"]').val();
			getServerData('POST','/ws/User/'+userid'+/Show/'+showid+'/setName/',callSetShowName);
		});
		
		$('#AddShowName').click(function(){
			getServerData('PUT','ws/User/'+userid+'/Show/'+showid+'/putName/',callLogShowName);
		});
		
		
		$('#DeleteShowName').click(function(){
			getServerData('DELETE','ws/User/'+userid+'/Show/'+showid+'/removeName/',callDeleteShowName);
		});
		
});

	

